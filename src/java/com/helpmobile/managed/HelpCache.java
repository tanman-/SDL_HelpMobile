/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.managed;

import com.helpmobile.dba.AccessFacade;
import com.helpmobile.dba.User;
import com.helpmobile.rest.Campus;
import com.helpmobile.rest.RestAccess;
import com.helpmobile.rest.Workshop;
import com.helpmobile.rest.WorkshopBooking;
import com.helpmobile.rest.WorkshopSet;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author terra
 */
@Named
@Startup
@Singleton
public class HelpCache {

    @Inject
    private RestAccess rest;

    @Inject
    private AccessFacade facade;

    private List<Campus> campusList = new LinkedList<>();
    private final List<WorkshopBooking> bookings = new LinkedList<>();
    private int bookingsCounter;
    private final Map<Integer, WorkshopSet> workshopSets = new LinkedHashMap<>();
    private final Map<Integer, Workshop> workshops = new LinkedHashMap<>();
    private List<User> students;

    @PostConstruct
    private void synchData() {
        try {
            System.out.println("Web Application Start");
            System.out.println("Synching HELPS Data");

            bookings.addAll(getRest().searchBooking());
            List<WorkshopSet> tempWorkshopSets = getRest().getWorkshops(true).getWorkshopSets();
            LinkedList<Workshop> tempWorkshops = new LinkedList<>();
            tempWorkshops.addAll(getRest().getAllWorkshops());
            campusList = getRest().getCampuses();
            students = extractUsers();
            System.out.println("Processing HELP Data");

            {
                Iterator<User> studentIterator = students.iterator();
                while (studentIterator.hasNext()) {
                    User student = studentIterator.next();
                    student.setBookings(new LinkedList<WorkshopBooking>());
                }
            }

            {
                Iterator<WorkshopBooking> bookingIterator = bookings.iterator();
                while (bookingIterator.hasNext()) {
                    WorkshopBooking book = bookingIterator.next();
                    Iterator<User> studentIterator = students.iterator();
                    while (studentIterator.hasNext()) {
                        User student = studentIterator.next();
                        if (student.getId().equals(book.getStudentId().trim())) {
                            book.setStudent(student);
                            student.getBookings().add(book);
                        }
                    }

                }
            }
            
            {
                Iterator<WorkshopBooking> bookingIterator = bookings.iterator();
                while (bookingIterator.hasNext()) {
                    WorkshopBooking book = bookingIterator.next();
                    if(book.getStudent()==null){
                        bookingIterator.remove();
                    }
                }
            }

            {
                Iterator<Workshop> workshopIterator = tempWorkshops.iterator();
                while (workshopIterator.hasNext()) {
                    Workshop work = workshopIterator.next();
                    workshops.put(work.getId(), work);
                }
            }

            List<Workshop> reduWorkshops = (List<Workshop>) tempWorkshops.clone();
            Iterator<WorkshopSet> workshopSetIterator = tempWorkshopSets.iterator();
            while (workshopSetIterator.hasNext()) {
                WorkshopSet set = workshopSetIterator.next();
                set.setWorkshops(new LinkedList<Workshop>());
                getWorkshopSets().put(set.getId(), set);
                Iterator<Workshop> workshopIterator = reduWorkshops.iterator();

                while (workshopIterator.hasNext()) {
                    Workshop work = workshopIterator.next();
                    if (work.getSetId() == set.getId()) {
                        set.getWorkshops().add(work);
                        workshopIterator.remove();
                    }
                }
            }

            System.out.println("Synch Finished");
        } catch (Exception ex) {
            Logger.getLogger(HelpCache.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<User> extractUsers() {
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("SDP_HelpMobilePU");
        EntityManager entityManager = factory.createEntityManager();
        //entityManager.getTransaction().begin();
        List<User> listPersons = entityManager.createQuery(
                "SELECT p FROM User p").getResultList();
        //entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
        return listPersons;
    }

    /**
     * @return the rest
     */
    public RestAccess getRest() {
        return rest;
    }

    /**
     * @return the facade
     */
    public AccessFacade getFacade() {
        return facade;
    }

    /**
     * @return the campusList
     */
    public List<Campus> getCampusList() {
        return campusList;
    }

    /**
     * @return the bookings
     */
    public List<WorkshopBooking> getBookings() {
        return bookings;
    }

    /**
     * @return the workshops
     */
    public Map<Integer, Workshop> getWorkshops() {
        return workshops;
    }

    /**
     * @return the students
     */
    public List<User> getStudents() {
        return students;
    }

    /**
     * @return the workshopSets
     */
    public Map<Integer, WorkshopSet> getWorkshopSets() {
        return workshopSets;
    }
}

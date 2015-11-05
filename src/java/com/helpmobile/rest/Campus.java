/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 *
 * @author terra
 */
public class Campus {
    /*
              "id": 4,
          "campus": "Skype",
          "archived": "2012-06-13T13:34:45.323"
    */
    private int id;
    @JsonProperty("campus")
    private String name;
    private Date archived;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the archived
     */
    public Date getArchived() {
        return archived;
    }

    /**
     * @param archived the archived to set
     */
    public void setArchived(Date archived) {
        this.archived = archived;
    }
}

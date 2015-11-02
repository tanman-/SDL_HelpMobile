/* 
USER
Password is password 
*/
INSERT INTO ROOT.APPLICANT (ID, COUNTRYORIGIN, COURSENUMBER, DEGREELEVEL, DOB, EDUCATIONALBACKGROUND, EMAIL, FACULTY, FIRSTLANGUAGE, GENDER, HOMEPHONE, MOBILEPHONE, "NAME", PASSWORD, PREFERREDNAME, PREFERREDPHONE, RESIDENCY, YEARLEVEL) 
	VALUES ('19999999', 225, 'C35452', 1, '1959-11-05', 'The Sentinel, Harvard', 'f.underwood@uts.edu.au', 6, 31, 0, '0299999999', '0499999999', 'Francis Joseph Underwood', '5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8', 'Frank', '0299999999', 1, 0);
INSERT INTO ROOT.APPLICANT (ID, COUNTRYORIGIN, COURSENUMBER, DEGREELEVEL, DOB, EDUCATIONALBACKGROUND, EMAIL, FACULTY, FIRSTLANGUAGE, GENDER, HOMEPHONE, MOBILEPHONE, "NAME", PASSWORD, PREFERREDNAME, PREFERREDPHONE, RESIDENCY, YEARLEVEL) 
	VALUES ('18888888', 225, 'C74576', 0, '1986-06-10', 'UChicago', 'z.barnes@uts.edu.au', 2, 31, 1, '0288888888', '0488888888', 'Zoe Marie Barnes', '5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8', 'Zoe', '0488888888', 1, 3);
INSERT INTO ROOT.APPLICANT (ID, COUNTRYORIGIN, COURSENUMBER, DEGREELEVEL, DOB, EDUCATIONALBACKGROUND, EMAIL, FACULTY, FIRSTLANGUAGE, GENDER, HOMEPHONE, MOBILEPHONE, "NAME", PASSWORD, PREFERREDNAME, PREFERREDPHONE, RESIDENCY, YEARLEVEL) 
	VALUES ('17777777', 225, 'C21230', 0, '1977-02-20', 'DrexelU, TempleU', 'p.russo@uts.edu.au', 0, 31, 0, '0277777777', '0477777777', 'Peter Russo', '5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8', 'Petey', '0477777777', 0, 0);
INSERT INTO ROOT.APPLICANT (ID, COUNTRYORIGIN, COURSENUMBER, DEGREELEVEL, DOB, EDUCATIONALBACKGROUND, EMAIL, FACULTY, FIRSTLANGUAGE, GENDER, HOMEPHONE, MOBILEPHONE, "NAME", PASSWORD, PREFERREDNAME, PREFERREDPHONE, RESIDENCY, YEARLEVEL) 
	VALUES ('16666666', 225, 'C78456', 1, '1964-04-01', 'I have don''t have any', 'd.stamper@uts.edu.au', 2, 31, 0, '0266666666', '0466666666', 'Douglas William Stamper', '5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8', 'Doug', '0466666666', 1, 1);
INSERT INTO ROOT.APPLICANT (ID, COUNTRYORIGIN, COURSENUMBER, DEGREELEVEL, DOB, EDUCATIONALBACKGROUND, EMAIL, FACULTY, FIRSTLANGUAGE, GENDER, HOMEPHONE, MOBILEPHONE, "NAME", PASSWORD, PREFERREDNAME, PREFERREDPHONE, RESIDENCY, YEARLEVEL) 
	VALUES ('15555555', 225, 'C84064', 1, '1983-07-25', 'Nah', 'j.skorsky@uts.edu.au', 2, 31, 1, '0255555555', '0455555555', 'Janine Skorsky', '5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8', 'Janine', '0455555555', 0, 0);

/* 
ACTIVITY
 */

INSERT INTO ROOT.ACTIVITY (ID, ACTIVITYDATE, AREA, AVAILABLE, BOOKABLE, CAPACITY, DESCRIPTION, DURATION, LECTURERNAME, LOCATION, TARGET, TOPIC, "TYPE", WAITINGLISTID) 
	VALUES (0, '2015-11-20 10:00:00.0', 0, 1, 1, 20, 'This is the description. This session is designed for incoming students.', 90, 'Red Bull', 'CB06.04.37', 1, 'Basic writing', 1, NULL);
INSERT INTO ROOT.ACTIVITY (ID, ACTIVITYDATE, AREA, AVAILABLE, BOOKABLE, CAPACITY, DESCRIPTION, DURATION, LECTURERNAME, LOCATION, TARGET, TOPIC, "TYPE", WAITINGLISTID) 
	VALUES (1, '2015-11-21 11:00:00.0', 1, 1, 1, 15, '“I have to do an in-class presentation. How do I prepare for it? What can I do to ensure that my presentation is structured clearly?” The workshop aims to help you plan, organise and structure your oral presentation, and how to use visual aids effectively. Practical information will be provided to help you calm your nerves, and enhance your clarity in speech.', 60, 'John Smith', 'CB11.00.405', 0, 'Giving a presentation', 1, NULL);
INSERT INTO ROOT.ACTIVITY (ID, ACTIVITYDATE, AREA, AVAILABLE, BOOKABLE, CAPACITY, DESCRIPTION, DURATION, LECTURERNAME, LOCATION, TARGET, TOPIC, "TYPE", WAITINGLISTID) 
	VALUES (2, '2015-11-22 12:00:00.0', 2, 1, 1, 25, '"I have difficulty catching everything the lecturer says. What can I do to improve my listening skills and how can I take meaningful notes while listening at the same time?” This workshop will provide you with strategies to prepare for each stage of the listening process – before, during and after a lecture – as well as tips for recognising lecture language. Accurate and concise recording of material delivered during a lecture will also be covered.', 120, 'Jane', 'CB01.14.22', 0, 'Active listening & note-taking in lectures', 1, NULL);
INSERT INTO ROOT.ACTIVITY (ID, ACTIVITYDATE, AREA, AVAILABLE, BOOKABLE, CAPACITY, DESCRIPTION, DURATION, LECTURERNAME, LOCATION, TARGET, TOPIC, "TYPE", WAITINGLISTID) 
	VALUES (3, '2015-11-23 13:00:00.0', 1, 1, 0, 15, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce maximus venenatis urna ac hendrerit. Aenean sollicitudin interdum congue. Nunc sed tincidunt tellus, vel dapibus dolor. Nullam vel blandit ipsum, quis pretium elit. Donec nisi erat, vehicula ac blandit id, semper vitae augue. Ut vel lectus condimentum, viverra ipsum eu, semper.', 60, 'Linda', 'CB07.02.11', 0, 'Advanced presentations', 1, NULL);


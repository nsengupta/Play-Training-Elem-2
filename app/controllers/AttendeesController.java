package controllers;

import java.util.List;


import play.mvc.Controller;
import play.mvc.Result;
import views.html.attendees.bysname;
import views.html.attendees.list;
import views.html.attendees.count;
import views.html.attendees.newPlayer;
import views.html.index;


import models.SoccerAttendeeRecord;
import models.AttendeesDB;

public class AttendeesController extends Controller {
	
	private AttendeesDB attendeesDB = new AttendeesDB();
	
    public Result index() {
        return ok(index.render("Attendees Application is being readied."));
    }
    
    public Result getAll() {
    	List<String> all =  attendeesDB.getAll();
    	return ok(list.render(all));
    }
    
    public Result getBySurname(String surname) {
    	return TODO;
    }
    
    public Result count() {
    	int attendeeCount = attendeesDB.attendeeCount();
    	return ok(count.render(attendeeCount));
    }
    
    public Result addAttendee(String surname,String firstname) {
    	
    	String statusOfAdding = attendeesDB.addAttendee(surname, firstname);
    	return ok(newPlayer.render(statusOfAdding));
    }
    
    

}

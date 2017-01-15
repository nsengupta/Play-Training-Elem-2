package controllers;

import java.util.List;

import models.AttendeesDB;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.attendees.bysname;
import views.html.attendees.list;
import views.html.attendees.count;
import views.html.index;

public class AttendeesController extends Controller {
	/**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
	
	private AttendeesDB attendeesDB = new AttendeesDB();
	
    public Result index() {
        return ok(index.render("Attendees Application is being readied."));
    }
    
    public Result getAll() {
    	List<String> all =  attendeesDB.getAll();
    	return ok(list.render(all));
    }
    
    public Result getBySurname(String surname) {
    	String retrievedName = attendeesDB.getBySurname(surname);
    	return ok(bysname.render(retrievedName));
    }
    
    public Result count() {
    	int attendeeCount = attendeesDB.attendeeCount();
    	return ok(count.render(attendeeCount));
    }
    
    public Result addAttendee(String surname,String firstname) {
    	return TODO;
    }

}

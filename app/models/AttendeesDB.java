package models;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AttendeesDB {
	
	public final Map<String,String> attendees= new HashMap<String,String>();
	
	public AttendeesDB () {
		
		attendees.put("Ronaldo",     "Christiano");
		attendees.put("Messi",       "Lionel");
		attendees.put("Ozil",        "Mesit");
		attendees.put("Sterling",    "Rehim");
		attendees.put("Griezeman",   "Antoine");
		attendees.put("Lewandowski", "Robert");
		attendees.put("Agueiro",     "Sergio");
		attendees.put("Keane",       "Robby");
		attendees.put("Gyan",        "Asamoa");
		attendees.put("Speed",       "Gary");
		attendees.put("Kelly",       "Gary");
	}
	
	public List<String> getAll() {
		
		List<String> players = new ArrayList<String>();
		
		for (Entry<String, String> s: this.attendees.entrySet()) 
			players.add(s.getKey() + "," + s.getValue());
		
		return (players);
	}
	
	public String getBySurname(String sname) {
		
		String fname = attendees.get(sname);
		if (fname == null || fname.isEmpty())
			return ("No player with " + sname+ ", found");
		else 
			return (fname + "," + sname);
	}
	
	public int attendeeCount() {
		return (attendees.size());
	}
	
	public String addAttendee(String sname, String fname) {
		
		String retrievedFname = attendees.get(sname);
		if (retrievedFname == null || retrievedFname.isEmpty()) {
			attendees.put(sname, fname);
			return (sname + "," + fname + ":added");
		}
		else {
			return null; // TODO: What may we return?
		}
		
	}

}

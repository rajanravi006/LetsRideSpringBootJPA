package com.letsride.letsride.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormat {
	
	public String getDateTime(String datetimeString) throws ParseException {
		String dateString = datetimeString;
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    	String date = "";
    	try{
        	Date tempDate = simpleDateFormat.parse(dateString);
        	//new format
        	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy, hh:mm aa");
        	//formatting the given time to new format with AM/PM
            date = sdf.format(tempDate);
            
        	}catch(ParseException e){
        		e.printStackTrace();
        	}
    	return date;
    	
	}
	
	
}

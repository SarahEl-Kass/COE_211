public class BasicWeek {
    // Initializing variables
    	private String day_1;
	private String day_2;
	private String day_3;
	private String day_4;
	private String day_5;
	private String day_6;
	private String day_7;
	
	public BasicWeek() {
	 day_1 = "Monday";
         
    	 day_2 = "Tuesday";
     	
    	 day_3 = "Wednesay";
    	 
     	 day_4 = "Thursday";
    	
     	 day_5 = "Friday";
    	
   	 day_6 = "Saturday";
    
    	 day_7 = "Sunday";
   	
	}

    // printing out the days
    public void printDays() {
        System.out.println("The basic days of the week are: " + day_1 + " " + 
			day_2 + " " + day_3 + " " + day_4 + " " + day_5 +
			" " + day_6 + " " + day_7);   
    }
}
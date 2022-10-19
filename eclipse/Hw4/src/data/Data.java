package data;

public class Data {
	private int day ;
	private int month ;
    private int year ;
    
    public  void setDay(int day) {
    	if(day>31) {
    		this.day=31;
    	}else if (day<=0) {
    		this.day=1;
    	}else {
    		this.day = day;
    	}
        
    }
    public int getDay() {
        return day;
    }
    
   

    public void setMonth(int month) {
    	if (month>12) {
    		this.month=12;
    	}else if (month<=0) {
    		this.month=1;
    	}else {
    		this.month = month;
    	}
        
    }
    public int getMonth() {
        return month;
    }


    
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    
}

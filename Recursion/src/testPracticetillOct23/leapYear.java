package testPracticetillOct23;

public class leapYear {

	public static void main(String[] args) {

     int year=2024;
     if(year/100==0)
     {
    	 System.out.println("leap");
    	 if(year/400==0)
    	 {
    		 System.out.println("leap");
    	 }
    	 {
    		 System.out.println("not");
    	 }
     } 
   
    	 else
    	 {
    		 if(year%4==0)
    		 {
    			 System.out.println("leap");
        	 }
        	 else
        	 {
        		 System.out.println("not");
        	 }    		 
     }
     
	}

}

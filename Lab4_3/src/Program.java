public class Program{ 
      
    public static void main (String args[]){
    	try {
    		getResult();
	    }
	    catch(Exception ex){
	    	System.out.print("Error: ");
	        System.out.println(ex.getMessage());
	    }
    }
    
    private static void getResult() throws Exception {
    	double x = getItem(13, 7) +  getItem(15, 12) + getItem(32, 21);
    	System.out.printf("x = %f \n", x);
    }

    private static double getItem(int a, int b) throws Exception {
    	return (a + Math.sqrt(b)) / (b + Math.sqrt(a));
    }
}
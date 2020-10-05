import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
		String next = null;
        Scanner in = new Scanner(System.in);
		do {
	    	try {
		        System.out.print("Input x: ");
		        double x = in.nextDouble();
		        System.out.print("Input y: ");
		        double y = in.nextDouble();
		        double z = Math.random() - 1;
		        System.out.printf("z = %f \n", z);
		        getA(x, y, z);
		    }
		    catch(Exception ex){
		    	System.out.print("Error: ");
		        System.out.println(ex.getMessage());
		    }
	        System.out.printf("\nTry again (y/n): ");
	        next = in.hasNext() ? in.next() : "";
		} while(next.equals("y"));
        in.close();
    }
    
    private static void getA (double x, double y, double z) throws Exception {
    	double output;	
    	if(x > 2) {
    		output = Math.sqrt((Math.tan(Math.toRadians(y)) - Math.cos(Math.toRadians(x))) / ((Math.pow(z, 10) + 4)));
    	} else if(x == 2) {
    		output = x > y ? x : y;
    	} else {
    		output = (x < z ? x : z) * Math.abs(x);
    	}
    	System.out.printf("A = %f \n", output);
    }
    
}
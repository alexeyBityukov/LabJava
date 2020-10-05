import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
		String next = null;
        Scanner in = new Scanner(System.in);
		do {
	    	try {
		        System.out.print("Input a: ");
		        double a = in.nextDouble();
		        System.out.print("Input b: ");
		        double b = in.nextDouble();
		        System.out.print("Input c: ");
		        double c = in.nextDouble();
		        
		        if(a == 0) throw new Exception("a must be non zero!");
	
				getX(a, b, c);

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
    
    private static void getX (double a, double b, double c) throws Exception {
    	double d = b * b - 4 * a * c;
    	
    	if( d < 0 ) {
    		throw new Exception("no solution");
    	}
    	else if(d == 0) {
    		System.out.printf("d = 0, x = %f \n",  -b / (2 * a));
    	} else {
    		System.out.printf("d > 0, x1 = %f, x2 = %f \n",  (-b + Math.sqrt(d)) / ((double ) 2 * a), (-b - Math.sqrt(d)) / ((double )2 * a));
    	}
    }
    
}
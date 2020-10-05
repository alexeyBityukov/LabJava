import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
    	try {
            Scanner in = new Scanner(System.in);
            System.out.print("Input A x: ");
            double ax = in.nextDouble(); 
            System.out.print("Input A y: ");
            double ay = in.nextDouble(); 
            System.out.print("Input B x: ");
            double bx = in.nextDouble(); 
            System.out.print("Input B y: ");
            double by = in.nextDouble(); 
            System.out.print("Input C x: ");
            double cx = in.nextDouble(); 
            System.out.print("Input C y: ");
            double cy = in.nextDouble(); 
            in.close();
        	System.out.printf("Perimeter triangle = %f \n", getLength(ax, ay, bx, by) + getLength(cx, cy, bx, by) + getLength(ax, ay, cx, cy));
	    }
	    catch(Exception ex){
	    	System.out.print("Error: ");
	        System.out.println(ex.getMessage());
	    }
    }
    
    private static double getLength(double x1, double y1, double x2, double y2) throws Exception {
    	return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
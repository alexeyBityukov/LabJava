public class Program{ 
    
    public static void main (String args[]){
    	
        for (double x = 0; x <= 1; x += 0.1) {
        	double val = Math.sqrt(Math.pow(x, 4) + 2 * x + 3);
        	System.out.printf("x = %f, then f = %f \n", x, val);
        }
    }
}
public class Program{ 
      
    public static void main (String args[]){
    	
       double val = 1;
       int x = 1;

        for (; val >= 0.8; x++) {
        	val = Math.tan(Math.toRadians(Math.PI/Math.pow(2, x + 1)));
        }

    	System.out.printf("If n >= 1, then Min n = %d \n", x);
    }
}

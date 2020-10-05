import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
    	try {
            Scanner in = new Scanner(System.in);
            System.out.print("Input number1: ");
            int number1 = in.nextInt(); 
            System.out.print("Input number2: ");
            int number2 = in.nextInt(); 
            System.out.print("Input number3: ");
            int number3 = in.nextInt(); 
            System.out.print("Input number4: ");
            int number4 = in.nextInt(); 
            System.out.print("Input number5: ");
            int number5 = in.nextInt(); 
            in.close();
            
        	System.out.printf("Inversed number1 = %d \n", invDigits(number1));
        	System.out.printf("Inversed number2 = %d \n", invDigits(number2));
        	System.out.printf("Inversed number3 = %d \n", invDigits(number3));
        	System.out.printf("Inversed number4 = %d \n", invDigits(number4));
        	System.out.printf("Inversed number5 = %d \n", invDigits(number5));
	    }
	    catch(Exception ex){
	    	System.out.print("Error: ");
	        System.out.println(ex.getMessage());
	    }
    }
    
    private static int invDigits(int K) throws Exception {
    	int number = K;
    	int next = 0; 
    	while(number >= 10) {
    		int val = number % 10;
    		next = next * 10 + val;
    		number /= 10;
    	}

		next = next * 10 + number;
    	
    	return next;
    }
}
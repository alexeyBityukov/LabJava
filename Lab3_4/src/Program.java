import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = in.nextInt();
        in.close();
        double sum = 0;
        double checkValue = 1 / (double) 99;
        int numbers = 0;

        for (int x = 1; x <= n; x++) {
        	double val = Math.tan(Math.toRadians(Math.PI/Math.pow(2, x + 1)));
        	if(val > checkValue) {
        		numbers++;
        	}
        	sum += val;
        }

		System.out.printf("sum = %f \n", sum);
		System.out.printf("numbers value > 1/ 99 = %d \n", numbers);
    }
}
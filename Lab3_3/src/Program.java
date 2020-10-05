import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = in.nextInt();
        in.close();
        int output = 1;

        for (int x = 1; x <= n; x++) {
        	if(x % 6 == 0) {
        		output *= x;
        	}
        }

		System.out.printf("Result = %d \n", output);
    }
}
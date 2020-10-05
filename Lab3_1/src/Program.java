import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Input N: ");
        int N = in.nextInt();
        in.close();
        int sum = 0;

        for (int x = 0; x <= N; x += 2) {
        	sum += x;
        }

		System.out.printf("sum = %d \n", sum);
    }
}
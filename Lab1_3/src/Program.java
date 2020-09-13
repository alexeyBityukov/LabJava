import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Input radius R: ");
        double x = in.nextDouble();
        in.close();
        double d = 2 * Math.PI * x;
        System.out.printf("y = %f \n", d);  
    }
}
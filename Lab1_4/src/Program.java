import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = in.nextDouble();
        System.out.print("Input y: ");
        double y = in.nextDouble();
        System.out.print("Input z: ");
        double z = in.nextDouble();
        in.close();
        double part1 = (x * y + 2 * x * x - 4) / (x * x + y * y + 1);
        double part2 = x * x * z * z + 2;
        System.out.printf("Output = %f \n", part1 / part2);  
    }
}
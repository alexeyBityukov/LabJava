import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Input top left parallelogram angle x: ");
        double topLeftX = in.nextDouble();
        System.out.print("Input top left parallelogram angle y: ");
        double topLeftY = in.nextDouble();    
        System.out.print("Input bottom right parallelogram angle x: ");
        double bottomRightX = in.nextDouble();  
        System.out.print("Input bottom right parallelogram angle y: ");
        double bottomRightY = in.nextDouble();    
        in.close();
        
        double centerX = (topLeftX + bottomRightX) / 2;
        double centerY = (topLeftY + bottomRightY) / 2;
        System.out.printf("Output point (%f; %f) \n", centerX, centerY);  
    }
}
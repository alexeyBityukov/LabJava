import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Input catet x1: ");
        double x1 = in.nextDouble();
        System.out.print("Input catet x2: ");
        double x2 = in.nextDouble();
        System.out.print("Input catet x3: ");
        double x3 = in.nextDouble();
        System.out.print("Input catet x4: ");
        double x4 = in.nextDouble();
        in.close();
        
        if(x1 < x2 && x2 < x3 && x3 < x4) {
        	System.out.printf("Numbers are arranged in ascending order \n");  
        } else {
        	System.out.printf("Numbers are not ascending \n"); 
        }
    }
}
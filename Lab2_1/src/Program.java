import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Input catet a: ");
        double a = in.nextDouble();
        System.out.print("Input catet b: ");
        double b = in.nextDouble();
        System.out.print("Input catet c: ");
        double c = in.nextDouble();
        in.close();
        boolean check = a*a + b*b == c*c;
        if(check) {
        	System.out.printf("Rectangular triangle \n");  
        } else {
        	System.out.printf("Non rectangular triangle \n");
        }
    }
}
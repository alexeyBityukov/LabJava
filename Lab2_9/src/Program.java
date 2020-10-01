import java.util.Scanner;

public class Program{ 
      
    public static void main (String args[]){
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Input(North -> N; South -> S; West -> W; East -> E) C: ");
        String C = in.hasNext() ? in.next() : "";
        System.out.print("Input command1: ");
        int command1 = in.nextInt();
        System.out.print("Input command2: ");
        int command2 = in.nextInt();
        in.close();
        
        if(command1 == 1) {
        	if(C.equals("N")) {
        		C = "W";
        	} else if(C.equals("S")) {
        		C = "E";
        	} else if(C.equals("W")) {
        		C = "S";
        	} else if(C.equals("E")) {
        		C = "N";
        	}
        } else if(command1 == -1){
        	if(C.equals("N")) {
        		C = "E";
        	} else if(C.equals("S")) {
        		C = "W";
        	} else if(C.equals("W")) {
        		C = "N";
        	} else if(C.equals("E")) {
        		C = "S";
        	}
        } else if(command1 == 2){
        	if(C.equals("N")) {
        		C = "S";
        	} else if(C.equals("S")) {
        		C = "N";
        	} else if(C.equals("W")) {
        		C = "E";
        	} else if(C.equals("E")) {
        		C = "W";
        	}	
        }
        
        if(command2 == 1) {
        	if(C.equals("N")) {
        		C = "W";
        	} else if(C.equals("S")) {
        		C = "E";
        	} else if(C.equals("W")) {
        		C = "S";
        	} else if(C.equals("E")) {
        		C = "N";
        	}
        } else if(command2 == -1){
        	if(C.equals("N")) {
        		C = "E";
        	} else if(C.equals("S")) {
        		C = "W";
        	} else if(C.equals("W")) {
        		C = "N";
        	} else if(C.equals("E")) {
        		C = "S";
        	}
        } else if(command2 == 2){
        	if(C.equals("N")) {
        		C = "S";
        	} else if(C.equals("S")) {
        		C = "N";
        	} else if(C.equals("W")) {
        		C = "E";
        	} else if(C.equals("E")) {
        		C = "W";
        	}	
        }
        
    	if(C.equals("N")) {
    		System.out.printf("Turned on Noth");
    	} else if(C.equals("S")) {
    		System.out.printf("Turned on South");
    	} else if(C.equals("W")) {
    		System.out.printf("Turned on West");
    	} else if(C.equals("E")) {
    		System.out.printf("Turned on East");
    	}  
    }
}
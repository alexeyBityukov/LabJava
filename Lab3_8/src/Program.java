public class Program{ 
      
    public static void main (String args[]){
    	
       double eps = 0.0001;
       int x = 1;
       double val = x - 1;
       double sum = 0;

        for (int n = 1; Math.abs(val) >= eps ; n++) {
        	val = Math.pow(-1, n + 1) * Math.pow((x - 1), n) / n;
        	sum += val;
        }
        
    	System.out.printf("Approximate value ln(1) = %f \n", sum);
    	System.out.printf("Exact value ln(1) = 0 \n", Math.log(x));
    }
}

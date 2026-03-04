package lambdaexpression;

public class MaxNum {

	    public static void main(String[] args) {

	        MaxNumber m = (a, b) -> {
	            if (a > b)
	                return a;
	            else
	                return b;
	        };

	        int result = m.findMax(10, 20);

	        System.out.println("Maximum is: " + result);
	    }
	}



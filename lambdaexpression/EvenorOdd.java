package lambdaexpression;

public class EvenorOdd {
	
	 public static void main(String[] args) {

	        Evenodd eo = (n) -> {
	            if (n % 2 == 0)
	                return "Even";
	            else
	                return "Odd";
	        };

	        String result = eo.check(7);

	        System.out.println("Number is: " + result);
	    }
	

}

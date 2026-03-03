package lambdaexpression;

public class LambdaTest {
		
		    public static void main(String[] args) {
		    	
	            //Without Parameter
		    	
		        Main_Interface obj = () -> System.out.println("Without parameter");
		        obj.display();
		        
		        //With Parameter
		        
		        Interface_1 s = (n) -> n * n;
		        System.out.println("Square is: " + s.findSquare(5));
		        
		        //with Multiple
		        
		        Interface_2 obj1 = (a, b) -> a + b;
		        System.out.println("Sum is: " + obj1.sum(10, 20));
		    }
		}




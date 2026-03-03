package lambdaexpression;

public class StringLengthExample {
	
	public static void main(String[] args) {

        StringLength obj = str -> str.length();

        System.out.println("Length is: " + obj.getLength("Java"));
    }

}

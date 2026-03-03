package employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class AccessEmployee {

	public static void main(String[] args) {
		
        List<Employee> empList = Arrays.asList(
                new Employee(1, "Gokul", 50000),
                new Employee(2, "Karthi", 30000),
                new Employee(3, "Ganesh", 70000),
                new Employee(4, "Vidhya", 40000)
        );

        Runnable r = () -> System.out.println("Employee Management using Java 8");
        r.run();

        Predicate<Employee> highSalary = emp -> emp.salary > 40000;
        System.out.println("\nEmployees with salary > 40000:");
        empList.stream().filter(highSalary).forEach(System.out::println);


        Function<Employee, String> getName = emp -> emp.name;
        System.out.println("\nEmployee Names:");
        empList.stream().map(getName).forEach(System.out::println);


        Consumer<Employee> printEmp = emp -> System.out.println(emp.name + " earns " + emp.salary);
        System.out.println("\nUsing Consumer:");
        empList.forEach(printEmp);


        Supplier<String> company = () -> "ABC Company";
        System.out.println("\nCompany: " + company.get());

   
        System.out.println("\nSalary after 10% hike:");
        empList.stream().map(emp -> emp.salary * 1.1).forEach(System.out::println);

        
        System.out.println("\nAll Employees:");
        empList.forEach(System.out::println);

        
        Optional<Employee> empOptional =empList.stream().filter(e -> e.name.equals("Ravi")).findFirst();
        System.out.println("\nOptional example:");
        System.out.println(empOptional.orElse(new Employee(0, "Not Found", 0)));


	}

}

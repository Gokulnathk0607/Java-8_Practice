package dateandtime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Emp_Ex {

    public static void main(String[] args) {
    	
        String employeeName = "Gokul";
        LocalDate joiningDate = LocalDate.of(2022, 6, 15);
        LocalDate today = LocalDate.now();
        Period experience = Period.between(joiningDate, today);
        
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedJoiningDate = joiningDate.format(formatter);

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Joining Date: " + formattedJoiningDate);
        System.out.println("Experience: "
                + experience.getYears() + " years "
                + experience.getMonths() + " months "
                + experience.getDays() + " days");
    }
}
package assesment.buildacompanyprojectteam;

import day16.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Employee e1 = new Employee(101, "Liam Anderson", "Developer", 3);
        Employee e2 = new Employee(102, "Kenji Tanaka", "Developer", 5);
        Employee e3 = new Employee(103, "Oliver Smith", "Developer", 2);

        ArrayList<Employee> developers = new ArrayList<>(Arrays.asList(e1, e2, e3));


        Employee e4 = new Employee(104, "Sophie Martin", "Tester", 4);
        Employee e5 = new Employee(105, "Daniel Wilson", "Tester", 3);
        Employee e6 = new Employee(106, "Emma Johnson", "Tester", 6);

        ArrayList<Employee> testers = new ArrayList<>(Arrays.asList(e4, e5, e6));


        Employee e7 = new Employee(107, "Lucas Muller", "Designer", 5);
        Employee e8 = new Employee(108, "Isabella Rossi", "Designer", 2);
        Employee e9 = new Employee(109, "Noah Williams", "Designer", 4);

        ArrayList<Employee> designers = new ArrayList<>(Arrays.asList(e7, e8, e9));

        ArrayList<ArrayList<Employee>> projectTeam = new ArrayList<>(Arrays.asList(developers, testers, designers));
        displayEmployees(developers, testers, designers, projectTeam);
    }

    private static void displayEmployees(ArrayList<Employee> developers, ArrayList<Employee> testers, ArrayList<Employee> designers, ArrayList<ArrayList<Employee>> projectTeam) {
//        Print all employees in the project team.
        System.out.println("Employees from Project team ");
        int count = 0;
        for (List<Employee> employee : projectTeam.subList(0, projectTeam.size())) {
            for (Employee emp : employee) {
                System.out.println("ID " + emp.getEmpId());
                System.out.println(emp.getName() + " " + emp.getRole());
                System.out.println("Experience " + emp.getExperience() + "years");
                System.out.println("---------------------------------------------");
                count++;
            }
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("total number of employees in Project Team is " + count);

        //                Print the names of all team members.
        System.out.println("Names of all team members.");
        for (List<Employee> employee : projectTeam.subList(0, projectTeam.size())) {
            for (Employee emp : employee) {
                System.out.println(emp.getName());
            }
        }

//        Print the employees having more than 2 years of experience.
        System.out.println("----------------------------------------------------------");
        System.out.println("Employees having more than 2 years of experience.");
        for (List<Employee> employee : projectTeam.subList(0, projectTeam.size())) {
            for (Employee emp : employee) {
                if (emp.getExperience()>2)
                    System.out.println(emp.getName());
            }
        }    }
}

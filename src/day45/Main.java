package day45;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    static void main() {
        ObjectMapper mapper = new ObjectMapper();
        List<Employee> employees = null;
        try {
            employees = mapper.readValue(
                    new File("src/myfolder/employee2.json"),
                    new TypeReference<>() {
                    }
            );
        } catch (IOException _) {

        }
          //All employees data
        for (Employee employee : employees)
            System.out.println(employee);
        // Employees who are in IT department
        System.out.println("Employees from IT Department");
      for (Employee employee : employees){
            if(employee.getDepartment().equalsIgnoreCase( "IT")) {
                System.out.println(employee.getName());
            }
       }
        // Employees who have more than or equal to 3 projects
        System.out.println("Employees working on more than or equal to 3 projects");
        for (Employee employee : employees){
//            System.out.println(employee.getProjects().size());
            if (employee.getProjects().size() >= 3){
                System.out.println(employee.getName());
            }
        }
    }
}

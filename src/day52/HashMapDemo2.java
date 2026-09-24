package day52;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo2 {
    static void main() {
        Map<String, Double> employees = new HashMap<>();
        employees.put("Alice", 800.00);
        employees.put("Ben", 900.00);
        employees.put("Chris", 1000.00);
        employees.put("David", 1100.0);

        System.out.println(employees);
        System.out.println(employees.keySet());
        System.out.println(employees.values());
        System.out.println("Emplyees whoes salary is more than 999 ********");
        for (Map.Entry<String,Double>emp: employees.entrySet()){
            if(emp.getValue()>= 999){
                System.out.println(emp.getKey());
            }
        }
        employees.put("Chris", 2000.0);
        double maxSalary = 0.0;
        String mxSalaryEmp="";
        for(Map.Entry<String, Double> emp : employees.entrySet()){
            if (maxSalary < emp.getValue()){
                maxSalary = emp.getValue();
                mxSalaryEmp = emp.getKey();
            }
        }
        System.out.println("employee with max salaray is : " + mxSalaryEmp);
    }
}

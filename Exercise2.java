//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise2 {

    public static void main(String[] args) {
        Map<Integer, String> empMapList = getIntegerStringMap();
        System.out.println(empMapList);
        Map<Double, List<Employee>> doubleListMap = getEmployeeDetailsBasedOnSalary();
        System.out.println("\n" + doubleListMap + "\n");
        Iterator var3 = empMapList.entrySet().iterator();

        Map.Entry doubleList;
        while(var3.hasNext()) {
            doubleList = (Map.Entry)var3.next();
            Integer k = (Integer)doubleList.getKey();
            String v = (String)doubleList.getValue();
            System.out.println("key: " + k + ", value: " + v);
        }

        System.out.println("\n");
        var3 = doubleListMap.entrySet().iterator();

        while(var3.hasNext()) {
            doubleList = (Map.Entry)var3.next();
            Double k = (Double)doubleList.getKey();
            List<Employee> v = (List)doubleList.getValue();
            System.out.println("Salary : " + k + ", EmployeeList : " + v);
        }

    }

    private static List<Employee> getEmp() {
        Employee emp1 = new Employee(101, "Neha", 35000.0);
        Employee emp2 = new Employee(102, "Mona", 38000.0);
        Employee emp3 = new Employee(103, "Tina", 40000.0);
        Employee emp4 = new Employee(104, "Rina", 35000.0);
        List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4);
        return empList;
    }

    private static Map<Integer, String> getIntegerStringMap() {
        Map<Integer, String> empMapList = new HashMap();
        Iterator var1 = getEmp().iterator();

        while(var1.hasNext()) {
            Employee employee = (Employee)var1.next();
            empMapList.put(employee.getEmployeeId(), employee.getEmployeeName());
        }

        return empMapList;
    }

    private static Map<Double, List<Employee>> getEmployeeDetailsBasedOnSalary() {
        Map<Double, List<Employee>> doubleListMap = (Map)getEmp().stream().collect(Collectors.groupingBy(Employee::getEmployeeSalary));
        return doubleListMap;
    }
}

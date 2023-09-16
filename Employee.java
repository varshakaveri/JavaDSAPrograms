//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Employee {
    int employeeId;
    String employeeName;
    double employeeSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.employeeId = empId;
        this.employeeName = empName;
        this.employeeSalary = empSalary;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return this.employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String toString() {
        return "Employee_id : " + this.employeeId + "\nEmployee_name : " + this.employeeName;
    }
}

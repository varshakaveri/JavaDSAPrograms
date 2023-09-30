import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaDBProgram {
    public static void main(String arg[])
    {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/practice_DB",
                    "root", "Varsha@2023");

            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from employee");
            int empId;
            String empCode;
            String empName;
            Long empSalary;

            while (resultSet.next()) {
                empId = resultSet.getInt("emp_id");
                empCode = resultSet.getString("emp_code").trim();
                empName = resultSet.getString("emp_name").trim();
                empSalary = resultSet.getLong("emp_salary");
                System.out.println("Employee Id : " + empId
                        + "\n Employee Code : " + empCode
                        + "\n Employee Name : " + empName
                        + "\n Employee Salary : " + empSalary);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    } // function ends
} // class ends

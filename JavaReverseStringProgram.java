import java.util.Scanner;
public class JavaReverseStringProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to print it in reverse order : ");
        String strValue = sc.nextLine();
        String temp = "";
        for (int i=strValue.length()-1;i>=0;i--){
            temp += strValue.charAt(i);
        }
        System.out.print("String Reverse is : " +temp);
    }
}

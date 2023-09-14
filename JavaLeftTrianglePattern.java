import java.util.Scanner;
public class JavaLeftTrianglePattern {
    public static void main(String[] args){
        System.out.println("Print Left Triangle Pattern");
        System.out.print("Enter number of lines to be printed : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for(i=0;i<n;i++){
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class JavaRightDownWardsTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Right Downwards Triangle");
        System.out.print("Enter number of lines to be printed : ");
        int n = sc.nextInt();
        int i,j;
        for(i=0;i<=n-1;i++){
            for(j=0;j<=i;j++){
                System.out.print("  ");
            }
            for(j=0;j<=n-1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

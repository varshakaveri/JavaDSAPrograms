import java.util.Scanner;
public class JavaDiamondPattern {
    public static void main(String[] args){
        System.out.println("Print Left Triangle Pattern");
        System.out.println("Enter number of lines to be printed : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for(i=0;i<n;i++){
            for(j=n-i;j>1;j--){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=0;i<=n-1;i++){
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (j=0;j<n-1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
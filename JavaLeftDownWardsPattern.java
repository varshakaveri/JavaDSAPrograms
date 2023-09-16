public class JavaLeftDownWardsPattern {
    public static void main(String[] args){
        int i,j,n=5;
        for(i=n-1;i>=0;i--){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

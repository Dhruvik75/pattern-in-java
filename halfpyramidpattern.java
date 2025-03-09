import java.util.Scanner;

public class halfpyramidpattern {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        //half pyramid pattern 3
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

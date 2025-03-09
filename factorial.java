import  java.util.*;
public class factorial {

    public static void printfactorial(int n){
        if(n<0){
            System.out.println("invalid value");
            return;

        }
        int factorial=1;
        for (int i=n;i>=1;i--){
            factorial =factorial* i;
        }
        System.out.println("print the factorial number :" +factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();

        printfactorial(n);

    }
}



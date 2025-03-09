import java.util.Scanner;

// leap year
public class interview {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int lep= sc.nextInt();
        if (lep % 4 ==0){
            System.out.println("this year is leap");
        }
        else {
            System.out.println("this year is not leap");
        }
    }
}



//solid rectangle pattern 1
import java.util.*;

public class Main {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int m= sc.nextInt();
//
//        for(int i=1;i<=4;i++){
//            for (int j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//          }



        //print hollow rectangle pattern 2
        //outer for loop
//        int n= sc.nextInt();
//        int m= sc.nextInt();
//        for (int i=1;i<=n;i++){
//            // inner for loop
//            for(int j=1;j<=m;j++){
//                if(i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("hollow rectangle");


        //half pyramid pattern 3
//        int n= sc.nextInt();
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }


//         inverted half pyramid pattern 4
//        int n= sc.nextInt();
//
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//          System.out.println(" ");
//        }

        //      inverted half pyramid rotete(180)pattern 5

//        int n=4;
////         for(int i=1; i<=n; i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

      // pattern 6
//        int n=5;
//        for(int i=1;i<=n;i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "");
//            }
//            System.out.println();
//        }

//   pattern 7

//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        int n=5;
//        int number=1;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }

        int n=5;
         for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                 int sum=i+j;
                 if(sum % 2 ==0){
                     System.out.print("1 ");
                 }
                 else {
                     System.out.print("0 ");
                 }
             }
             System.out.println();
         }

}
}
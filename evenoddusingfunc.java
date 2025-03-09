import java.util.*;
public class evenoddusingfunc{
        public static void evenodd(int n){
            if(n%2 == 0){
                System.out.println("this is even number");
            }
            else {
                System.out.println("this is odd number");
            }

            return;

        }
        public  static  void  main(String[] args){
                Scanner sc= new Scanner(System.in);
                int n= sc.nextInt();

                evenodd(n);
            }
        }


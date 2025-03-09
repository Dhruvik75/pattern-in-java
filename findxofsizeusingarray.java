import java.util.Scanner;

public class findxofsizeusingarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size= sc.nextInt();
        int number[]= new int[size];

        for(int i=0;i<size;i++){
            number[i]= sc.nextInt();
        }
        System.out.println(" enter the x value");
        int x= sc.nextInt();

        for (int i=0;i<number.length;i++){
            if(number[i] == x){
                System.out.println("x is found index :"+ i);
            }
        }
    }

}

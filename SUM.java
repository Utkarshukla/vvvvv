import java.util.*;
public class SUM {
    public static void main(String[] args){
        System.out.println("Enter the value of 2 input a and b");
        try(Scanner sc = new Scanner(System.in);){
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c = a+b;
            System.out.println(c);
        }
    }
}

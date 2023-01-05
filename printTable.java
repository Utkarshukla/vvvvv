import java.util.*;
public class printTable {
    public static void main(String[] args) {
        System.out.println(" you want to print table of......");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
        
            for(int i=1;i<=10;i++){
                int n= x*i; 
                System.out.println("Table  "+n);
            }
            
        }
    }
}

import java.util.*;
public class sumofnatural {
    public static void main(String[] args) {
        System.out.println(" you want to print sum of......Natural numbers");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            int x=0;
            for(int i=0;i<=n;i++){
                x= x+i; 
            }
            System.out.println(x);
        }
    }
}

import java.util.*;
public class Input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();   //in palce of next if we use nextLine then it hold the total i/p
            System.out.println(name);
        }
    }
}

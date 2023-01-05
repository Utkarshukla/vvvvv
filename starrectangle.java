import java.util.Scanner;

public class starrectangle {
    /**
     * @param args
     */
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            //solid rectangle
            // for(int i=0; i<r;i++){
            //     for(int j=0;j<c;j++){
            //         System.out.print(" * ");
            //     }
            //     System.out.println();
            // }

            //holow rectangle 
            // for(int i=1; i<=r;i++){
            //     for(int j=1;j<=c;j++){
            //         if(i==1 || j==1 || i==r || j==c){
            //             System.out.print(" * ");   //string lenth is 3
            //         }    
            //         else {
            //             System.out.print("   "); //string lenght is 3 
            //         }
            //     }
            //     System.out.println();
            // }


            //half pyramid
            // for(int i=1; i<=r;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print(" * ");
            //     }
            //     System.out.println();
            // }


            //downword pyramid
            // for(int i=1; i<=r;i++){
            //     for(int j=(r-i);j>=0;j--){
            //         System.out.print(" * ");
            //     }
            //     System.out.println();
            // }

            //
        }
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line

            String frmtStrng = String.format("%-15s", s1);
            String outp = String.format("%03d", x);

            if(s1.length() <= 10)
            {
                System.out.println(frmtStrng  + outp);
            }
            else {
                System.out.println("The string must not be more than 10 characters long!");
            }
        }
        System.out.println("================================");

    }
}




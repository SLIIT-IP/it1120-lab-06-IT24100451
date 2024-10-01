import java.util.Scanner;

public class IT24100451Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = 0;
        int Tot = 0;
        int cnt = 0;
        double RMS = 0.0;

        System.out.print("Enter Positive integers (terminate input with -99): ");
        no = scanner.nextInt();

        while (no != -99) {  
            cnt = cnt + 1;
            Tot = Tot + (no * no);
            System.out.print("Enter a Number:");
            no = scanner.nextInt();
        }

        if (cnt != 0) {
            RMS = Math.sqrt((double) Tot / cnt);  
            System.out.println("RMS of the entered numbers: " + RMS);
        } else {
            System.out.println("Count is zero; cannot calculate RMS.");
        }
      }
}
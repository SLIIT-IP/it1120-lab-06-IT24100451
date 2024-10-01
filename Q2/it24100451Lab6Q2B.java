import java.util.Scanner;

public class IT24100451Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        
        int n = 0;
        System.out.println("Please Enter 10 numbers:");
        
        while (n < 10) {
            System.out.print("Enter Number " + (n + 1) + ": ");
            numbers[n] = scanner.nextInt();
            n++;
        }
        
        System.out.println("The numbers you entered are:");
        n = 0;  
        
        while (n < 10) {
            System.out.print(numbers[n]);
            n++;
         }
     }
}
import java.util.*;

public class Question {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the start number:");
        int start = input.nextInt();
        System.out.println("Please enter the end number:");
        int end = input.nextInt();
        int x = start;
        int sum = 0;
        if (start > end){
            System.out.println("The start number is bigger than the end number, so there os no result.");
        }
        else{
            while (x <= end){
                sum = sum + x;
                x = x + 1;
            }
            System.out.printf("The sum from the start to the end is %d\n", sum);
        }
    }
}
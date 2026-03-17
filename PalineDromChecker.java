import java.util.Scanner;
class PalineDromChecker{
    public static int reverseNum(int num){
        int digit , reverse = 0;
        while (num > 0){
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reverse = reverseNum(num);
        if (num == reverse){
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
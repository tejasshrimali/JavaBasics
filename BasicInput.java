import java.util.Scanner;
class BasicInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = sc.nextInt();
        System.out.println("You entered: " + integer);
    }
}
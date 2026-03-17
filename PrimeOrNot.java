import java.util.Scanner;
class PrimeOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int facts = 0;
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                facts++;
            }
        }
        if(facts == 2){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
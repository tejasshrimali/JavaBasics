import java.util.Scanner;
class FactorialN{
    public static int Fact(int n ){
        if( n == 1) return 1;
        return n * Fact(n-1);
    }

    public static void main(String[] a){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number for its factorail;");
          int n = sc.nextInt();
          System.out.println("Factorial:"+Fact(n));
    }
}
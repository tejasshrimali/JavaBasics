import java.util.Scanner;
class SumOfTwoInteger{
    public static int Sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = Sum(a, b);
        System.out.println(result);
    }
}
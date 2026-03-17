import java.util.Scanner;
class MultiplyFloats{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float result = 0;
        if(a != 0 && b != 0) result = a * b;
        System.out.println("Result of float multiplication:" + result);
    }
}
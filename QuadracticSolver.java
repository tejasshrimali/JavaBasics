import java.util.Scanner;
class QuadracticSolver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float d = (b*b) - (4*a*c);
        float root1 = (float) ((-b + Math.sqrt(d)) / (2*a));
        float root2 = (float) ((-b - Math.sqrt(d)) / (2*a));

        System.out.println("The roots are: " + root1 + " and " + root2);

    }
}
import java.util.Scanner;
class AplhabetChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if ( (int)ch >= 65 && (int)ch <= 90 || (int)ch >= 97 && (int)ch <= 122){
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
       
    }
}
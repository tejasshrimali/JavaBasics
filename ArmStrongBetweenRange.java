import java.util.*;



public class ArmStrongBetweenRange {


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Give range in form of a b");

    int a = sc.nextInt();
    int b = sc.nextInt();
    ArmStrongNumber asn = new ArmStrongNumber();
    for(int i = a; i <= b; i++){
        int digits = String.valueOf(i).length();
        if(asn.isArmStrong(i, digits)){
          System.out.print(i +" ");
        }
    }
 }
}
class ArmStrongNumber{
    public boolean isArmStrong(int n , int noOfDigits){
        int o = n;
        int d = 0;
        int sum = 0;
        int p = 1;

        while (n > 0){
            d = n % 10;
            sum += Math.pow(d,noOfDigits);
            n /= 10;
        }
        if(sum == o){
            return true;
        }else{
            return false;
        }
    }

    // public static void main(String[] args){
    //     System.out.println(isArmStrong(153,3));
    // }
}

import java.util.Scanner;
class PrimeNumberBetweenIntervals{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int facts = 0;
        for(int i = a; i <=b;i++){
             if(isPrime(i)){
                System.out.print(i +" ");
             }
        }
    }

    public static boolean isPrime(int n){
        int facts = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                facts++;
            }
        }
        if(facts == 2){
            return true;
        }else{
            return false;
        }

    }
}
class GCDnLCM{
    public static int calcGCD(int a, int b){
        if (b == 0) {
            return a;
        }
        return calcGCD(b, a % b); 
    }

    public static int calcLCM(int a, int b){
        return (a * b) / calcGCD(a, b); 
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 15;

        int gcd = calcGCD(num1, num2);
        int lcm = calcLCM(num1, num2);

        System.out.println("GCD of  is: " + gcd);
        System.out.println("LCM of  is: " + lcm);
    }
}
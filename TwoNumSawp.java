class TwoNumSawp{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int temp = 0;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
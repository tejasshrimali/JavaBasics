import java.util.Scanner;
class CharFrequencyCalc{
    public static int calculateFre(String str , char a){
        int count = 0;
        for(int i = 0;i< str.length();i++){
            if(str.charAt(i) == a){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter a char");
        char a = sc.next().charAt(0);
        int frequency = calculateFre(str, a);
        System.out.println("Frequency of '" + a + "' in \"" + str + "\" is: " + frequency);
    }
}
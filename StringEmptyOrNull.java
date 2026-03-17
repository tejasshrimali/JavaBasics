import java.util.Scanner;
class StringEmptyOrNull{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        if(str == null){
            System.out.println("String is null");
        
        }else if(str.isEmpty()){
            System.out.println("String is empty");
        }else {
            System.out.println("String is:"+str);
        }
    }
}
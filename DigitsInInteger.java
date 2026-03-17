class DigitsInInteger{
    public static void main(String[] args){
        int integer = 456465;
        int count = 0;
        while(integer > 0){
            integer /= 10;
            count++;
        }

        System.out.println("Count:"+count);
    }
}
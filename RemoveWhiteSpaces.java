class RemoveWhiteSpaces{
    public static void main(String[] args){
        String str = "   Hello Wo rld!   ";
        String result = str.replaceAll("\s+", "");
        System.out.println(result);
    }
}
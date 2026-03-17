class RoundDecimalToNdigit{
    public static double roundToNDecimalPlaces(double number, int n) {
        double scale = Math.pow(10, n);
        return Math.round(number * scale) / scale;
    }
    public static void main(String[] args) {
        double number = 3.141592653589793;
        int n = 4;
        double roundedNumber = roundToNDecimalPlaces(number, n);
        System.out.println("Original number: " + number);
        System.out.println("Rounded to " + n + " decimal places: " + roundedNumber);
    }
}
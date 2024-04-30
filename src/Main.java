public class Main {

    private static String binary = "";

    static void convert(int number) {
        if(number==1) {
            binary = "1" + binary;
        }
        else {
            if(number % 2 == 0) {
                binary = "0" + binary;
            }
            else {
                binary = "1" + binary;
            }
            convert(number/2);
        }
    }

    public static void main(String args[]) {
        convert(10);
        System.out.println(binary);
    }
}

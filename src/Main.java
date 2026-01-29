public class Main {
    public static void main(String[] args) {
        Temperature temp1 = new Temperature(78.52, 54.59, "F");
        System.out.println(temp1.tempInfo());

        Temperature temp2 = new Temperature(23.90, 14.95, "C");
        System.out.println(temp2.tempInfo());

        Temperature temp3 = new Temperature(57.53, 38.65, "K");
        System.out.println(temp3.tempInfo());

        System.out.println(Temperature.convertFtoC(78.5));
        System.out.println(Temperature.convertCtoF(12.6));

        temp1.changeToC();
        System.out.println(temp1.tempInfo());

        temp1.changeToC();
        System.out.println(temp1.tempInfo());

        temp1.changeToF();
        System.out.println(temp1.tempInfo());

        temp1.changeToF();
        System.out.println(temp1.tempInfo());
    }
}
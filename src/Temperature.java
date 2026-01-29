public class Temperature {
    private double highTemp;
    private double lowTemp;
    private String tempScale;

    public Temperature(double high, double low, String scale) {
        highTemp = high;
        lowTemp = low;
        if (scale.equals("C")) {
            tempScale = "C";
        } else {
            tempScale = "F";
        }
    }

    public static double convertCtoF(double temp) {
        return temp * 9 / 5 + 32;
    }

    public static double convertFtoC(double temp) {
        return (temp - 32) * 5 / 9;
    }

    public void changeToC() {
        if (tempScale.equals("F")) {
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);
            tempScale = "C";
        }
    }

    public void changeToF() {
        if (tempScale.equals("C")) {
            highTemp = convertCtoF(highTemp);
            lowTemp = convertCtoF(lowTemp);
            tempScale = "F";
        }
    }

    public String tempInfo() {
        return "High Temperature: " + highTemp + " " + tempScale + "\nLow Temperature: " + lowTemp + " " + tempScale;
    }
}
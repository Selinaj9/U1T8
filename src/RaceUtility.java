public class RaceUtility {
    public static double milesToKm(double miles) {
        return miles * 1.609;
    }

    public static double kmToMiles(double km) {
        return km * 0.621;
    }

    public static String makeProper(String x) {
        x = x.toLowerCase();
        String ans = "";
        int idx = -1;
        for (int i = 0; i < x.length(); i++) {
            String letter = x.substring(i, i + 1);
            if (i == 0) {
                ans += letter.toUpperCase();
            } else {
                if (letter.equals(" ")) {
                    idx = i + 1;
                }
                if (idx == i) {
                    ans += letter.toUpperCase();
                } else {
                    ans += letter;
                }
            }
        }
        return ans;
    }
}
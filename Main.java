public class Main {

    public static String ageOfManAndTemperature(int ageOfMan, int temperature) {

        if (ageOfMan >= 20 && ageOfMan <= 45 && temperature <= -20 && temperature <= 30) {
            return "Can go to walk";
        }
        else if (ageOfMan < 20 && temperature >= 0 && temperature <= 28) {
            return "Can go to walk";
        }
        else if (ageOfMan > 45 && temperature >= -10 && temperature <= 25) {
            return "Can go to walk";
        }
        else {
            return "Stay at home";
        }
    }

    public static void main(String  [] arg) {
        System.out.println (ageOfManAndTemperature(22, -30));
        System.out.println (ageOfManAndTemperature(48, 11));
        System.out.println (ageOfManAndTemperature(35, 25));
        System.out.println (ageOfManAndTemperature(70, 33));
        System.out.println (ageOfManAndTemperature(40, -30));


    }
}

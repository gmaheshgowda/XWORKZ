package Methods;
public class Projector {
    static String projectorStatus = "OFF";
    static int currentBrightness;
    static int minBrightness = 0;
    static int maxBrightness = 10;

    public static void acOnOffSwitch() {
        if (projectorStatus == "OFF") {
            projectorStatus = "ON";
            System.out.println("Your Projector is now turned on");
        } else {
            projectorStatus = "OFF";
            System.out.println("Your Projector is now turned OFF");
        }
    }

    public static void increaseBrightness() {
        if (projectorStatus == "ON") {
            if (currentBrightness < 5) {
                currentBrightness++;
                System.out.println("Your current brightness is: " + currentBrightness);
            } else {
                System.out.println("The Projector is at max brightness");
            }
        } else {
            System.out.println("Your Projector is in Off condition, please turn it on");
        }
    }

    public static void decreaseBrightness() {
        if (projectorStatus == "ON") {
            if (currentBrightness > 0) {
                currentBrightness--;
                System.out.println("Your current brightness is: " + currentBrightness);
            } else {
                System.out.println("The Projector is at the lowest brightness level");
            }
        } else {
            System.out.println("Your Projector is in Off condition, please turn it on");
        }
    }
}

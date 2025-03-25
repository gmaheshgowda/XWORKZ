package Methods;
public class Mixer {
    static String mixerStatus = "OFF";
    static int currentLevel;
    static int minLevel = 0;
    static int maxLevel = 10;

    public static void acOnOffSwitch() {
        if (mixerStatus == "OFF") {
            mixerStatus = "ON";
            System.out.println("Your Mixer is now turned on");
        } else {
            mixerStatus = "OFF";
            System.out.println("Your Mixer is now turned OFF");
        }
    }

    public static void increaseSpeed() {
        if (mixerStatus == "ON") {
            if (currentLevel < 5) {
                currentLevel++;
                System.out.println("Your current speed is: " + currentLevel);
            } else {
                System.out.println("The Mixer is at max speed");
            }
        } else {
            System.out.println("Your Mixer is in Off condition, please turn it on");
        }
    }

    public static void decreaseSpeed() {
        if (mixerStatus == "ON") {
            if (currentLevel > 0) {
                currentLevel--;
                System.out.println("Your current speed is: " + currentLevel);
            } else {
                System.out.println("The Mixer is at the lowest speed");
            }
        } else {
            System.out.println("Your Mixer is in Off condition, please turn it on");
        }
    }
}

package Methods;
public class Radio {
    static String radioStatus = "OFF";
    static int currentFrequency;
    static int minFrequency = 87;
    static int maxFrequency = 108;

    public static void acOnOffSwitch() {
        if (radioStatus == "OFF") {
            radioStatus = "ON";
            System.out.println("Your Radio is now turned on");
        } else {
            radioStatus = "OFF";
            System.out.println("Your Radio is now turned OFF");
        }
    }

    public static void increaseFrequency() {
        if (radioStatus == "ON") {
            if (currentFrequency < 108) {
                currentFrequency++;
                System.out.println("Your current frequency is: " + currentFrequency + " MHz");
            } else {
                System.out.println("The Radio is at max frequency");
            }
        } else {
            System.out.println("Your Radio is in Off condition, please turn it on");
        }
    }

    public static void decreaseFrequency() {
        if (radioStatus == "ON") {
            if (currentFrequency > 87) {
                currentFrequency--;
                System.out.println("Your current frequency is: " + currentFrequency + " MHz");
            } else {
                System.out.println("The Radio is at the lowest frequency");
            }
        } else {
            System.out.println("Your Radio is in Off condition, please turn it on");
        }
    }
}

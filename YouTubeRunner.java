package Methods;

public class YouTubeRunner {
    public static void main(String[] args) {
        System.out.println("YouTube login with email & recovery email: " + YouTube.login("ytUser@gmail.com", "ytPass", "backup@gmail.com"));
        System.out.println("YouTube login with phone: " + YouTube.login(9876543210L, "ytPass"));
        System.out.println("YouTube login with username, OTP & 2FA: " + YouTube.login("YTuser90", "ytPass", "ytUser@gmail.com", 1234));
            }
}


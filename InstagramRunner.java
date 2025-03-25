package Methods;

public class InstagramRunner {
    public static void main(String[] args) {
        System.out.println("Instagram login with email & OTP: " + Instagram.login("instaUser@gmail.com", "instaPass", 1234));
        System.out.println("Instagram login with phone: " + Instagram.login(9876543210L, "instaPass"));
        System.out.println("Instagram login with username & password : " + Instagram.login("instaUser90", "instaPass", "instaUser@gmail.com"));
        
    }
}

package Methods;

public class SnapchatRunner {
    public static void main(String[] args) {
        System.out.println("Snapchat login with phone & security code: " + Snapchat.login(9876543210L, "snapPass", 1234));
        System.out.println("Snapchat login with email & password (returns status code): " + Snapchat.login("snapUser@gmail.com", "snapPass"));
        System.out.println("Snapchat login with username & security question: " + Snapchat.login("snapUser90", "snapPass", "snapUser@gmail.com"));
       
    }
}


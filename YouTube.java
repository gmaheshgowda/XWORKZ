package Methods;

public class YouTube {

    public static boolean login(long phone, String password) {
        return phone > 0 && password != null;
    }

    public static String login(String email, String password, String recoveryEmail) {
        if (email != null && password != null && recoveryEmail.contains("@")) {
            return "Login successful with recovery email";
        }
        return "Login unsuccessful";
    }

    public static String login(String username, String password, String email, int otp) {
        if (!username.isEmpty() && password != null && email != null && otp > 999) {
            return "Login successful";
        }
        return "Login unsuccessful";
    }

}

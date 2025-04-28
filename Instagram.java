package Methods;

public class Instagram {

    public static boolean login(long phone, String password) {
        return phone > 0 && password != null;
    }

    public static String login(String email, String password, int otp) {
        if (email != null && password != null && otp > 999) {
            return "Login successful with OTP verification";
        }
        return "Login unsuccessful";
    }

    public static String login(String username, String password, String email) {
        if (!username.isEmpty() && password != null && email != null ) {
            return "Login successful with security question verification";
        }
        return "Login unsuccessful";
    }

 
}


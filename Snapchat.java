package Methods;

public class Snapchat {

    public static boolean login(long phone, String password, int securityCode) {
        if( phone > 0 && password != null && securityCode == 1234){
            return true;
        }
        return false;
    }

    public static String login(String email, String password) {
        if (email != null && password != null) {
            return "SucessFull"; 
        }
        return "unsuccessfull"; 
    }

    public static String login(String username, String password, String email) {
        if (!username.isEmpty() && password != null && email != null) {
            return "Login successful via security question";
        }
        return "Login unsuccessful";
    }

}


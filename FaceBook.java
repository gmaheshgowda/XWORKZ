package Methods;

public class FaceBook {
    
    public static String login(long phone,String password)
    {
      String loginmsg = null;
        if(phone > 0 && password != null)
        {
            loginmsg = "login successfull";
        }
        else{
            loginmsg = "login unsuccessfull";
        }
        return loginmsg;
    }
    public static String login(String email,String password)
    {
      String loginmsg = null;
        if(email != null && password != null)
        {
            loginmsg = "login successfull";
        }
        else{
            loginmsg = "login unsuccessfull";
        }
        return loginmsg;
    }
    public static String login(String userId,String password,String email)
    {
      String loginmsg = null;
        if(email != null && password != null && !userId.isEmpty())
        {
            loginmsg = "login successfull";
        }
        else{
            loginmsg = "login unsuccessfull";
        }
        return loginmsg;
    }
    public static String login(String YesorNo)
    {
        if(YesorNo == "Yes")
        {
            return "your login info saved";
        }
        else if(YesorNo == "No")
        {
            return "login Info Not Saved";
        }
        else {
            System.out.println("please say Nes or No");
        }
        return null;
    }

}

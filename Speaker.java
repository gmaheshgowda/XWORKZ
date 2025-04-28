package Methods;
public class Speaker {
  static  String speakerStatus = "OFF";
  static int currrentVolume;
  static int minVolume = 0;
  static int maxVolume = 10;
    public static void acOnOffSwitch()
    {
        if(speakerStatus == "OFF")
        {
            speakerStatus = "ON"; 
            System.out.println("your Speaker is now turned on");           
        }
        else{
            speakerStatus = "OFF";
            System.out.println("Your speaker is now turned OFF");
        }
        
    }
public static void increasevolume()
{
    if(speakerStatus == "ON")
    {
        if(currrentVolume <5 )
        {
            currrentVolume++;
            System.out.println("you current volume is : "+currrentVolume);
        }
        else{
            System.out.println("The speaker is at max volume ");
        }
        
    }else{
        System.out.println("your Speaker is in Off condition please turn it on ");
    }
}
public static void decreaseVolume()
{
    if(speakerStatus == "ON")
    {
        if(currrentVolume > 0 )
        {
            currrentVolume--;
            System.out.println("you current volume is : "+currrentVolume);
        }
        else{
            System.out.println("The speaker is at mute condition ");
        }
        
    }else{
        System.out.println("your Speaker is in Off condition please turn it on ");
    }
}
    
}


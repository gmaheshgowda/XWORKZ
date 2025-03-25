package Methods;
public class InsuranceProvider {
    public static double search(String insuranceName)
    {
        double termPrice = 0.0;
        if (insuranceName == "SBI term Life Insurance") {
            termPrice = 9000.0;
            
        }
        else if (insuranceName == "Hdfc term Life Insurance") {
            termPrice =5600.0 ;
            
        }
        else if (insuranceName ==  "Bajaj Aliance Life Insurance") {
            termPrice = 7890.0 ;
            
        }
        else if (insuranceName == "LIC life Insurance") {
            termPrice =4560.98 ;
            
        }
        else if (insuranceName == "reliance Life Insurance") {
            termPrice = 6544.09 ;
            
        }
        else if (insuranceName == "Max life Insurance") {
            termPrice =5643.98 ;
            
        }
        else if (insuranceName ==  "CANARA Life Insurance") {
            termPrice =10009.98;
            
        }
        else if (insuranceName == "Policy Bazaar Life Insurance" ) {
            termPrice =6799.06;
            
        }
        else if (insuranceName == "Shriram life Insurance") {
            termPrice =9999.99 ;
            
        }
        else if (insuranceName =="Bank of Baroda Life Insurance policy" ) {
            termPrice =8956.85 ;
        }
        else{
            System.out.println(insuranceName+" : this name is not valid ");
        }
        return termPrice;
      
    }
    
    
}

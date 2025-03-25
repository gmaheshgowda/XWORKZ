package Methods;

public class InsuranceProviderRunner {
    public static void main(String[] args) {
        double termprice = InsuranceProvider.search("CANARA Life Insurance");
        System.out.println("the term price for the insurance provider is "+termprice+"/-Rupees only");
    }
    
}
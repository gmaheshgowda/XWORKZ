public class AmazonRunner {
    public static void main(String[] args) {
        Amazon ref1= new Amazon("mahesh", "Hindupur", "9019463973", 07);
        System.out.println("the name of the user is : "+ref1.name);
        System.out.println("the address of the user is : "+ref1.adress);
        System.out.println("the phone of the user is : "+ref1.phone);
        System.out.println("the id of the user is : "+ref1.id);


        Amazon ref2= new Amazon("surya", "banglore", "9019463433", 06);
        System.out.println("the name of the user is : "+ref2.name);
        System.out.println("the address of the user is : "+ref2.adress);
        System.out.println("the phone of the user is : "+ref2.phone);
        System.out.println("the id of the user is : "+ref2.id);

        


 
     }
    
}

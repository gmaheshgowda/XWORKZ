package Methods;

public class FaceBookRunner {
    public static void main(String[] args) {
        System.out.println("method with 2 parameters  : "+FaceBook.login("gmahesh@gmail.com", "mahesh1234"));
        System.out.println("method with 2 parameters and diff types : "+FaceBook.login(9019463973L, "mahesh1234"));
        System.out.println("method with 3 parameters : "+FaceBook.login("maheshgowda90", "mahesh1234", "gmahesh@gmail.com"));
        System.out.println(FaceBook.login("Yes"));
      
    }
    
}

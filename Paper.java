package ConstructorChaining;

public class Paper {
    String name;
    int circulation ;       
    String format ;    
    double price ;            
    boolean isDigital ; 
    long ownerId;           

    Paper(){
        this("mahesh");
    }
    Paper(String name)
    {
        this(5600);
        this.name = name;
    }
    Paper(int circulation)
    {
        this(3.80);
        this.circulation = circulation;
    }
    Paper(double price)
    {
        this(true);
        this.price = price;
    }
    Paper(boolean isDigital)
    {
        this(901934598L);
        this.isDigital = isDigital;
    }
    Paper(long ownerId)
    {
        this("mahesh",3.45);
        this.ownerId = ownerId;
    }
    Paper(String name,double price)
    {
        this.name = name;
        this.price = price;
    }


    public void displayInfo()
    {
        System.out.println("the name of the consumer :"+name);
        System.out.println("the format of the psper is : "+format);
        System.out.println("the circulation of the paper is :"+circulation);
        System.out.println("the owner id is as follows : "+ownerId);
        System.out.println("is the paper digital or not : "+isDigital);
        System.out.println("the price of the paper is : "+price);

    }
    public static void main(String[] args) {
        Paper ref1 = new Paper();
        ref1.displayInfo();
    }
}


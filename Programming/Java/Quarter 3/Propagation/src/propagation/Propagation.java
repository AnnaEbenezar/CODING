package propagation;

public class Propagation {

    public static void main(String[] args) 
    {
        ExceptionScope demo = new ExceptionScope();
        
        System.out.println("Programming beginning.");
        demo.level1();
        System.out.println("Program ending.");
    }
    
}

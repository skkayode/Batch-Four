package methodoverloadingclass;

/**
 *
 * @author KayodeOluseyiR
 */
public class MethodOverloadingClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       System.out.println(Add(10,25));
       
       System.out.println(Add("seyi"," weds sandra"));
       
       System.out.println(Add(2.6,25.1));
    }
    
    public static int Add (int a, int b){
        return (a + b); 
    }
    
    public static String Add (String a, String b){
        return (a + b); 
    }
    
    public static double Add (double a, double b){
        return (a * b); 
    }
//this is calledmethod overloading    
//this above is called method overloading, (method overload/; this is when you define differentmethods with the samename but perform different logic, that is called overloading)
//you can define different method with the same name to perform different operations but logically they'll be doing the same kind of work
}

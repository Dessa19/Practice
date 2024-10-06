public class ExceptionHandling {
    public static void main(String[] args) {

/* below is the code for to handle exception that happend when we do programming.
*/
     try {
         int myInt = Integer.parseInt("Dessalew");  //this code is the one make error and exception

     } catch (Exception e) {
         System.out.println("Hello Dude your are wrong");// this code is catch the error or exception.if try block correct  the catch block never excecuted .

     }finally {
         System.out.println("in the finally block");// this code is the one we want to excute even if it is Exception (wrong)
     }
        System.out.println("End here");

     //we can invoke  methods in try block example is below.
        try {
            getInt();

        } catch (NumberFormatException e) {
            System.out.println("Hello Dude your are wrong");
        }
        finally {
            System.out.println("in the finally block");
        }
    }
    private static void getInt(){
        int myInt = Integer.parseInt("Dessalew");
    }
}
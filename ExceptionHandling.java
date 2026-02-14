public class ExceptionHandling {
    public static void main(String[] args) {
        // int a = 10;
        // int b =0 ;
        // System.out.println("Hello");
        
        // System.out.println(a/b);
        
        // exception Exception handling without using tru and catch 
        

        // if(b!=0){
        //     System.out.println(a/b);
        // }
        // else{
        //     System.out.println("B is 0");
        // }

        // System.out.println("Hi");

        int a=10;
        int b = 0;
        int arr[]={2,4,5,7};
        try {
            System.out.println("Start of try");
            System.out.println(a/b);
            System.out.println(arr[5]);
            System.out.println("End of Try");


        } catch (Exception e) {                                                             //NOT RECOMMENDED 
            System.out.println(e);
            System.out.println("Message --> "+e.getMessage());
        }
        // } catch (ArrayIndexOutOfBoundsException e) {                                         //ALWAYS RECOMMENDED TO RUDECE TIME 
        //     System.out.println("Error");
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Error1");
        // }
        // catch(NullPointerException e){
        //     System.out.println("Error3");
        // }

    }
}

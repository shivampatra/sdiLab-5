import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;
public class Netflix{
    // public void validateAge(int age){
    public Netflix(int age) throws InvalidAgeException{
        if(age<16){
            // System.out.println("Your age is not valid for this content");
            throw new InvalidAgeException("Your age should be greater than 16 , then only you can access Netflix ! ");
        }
    }
    public void showContent(){
            System.out.println("Welcome to Netflix");
    }
    // public static void main(String[] args) throws InvalidAgeException {               //NOT A GOOD PRACTIcE
    public static void main(String[] args)throws IOException{
        try{
            // Scanner sc = new Scanner(System.in);
            // System.out.print("Enter your age : ");
            // int n = sc.nextInt();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your age : ");
            int i = Integer.parseInt(br.readLine());
        Netflix obj = new Netflix(i);
        obj.showContent();
            }
    catch(InvalidAgeException e){
                System.out.println(e.getMessage());
            } 
  
  finally{
    // sc.close();
    System.out.println("Thank you !");
  }
        }

}


class InvalidAgeException extends Exception {
                    public InvalidAgeException(String message){
                        super(message);
                    }
}
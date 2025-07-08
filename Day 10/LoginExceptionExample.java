import java.util.*;
class PasswordException extends Exception{
    public PasswordException(String message){
        super(message);
    }
}
class UsernameException extends Exception{
    public UsernameException(String message){
        super(message);
    }
}
public class LoginExceptionExample {
    public static void main(String[] args) throws PasswordException, UsernameException{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String uname = input.next();
        System.out.print("Enter password: ");
        String pass = input.next();
        if(!uname.equals("admin")) throw new UsernameException("Invalid user");
        if(!pass.equals( "1234")) throw new PasswordException("Invalid password");
        System.out.println("Login Successfull");
    }    
}

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
    static Map<String, String> map = new HashMap<>();
    static {
        map.put("admin", "1234");
        map.put("abhinav", "abcd");
        map.put("rahul", "1098");
        map.put("aman", "1111");

    }
    public static void main(String[] args) throws PasswordException, UsernameException{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String uname = input.next();
        System.out.print("Enter password: ");
        String pass = input.next();
        try {
            login(uname, pass);
        } catch (UsernameException e) {
            System.out.println("UsernameException Occurred : "+e.getMessage());
        }catch (PasswordException e){
            System.out.println("PasswordException Occurred: "+e.getMessage());
        }
    }
    static void login(String uname, String pass)throws UsernameException, PasswordException{
        if(!map.containsKey(uname)) throw new UsernameException("Invalid username");
        if(!map.get(uname).equals(pass)) throw new PasswordException("Invalid password");
        System.out.println("Successful Login!!");
    }    
}

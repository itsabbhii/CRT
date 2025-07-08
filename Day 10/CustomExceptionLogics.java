
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}

public class CustomExceptionLogics {
    public static void main(String[] args) {
        try {
            int x = -1, y = 0;
            if(y>x) throw new CustomException("Y should be lesser than X");
            if(y == 0) throw new ArithmeticException("Divisor can't be zero");
            System.out.println("result = "+x/y);
        } catch (CustomException e) {
            System.out.println("Custom excpetion occured: "+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Arithmetic error occured: "+e.getMessage());
        }finally{
            System.out.println("This block will always execute");
        }
    }
    
    static void ThrowsImplementation() throws CustomException{
        int x = 10, y = 9;
        if(x > y) throw new CustomException("Y should be lesser than X");
        if(y == 0) throw new ArithmeticException("Divisor can't be zero");
        System.out.println("result = "+x/y);
    }
}

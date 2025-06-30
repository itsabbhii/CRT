import java.util.*;
public class RollerCoaster{
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        System.err.print("Enter height in cms: ");
        height = sc.nextInt();
        if (height > 120) {
            System.out.println("You can ride");
            System.out.print("Enter the age: ");
            int age = sc.nextInt();
            int fare;
            if (age < 12) {
                System.out.println("Ticket price is $5!!");
                fare = 5;
            }else if (age <= 18 && age >= 12){
                System.out.println("Ticket price is $7!!");
                fare = 7;
            }else{
                System.out.println("Ticket price is $12!!");
                fare = 12;
            }
            System.out.print("Want photo??(yes/no) : ");
            String photo = sc.next();
            if("yes".equals(photo)){
                fare = fare + 3;
            }
            System.out.println("Total bill is $"+fare);
        }
        else{
            System.out.println("You can't ride");
        }
        sc.close();
    }
}
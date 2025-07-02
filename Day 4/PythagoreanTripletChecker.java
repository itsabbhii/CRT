import java.util.*;

public class PythagoreanTripletChecker {
    static int square(int a){
        return a*a;
    }
    static boolean isPythagoreanUsingFormula(int n1, int n2, int n3){
        int max = Math.max(n1, n2);
        max = Math.max(max, n3);
        return square(n1)+square(n2)+square(n3) == 2*square(max);
    }
    static boolean isPythagoreanTriplet(int n1, int n2, int n3){
        int[] arr = {n1, n2, n3};
        Arrays.sort(arr);
        return (square(arr[2]) == (square(arr[0])+square(arr[1])));    
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int n3 = input.nextInt();

        String answer = isPythagoreanUsingFormula(n1, n2, n3) ? "Yes" : "No";
        System.out.println("Answer is : "+ answer);
    }    
}

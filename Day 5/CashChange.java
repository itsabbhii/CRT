import java.util.*;

public class CashChange {
    static ArrayList<Integer> findChange(int amt, Integer[] cash){
        Arrays.sort(cash, (a, b) -> b - a);
        int counter = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(amt != 0 && counter < cash.length){
            if(cash[counter] <= amt){
                amt -= cash[counter];
                ans.add(cash[counter]);
            }
            else{
                counter++;
            }
        }
        return ans; 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = input.nextInt();
        Integer[] cash = {2, 1, 10, 5, 20, 100, 50, 2000, 200, 500};
        
        ArrayList<Integer> change = findChange(amount, cash);
        System.out.println("Change is given by: "+ change);
    }    
}

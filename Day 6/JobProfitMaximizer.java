import java.util.*;

class Job{
    String id;
    int deadline;
    int profit;

    public Job(String id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
    
}
public class JobProfitMaximizer {
    static int maxProfit(Job[] jobs, int maxDeadline){
        Arrays.sort(jobs, (a, b) -> (b.profit - a.profit));

        int totalProfit = 0;
        

        String[] jobsOrder = new String[maxDeadline];
        boolean[] isOccupied = new boolean[maxDeadline];
        
        for(Job job: jobs){
            for(int i = job.deadline-1; i>=0; i++){
                if(!isOccupied[i]){
                    totalProfit+=job.profit;
                    jobsOrder[i] = job.id;
                    isOccupied[i] = true;
                }
            }
        }
        return totalProfit;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Job[] jobs = new Job[n];
        int maxDeaadline = 0;

        for(int i =0 ; i< n ; i++){
            String ch = input.next();
            int deadine = input.nextInt();
            int profit = input.nextInt();
            if(deadine > maxDeaadline) maxDeaadline = deadine;
            jobs[i] = new Job(ch, deadine, profit);
        }

        System.out.println(maxProfit(jobs, maxDeaadline));

    }
}

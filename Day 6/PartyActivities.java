import java.util.*;

class Activity{
    int start;
    int finish;

    Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "Started at "+ start + " finshed at "+ finish;
    }

}

public class PartyActivities {
    static int maximumNumberOfActivities(Activity[] activities){
        Arrays.sort(activities, (a, b) -> a.finish - b.finish);

        List<Activity> selected = new ArrayList<>();
        selected.add(activities[0]);
        int lastFinish = activities[0].finish;

        for(int i= 1; i<activities.length; i++){
            if(activities[i].start >= lastFinish){
                lastFinish = activities[i].finish;
                selected.add(activities[i]);
            }
        }

        return selected.size();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Activity[] activities = new Activity[n];

        for(int i = 0; i < n; i++){
            int start = input.nextInt();
            int finish = input.nextInt();
            activities[i] = new Activity(start, finish);
        }

        System.out.println(maximumNumberOfActivities(activities));
        
    }    
}

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

public class ActivitySelection {
    static int findMaximumNumberOfActivities(Activity[] activities){
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
        Integer[] start = {3, 3, 1, 5};
        Integer[] finish = {7, 4, 2, 9};

        Activity[] activities = new Activity[start.length];

        for(int i = 0; i < start.length; i++){
            activities[i] = new Activity(start[i], finish[i]);
        }

       
        System.out.println("Number of Activities: " + findMaximumNumberOfActivities(activities));
        
    }    
}

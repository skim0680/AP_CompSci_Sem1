public class StepTracker{
    private int days;
    private int adays;
    private int totstep;
    private int req;
    
    public StepTracker(int req){
        this.req = req;
        days = 0;
        adays = 0;
        totstep = 0;
    }
    
    public void addDailySteps(int steps){
        days = days + 1;
        totstep = totstep + steps;
        if(steps>=req){
            adays = adays + 1;
        }
        return;
    }
    public int activeDays(){
        return adays;
    }
    public double averageSteps(){
        return totstep/days;
    }
}
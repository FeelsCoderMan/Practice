public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        // your code
        if(v1>=v2){
            return null;
        }
        float timeRace=(float) g/(v2-v1);
        int[] timeSolution= new int[3];
        timeSolution[0]=(int) timeRace;
        timeSolution[1]=(int) ((timeRace-timeSolution[0])*60);
        timeSolution[2]=(int) ((timeRace-timeSolution[0]-timeSolution[1]/60.0)*3600.0);
        return timeSolution;


    }
}
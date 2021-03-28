public class Line {
    public static String Tickets(int[] peopleInLine)
    {
        int bill25=0;
        int bill50=0;

        for(int bill:peopleInLine){
            switch(bill){
                case 25:
                    bill25++;
                    break;
                case 50:
                    bill50++;
                    if(bill25<0){
                        return "NO";
                    }else{
                        bill25--;
                    }
                    break;
                case 100:
                    if(bill50>0 && bill25>0){
                        bill50--;
                        bill25--;
                    }else if(bill25>=3){
                        bill25-=3;
                    }else{
                        return "NO";
                    }
                    break;
                default:
                    break;

            }
        }
        return "YES";
    }
}
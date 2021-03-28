import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        List<Integer> resultList=new ArrayList<Integer>();
        int num=0;
        char[] dataArray=data.toCharArray();
        for(char letter:dataArray){
            switch(letter){
                case 'i':
                    num++;
                    break;
                case 'd':
                    num--;
                    break;
                case 's':
                    num*=num;
                    break;
                case 'o':
                    resultList.add(num);
                    break;
            }
        }
        int [] resultArray=new int[resultList.size()];
        for(int i=0;i<resultList.size();i++){
            resultArray[i]=resultList.get(i);
        }
        return resultArray;

    }
}

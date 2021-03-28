import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public  static int findIt(int[] a) {
        Map<Integer,Integer> lst=new HashMap<>();
        for(int num:a){
            if(lst.get(num)==null){
                lst.put(num,1);
            }else{
                lst.put(num,lst.get(num)+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: lst.entrySet()){
            if(entry.getValue()%2==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
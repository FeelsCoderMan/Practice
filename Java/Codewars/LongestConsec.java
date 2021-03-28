import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        // Validation
        if((strarr.length==0) || (k> strarr.length) || (k<=0)){
            return "";
        }
        // <consecutive string,its length>
        Map<String,Integer> concatenateStringMap=new LinkedHashMap<>();

        for(int i=0;i< strarr.length-(k-1);i++){
            String concatString="";
            int counter=0;
            while(true){
                concatString+=strarr[i+counter];
                counter++;
                if(counter==k){
                    break;
                }
            }
            concatenateStringMap.put(concatString,concatString.length());
        }
        // Sort by key's value in reverse order
        Map<String,Integer> concatenateStringMapSorted=concatenateStringMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)-> e1,LinkedHashMap::new));
        // Return first key of map
        for(Map.Entry<String,Integer> entry:concatenateStringMapSorted.entrySet()){
            return entry.getKey();
        }










        return null;
    }
}
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        int binaryLen=binary.size()-1;
        int total=0;
        for(Integer num:binary){
            if(num==1) {
                Double dNum = Double.valueOf(binaryLen);
                total += (int) (Math.pow(2.0, dNum));
                binaryLen--;
            }else{
                binaryLen--;
            }
        }
        return total;
    }
}
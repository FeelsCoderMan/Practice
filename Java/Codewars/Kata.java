public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String result="(";
        for(int i=0;i<numbers.length;i++){
            switch(i){
                case 0:
                case 1:
                case 2:
                case 4:
                case 6:
                case 7:
                case 8:
                case 9:
                    result+=numbers[i];
                    break;
                case 3:
                    result+=") ";
                    result+=numbers[i];
                    break;
                case 5:
                    result+=numbers[i];
                    result+="-";
                    break;
            }
        }
        return result;
    }
}
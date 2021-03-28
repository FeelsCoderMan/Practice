public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        if(walk.length!=10){
            return false;
        }
        int horizontal=0;
        int vertical=0;
        for(char direction:walk){
            switch(direction){
                case 'n':
                    vertical++;
                    break;
                case 's':
                    vertical--;
                    break;
                case 'w':
                    horizontal--;
                    break;
                case 'e':
                    horizontal++;
                    break;
            }
        }
        return (horizontal==0) && (vertical==0);
    }
}
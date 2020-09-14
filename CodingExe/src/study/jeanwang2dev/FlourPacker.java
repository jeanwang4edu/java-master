package study.jeanwang2dev;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int flourTotal = 5 * bigCount + smallCount;
        return flourTotal >= goal && goal % 5 <= smallCount;
    }
}



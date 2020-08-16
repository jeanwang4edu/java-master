public class BarkingDog {

    public static boolean  shouldWakeUp(boolean barking, int hourOfDay){
        boolean result = false;

        if(barking){
            if(hourOfDay < 8 || hourOfDay > 22) {
                result = true;
            }
            if( hourOfDay < 0 || hourOfDay > 23) {
                result = false;
            }
        }
        return result;
    }
}

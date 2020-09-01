package study.jeanwang2dev;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
	    // write your code here
        System.out.println( getDurationString(65, 45 ) );
        System.out.println( getDurationString( 3945L));
        System.out.println( getDurationString( -41 ));
        System.out.println( getDurationString( 65, 9));
    }

    private static String getDurationString(long minutes, long seconds){
        // validate
        if(minutes < 0 || seconds < 0 || seconds > 60) {
            return INVALID_VALUE_MESSAGE;
        }
        // calculate hour minute and second and return a string
        long hour = minutes / 60 ;
        long remaining_min = minutes % 60;
        return hour + "h " + remaining_min + "m " + seconds + "s";
    }

    private static String getDurationString(long seconds) {
        if( seconds < 0 ){
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remaining_seconds = seconds % 60;
        return getDurationString(minutes, remaining_seconds);
    }
}

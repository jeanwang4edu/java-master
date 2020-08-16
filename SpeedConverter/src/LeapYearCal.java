public class LeapYearCal {

    public static boolean isLeapYear(int year){
        if( !(year >= 1 && year <= 9999) ){
            return false;
        }
        // calculate the year
        int result1 = year % 4;
        int result2 = year % 100;
        int result3 = year % 400;

//        if( result1 == 0 ) {
//            if ( result2 == 0 ){
//                if( result3 == 0 ){
//                    return true;
//                } else {
//                    return false;
//                }
//            } else{
//                return true;
//            }
//        } else {
//            return false;
//        }
        if ( ( result1 == 0 && !(result2 == 0) ) || result3 == 0 ) {
            return true;
        } else {
            return false;
        }

    }
}

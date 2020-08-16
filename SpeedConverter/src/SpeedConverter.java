public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if ( kilometersPerHour < 0 ) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if( kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = Math.round( toMilesPerHour(kilometersPerHour) );
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        //System.out.printf("%5.2f km/h = %d mi/h%n", kilometersPerHour, milesPerHour);
    }

}


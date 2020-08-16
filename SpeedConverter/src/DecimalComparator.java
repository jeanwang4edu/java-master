public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces( double paraOne, double paraTwo ){

        return ( (int)(paraOne * 1000) == (int)(paraTwo * 1000) ) ;

    }
}

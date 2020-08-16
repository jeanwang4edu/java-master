public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes( int kiloBytes ){

        if( kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        //calculate the result from kiloBytes
        int megabytes = kiloBytes / 1024;
        int remaining_kilobytes = kiloBytes % 1024;

        System.out.printf("%d KB = %d MB and %d KB%n", kiloBytes, megabytes, remaining_kilobytes);
    }

}

package study.jeanwang2dev;

public class DiagonalStar {

    public static void printSquareStar(int number){
        if(number >= 5 ) {

            for (int row = 1; row <= number; row++) {
                for (int col = 1; col <= number; col++) {
                    // first or last row, first or last column
                    // row number equals to column number
                    // column number equals rowCount - currentRow + 1
                    if (row == 1 || row == number || col == 1 || col == number || row == col ||  col == number - row + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                    // last row, print return for moving to next line
                    if (col == number) {
                        System.out.println();
                    }
                }
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}

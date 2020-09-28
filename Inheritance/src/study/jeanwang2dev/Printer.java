package study.jeanwang2dev;

public class Printer {

    private double tonerLevel = 100;
    private int numOfPagesPrinted = 0;
    private boolean isDuplexPrinter;
    private double tonerPerSide = 0.2;

    public Printer(){
        this.numOfPagesPrinted = 0;
        this.tonerLevel = 0;
        this.isDuplexPrinter = false;
    }

    public Printer(int tonerLevel, int numOfPagesPrinted, boolean isDuplexPrinter) {
        if( numOfPagesPrinted > 0){
            this.numOfPagesPrinted = numOfPagesPrinted;
        }
        if( tonerLevel > -1 && tonerLevel < 100){
            this.tonerLevel = tonerLevel;
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumOfPagesPrinted() {
        return numOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public void fillUpToner(){
        tonerLevel = 100;
        System.out.println("Printer fill up");
    }

    public void print(int pages){
        // each page cost 0.2 toner
        int pagesToPrint = pages;
        int pageCount = 0;
        while( pagesToPrint > 0 ) {
            if( tonerLevel > tonerPerSide ){
                tonerLevel -= tonerPerSide;
                pagesToPrint--;
                pageCount++;
            } else {
                System.out.println("not enough toner...paper didn't print");
                break;
            }
        }
       // System.out.println("numOfPagesPrinted: " + pageCount);

        if( isDuplexPrinter){
            pageCount = (pageCount / 2 ) + ( pageCount % 2);
            numOfPagesPrinted += pageCount;
            System.out.println("printing in duplex mode");
        } else {
            numOfPagesPrinted += pageCount;
            System.out.println("printing in single page mode");
        }

    }

    public double addToner(int tonerAmount){
        if( tonerAmount > 0 && tonerAmount <= 100){
            if( this.tonerLevel + tonerAmount > 100){
                return  -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }

}

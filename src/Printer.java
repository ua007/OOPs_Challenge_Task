public class Printer implements PrinterFunctions{

    private double tonerLevel;
    private int pagesPrinted;
    private boolean duplexOrNot;


    public double getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(double tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean isDuplexOrNot() {
        return duplexOrNot;
    }

    public void setDuplexOrNot(boolean duplexOrNot) {
        this.duplexOrNot = duplexOrNot;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                ", duplexOrNot=" + duplexOrNot +
                '}';
    }

    @Override
    public String tonnerFilling() {
        if (this.tonerLevel<100)
            return ("Fill up More");
        else
            return ("Filled up");
    }

    @Override
    public int pagesPrinted() {
        return this.pagesPrinted;
    }

    public void checkDuplex()
    {
        if (this.duplexOrNot)
            System.out.println("Is a Duplex");
        else
            System.out.println("Is not a Duplex");
    }
}

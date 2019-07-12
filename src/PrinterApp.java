public class PrinterApp {

    public static void main(String[] args)
    {
        Printer print=new Printer();

        print.setTonerLevel(34.56);
        print.setPagesPrinted(67);
        print.setDuplexOrNot(true);

        print.checkDuplex();

        System.out.println(print.tonnerFilling());

        System.out.println(print.pagesPrinted());

    }
}

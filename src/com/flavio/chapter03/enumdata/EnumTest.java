package com.flavio.chapter03.enumdata;

public class EnumTest {

    PrinterType printerType;

    public EnumTest(PrinterType pType) {
        printerType = pType;
    }

    public void feature() {
        switch (printerType) {
            case DOTMATRIX:
                System.out.println("Dot-matrix printers are economical and almost obsolete");
                break;
            case INKJET:
                System.out.println("Inkjet printers provide decent quality prints");
                break;
            case LASER:
                System.out.println("Laser printers provide best quality prints");
                break;
        }

        System.out.println("Print page capacity per minute: " +
                printerType.getPagePrintCapacity());
    }

    public static void main(String[] args) {
        EnumTest enumTest = new EnumTest(PrinterType.LASER);
        enumTest.feature();
        EnumTest enumTest2 = new EnumTest(PrinterType.INKJET);
        enumTest2.feature();
    }
}

package com.flavio.chapter03.nestedclasses;

public enum PrinterType {
    DOTMATRIX(5), INKJET(10), LASER (50);

    int pagePrintCapacity;

    private PrinterType(int pagePrintCapacity) {
        this.pagePrintCapacity = pagePrintCapacity;
    }

    public int getPagePrintCapacity() {
        return pagePrintCapacity;
    }
}

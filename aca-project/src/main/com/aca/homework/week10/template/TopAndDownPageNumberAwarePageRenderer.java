package com.aca.homework.week10.template;

public class TopAndDownPageNumberAwarePageRenderer extends TopPageNumberAwarePageRenderer {

    public void print() {
        super.printHeader();
        super.pageNumber();
        super.printPage();
        super.pageNumber();
        super.printFooter();
    }
}

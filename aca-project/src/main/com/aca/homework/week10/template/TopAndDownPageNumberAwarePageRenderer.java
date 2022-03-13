package com.aca.homework.week10.template;

public class TopAndDownPageNumberAwarePageRenderer extends TopPageNumberAwarePageRenderer {

    public void printTopAndDownPageNumberAwarePageRenderer() {
        super.printHeader();
        super.pageNumber();
        super.printPage();
        super.pageNumber();
        super.printFooter();
    }
}

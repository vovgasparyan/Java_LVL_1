package com.aca.homework.week10.template;

public class TopPageNumberAwarePageRenderer extends PageRenderer {

    public void printTopPageNumberAwarePageRenderer() {
        super.printHeader();
        this.pageNumber();
        super.printPage();
        super.printFooter();
    }

    public void pageNumber() {
        System.out.println("Page number");
    }
}

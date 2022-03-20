package main.com.aca.homework.week10.template;

public class PageRenderer {

    public void print() {
        this.printHeader();
        this.printPage();
        this.printFooter();
    }

    public void printHeader() {
        System.out.println("Header");
    }

    public void printPage() {
        System.out.println("Page");
    }

    public void printFooter() {
        System.out.println("Footer");
    }
}

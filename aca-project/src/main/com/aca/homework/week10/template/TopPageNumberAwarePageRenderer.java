package main.com.aca.homework.week10.template;

public class TopPageNumberAwarePageRenderer extends PageRenderer {

    public void printTopPageNumberAwarePageRenderer() {
        this.printHeaderTopPage();
        this.pageNumber();
        this.printPageTopPage();
        this.printFooterTopPage();
    }

    public void printHeaderTopPage() {
        System.out.println("Header");
    }

    public void printPageTopPage() {
        System.out.println("Page");
    }

    public void printFooterTopPage() {
        System.out.println("Footer");
    }

    public void pageNumber() {
        System.out.println("Page number");
    }
}

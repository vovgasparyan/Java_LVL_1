package main.com.aca.homework.week10.template;

public class TopAndDownPageNumberAwarePageRenderer extends TopPageNumberAwarePageRenderer {

    public void printTopAndDownPageNumberAwarePageRenderer() {
        this.printHeaderTopAndDownPage();
        this.pageNumberTopAndDownPage();
        this.printPageTopAndDownPage();
        this.pageNumberTopAndDownPage();
        this.printFooterTopAndDownPage();
    }

    public void printHeaderTopAndDownPage() {
        System.out.println("Header");
    }

    public void printPageTopAndDownPage() {
        System.out.println("Page");
    }

    public void printFooterTopAndDownPage() {
        System.out.println("Footer");
    }

    public void pageNumberTopAndDownPage() {
        System.out.println("Page number");
    }
}

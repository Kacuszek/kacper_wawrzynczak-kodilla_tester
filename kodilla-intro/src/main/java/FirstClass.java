public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.chekPriceAndYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2018);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.chekPriceAndYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2006);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.chekPriceAndYear();

        Notebook newNotebook = new Notebook(1300, 2100, 2021);
        System.out.println(newNotebook.weight + " " + newNotebook.price + " " + newNotebook.year);
        newNotebook.checkPrice();
        newNotebook.checkWeight();
        newNotebook.chekPriceAndYear();


    }
}

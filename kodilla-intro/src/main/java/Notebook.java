public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
        public void checkPrice () {
            if (this.price < 600) {
                System.out.println("This notebook is very cheap");
            } else if (this.price > 600 && this.price < 1000){
                System.out.println("The price is good");
            }else {
                System.out.println("This notebook is expensive");
            }
        }
        public void checkWeight () {
        if (this.weight < 1000) {
            System.out.println("This notebook is light");
        } else if (this.weight > 1000 && this.weight < 1600) {
            System.out.println("The notebook is not very heavy");
        } else {
            System.out.println("The notebook is very heavy");
        }
        }
        public void chekPriceAndYear () {
        if (this.price > 500 && this.year < 2010) {
            System.out.println("This notebook is not worth the money");
        } else if (this.price < 1600 && this.year > 2015) {
            System.out.println("This is a good deal");
        } else if (this.price < 2500 && this.year == 2021) {
            System.out.println("You are lucky. Good price and the newest notebook");
        }else {
            System.out.println("It is not enough details");
        }
        }
    }
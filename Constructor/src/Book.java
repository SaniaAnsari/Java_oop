public class Book {
    String title;
    String author;
    float price;
              //Parameterized Constructor
    Book( String title, String author, float price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displayBook(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);

    }
}

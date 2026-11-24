public class LibraryManagement {
    private String title;
    private  String author;
    private int bookId;
    private double price;
    private boolean isAvailable;
    LibraryManagement(String title,String author,int bookId,double price,boolean isAvailable
    ){
        this.title=title;
        this.author=author;
        this.bookId=bookId;
        this.price=price;
        this.isAvailable=isAvailable;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return  author;
    }
    public int getBookId(){
        return bookId;
    }
    public double getPrice(){
        return price;
    }
    public boolean getIsAvailable(){
        return  isAvailable;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(double price){
       if (price>0){
         this.price=price;
       }else{
        System.out.println("Invalid price !");
       }
    }
    public void borrowbook(){
        if (isAvailable){
            this.isAvailable=!isAvailable;
            System.out.println("the book is borrowed successfully");

        }else{
            System.out.println("Book is already borrowed");
        }

    }
    public void returnBook(){
           this.isAvailable=true;
    }
    public static void main(String[] args){
        LibraryManagement book1=new LibraryManagement("Got","selam",12,202.2,true);
       LibraryManagement book2=new LibraryManagement("sememen", "sisay", 10, 200, false);
       book1.borrowbook();
       book1.borrowbook();
       book1.returnBook();
       System.out.println(book1.getTitle());
       System.out.println(book1.getAuthor());
       System.out.println(book1.getBookId());
       System.out.println(book1.getPrice());
       System.out.println(book1.getIsAvailable());
       System.out.println(book2.getTitle());
       System.out.println(book2.getAuthor());
       System.out.println(book2.getBookId());
       System.out.println(book2.getPrice());
       System.out.println(book2.getIsAvailable());
    }
}

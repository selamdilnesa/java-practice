public class Book {
    String titles;
    int pages;
    Book(String titles,int pages){
        this.titles=titles;
        this.pages=pages;
    }
    void printInfo(){
        System.out.println(titles);
        System.out.println(pages);
    
        
    }
    void addPages(int extraPages){
        pages+=extraPages;
     
    }
    public boolean sameTitle(Book other){
        if(this.titles==other.titles){
            return true;
            
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Book b1=new Book("fker eske mekabr",523);
        Book b2=new Book ("fker eske mekabr",450);
        b1.addPages(200);
        b1.printInfo();
        b2.printInfo();
        b1.sameTitle(b2);
    
    }
    
}

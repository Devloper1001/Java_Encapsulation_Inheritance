class Book {
    String title;
    String author;
    int isbn;
    static int totalBook;
    boolean isBorrowed;
    boolean isAlreadyReturned;

    static {
        totalBook = 0;
    }

    {
        totalBook++;
    }

    Book(int isbn ,String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(int isbn){
        this(isbn , "unknown" , "unknown");
    }

    public void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else {
            isBorrowed = true;
            System.out.println("enjoy the" +" "+title+ " " + "book");
        }
    }

    public void returnBook(){
        if (isAlreadyReturned){
            System.out.println("Book is Already in the Library");
        }else {
            isAlreadyReturned = true;
            System.out.println("Book is returned hope you enjoy,please leve a review");
        }
    }

     static int getTotalNumberOfBooks(){
        return totalBook;
    }


    public static void main(String[] args) {

        Book english = new Book(364,"Grammer","Luci");
        Book maths = new Book(3600);

        english.borrowBook();
        maths.borrowBook();
        maths.borrowBook();
        maths.returnBook();
        maths.returnBook();
        System.out.println(getTotalNumberOfBooks());

    }
}

package Question1;


    
    public class Library implements Comparable<Library> {
	
        private String bookName;
        private String bookAuthor;
        private int bookId;
        
        
        
        public Library() {
           super();
       }
   
   
       public Library(String bookName, String bookAuthor,int bookId)
        {
            this.bookAuthor=bookAuthor;
            this.bookName= bookName;
            this.bookId=bookId;
        }
       
       
       
       @Override
       public boolean equals(Object obj) {
           if(this==obj)
               return true;
           Library l1 = this;
           Library l2=(Library)obj;
           return l1.bookId==l2.bookId;
           }
       
       
       public String getBookName() {
           return bookName;
       }
   
   
       public void setBookName(String bookName) {
           this.bookName = bookName;
       }
   
   
       public String getBookAuthor() {
           return bookAuthor;
       }
   
   
       public void setBookAuthor(String bookAuthor) {
           this.bookAuthor = bookAuthor;
       }
   
   
       public int getBookId() {
           return bookId;
       }
   
   
       public void setBookId(int bookId) {
           this.bookId = bookId;
       }
   
   
       @Override
       public int compareTo(Library o) {
           // TODO Auto-generated method stub
           return 0;
       }
   
   
   }


public class ex1 {
    public static void main(String[] args) {

    }
    interface adminLogin
    {
        void status();
        void issuedBookDetails();
        void calculateFine();
        void sendMail();
        void activateBook();
        void deactivateBook();
    }

    interface memberLogin
    {
        void issuedBooks();
        void finePayment();
        void searchBook();
    }

    interface addBook
    {
        void add();
    }
    interface removeBook
    {
        void remove();
    }

    class Admin implements adminLogin, addBook, removeBook, searchBook, issueBook, calculateFine
    {
        int id;
        String password;
        public void showLibraryDetails()
        {

        }
        @Override
        public void status() {

        }
        @Override
        public void issuedBookDetails() {

        }
        @Override
        public void calculateFine() {

        }

        @Override
        public void sendMail() {

        }

        @Override
        public void activateBook() {

        }

        @Override
        public void deactivateBook() {

        }

        @Override
        public void remove(){

        }

        @Override
        public void add() {

        }
        @Override
        public void search() {
// TODO Auto-generated method stub

        }
        @Override
        public void issue() {
// TODO Auto-generated method stub

        }
        @Override
        public void calculate() {
// TODO Auto-generated method stub

        }

    }
    class Book
    {
        int isbn;
        String author;
        float price;
        int quantity;
        String type;
    }

    class Member implements searchBook, issueBook
    {
        int id;
        String password;
        @Override
        public void search() {

        }
        @Override
        public void issue() {

        }
    }

    interface searchBook
    {
        void search();
    }

    interface issueBook
    {
        void issue();
    }

    interface calculateFine
    {
        void calculate();
    }


}


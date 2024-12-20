import java.util.ArrayList;

public class showData {
    public static void main(String[] args) {
        //Creating object of class AddDataToArrayList

        AddDataToArrayList b = new AddDataToArrayList();

        //Creating ArrayList and storing in it the list returned by b.bookdetails()
        ArrayList<Book> myBookList = b.bookdetails();
        for (Book showValue : myBookList) {
            System.out.println(showValue.getNumber() + " " + showValue.getName() + " " + showValue.getCategory() + " " + showValue.getAuthor());
        }


    }
}


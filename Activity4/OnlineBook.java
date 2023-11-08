/**
 * Child class program 
 * 
 * Activity 4
 * @author Nick Mitchell - CPSC1220
 * @version 11/08/23
 */
public class OnlineBook extends OnlineTextItem {
    protected String author;

    public OnlineBook(String nameIn, double priceIn) {
        super(nameIn, priceIn);

        author = "Author Not Listed";
    }

    public void setAuthor(String authorIn) {
        author = authorIn;
    }

    public String toString() {
        return name + " - " + author + ": $" + price;
    }

}

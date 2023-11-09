/**
 * Child class program 
 * 
 * Activity 4
 * @author Nick Mitchell - CPSC1220
 * @version 11/08/23
 */
public class OnlineBook extends OnlineTextItem {
    protected String author;

    /**
     * Method.
     * @param nameIn for name input
     * @param priceIn for price input
     */
    public OnlineBook(String nameIn, double priceIn) {
        super(nameIn, priceIn);

        author = "Author Not Listed";
    }

    /**
     * Method.
     * @param authorIn for author input
     */
    public void setAuthor(String authorIn) {
        author = authorIn;
    }

    /**
     * Method.
     * @return string of inputs
     */
    public String toString() {
        return name + " - " + author + ": $" + price;
    }

}

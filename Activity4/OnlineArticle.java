/**
 * Child class program 
 * 
 * Activity 4
 * @author Nick Mitchell - CPSC1220
 * @version 11/08/23
 */
public class OnlineArticle extends OnlineTextItem {
    private int wordCount;


    /**
     * Constructor.
     * @param nameIn for name input
     * @param priceIn for price input
     */
    public OnlineArticle(String nameIn, double priceIn) {
        super(nameIn, priceIn);
        wordCount = 0;

    }

    /**
     * Method.
     * @param wordCountIn
     */
    public void setWordCount(int wordCountIn) {
        wordCount = wordCountIn;
    }
    
}

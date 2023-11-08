/**
 * Child class program 
 * 
 * Activity 4
 * @author Nick Mitchell - CPSC1220
 * @version 11/08/23
 */
public class OnlineArticle extends OnlineTextItem {
    private int wordCount;


    public OnlineArticle(String nameIn, double priceIn) {
        super(nameIn, priceIn);
        wordCount = 0;

    }

    public void setWordCount(int wordCountIn) {
        wordCount = wordCountIn;
    }
    
}

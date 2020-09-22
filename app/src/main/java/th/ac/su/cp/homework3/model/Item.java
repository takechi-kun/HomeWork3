package th.ac.su.cp.homework3.model;

public class Item {
    public final int imageResId;
    public final String word;
    public final String translate;
    public Item(int imageResId, String word, String translate) {
        this.imageResId = imageResId;
        this.word = word;
        this.translate = translate;
    }
}

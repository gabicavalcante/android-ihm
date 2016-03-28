package polynews.polytech.unice.fr.polynews.model;

/**
 * Class to represents the article model.
 * @author Gabriela Cavalcante
 * @version 28/03/16.
 */
public class New {
    private int id;
    private String title;
    private String content;
    private String author;
    private String date;
    private int category;
    private int media_type;
    private String media_path;

    public New() {
    }

    public New(int id, String title, String content, String author, int category, int media_type, String media_path) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = category;
        this.media_type = media_type;
        this.media_path = media_path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return author;
    }

    public void setDate(String author) {
        this.author = author;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getMedia_type() {
        return media_type;
    }

    public void setMedia_type(int media_type) {
        this.media_type = media_type;
    }

    public String getMedia_path() {
        return media_path;
    }

    public void setMedia_path(String media_path) {
        this.media_path = media_path;
    }
}
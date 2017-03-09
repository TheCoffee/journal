package in.ghostcode.journal;

/**
 * Created by Coffee on 3/5/17.
 */

public class Entry {
    private int id;
    private String title, content, date;

    public Entry(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public Entry(int id, String title, String content, String date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

public class Referat extends Document implements Cloneable {
    private Author author;
    private String topic;
    private int pages;

    public Referat() {
        this.author = new Author();
        this.topic = "";
        this.pages = 0;
    }

    public Referat(Author author, String topic, int pages) {
        this.author = author;
        this.topic = topic;
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Referat{" +
                "author=" + author +
                ", topic='" + topic + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Referat referat = (Referat) super.clone();
        referat.setAuthor((Author) author.clone());
        return referat;
    }

    @Override
    public void submit() {
        isSubmitted = true;
        System.out.println("Referat sus zaglavie " + topic + " submitted");
    }
}

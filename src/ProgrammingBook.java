public class ProgrammingBook extends Book{
    private String language;
    private String framwork;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String language, String framwork) {
        this.language = language;
        this.framwork = framwork;
    }

    public ProgrammingBook(int bookCode, String name, double price, String author, String language, String framwork) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framwork = framwork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramwork() {
        return framwork;
    }

    public void setFramwork(String framwork) {
        this.framwork = framwork;
    }


}

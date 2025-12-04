package practice6.practice6_1;

class Book implements Nameable {
    private String name;
    private String author;
    private int pages;

    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}
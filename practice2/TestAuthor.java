package practice2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Пушкин А.С", "pushkin1703@email.com", 'm');
        System.out.println("Name " + author.getName());
        System.out.println("Email " + author.getEmail());
        System.out.println("Male " + author.getGender());

        System.out.println("Info " + author.toString());

        author.setEmail("kalotushkin228@mail.ru");

        System.out.println("Info " + author.toString());


    }
}

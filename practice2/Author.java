package practice2;

public class Author {
    // private default protected public
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender ) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char gender(){
        return gender;
    }

    public void setEmail(String email){
        this.email =  email;
    }

    public char getGender(){
        return gender;
    }

    public String toString() {
        return "Author[name = " + name + " , email = " + email + " , gender = " + gender + "]";
    }

}

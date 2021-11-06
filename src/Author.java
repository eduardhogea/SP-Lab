public class Author {

    private final String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
    }
}

/*
public class Author {
    private final String author_name;
    //private final String author_surname;


    public Author(String author_name) {
        this.author_name = author_name;
        //this.author_surname= author_surname;
    }

    public void print() {
        System.out.println(this.author_name);
    }
}
*/
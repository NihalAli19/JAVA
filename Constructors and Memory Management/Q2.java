class Language {

    public String language;

    Language () {
        language = "JAVA";
    }

    Language (String langV) {
        language = langV;
    }

    public void print() {
        System.out.println("" + language);
    }
}
public class Q2 {
    public static void main(String[] args) {

        Language lang = new Language();
        Language langVar = new Language("C");

        lang.print();
        langVar.print();
    }
}

package wordfinder;

public class Main {
    public static void main(String[] args) {
        WordFinder wordFinder = new WordsFinderImpl();
        String exampleText = "To jest przykładowy tekst z wulgaryzmem: kurwa i chuj. jebać to";

        if (wordFinder.checkForProfanity(exampleText)) {
            System.out.println("Tekst zawiera wulgaryzmy.");

            String censoredText = wordFinder.censorText(exampleText);
            System.out.println("Ocenzurowany tekst: " + censoredText);
        } else {
            System.out.println("Tekst nie zawiera wulgaryzmów.");
        }
    }
}

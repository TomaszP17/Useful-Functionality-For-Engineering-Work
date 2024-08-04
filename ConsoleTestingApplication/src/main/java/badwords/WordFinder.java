package badwords;

public interface WordFinder {

    boolean checkForProfanity(String textToCheck);
    String censorText(String textToCensor);
}

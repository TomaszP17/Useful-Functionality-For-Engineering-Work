package wordfinder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsFinderImpl implements WordFinder{

    private static final Pattern PROFANITY_PATTERN = Pattern.compile(Profanity.toRegex(), Pattern.CASE_INSENSITIVE);

    @Override
    public boolean checkForProfanity(String textToCheck) {
        Matcher matcher = PROFANITY_PATTERN.matcher(textToCheck);
        return matcher.find();
    }

    @Override
    public String censorText(String textToCensor) {
        Matcher matcher = PROFANITY_PATTERN.matcher(textToCensor);
        StringBuilder censoredText = new StringBuilder();

        while (matcher.find()) {
            String word = matcher.group();
            String stars = "*".repeat(word.length());
            matcher.appendReplacement(censoredText, stars);
        }
        matcher.appendTail(censoredText);

        return censoredText.toString();
    }
}

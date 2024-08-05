package wordfinder;

public enum Profanity {
    KURWA,
    JAPIERDOLE,
    CHUJ,
    PIZDA,
    JEBA,
    SKURWYSYN,
    PIERDOL,
    KUTAS,
    CIPA,
    DUPA,
    ZAJEBIST;

    public static String toRegex(){
        StringBuilder regexBuilder = new StringBuilder();

        for(Profanity profanity : Profanity.values()){
            regexBuilder.append(profanity.name().toLowerCase()).append("|");
        }

        return "\\b(" + regexBuilder.substring(0, regexBuilder.length() - 1) + ")\\b";
    }
}

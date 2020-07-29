import java.util.HashSet;
import java.util.Set;


public class Panagram {

    public boolean isPanagram(String s) {

        Set<Character> requiredChar = loadRequiredChar();

        s = s.toLowerCase();
        Set<Character> setOfChar = new HashSet<>();
        for (Character singleChar : s.toCharArray()) {
            if (singleChar.equals(' ')) continue;
            setOfChar.add(singleChar);
        }

        requiredChar.removeAll(setOfChar);

        return requiredChar.isEmpty();
    }

    private Set<Character> loadRequiredChar() {

        String requiredString = "abcdefghijklmnopqrstuvwxyz";
        Set<Character> requiredChar = new HashSet<>();
        for (Character c : requiredString.toCharArray()) {
            requiredChar.add(c);
        }

        return requiredChar;
    }

    public static void main(String[] args) {
    }

}

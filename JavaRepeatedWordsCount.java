
import java.util.HashSet;
import java.util.Set;

public class JavaRepeatedWordsCount {
    public static void main(String[] args) {
        String sent = "Varsha is very very brilliant girl, is also smart girl";
        System.out.println(repeatedWordCount(sent));
    }

    public static String repeatedWordCount(String str) {
        String result = str.toLowerCase();
        String[] words = result.split("\\W");
        Set<String> stringSet = new HashSet();

        for(int i = 0; i < words.length - 1; ++i) {
            for(int j = 1; j < words.length; ++j) {
                if (words[i].equals(words[j]) && i != j) {
                    stringSet.add(words[i]);
                }
            }
        }

        return stringSet.toString();
    }
}

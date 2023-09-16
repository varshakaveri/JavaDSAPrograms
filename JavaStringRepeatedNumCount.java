import java.util.Set;
import java.util.HashMap;
public class JavaStringRepeatedNumCount {
     public static void main(String args[]) {

            String strValue = "This is testing Program testing Program IS This Testing";

            String value = strValue.toLowerCase();

            String item[] = value.split(" ");

            HashMap<String, Integer> map = new HashMap<>();

            for (String t : item) {
                if (map.containsKey(t)) {
                    map.put(t, map.get(t) + 1);

                } else {
                    map.put(t, 1);
                }
            }
            Set<String> keys = map.keySet();
            for (String key : keys) {
                System.out.print(key+" :\t");
                System.out.println(map.get(key));
            }
     }
}

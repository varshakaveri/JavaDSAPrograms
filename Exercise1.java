//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1 {

    public static void main(String[] arg) {
        List<Integer> list = new ArrayList();
        list.add(23);
        list.add(24);
        list.add(16);
        list.add(32);
        list.add(53);
        list.add(75);
        list.add(12);
        Stream var10000 = list.stream().sorted().filter((i) -> {
            return i % 2 == 0;
        });
        PrintStream var10001 = System.out;
        Objects.requireNonNull(var10001);
        var10000.forEach(var10001::println);
        List<String> listString = (List)list.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(listString);
    }
}

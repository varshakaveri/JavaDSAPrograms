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
        list.stream().sorted().filter(i -> i % 2 == 0).forEach(System.out::println);
        List<String> listString = list.stream().sorted().filter(i -> i%2 == 0).map(String::valueOf).collect(Collectors.toList());
        System.out.println(listString);
    }
}

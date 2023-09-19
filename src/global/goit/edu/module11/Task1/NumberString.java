package global.goit.edu.module11.Task1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class NumberString {

    public String handle(List<String> listStringForHandling) {

        AtomicInteger order = new AtomicInteger(1);

        String result = listStringForHandling
                .stream()
                .map(name -> {
                    return getString(order.getAndIncrement(), name);
                })
                .collect(Collectors.joining());

        return result;

    }
    private static String getString(int order, String name) {
        String s = "";
        if (order % 2 != 0) {
            s = order + ". " + name + ", ";
        }
        return s;
    }
}

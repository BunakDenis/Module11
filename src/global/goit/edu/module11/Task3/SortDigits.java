package global.goit.edu.module11.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortDigits {

    public void sort(String[] value) {

        List<String> digits = new ArrayList<>();

        for (String s : value) {
            for (String v : s.split(",")) {
                digits.add(v.strip());
            }
        }

        String result = digits
                .stream()
                .sorted((n1, n2) -> Integer.parseInt(n1) - Integer.parseInt(n2))
                .collect(Collectors.joining(","));

        System.out.println(result);

    }
}
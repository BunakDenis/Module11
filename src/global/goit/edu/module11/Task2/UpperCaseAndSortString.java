package global.goit.edu.module11.Task2;

import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseAndSortString {
    public List<String> handle(List<String> listStringForHandling) {

        List<String> result = listStringForHandling
                .stream()
                .map(String::toUpperCase)
                .sorted((n1, n2) -> n2.charAt(0) - n1.charAt(0))
                .collect(Collectors.toList());

        return result;
    }
}
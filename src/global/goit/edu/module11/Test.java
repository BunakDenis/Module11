package global.goit.edu.module11;

import global.goit.edu.module11.Task1.NumberString;
import global.goit.edu.module11.Task2.UpperCaseAndSortString;
import global.goit.edu.module11.Task3.SortDigits;
import global.goit.edu.module11.Task4.RandomGeneratorDigits;
import global.goit.edu.module11.Task5.ShuffleOfStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        //Task1

        NumberString stringHandler = new NumberString();

        List<String> names = Arrays.asList("Aaron", "Benjamin", "Cameron", "Daniel", "Eric", "Fred", "Gabriel", "Harold",
                "Isaac", "Jack", "Kevin", "Landon", "Malcolm", "Nathaniel", "Oscar", "Patrick", "Ralph", "Samuel", "Thomas");

        System.out.println("Task 1");
        System.out.println("stringHandler.handle(names) = " + stringHandler.handle(names));
        System.out.println("----------------------------------");

        //Task2

        UpperCaseAndSortString upperCaseAndSortString = new UpperCaseAndSortString();

        System.out.println("Task 2");
        System.out.println("upperCaseAndSortString.handle(names) = " + upperCaseAndSortString.handle(names));
        System.out.println("----------------------------------");

        //Task3

        String[] digits = new String[] {"1, 2, 0", "4, 5"};

        SortDigits sortDigits = new SortDigits();

        System.out.println("Task 3");
        sortDigits.sort(digits);
        System.out.println("----------------------------------");

        //Task4

        RandomGeneratorDigits r = new RandomGeneratorDigits();

        System.out.println("Task 4");
        r.generateLongStream(25214903917L, 11L, 2L ^ 48L).forEach(System.out::println);
        System.out.println("----------------------------------");

        //Task5
        System.out.println("Task 5");

        Stream<Integer> stream1 = Stream.of(5, 15, 20, 30);
        Stream<Integer> stream2 = Stream.of(50, 60, 70, 80);

        ShuffleOfStreams shuffleOfStreams = new ShuffleOfStreams();

        Stream<Integer> zip = shuffleOfStreams.zip(stream1, stream2);

        zip.forEach(System.out::println);

    }
}
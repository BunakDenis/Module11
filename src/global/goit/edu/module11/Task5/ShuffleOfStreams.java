package global.goit.edu.module11.Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ShuffleOfStreams {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        List<T> result = new ArrayList<>();

        while (iterator1.hasNext() && iterator2.hasNext()) {
            result.add(iterator1.next());
            result.add(iterator2.next());
        }

        return result.stream();

    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(5, 15, 20, 30);
        Stream<Integer> stream2 = Stream.of(50, 60, 70, 80);

        Stream<Integer> zip = zip(stream1, stream2);

        zip.forEach(System.out::println);

    }
}
package global.goit.edu.module11.Task4;

import java.util.stream.Stream;

public class RandomGeneratorDigits {

    public Stream<Long> generateLongStream(long a, long c, long m) {


/*
        Реалізуйте свій лінійний конгруентний генератор. Для цього почніть з x[0] = seed, і далі кожний наступний елемент рахуйте за формулою
        на зразок x[n + 1] = 1 (a x[n] + c) % m для коректних значень a, c, та m.

        Необхідно імплементувати метод, що приймає на вхід параметри a, c, та m, і повертає Stream<Long>.

        Для тесту використовуйте такі дані:

        a = 25214903917
        c = 11
        m = 2^48 (2в степені48`)
*/
        RansomAlgorithm r = new RansomAlgorithm(a, c, m);

        Stream<Long> result = Stream
                .iterate(1l, x -> r.nextLong(x))
                .peek(System.out::println)
                .limit(10);

        return result;

    }
}
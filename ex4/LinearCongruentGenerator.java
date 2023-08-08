package hw11.ex4;

import java.util.stream.Stream;


//Використовуючи Stream.iterate, створіть безкінечний стрім випадкових чисел, але не використовуючи Math.random().
//
//Реалізуйте свій лінійний конгруентний генератор. Для цього почніть з x[0] = seed, і далі кожний наступний елемент рахуйте за формулою на зразок x[n + 1] = 1 (a x[n] + c) % m для коректних значень a, c, та m.
//
//Необхідно імплементувати метод, що приймає на вхід параметри a, c, та m, і повертає Stream<Long>.
//
//Для тесту використовуйте такі дані:
//
//a = 25214903917
//c = 11
//m = 2^48 (2в степені48`)
public class LinearCongruentGenerator {
    public static Stream<Long> generateRandomStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        long seed = System.currentTimeMillis();

        Stream<Long> randomStream = generateRandomStream(a, c, m, seed);

        // To test, print the first 10 numbers in the stream
        randomStream.limit(10).forEach(System.out::println);
    }
}


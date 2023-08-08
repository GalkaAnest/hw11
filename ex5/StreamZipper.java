package hw11.ex5;

import java.util.stream.Stream;
import java.util.Iterator;
//Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) який "перемішує" елементи зі стрімів first та second, зупиняючись тоді, коли у одного зі стрімів закінчаться елементи.
public class StreamZipper {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        Stream.Builder<T> builder = Stream.builder();

        while (iterator1.hasNext() && iterator2.hasNext()) {
            builder.accept(iterator1.next());
            builder.accept(iterator2.next());
        }

        return builder.build();
    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);

        Stream<Integer> zippedStream = zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }
}


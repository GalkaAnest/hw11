package hw11.ex1;
import java.util.Arrays;
import java.util.List;
//Метод приймає на вхід список імен. Необхідно повернути рядок вигляду 1. Ivan, 3. Peter... лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)
// Java program to iterate over Stream with Indices

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ListOfNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Sophia", "Braydan", "Oliver", "Jenny", "Rayan", "Zinabe");
        String result = formatNames(names);
        System.out.println(result);

    }
    public static String formatNames(List<String> names){
        return IntStream
                .range(0, names.size())
                .filter(i -> i%2 != 0)
                .mapToObj(i ->(i) + ". " +names.get(i))
                .collect(Collectors.joining(", "));
    }
}
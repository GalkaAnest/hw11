package hw11.ex2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

//Метод приймає на вхід список рядків (можна взяти список із Завдання 1). Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).
public class ZtoANames {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Anna", "Sophia", "Braydan", "Oliver", "Jenny", "Rayan", "Zinabe");
        names.replaceAll(String::toUpperCase);
        List<String>sortedList=names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        names.stream().map(name -> name.toUpperCase());
        sortedList.forEach(name -> {

            System.out.println(name);
        });
    }
}


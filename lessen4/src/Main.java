
//```Цель: Практика создания обобщенных классов и методов для обработки различных типов данных.
//
//        Инструкции:

//        Создайте еще один обобщенный класс Pair, который будет представлять собой пару объектов. Этот класс должен иметь два поля для хранения объектов и соответствующие геттеры и сеттеры.
//
//        Создайте метод swapPairs, который принимает массив объектов типа Pair и меняет местами элементы в каждой паре. Например, если у вас есть пара (A, B), после вызова swapPairs она должна стать парой (B, A). Используйте обобщенные методы для реализации этой операции.
//
//        Напишите программу, которая демонстрирует использование вашего обобщенного класса Box и методов printBoxContents и swapPairs для разных типов данных (например, целых чисел, строк, объектов пользовательских классов и т. д.).
//
//        Выведите результаты выполнения программы на экран, чтобы показать, что методы работают с разными типами данных.
//
//        Примечания:
//
//        Обязательно добавьте комментарии к вашему коду, чтобы объяснить, какие части кода выполняют какие задачи и как обобщенные типы используются в вашей программе.
//
//        При реализации метода swapPairs, учтите, что он должен работать с любыми типами объектов внутри пары.
//
//        Экспериментируйте с разными типами данных, чтобы продемонстрировать универсальность вашего кода.
//
import java.util.ArrayList;
import java.util. Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Box<Integer> box = new Box<Integer>(2, "tree");
        Box<String> box1 = new Box<String>("apl", "plastic");
        box.setDing(4);
        System.out.println(box);
        Pair<Integer, String> pair = new Pair<Integer, String>(2, "two");
        Pair<String, Integer> pair1 = new Pair<String, Integer>("student", 5);

        pair1.setQuality("teacher");
        System.out.println(pair1);



        List<Pair<Integer, String>> pairs = new ArrayList<>();
        pairs.add(new Pair<>(1, "a"));
        pairs.add(new Pair<>(2, "b"));
        pairs.add(new Pair<>(3, "c"));

        System.out.println("Befor:" +pairs);

        swapPairs(pairs);

        System.out.println("After:" +pairs);
     
    }

    public static <T, V> void swapPairs (List<Pair<T, V>> pairs) {


        for (Pair<T,V> pair:pairs){
            T tempQuality =pair.getQuality();
            pair.setQuality(pair.getOwner());
            pair.setOwner(tempQuality);
        }
        }
    }




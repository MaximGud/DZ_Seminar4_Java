import java.util.LinkedList;

import org.w3c.dom.Node;

public class App {
    public static void main(String[] args) throws Exception {
        // 1)Пусть дан LinkedList с несколькими элементами.
        // Реализуйте метод, который вернет “перевернутый” список.
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Task1.run(list);

        // 2. Реализуйте очередь с помощью LinkedList со
        // следующими методами:enqueue() - помещает элемент в конец очереди,
        // dequeue() - возвращает первый элемент из очереди и удаляет его,
        // first() - возвращает первый элемент из очереди, не удаляя.
        System.out.println("Перенести элемент 2 в конец списка: "+ Task2.enqueue(list, 2));
        System.out.println("Первый элемент списка и его удаление: "+ Task2.dequeue(list));
        System.out.println("Новый список: "+ list);
        System.out.println("Первый элемент списка без удаления: "+ Task2.first(list));

    }
}

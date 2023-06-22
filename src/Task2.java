import java.util.LinkedList;

public class Task2 {
  public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int m) {
    list.add(list.remove(list.indexOf(m)));
    return list;
  }

  public static Integer dequeue(LinkedList<Integer> list) {
    int i = list.get(0);
    list.remove(0);
    return i;
  }

  public static Integer first(LinkedList<Integer> list) {
    return list.getFirst();
  }
}

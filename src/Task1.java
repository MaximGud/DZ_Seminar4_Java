import java.util.LinkedList;

public class Task1 {

  public static void run(LinkedList<Integer> list) {

    for (int m = list.size() - 1; m >= 0; m--) {
      System.out.println(list.get(m));
    }
  }
}
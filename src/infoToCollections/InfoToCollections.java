package infoToCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class InfoToCollections {

  /**
   * This main method is showing use of List interface.
   *
   * @param args arguments if any
   */
  public static void main(String[] args) {

    List<Integer> arrayList = new ArrayList<>();
    List<String> linkedList = new LinkedList<>();
    List<Long> vectorList = new Vector<>();
    List<Boolean> stackList = new Stack<>();

    System.out.println(arrayList);
    System.out.println(linkedList);
    System.out.println(vectorList);
    System.out.println(stackList);

  }
}

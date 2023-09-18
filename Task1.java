import java.util.*;

public class Task1 {

  public static void main(String[] args) {

    ArrayList<Integer> numList = new ArrayList<>();
    numList.add(20);
    numList.add(50);
    numList.add(30);
    numList.add(15);

    maximum(numList);
  }

  public static void maximum(ArrayList<Integer> numList) {
    int maxValue = numList.get(0);

    for (int i = 0; i < numList.size(); i++) {

      if (numList.get(i) > maxValue)
        maxValue = numList.get(i);
    }
    System.out.print("The maximum value of the list is: " + maxValue);

  }
}

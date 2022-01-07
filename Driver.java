import java.util.ArrayList;

public class Driver {

  public static void main(String[] args) {
    System.out.println("Testing bubble...");
    System.out.println("Best case scenario: The array is already in ascending order");
    ArrayList test1 = new ArrayList<Comparable>();
    test1.add(1);
    test1.add(2);
    test1.add(3);
    test1.add(4);
    test1.add(5);
    System.out.println("test1 unsorted: " + test1);
    System.out.println("number of swaps required: " + Sorts.bubble(test1));
    System.out.println("--");
    System.out.println("Random case scenario: ");
    ArrayList test2 = Sorts.populate(5, 1, 10);
    System.out.println("test2 unsorted: " + test2);
    System.out.println("number of swaps required: " + Sorts.bubble(test2));
    System.out.println("--");
    System.out.println("Worst case scenario: The array is in descending order");
    ArrayList test3 = new ArrayList<Comparable>();
    test3.add(5);
    test3.add(4);
    test3.add(3);
    test3.add(2);
    test3.add(1);
    System.out.println("test3 unsorted: " + test3);
    System.out.println("number of swaps required: " + Sorts.bubble(test3));

    System.out.println("------------------------------------------------------------------------");

    System.out.println("Testing selection...");
    System.out.println("Best case and worst case scenarios are the same.");
    System.out.println("Array in ascending order: ");
    ArrayList test4 = new ArrayList<Comparable>();
    test4.add(1);
    test4.add(2);
    test4.add(3);
    test4.add(4);
    test4.add(5);
    System.out.println("test4 unsorted: " + test4);
    System.out.println("number of swaps required: " + Sorts.selection(test4));
    System.out.println("--");
    System.out.println("Random case scenario: ");
    ArrayList test5 = Sorts.populate(5, 1, 10);
    System.out.println("test5 unsorted: " + test5);
    System.out.println("number of swaps required: " + Sorts.selection(test5));
    System.out.println("--");
    System.out.println("Array in descending order:");
    ArrayList test6 = new ArrayList<Comparable>();
    test6.add(5);
    test6.add(4);
    test6.add(3);
    test6.add(2);
    test6.add(1);
    System.out.println("test6 unsorted: " + test6);
    System.out.println("number of swaps required: " + Sorts.selection(test6));

    System.out.println("------------------------------------------------------------------------");

    System.out.println("Testing insertion...");
    System.out.println("Best case scenario: The array is already in ascending order");
    ArrayList test7 = new ArrayList<Comparable>();
    test7.add(1);
    test7.add(2);
    test7.add(3);
    test7.add(4);
    test7.add(5);
    System.out.println("test7unsorted: " + test7);
    System.out.println("number of swaps required: " + Sorts.insertion(test7));
    System.out.println("--");
    System.out.println("Random case scenario: ");
    ArrayList test8 = Sorts.populate(5, 1, 10);
    System.out.println("test8 unsorted: " + test8);
    System.out.println("number of swaps required: " + Sorts.insertion(test8));
    System.out.println("--");
    System.out.println("Worst case scenario: The array is in descending order");
    ArrayList test9 = new ArrayList<Comparable>();
    test9.add(5);
    test9.add(4);
    test9.add(3);
    test9.add(2);
    test9.add(1);
    System.out.println("test9 unsorted: " + test9);
    System.out.println("number of swaps required: " + Sorts.insertion(test9));
  }

}

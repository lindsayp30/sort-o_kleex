import java.util.ArrayList;

public class Driver {

  public static ArrayList populate(ArrayList<Comparable> data, int size) {
    for (int i = 0; i < size; i++) {
      data.add(i);
    }
    return data;
  }

  public static ArrayList backpopulate(ArrayList<Comparable> data, int size) {
    for (int i = size-1; i > 0; i--) {
      data.add(i);
    }
    return data;
  }

  public static void main(String[] args) {
    System.out.println("Testing bubble...");
    System.out.println("Best case scenario: The array is already in ascending order");
    System.out.println("array in ascending order with 5 elements: ");
    ArrayList test1 = new ArrayList<Comparable>();
    populate(test1, 5);
    System.out.println(Sorts.bubble(test1));
    System.out.println("array in ascending order with 50 elements: ");
    ArrayList test01 = new ArrayList<Comparable>();
    populate(test01, 50);
    System.out.println(Sorts.bubble(test01));
    System.out.println("array in ascending order with 100 elements: ");
    ArrayList test001 = new ArrayList<Comparable>();
    populate(test001, 100);
    System.out.println(Sorts.bubble(test001));
    System.out.println("--");
    System.out.println("Random case scenario: ");
    ArrayList test2 = Sorts.populate(5, 1, 10);
    System.out.println("test2 unsorted: " + test2);
    System.out.println(Sorts.bubble(test2));
    System.out.println("--");
    System.out.println("Worst case scenario: The array is in descending order");
    System.out.println("array in descending order with 5 elements: ");
    ArrayList test3 = new ArrayList<Comparable>();
    backpopulate(test3, 5);
    System.out.println(Sorts.bubble(test3));
    System.out.println("array in descending order with 50 elements: ");
    ArrayList test03 = new ArrayList<Comparable>();
    backpopulate(test03, 50);
    System.out.println(Sorts.bubble(test03));
    System.out.println("array in descending order with 100 elements: ");
    ArrayList test003 = new ArrayList<Comparable>();
    backpopulate(test003, 100);
    System.out.println(Sorts.bubble(test003));

    System.out.println("------------------------------------------------------------------------");

    System.out.println("Testing selection...");
    System.out.println("Best case and worst case scenarios are the same.");
    System.out.println("Array in ascending order:");
    System.out.println("array in ascending order with 5 elements: ");
    ArrayList test4 = new ArrayList<Comparable>();
    populate(test4, 5);
    System.out.println(Sorts.selection(test4));
    System.out.println("array in ascending order with 50 elements: ");
    ArrayList test04 = new ArrayList<Comparable>();
    populate(test04, 50);
    System.out.println(Sorts.selection(test04));
    System.out.println("array in ascending order with 100 elements: ");
    ArrayList test004 = new ArrayList<Comparable>();
    populate(test004, 100);
    System.out.println(Sorts.selection(test004));
    System.out.println("--");
    System.out.println("Random case scenario: ");
    ArrayList test5 = Sorts.populate(5, 1, 10);
    System.out.println("test5 unsorted: " + test5);
    System.out.println(Sorts.selection(test5));
    System.out.println("--");
    System.out.println("Array in descending order:");
    System.out.println("array in descending order with 5 elements: ");
    ArrayList test6 = new ArrayList<Comparable>();
    backpopulate(test6, 5);
    System.out.println(Sorts.selection(test6));
    System.out.println("array in descending order with 50 elements: ");
    ArrayList test06 = new ArrayList<Comparable>();
    backpopulate(test06, 50);
    System.out.println(Sorts.selection(test06));
    System.out.println("array in descending order with 100 elements: ");
    ArrayList test006 = new ArrayList<Comparable>();
    backpopulate(test006, 100);
    System.out.println(Sorts.selection(test006));

    System.out.println("------------------------------------------------------------------------");

    System.out.println("Testing insertion...");
    System.out.println("Best case scenario: The array is already in ascending order");
    System.out.println("array in ascending order with 5 elements: ");
    ArrayList test7 = new ArrayList<Comparable>();
    populate(test7, 5);
    System.out.println(Sorts.insertion(test7));
    System.out.println("array in ascending order with 50 elements: ");
    ArrayList test07 = new ArrayList<Comparable>();
    populate(test07, 50);
    System.out.println(Sorts.insertion(test07));
    System.out.println("array in ascending order with 100 elements: ");
    ArrayList test007 = new ArrayList<Comparable>();
    populate(test007, 100);
    System.out.println(Sorts.insertion(test007));
    System.out.println("--");
    System.out.println("Random case scenario: ");
    ArrayList test8 = Sorts.populate(5, 1, 10);
    System.out.println("test8 unsorted: " + test8);
    System.out.println(Sorts.insertion(test8));
    System.out.println("--");
    System.out.println("Worst case scenario: The array is in descending order");
    System.out.println("array in descending order with 5 elements: ");
    ArrayList test9 = new ArrayList<Comparable>();
    backpopulate(test9, 5);
    System.out.println(Sorts.insertion(test9));
    System.out.println("array in descending order with 50 elements: ");
    ArrayList test09 = new ArrayList<Comparable>();
    backpopulate(test09, 50);
    System.out.println(Sorts.insertion(test09));
    System.out.println("array in descending order with 100 elements: ");
    ArrayList test009 = new ArrayList<Comparable>();
    backpopulate(test009, 100);
    System.out.println(Sorts.insertion(test009));
  }

}

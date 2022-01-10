import java.util.ArrayList;

public class Sorts {

  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

  public static String bubble( ArrayList<Comparable> data )
  {
    int pass_counter = 0;
    int swap_counter = 0;
    int compare_counter = 0;
    for( int passCtr = 1; passCtr < data.size(); passCtr++ ) {
      pass_counter ++;
      //System.out.println( "commencing pass #" + passCtr + "..." );
      //iterate thru first to next-to-last element, comparing to next
      for( int i = 0; i < data.size()-1; i++ ) {
        compare_counter ++;
        //if element at i > element at i+1, swap
        if ( data.get(i).compareTo(data.get(i+1) ) > 0 ) {
          data.set( i, data.set(i+1,data.get(i)) );
          swap_counter ++;
        }
        //System.out.println(data); //diag: show current state of list
      }
    }
    return "# of swaps: " + swap_counter + "\n# of passes: " + pass_counter + "\n# of compares: " + compare_counter;
  }

  public static String selection( ArrayList<Comparable> data )
  {
  //note: this version places greatest value at rightmost end,

  //maxPos will point to position of SELECTION (greatest value)
  int maxPos;
  int pass_counter = 0;
  int swap_counter = 0;
  int compare_counter = 0;

  for( int pass = data.size()-1; pass > 0; pass-- ) {
    pass_counter ++;
    //System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
    maxPos = 0;
    for( int i = 1; i <= pass; i++ ) {
      compare_counter ++;
      //System.out.println( "maxPos: " + maxPos );//diag
      //System.out.println( data );//diag
      if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
        maxPos = i;
    }
    data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
    swap_counter++;
    //System.out.println( "after swap: " +  data );//diag
    }
    return "# of swaps: " + swap_counter + "\n# of passes: " + pass_counter + "\n# of compares: " + compare_counter;
  }//end selectionSort

  public static String insertion( ArrayList<Comparable> data )
  {
    int pass_counter = 0;
    int swap_counter = 0;
    int compare_counter = 0;

    for( int partition = 1; partition < data.size(); partition++ ) {
      pass_counter ++;
      //partition marks first item in unsorted region
      //diag:
      //System.out.println( "\npartition: " + partition + "\tdataset:");
      //System.out.println( data );
      //traverse sorted region from right to left
      for( int i = partition; i > 0; i-- ) {
        compare_counter ++;
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(i).compareTo( data.get(i-1) ) < 0 ) {
          //diag:
          //System.out.println( "swap indices "+(i-1)+" & "+i+"..." );
          data.set( i, data.set( i-1, data.get(i) ) );
          swap_counter++;
        }
        else
        break;
      }
    }
    return "# of swaps: " + swap_counter + "\n# of passes: " + pass_counter + "\n# of compares: " + compare_counter;

  }//end insertionSortV

}

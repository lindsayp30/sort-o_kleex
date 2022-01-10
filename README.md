# TNPG: kleex
**Members: Lindsay Phung and Xinqing Lin**

**Duckies: Tommy and Horse**

**SotW: Achilles Heel by J. Maya and London by Mokita**

---

***Bubblesort:***
- The best case scenario is when the list is already arranged in ascending order. It uses n-1 passes and 0 swaps.
- This is because as the program iterates through the list (left to right), it compares each element to the one succeeding it. There are only swaps when an element's value is less than that of the one succeeding it. In a list already in ascending order, there will be no swaps.
- The time complexity of the best case scenario is O(n) because there is a relationship such that even though no swaps are made, the program still has to do n-1 passes. This is bound by n.
- An example: with the test array with 100 elements, there are 0 swaps with 99 passes. This is less than 100.
- The worst case scenario is when the list is arranged in descending order.
- This is because an element's value will always be greater than that of the one succeeding it. Thus, swaps will have to be made.
- The time complexity of the worst case scenario is O(n^2) because for every pass, there is more than one swap. This is because of the nested for loop. This relationship would be bound by n^2.
- An example: with the test array with 100 elements, there are 4851 swaps with 98 passes. This is less than 10,000.

***Selection Sort:***
- There is no best or worst case scenario. All scenarios require the program to swap data.size() - 1 times regardless of the order of the ArrayList.
- This is because the code always swaps the rightmost element of the unsorted area with the element at maxPos, even if they are the same element.
- The time complexity of the scenarios is O(n) because there will always be n-1 passes and n-1 swaps, which rounds up to n because Big-O categorization ignores constants. This is bound by n.
- An example: with the test array with 100 elements, in ascending and descending order, there are 98 swaps and 98 passes. This is less than 100.

***Insertion Sort:***
- The best case scenario is when the list is already arranged in ascending order. It uses n-1 passes and 0 swaps.
- This is because an element's value is greater than that of the one succeeding it. Thus, no swaps will be required.
- The time complexity of the best case scenario is O(n) because there is a relationship such that even though no swaps are made, the program still has to do n-1 passes. This is bound by n.
- An example: with the test array with 100 elements, there are 0 swaps and 99 passes. This is less than 100.
- The worst case scenario is when the list is arranged in descending order.
- This is because every element will have to be "walked" to its appropriate location, except for the greatest element in the ArrayList. "Walking" will take up many swaps.
- The time complexity of the worst case scenario is O(n^2) because for every pass, there is more than one swap. This is because of the nested for loop. This relationship would be bound by n^2.
- An example: with the test array with 100 elements, there are 4851 swaps with 98 passes. This is less than 10,000.

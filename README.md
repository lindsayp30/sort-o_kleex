# TNPG: kleex 

**Members: Lindsay Phung and Xinqing Lin**

**Duckies: Tommy and Horse**

**Songs of the week: Achilles Heel by J. Maya (Lindsay) and London by Mokita (Xinqing)**

---

***For bubble:***
- The best case scenario is when the list is already arranged in ascending order. Given that the size of the arrays are the same, when comparing it with an ArrayList with randomly generated numbers, the best case scenario required 0 swaps while the random scenario required around 5 swaps.
- This is because as the program iterates through the list (left to right), it compares each element to the one succeeding it. There are only swaps when an element's value is less than that of the one succeeding it. In a list already in ascending order, there will be no swaps.
- The worst case scenario is when the list is arranged in descending order. Given that the size of the arrays are the same, when compared to an ArrayList with randomly generated numbers, the worst case scenario performed worse at 10 swaps. This surpasses random scenario's ~5 swaps.
- This is because an element's value will always be greater than that of the one succeeding it.

***For selection:***
- There is no best or worst case scenario. All scenarios require the program to swap data.size() - 1 times regardless of the order of the ArrayList.
- This is because the code always swaps the rightmost element of the unsorted area with the element at maxPos, even if they are the same element.

***For insertion:***
- The best case scenario is when the list is already arranged in ascending order. Given that the size of the arrays are the same, when comparing it with an ArrayList with randomly generated numbers, the best case scenario required 0 swaps while the random scenario required around 5 swaps.
- This is because an element's value is greater than that of the one succeeding it. Thus, no swaps will be required.
- The worst case scenario is when the list is arranged in descending order. Given that the size of the arrays are the same, when compared to an ArrayList with randomly generated numbers, the worst case scenario performed worse at 10 swaps. This surpasses random scenario's ~5 swaps.
- This is because every element will have to be "walked" to its appropriate location, except for the greatest element in the ArrayList. "Walking" will take up many swaps.

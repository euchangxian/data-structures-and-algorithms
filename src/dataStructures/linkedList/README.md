# Linked Lists
Linked lists are a linear structure used to store data elements. 
It consists of a collection of objects, used to store our data elements, known as nodes.

![Linked list image](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20230726162542/Linked-List-Data-Structure.png)

*Source: GeeksForGeeks*

### Linked Lists vs Arrays
Linked lists are similar to arrays in 
terms of used and purpose, but there are considerations when deciding which structure to use. 

Unlike arrays, which are stored in contiguous locations in memory,
linked lists are stored across memory and are connected to each other via pointers.

![Array image](https://beginnersbook.com/wp-content/uploads/2018/10/array.jpg)

*Source: BeginnersBook*

## Analysis
Some common operations involved in a linked list includes looking up elements in a linked list and inserting elements into a linked list.

Searching a linked list requires O(n) time complexity whereas inserting into a linked list from a specified index requires O(n) time complexity.

## Notes / Further Details / Conclusion

### Memory Requirements & Flexibility
As a contiguous block of memory must be allocated for an array, its size is fixed.
If we declare a array of size *n*, but only allocate *x* elements, where *x < n*, 
we will be left with unused, wasted memory.

This waste does not occur with linked lists, which only take up memory as new elements are added.
However, additional space will be used to store the pointers. 

As the declared size of our array is static (done at compile time), we are also given less flexibility if 
we end up needing to store more elements at run time.

However, linked list gives us the option of adding new nodes at run time based on our requirements, 
allowing us to allocate memory to store items dynamically, giving us more flexibility.

### Conclusion
You should aim to use linked list in scenarios where you cannot predict how many elements you need to store
or if you require constant time insertions to the list.

However, arrays would be preferred if you already know the amount of elements you need to store ahead of time. 
It would also be preferred if you are conducting a lot of look up operations.

## Linked List Variants
The lookup time within a linked list is its biggest issue.
However, there are variants of linked lists designed to speed up lookup time.

### Doubly Linked List

![Doubly Linked List](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2014/03/DLL1.png)

*Source: GeeksForGeeks*

This is a variant of the linked list with each node containing the pointer to not just the next note, but also the previous node.

Unlike the standard linked list, this allows us to traverse the list in the backwards direction too, this makes it a good data structure to use when implementing undo / redo functions. However, when implementing a doubly linked list, it is vital to ensure that you consider and maintain **both** pointers.

It is also worth noting that insertion from the front and back of the linked list is a O(1) operation. (Since we now only need to change the pointers in the node.)

### Skip list

![Skip List](https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Skip_list.svg/800px-Skip_list.svg.png)

*Source: Brilliant*

This is a variant of a linked list with additional pointer paths that does not lead to the next node 
but allow you to skip through nodes in a "express pointer path" which can be user configured. 
If we know which nodes each express pointer path stops at, we would be able to conduct faster lookup.

This would also be ideal in situations where we want to store a large amount
of data which we do not need to access regularly that we are not willing to delete.

### Unrolled Linked Lists

![Unrolled Linked List](https://ds055uzetaobb.cloudfront.net/brioche/uploads/5LFjevVjNy-ull-new-page.png?width=2400)

*Source: Brilliant*

Unrolled linked lists stores multiple consecutive elements into a single bucket node. 
This allows us to avoid constantly travelling down nodes to get to the element we need.
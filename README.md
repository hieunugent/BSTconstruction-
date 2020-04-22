# BSTconstruction
- Write a Binary Search Tree. the class should support:
  - Inserting values with the 'insert' method.
  - Removing values with the 'remove' method; this method should only remove the first instance of a given value.
  - searching for values with the 'contains' method,
- Note that you can't remove values from a single node tree should simply not do anything
- BST note have a int value , left node , right node
- BST property, current node is greater than left node value and less than right node value  
- children node of BST is either valid BST node themselves or NULL
# Solution
- insert:
  - value insert need to compare with current root node to consider where should it go, if greater/equal put on the right side, less than on the left side. traverse until meet leaf
  - time complexity: O(logN)
- contain:
  - return boolean expression, traverser through the tree, if greater/equal current node move right, less than move left, if meet num target return true else return false
  - time complexity:O(logN)
- Remove:
  - using search function find where num is.
  - if it is a leaf just remove it
  - if it is root remove it and replace it by the most left node on the right side, same as the smallest value on the right side and remove current position of the smallest
- Search:
  - Function use to identify location of the node.
  - it can be use to swap node and remove node.
# static Block
  - static block is used when need to do  the computation in order to initialize static variable
  - a static block that gets executed exactly once, when the class is first loaded.
# time complexity:
  - given value will eliminate haft of tree as each time iterate through the tree
  - for insert function the average complexity time would be O(logN)
  - for contain function the average would be O(logN)
  - for remove function (OLogN)
  

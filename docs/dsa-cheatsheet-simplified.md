# DSA Cheatsheet: Pattern-Based Problem Solving

## Problem Patterns

### **Sorted Array?**
- **Binary Search** - Finding specific elements
- **Two Pointers** - Pairs with target sum, triplets

### **Subarray Problems?**
- **Sliding Window** - Subarrays with constraints (fixed/variable size)
- **Prefix Sum** - Range queries, cumulative calculations
- **Kadane's Algorithm** - Maximum subarray sum

### **Need All Combinations?**
- **Backtracking** - All permutations, subsets, combinations
- **Recursion** - Breaking into smaller subproblems

### **Recursion Not Allowed?**
- **Stack** - Manual function call simulation

### **Tree Problems?**
- **DFS** - Path finding, exploration (recursive or stack)
- **BFS** - Shortest path, level order (queue)

### **Graph Problems?**
- **DFS** - Connected components, cycle detection
- **BFS** - Shortest path in unweighted graphs
- **Dijkstra** - Shortest path with positive weights
- **Union-Find** - Connected components, cycle detection

### **Need O(1) Lookup?**
- **HashMap/HashSet** - Frequency counting, existence checking
- **Count Array** - For limited range inputs

### **Need Top/Least K Elements?**
- **Heap** - Min/Max priority queue
- **QuickSelect** - Finding Kth element

### **String Matching?**
- **Hash Map** - Character frequency, anagrams
- **Trie** - Prefix matching, autocomplete
- **Two Pointers** - Palindrome checking

### **In-Place Requirement?**
- Value encoding (use sign bit, quotient/remainder)
- Swap technique (array reorganization)

### **Space Is Critical?**
- Sort first - Often enables O(1) space solutions
- Bit manipulation - XOR for duplicates/missing

### **Optimization Problems?**
- **Dynamic Programming** - Optimal substructure problems
- Bottom-up (tabulation) or top-down (memoization)

### **Linked List?**
- **Two Pointers** - Fast/slow for cycles, middle finding
- **Dummy Node** - Simplify head operations
- **Reversal** - For palindrome, reordering

## Data Structure Quick Reference

### **Linear**
- **Array/ArrayList** - Random access O(1), insertion O(n)
- **LinkedList** - Insert/delete at position O(1), access O(n)
- **Stack** - LIFO, expression parsing, backtracking
- **Queue** - FIFO, BFS algorithm
- **Deque** - Both-end operations

### **Hash-Based**
- **HashMap/HashSet** - O(1) average lookup, insertion, deletion

### **Tree-Based**
- **Binary Tree** - Hierarchical data
- **BST** - Ordered operations O(log n) average
- **Trie** - String prefix operations
- **Heap** - Priority queue operations
- **Segment Tree** - Range queries

### **Graph**
- **Adjacency List** - Sparse graphs O(V+E) space
- **Adjacency Matrix** - Dense graphs O(V²) space

## Common Time-Space Tradeoffs

| Approach | Time | Space | Best For |
|----------|------|-------|----------|
| HashMap/Set | O(n) | O(n) | Lookup optimization |
| Sort first | O(n log n) | O(1) | Space-constrained problems |
| Two pointers | O(n) | O(1) | Linear traversal, in-place operations |
| Recursion | Varies | O(n) stack | Elegant solutions to tree/graph problems |
| DP memoization | O(states) | O(states) | Top-down optimization problems |
| DP tabulation | O(states) | O(states) | Bottom-up optimization problems |

## Problem Solving Steps
1. **Identify** the problem pattern
2. **Choose** appropriate data structure/algorithm
3. **Handle** edge cases: empty, single element, duplicates
4. **Optimize** if time/space requirements aren't met

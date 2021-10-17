# 2 Pointers

Problems based on 2 Pointers approach

---
## 2 Pointers Problems Rundown 
### (Approaches to Solve)

### Clone a Linked List with next and random pointer

#### Brute force approach 
#### Hashing

- Hash the current node with new duplicate node for the first traversal
- Assign next and random pointers, one by one, using Hashmap for the next traversal
- Return the new clone (deep copy) of LL

#### Optimal appraoch

- Copy nodes and insert them right after the original nodes
- In the next iteration, Assign random pointers for the copy nodes using a dummy node `iter` and original nodes
- Restore the original list, and extract the copy list

---
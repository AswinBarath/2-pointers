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
- Time Complexity: O(N) | Space Complexity: O(1)

---

### 3 sum 

#### Brute force approach

- Try out all th triplets and return the sum which gives 0
- Use three loops to traverse through array and compute triplet sum
- For returning unique triplets, we can use a HashSet
- Time Complexity: O(N^3 * logM) (why? Insertion in a set of size m will take logarithmic time)
- Space Complexity: O(M) (why? M - No. of unique triplets in the HashSet)

#### Better approach
#### Hashing

- We can improve the above approach using Hashing
- Create a HashMap and store the elements with their occurances in one iteration
- Now, use two loops to compute the triplets like c = -(a+b)
- Decrement the ocuurences when you use the element for computation and increment to original form once computation is done
- Use HashSet to store unique triplets and return it
- Time Complexity: O(N^2 * logM) | Space Complexity: O(M + N)

#### Optimal approach
#### 2-pointer technique

- Sort the given array
- `a+b+c=0` is the triplet we need to find. So, use `b + c = -a` to change given problem to **Two Sum problem** 
- Choose the unqiue `a` for each iteration and keep it constant until two-pointers cross over
- Take to pointer `lo` and `hi` to choose unique `b` and unique `c` respectively and change them in the following way
    - When `b+c<-a` then `lo++`
    - When `b+c>-a` then `hi--`
    - When `b+c == -a` then `lo++` and `hi--` at the same time
    - (To choose unique elements from array compare adjacent elements and update the pointers accordingly)
- Time Complexity: O(N^2) | Space Complexity: O(1) (auxiliary, because the space used for answer is not accountable)

---

###	Trapping rainwater 



---

###	Remove Duplicate from Sorted array 



---

###	Max consecutive ones 



---

# 2 Pointers

Problems based on the 2 Pointers approach

## SDE Sheet problems on 2 Pointers

[Sheet Link](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/)

### Day 7

| Completion Status | Problems on 2 Pointers | Explanation | Solution |
| --- | --- | --- | --- |
| ✅ | [Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/) | [Brute, Better & Optimal Approaches](#Clone-a-Linked-List-with-next-and-random-pointer) | [Java Soultion](./src/sde_sheet/CloneLLwith2Pointers.java) |
| ✅ | [3Sum](https://leetcode.com/problems/3sum/) | [Brute, Better & Optimal Approaches](#3-sum) | [Java Soultion](./src/sde_sheet/ThreeSum.java) |
| ✅ | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | [Brute, Better & Optimal Approaches](#Trapping-rainwater) | [Java Soultion](./src/sde_sheet/ContainerWithMostWater.java) |
| ✅ | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | [Brute, Better & Optimal Approaches](#Remove-Duplicate-from-Sorted-array ) | [Java Soultion](./src/sde_sheet/RemoveDuplicateFromSortedarray.java) |
| ✅ | [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/) | [Brute, Better & Optimal Approaches](#Max-consecutive-ones) | [Java Soultion](./src/sde_sheet/MaxConsecutiveOnes.java) |

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
- Time Complexity: O(N^2) 
- Space Complexity: O(1) (auxiliary, because the space used for answer is not accountable)


---


###	Trapping rainwater 

Given: Heights of buildings in an array
To return: Maximum Area of water the given building can trap
Approach: Find two building which result in trapping maximum area

#### Intuition

- To find the maximum trapped rainwater for given building, we use the formula: `min(left[i] - right[i]) - a[i]`, where
    - left[i] is the height of the maximum building to the left
    - right[i] is the height of the maximum building to the right
    - a[i] is the height of given building

#### Brute force approach

- To find the building with maximum height from left and right, we can use two loops
- Time Complexity: O(N^2) | Space Complexity: O(1)

#### Better approach
#### Prefix sum

- Create two array to store prefix maximum and suffix maximum
- These array will store the maximum height from left to right in prefix arr and vice versa
- Time Complexity: O(N) <= `O(N) + O(N) + O(N)`
- Space Complexity: O(N) <= `O(N) + O(N)`

#### Optimal approach

- Take two pointers left and right at extreme positions
- Maintain two values leftMax and rightMax and update it accordingly
- Calculate area using height and width and update if its greater than maxArea
- Compute maxArea until left and right pointers cross over
- Time Complexity: O(N) | Space Complexity: O(1)


---


###	Remove Duplicate from Sorted array 

Given: Sorted array with duplicates
To return: No. of unique numbers
Condition: 
    - To sort all unique numbers and insert in-place in the given array from the start
    - No need other numbers
Approach: Find unique numbers, overwrite the given array with unique numbers, count them and return it.

#### Brute force appraoch

- Use a HashSet to store unique numbers
- Insert them in-place at given array
- Time Complexity: O(NlogN) (why? N for traversal and logN for inserting them in HashSet)
- Space Complexity: O(N)

#### Optimal approach

- Take two pointer i and j
    - If values at i and j are same, then increment j
    - If values at i and j are different, then increment i, and copy element value of j to i
- When j is out of bound, return the count which is `(i+1)`
- Time Complexity: O(N) | Space Complexity: O(1)


---


###	Max consecutive ones 

Given: Binary Array
To return: Maximum consecutive ones in given binary array
Approach: Keep track of consecutive ones and the maximum count

- Use two pointers count and maxi
- Count the consecutive ones and update the count
- If we encounter zero, change count to zero
- Keep updating the maximum value of count in maxi
- Time Complexity: O(N) | Space Complexity: O(1)


---

# Day-5 - Advanced Java Training 🚀

On Day-5, I worked on a variety of array, math, greedy, hashing, and prefix sum problems. These questions helped me improve my understanding of efficient array manipulation, pattern recognition, and problem-solving strategies that avoid unnecessary brute force approaches 🧠

## Problems Completed ✅
- 1217. Minimum Cost to Move Chips to The Same Position
- 2455. Average Value of Even Numbers That Are Divisible by Three
- 3232. Find if Digit Game Can Be Won
- 27. Remove Element
- 1480. Running Sum of 1d Array
- 1470. Shuffle the Array
- 189. Rotate Array
- 283. Move Zeroes
- 121. Best Time to Buy and Sell Stock
- 1. Two Sum
- 169. Majority Element
- 724. Find Pivot Index

---

## 1. Minimum Cost to Move Chips to The Same Position 🎯

### Problem Overview
This problem asks for the minimum cost required to move all chips to the same position.

### Logic Used
Moving a chip by 2 positions costs 0, while moving it by 1 position costs 1. This means:
- all chips on even positions can be grouped together for free
- all chips on odd positions can also be grouped together for free

So, the minimum cost is the smaller count between chips on even and odd positions.

### What I Learned
- How parity can simplify movement problems
- How to convert a movement problem into a counting problem
- Better understanding of greedy observation

### Takeaway
This problem showed me that sometimes the cheapest route is hidden inside a simple even-odd pattern ⚖️

---

## 2. Average Value of Even Numbers That Are Divisible by Three 🔢

### Problem Overview
This problem asks for the average of all numbers in the array that are both even and divisible by 3.

### Logic Used
A number that is both even and divisible by 3 must be divisible by 6. So the solution:
- filters numbers divisible by 6
- adds them to a sum
- counts how many such numbers exist
- returns the integer average

### What I Learned
- How to combine multiple divisibility conditions efficiently
- How to calculate average using sum and count
- How to handle cases where no valid elements exist

### Takeaway
This problem was a nice reminder that two conditions can often be merged into one cleaner check ✨

---

## 3. Find if Digit Game Can Be Won 🎮

### Problem Overview
This problem asks whether Alice can win a digit-based game by comparing sums of certain grouped numbers.

### Logic Used
The numbers are separated into:
- single-digit numbers
- double-digit numbers

Then the sums of both groups are compared. If they are not equal, Alice can win.

### What I Learned
- How to split input into categories based on value ranges
- How grouping can simplify game-related logic
- Better clarity in handling sum comparisons

### Takeaway
This problem taught me that even game problems can boil down to neat little grouping rules.

---

## 4. Remove Element 🧹

### Problem Overview
This problem asks to remove all occurrences of a given value from an array in-place and return the number of remaining elements.

### Logic Used
A pointer is used to track where the next valid element should be placed.
- Traverse the array
- If the element is not equal to the target value, place it at the pointer
- Increase the pointer

### What I Learned
- How in-place array modification works
- How two-pointer style logic can avoid extra space
- How to overwrite unwanted elements efficiently

### Takeaway
This problem strengthened my understanding of in-place operations, which are tiny but mighty in interviews 💪

---

## 5. Running Sum of 1d Array 📈

### Problem Overview
This problem asks to transform the array so that each element becomes the sum of itself and all previous elements.

### Logic Used
Starting from index 1, each element is updated by adding the value of the previous element.

### What I Learned
- Introduction to prefix sum thinking
- How cumulative calculations are built step by step
- How array values can be reused efficiently

### Takeaway
This problem gave me a good starting point for understanding prefix sums, which show up everywhere later.

---

## 6. Shuffle the Array 🔀

### Problem Overview
This problem asks to rearrange the array in the form:
`x1, y1, x2, y2, ...`

### Logic Used
The array is split logically into two halves:
- first half contains x values
- second half contains y values

Then a new array is filled alternately with one value from each half.

### What I Learned
- How to map indices carefully
- How structured rearrangement works
- Better confidence in array construction problems

### Takeaway
This problem looked simple, but it trains precision. One wrong index and the whole thing becomes spaghetti 🍝

---

## 7. Rotate Array 🔄

### Problem Overview
This problem asks to rotate the array to the right by `k` steps.

### Logic Used
The solution uses reversal:
- reverse the whole array
- reverse the first `k` elements
- reverse the remaining elements

This rotates the array efficiently without extra space.

### What I Learned
- A smart in-place technique for rotation
- How reversing can be used creatively
- The importance of reducing `k` using modulo

### Takeaway
This problem taught me one of those elegant tricks that feels illegal the first time you see it 😄

---

## 8. Move Zeroes 0️⃣

### Problem Overview
This problem asks to move all zeroes to the end of the array while keeping the order of non-zero elements the same.

### Logic Used
The solution:
- places all non-zero elements at the front
- keeps track of the next valid position
- fills the remaining positions with zeroes

### What I Learned
- How stable rearrangement works
- How to preserve order while modifying arrays
- Better practice with in-place array updates

### Takeaway
This problem was good training for clean data movement without creating extra mess.

---

## 9. Best Time to Buy and Sell Stock 💹

### Problem Overview
This problem asks for the maximum profit that can be made by buying and selling a stock once.

### Logic Used
The idea is:
- track the minimum stock price seen so far
- calculate profit for each day if sold on that day
- update the maximum profit whenever a better one is found

### What I Learned
- How greedy tracking works
- How to optimize profit calculation in one pass
- How to identify the best buy-sell pair without brute force

### Takeaway
This problem showed me how much mileage you can get from keeping track of just one minimum value.

---

## 10. Two Sum 🧩

### Problem Overview
This problem asks to find two indices such that the numbers at those indices add up to the target.

### Logic Used
A HashMap is used to store:
- each number
- its index

For every element, the complement needed to reach the target is checked in the map.

### What I Learned
- How hashing can reduce time complexity
- How to trade space for speed
- One of the most classic interview problem patterns

### Takeaway
This problem is basically the handshake between arrays and HashMaps 🤝

---

## 11. Majority Element 👑

### Problem Overview
This problem asks to find the element that appears more than `n / 2` times in the array.

### Logic Used
The Boyer-Moore Voting Algorithm is used:
- keep a candidate and a count
- if count becomes 0, choose a new candidate
- increase or decrease the count depending on the current element

### What I Learned
- A very efficient voting-based algorithm
- How cancellation logic works in arrays
- How majority problems can be solved in constant space

### Takeaway
This problem introduced me to a clever algorithm that looks suspiciously simple until it works beautifully.

---

## 12. Find Pivot Index ⚖️

### Problem Overview
This problem asks to find the index where the sum of elements on the left equals the sum of elements on the right.

### Logic Used
The solution:
- calculates the total sum of the array
- keeps a running left sum
- checks whether left sum equals right sum at each position

### What I Learned
- How prefix sums help compare partitions
- How to avoid recalculating sums repeatedly
- Better handling of balance-based array problems

### Takeaway
This problem improved my ability to think in terms of left and right contributions instead of recalculating everything each time.

---

## Overall Learning from Day-5 🌟
Day-5 helped me improve in:
- **Array manipulation**
- **Greedy thinking**
- **Hashing**
- **Prefix sum**
- **In-place operations**
- **Pattern recognition**

These problems gave me solid practice with common coding interview techniques. I learned how to approach problems with cleaner logic, reduce unnecessary work, and use the right data structure or observation when needed 🚀

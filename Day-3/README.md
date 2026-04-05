# Day-3 - Advanced Java Training 🚀

On Day-3, I practiced problems based on mathematical reasoning and bit manipulation. These questions helped me understand how patterns in numbers, binary representations, and digit positions can lead to efficient solutions without relying on brute force methods 🧠

## Problems Completed ✅
- 172. Factorial Trailing Zeroes
- 342. Power of Four
- 191. Number of 1 Bits
- 400. Nth Digit

---

## 1. Factorial Trailing Zeroes 🧮

### Problem Overview
This problem asks to find the number of trailing zeroes in the factorial of a number `n`.

### Logic Used
Trailing zeroes are formed by multiplying `2 × 5`. Since factorials always have more 2s than 5s, the problem becomes counting how many times 5 appears as a factor in the factorial.

### What I Learned
- How trailing zeroes are formed mathematically
- Why counting factors of 5 is enough
- How repeated division can simplify number theory problems

### Takeaway
This problem taught me that sometimes the direct-looking approach is a trap, and the smarter path is hidden in factor counting 🔍

---

## 2. Power of Four ⚡

### Problem Overview
This problem asks whether a given number is a power of 4.

### Logic Used
The number is repeatedly divided by 4 as long as it is divisible. If it finally becomes 1, then it is a power of 4. Otherwise, it is not.

### What I Learned
- How repeated division can check powers efficiently
- How to handle edge cases like 0 and negative numbers
- Better understanding of number properties

### Takeaway
This problem improved my ability to test mathematical conditions in a clean and efficient way.

---

## 3. Number of 1 Bits 💻

### Problem Overview
This problem asks to count the number of `1`s in the binary representation of a number.

### Logic Used
Using bit manipulation:
- Check the last bit using `n & 1`
- Add to the count if it is `1`
- Right shift the number to process the next bit

### What I Learned
- Practical use of bitwise operators
- How binary representations are handled in programming
- Why bit manipulation can make solutions efficient

### Takeaway
This problem gave me better confidence in working with binary logic, which is something that initially looks scary until it clicks 😄

---

## 4. Nth Digit 🔢

### Problem Overview
This problem asks to find the `n-th` digit in the infinite sequence:

`1234567891011121314...`

### Logic Used
The sequence is divided into groups:
- 1-digit numbers
- 2-digit numbers
- 3-digit numbers
and so on.

The solution finds which group contains the required digit, identifies the exact number, and then extracts the correct digit from it.

### What I Learned
- How to break large sequences into manageable groups
- How digit-length patterns work
- How math can be used to navigate number sequences efficiently

### Takeaway
This problem taught me to stop looking at the sequence as one giant monster and instead split it into smaller predictable chunks 🐉➡️🧩

---

## Overall Learning from Day-3 🌟
Day-3 helped me strengthen my skills in:
- **Mathematical reasoning**
- **Pattern recognition**
- **Bit manipulation**
- **Efficient problem solving**

These problems showed me that many coding questions become easier once the underlying pattern is understood. Instead of brute force, the focus was on using logic, properties of numbers, and binary operations to arrive at efficient solutions 🚀

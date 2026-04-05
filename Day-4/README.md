# Day-4 - Advanced Java Training 🚀

On Day-4, I practiced a mix of mathematical, simulation-based, and array/string problems. These questions helped me improve my ability to identify hidden patterns, handle edge cases, and choose efficient logic instead of relying only on brute force 🧠

## Problems Completed ✅
- 390. Elimination Game
- 397. Integer Replacement
- 1518. Water Bottles
- 319. Bulb Switcher
- 66. Plus One
- 657. Robot Return to Origin

---

## 1. Elimination Game 🔄

### Problem Overview
This problem asks to find the last remaining number after repeatedly eliminating numbers from left to right and right to left in alternating rounds.

### Logic Used
Instead of simulating the full list, the solution tracks:
- the current starting number
- the gap between remaining numbers
- the count of remaining numbers
- the direction of elimination

This makes the problem much more efficient.

### What I Learned
- How to optimize simulation problems using variables instead of full arrays
- How alternating directions affect the result
- How patterns emerge when the data keeps shrinking

### Takeaway
This problem taught me that simulation problems do not always need full simulation. Sometimes a few smart variables do all the heavy lifting 🏋️

---

## 2. Integer Replacement 🔢

### Problem Overview
This problem asks for the minimum number of operations needed to reduce a number to 1.
- If the number is even, divide it by 2
- If it is odd, either add 1 or subtract 1

### Logic Used
The idea is to reduce the number as efficiently as possible:
- Even numbers are halved
- For odd numbers, choose the better option between `+1` and `-1`
- A special case is needed for small values like 3

### What I Learned
- How greedy thinking can help in optimization problems
- Why edge cases matter a lot
- How bit-based patterns influence decision making

### Takeaway
This problem was a nice reminder that one wrong choice in a greedy problem can send the whole solution into the bushes 🌿

---

## 3. Water Bottles 🍼

### Problem Overview
This problem asks how many water bottles can be drunk in total if empty bottles can be exchanged for new full bottles.

### Logic Used
The solution keeps track of:
- bottles currently available to drink
- empty bottles collected after drinking
- how many new bottles can be obtained by exchange

This repeats until no more exchanges are possible.

### What I Learned
- How to simulate real-world style exchange processes
- How to manage values through repeated transformation
- Better understanding of loop-based state updates

### Takeaway
This problem made simulation feel practical and straightforward. Very simple concept, but easy to mess up if the bottle counts are handled carelessly 😄

---

## 4. Bulb Switcher 💡

### Problem Overview
This problem asks how many bulbs remain ON after toggling them in multiple rounds.

### Logic Used
A bulb remains ON only if it is toggled an odd number of times. That happens only for numbers with an odd number of divisors, which are perfect squares.

So the answer is simply the count of perfect squares less than or equal to `n`.

### What I Learned
- How divisor patterns affect outcomes
- Why perfect squares behave differently
- How a problem that looks like simulation can become a direct math formula

### Takeaway
This problem was a classic trapdoor. It looks like you need loops and bulb flipping chaos, but the answer is quietly sitting inside number theory 💡

---

## 5. Plus One ➕

### Problem Overview
This problem asks to add one to a large number represented as an array of digits.

### Logic Used
The solution starts from the last digit:
- If it is less than 9, increase it and return
- If it is 9, make it 0 and continue
- If all digits are 9, create a new array with one extra digit

### What I Learned
- How carry propagation works in arrays
- How to handle array edge cases cleanly
- Why simple-looking problems still need careful implementation

### Takeaway
This problem helped me understand how normal arithmetic operations are handled manually in array form.

---

## 6. Robot Return to Origin 🤖

### Problem Overview
This problem asks whether a robot returns to the origin after executing a sequence of moves.

### Logic Used
The robot’s position is tracked using:
- horizontal movement (`L` and `R`)
- vertical movement (`U` and `D`)

If both coordinates are 0 at the end, the robot returns to the origin.

### What I Learned
- How to simulate coordinate movement
- How strings can represent movement instructions
- How to map characters to position changes

### Takeaway
This problem was a nice exercise in basic simulation and coordinate tracking. Tiny robot, decent lesson 🚶‍♂️

---

## Overall Learning from Day-4 🌟
Day-4 helped me improve in:
- **Pattern recognition**
- **Greedy thinking**
- **Simulation**
- **Array manipulation**
- **Mathematical reasoning**

These problems taught me to look beyond the obvious brute force method and search for the underlying rule, shortcut, or structure behind the question. That shift in thinking is where a lot of the real improvement happens 🚀


# 📘 Why `System.out.println(arr)` Does NOT Print Array Elements in Java

In Java, many beginners expect this:

```java id="x8m2q5"
int[] arr = {10, 20, 30};

System.out.println(arr);
```

to print:

```text id="u4n7v1"
10 20 30
```

But instead, Java prints something like:

```text id="m1q9k4"
[I@5acf9800
```

This confuses almost every beginner.

To understand this properly, we need to learn:

* arrays as objects
* references
* memory representation
* `toString()`
* Object class behavior
* behind-the-scenes Java execution

---

# 📌 The Problem Statement

## Code

```java id="r5m8q2"
public class Array {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        System.out.println(arr);
    }
}
```

---

# 📌 Expected Output (Beginner Expectation)

```text id="t7n2v5"
10 20 30
```

---

# 📌 Actual Output

```text id="v3m9k1"
[I@5acf9800
```

OR similar random value.

---

# 📌 Why Does This Happen?

Because:

```java id="k1m7v4"
arr
```

does NOT directly contain array elements.

It contains:

# reference/address

to the array object.

---

# 🚨 Very Important Concept

# Arrays in Java are Objects

This is the MOST important understanding.

---

# 📌 What Happens Internally?

When you write:

```java id="z8n2q5"
int[] arr = {10, 20, 30};
```

Java creates:

# array object in heap memory

---

# 📌 Internal Memory Representation

```text id="m5v1k9"
Stack Memory
-------------
arr = reference/address

       ↓

Heap Memory
-------------
| 10 | 20 | 30 |
-------------
```

---

# 📌 What is `arr` Actually?

`arr` is:

# reference variable

It stores:

# address/reference

of the array object.

---

# 📌 Important Understanding

This:

```java id="w2m8q4"
arr
```

is NOT the actual array.

It is only:

# a pointer/reference to the array object

---

# 📌 Then What Happens in:

```java id="r7n1v5"
System.out.println(arr);
```

?

---

# 📌 Internal Java Behavior

Behind the scenes, Java converts:

```java id="u9m3k2"
System.out.println(arr);
```

into something similar to:

```java id="x4n8v1"
System.out.println(arr.toString());
```

because arrays are objects.

---

# 📌 What is `toString()`?

Every object in Java inherits:

```java id="m1v7q5"
toString()
```

method from:

# Object class

---

# 📌 Default `toString()` Behavior

Default implementation returns:

```text id="p6n2v8"
className@hashcode
```

---

# 📌 Array Output Breakdown

Example output:

```text id="k9m4q1"
[I@5acf9800
```

---

# 📌 Meaning of Each Part

| Part       | Meaning              |
| ---------- | -------------------- |
| `[`        | array                |
| `I`        | integer type         |
| `@`        | separator            |
| `5acf9800` | hexadecimal hashcode |

---

# 📌 Why `I`?

Java uses internal JVM type codes.

| Type    | JVM Symbol |
| ------- | ---------- |
| int     | `I`        |
| double  | `D`        |
| char    | `C`        |
| boolean | `Z`        |

So:

```text id="t3m8v2"
[I
```

means:

# integer array

---

# 📌 Why Doesn't Java Automatically Print Elements?

Because arrays do NOT override:

# `toString()`

method.

So Java uses:

# Object class default implementation

---

# 📌 Compare With String Class

Example:

```java id="r1n7k5"
String s = "Hello";

System.out.println(s);
```

Output:

```text id="u8m2q4"
Hello
```

---

# 📌 Why Does String Print Properly?

Because:

# String class overrides `toString()`

method.

So instead of reference info, actual content is printed.

---

# 📌 Arrays Do NOT Override `toString()`

So Java falls back to:

# Object class behavior

---

# 📌 Similar Example With Custom Object

```java id="x5m9v1"
class Student {

    int age = 20;
}
```

```java id="k2n7q4"
Student s = new Student();

System.out.println(s);
```

Output:

```text id="m8v1k5"
Student@6d06d69c
```

because custom class also uses default `toString()`.

---

# 📌 How to Properly Print Arrays?

There are two common ways:

## ✅ 1. Loop

OR

## ✅ 2. `Arrays.toString()`

---

# ✅ Method 1 — Using Loop

```java id="t4m8q1"
public class Array {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        for(int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
```

Output:

```text id="v7n2k5"
10 20 30
```

---

# 📌 Why Loop Works?

Because:

```java id="m3q9v1"
arr[i]
```

accesses:

# actual elements

inside array object.

---

# ✅ Method 2 — `Arrays.toString()`

```java id="w8m1q4"
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        System.out.println(Arrays.toString(arr));
    }
}
```

Output:

```text id="r2n7v5"
[10, 20, 30]
```

---

# 📌 What Does `Arrays.toString()` Do Internally?

Internally it:

* traverses array
* accesses each element
* builds formatted String

Something similar to:

```java id="k5m8v2"
for(int i = 0; i < arr.length; i++) {

    result += arr[i];
}
```

---

# 📌 Why Arrays Are Objects in Java?

Because Java is:

# fully object-oriented

Arrays have:

* methods
* properties
* runtime type information

Example:

```java id="u1n9q4"
arr.length
```

`length` belongs to array object.

---

# 📌 Internal Array Creation

```java id="x7m2v5"
int[] arr = new int[3];
```

Behind the scenes:

```text id="m4q8k1"
1. JVM allocates heap memory
2. Creates array object
3. Initializes default values
4. Stores reference in arr
```

---

# 📌 Default Values in Arrays

```java id="v9n1k7"
int[] arr = new int[3];
```

creates:

```text id="r5m8q2"
[0, 0, 0]
```

because Java initializes arrays automatically.

---

# 📌 Why `println()` Behaves Like This?

`System.out.println()` has different overloaded versions.

For objects:

```java id="p2n7v4"
println(Object obj)
```

internally calls:

```java id="u6m1q8"
String.valueOf(obj)
```

which eventually calls:

```java id="x3m9k5"
obj.toString()
```

---

# 📌 Full Behind-the-Scenes Flow

```text id="t8n2v1"
System.out.println(arr)
         ↓
println(Object obj)
         ↓
obj.toString()
         ↓
Object class default implementation
         ↓
[I@5acf9800
```

---

# 📌 Important Interview Point 🚀

## Why doesn't `System.out.println(arr)` print array elements?

Answer:

> Because arrays are objects in Java, and printing an array directly calls the default `toString()` method inherited from Object class, which prints reference information instead of actual array contents.

---

# 📌 Final Mental Model 🧠

## `arr`

```text id="m1v7q4"
Reference variable
```

---

## Array Elements

```text id="r8n2k5"
Stored inside heap memory
```

---

## `System.out.println(arr)`

```text id="u4m9q1"
Prints object reference info
```

---

## `Arrays.toString(arr)`

```text id="x6n1v8"
Prints actual array elements
```

---

# 🎯 Final Visualization

```text id="p5m8q2"
arr
 ↓
-----------------
| 10 | 20 | 30 |
-----------------
```

`arr` only stores:

# reference/address

NOT actual elements.

---

# 🚀 Best Practice

✅ For readable output use:

```java id="z9m2v5"
Arrays.toString(arr)
```

OR loop.

Avoid:

```java id="k4n7q1"
System.out.println(arr)
```

when printing array contents.

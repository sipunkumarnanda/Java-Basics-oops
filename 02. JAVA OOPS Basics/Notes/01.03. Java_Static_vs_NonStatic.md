
# 🚀 Java Static vs Non-Static Methods — Complete Interview Notes

---

# 📌 Problem Statement

Consider this code:

```java id="f6g0wq"
class Basics {

    private void prinnt() {
        System.out.println("print called");
    }

    public static void main(String[] args) {
        prinnt(); // ❌ Error
    }
}
```

### ❓Question

Why does Java give an error here?

Why must we create an object to call `prinnt()`?

Why does making the method `static` solve the issue?

---

# 🧠 Core Concept

Java methods are of two types:

| Type              | Belongs To |
| ----------------- | ---------- |
| `static` method   | Class      |
| non-static method | Object     |

---

# 🏗️ Understanding Memory & Execution Flow

When JVM starts a Java program:

```java id="x2s5jk"
public static void main(String[] args)
```

gets executed first.

Notice:

```java id="1w4oqv"
main()
```

is `static`.

That means JVM can call it **without creating any object**.

---

# ⚠️ The Real Problem

Inside `main()`:

```java id="kwk6gh"
prinnt();
```

you are trying to call:

```java id="skv64s"
private void prinnt()
```

which is a **non-static method**.

A non-static method belongs to an object.

But currently:

❌ No object exists.

So Java gets confused:

> "Which object's `prinnt()` should I call?"

---

# ❌ Error Explanation

Java internally thinks:

```text
Cannot make a static reference to the non-static method prinnt()
```

Meaning:

> A static method (`main`) cannot directly access instance/object members.

---

# ✅ Solution 1 — Create an Object

```java id="87l2ww"
class Basics {

    private void prinnt() {
        System.out.println("print called");
    }

    public static void main(String[] args) {

        Basics obj = new Basics();

        obj.prinnt();
    }
}
```

---

# 🔍 Step-by-Step Execution

## Step 1️⃣

JVM loads class `Basics`

---

## Step 2️⃣

JVM calls:

```java id="dc5w1g"
main()
```

without object creation.

---

## Step 3️⃣

Inside `main()`:

```java id="03vrmn"
Basics obj = new Basics();
```

Object gets created in heap memory.

---

## Step 4️⃣

Now Java knows WHICH object's method to call:

```java id="hf2h5m"
obj.prinnt();
```

✅ Works perfectly.

---

# ✅ Solution 2 — Make Method Static

```java id="m5m4zm"
class Basics {

    private static void prinnt() {
        System.out.println("print called");
    }

    public static void main(String[] args) {

        prinnt();
    }
}
```

---

# 🎯 Why This Works

Now `prinnt()` belongs to the class itself.

So:

✅ No object required
✅ JVM can directly call it

---

# 🧠 Deep Understanding — Static vs Non-Static

# 🔹 Static Members

Static members belong to:

```text
Class
```

Only one copy exists.

---

## Example

```java id="6v20qf"
class Student {
    static String school = "ABC School";
}
```

Every student shares same school.

---

# 🔹 Non-Static Members

Non-static members belong to:

```text
Object
```

Every object gets its own copy.

---

## Example

```java id="i4qf3d"
class Student {
    String name;
}
```

Each student has different name.

---

# 🏠 Real-Life Analogy

# 🚗 Car Example

## Static

```text
Company Name = Toyota
```

Same for all cars.

---

## Non-static

```text
Car Color
Car Number
Owner
```

Different for each car object.

---

# 📦 Memory Representation

# 🔹 Static Data

Stored in:

```text
Method Area / Class Area
```

Shared by all objects.

---

# 🔹 Non-Static Data

Stored inside:

```text
Heap Memory (Object)
```

Each object has separate copy.

---

# ⚡ Important Interview Rule

# ✅ Static method can access:

| Access               | Allowed?   |
| -------------------- | ---------- |
| Static variables     | ✅          |
| Static methods       | ✅          |
| Non-static variables | ❌ Directly |
| Non-static methods   | ❌ Directly |

---

# ❓ Why Static Cannot Directly Access Non-Static?

Because:

```text
Static methods load before objects are created.
```

Non-static members need object reference.

Without object:

❌ Java doesn't know WHICH instance to use.

---

# ✅ But Non-Static CAN Access Static

Example:

```java id="30gk6r"
class Demo {

    static int x = 10;

    void show() {
        System.out.println(x);
    }
}
```

Why?

Because static members already exist globally for class.

---

# 🔥 Most Important Interview Question

# ❓Why is `main()` static in Java?

# ✅ Answer

Because JVM needs to call `main()` before creating any object.

If `main()` were non-static:

```java id="gm1x2n"
public void main(String[] args)
```

JVM would first need object creation.

But who creates the first object?

This creates circular dependency.

So Java solves this by making:

```java id="udw9yz"
main()
```

static.

---

# 🧪 Interview Example

# ❓Predict Output

```java id="lt8l5r"
class Test {

    void show() {
        System.out.println("Show");
    }

    public static void main(String[] args) {
        show();
    }
}
```

# ✅ Answer

Compilation Error:

```text
Cannot make a static reference to the non-static method show()
```

---

# 🧪 Another Interview Example

```java id="9ot9va"
class Test {

    static void show() {
        System.out.println("Show");
    }

    public static void main(String[] args) {
        show();
    }
}
```

# ✅ Output

```text
Show
```

---

# 🧠 Advanced Interview Concept

# ❓Can static methods be overridden?

# ✅ Answer

No.

Static methods belong to class, not object.

They are:

```text
Method Hidden
```

not overridden.

---

# ❓Can constructor be static?

# ✅ Answer

No.

Constructor is used for object creation.

Static belongs to class.

So concept conflicts.

---

# ❓Can we access static method using object?

# ✅ Yes (but not recommended)

```java id="mq1a5t"
Demo obj = new Demo();
obj.show();
```

Works because compiler converts it internally to:

```java id="t2xmw0"
Demo.show();
```

---

# 🎯 Best Practice

# ✅ Recommended

```java id="x0h7h1"
Demo.show();
```

# ❌ Avoid

```java id="knm9a6"
obj.show();
```

for static methods.

---

# 🔥 Interview Cheat Sheet

| Concept                         | Static        | Non-Static      |
| ------------------------------- | ------------- | --------------- |
| Belongs To                      | Class         | Object          |
| Object Needed?                  | ❌ No          | ✅ Yes           |
| Memory                          | Method Area   | Heap            |
| Accessed Using                  | Class Name    | Object          |
| Loaded When                     | Class Loading | Object Creation |
| Can access static?              | ✅ Yes         | ✅ Yes           |
| Can access non-static directly? | ❌ No          | ✅ Yes           |

---

# 🧾 Final Interview Answer (Short Version)

# ❓Why must we create object for non-static methods?

# ✅ Perfect Interview Answer

> Non-static methods belong to objects, not the class itself.
> Since `main()` is static, it executes without object creation.
> Therefore, to call a non-static method, we must first create an object and use object reference to access that method.
> Static methods do not need objects because they belong to the class level.

# Reverse String Using Recursion in Java

## Correct Approach

```java
// User function Template for Java

class Solution {

	public static String reverseString(String s) {

		StringBuilder sb = new StringBuilder();

		// code here
		helper(s, 0, sb);

		return sb.toString();
	}

	static void helper(String s, int i, StringBuilder sb) {

		if (i == s.length()) {
			return;
		}

		helper(s, i + 1, sb);

		sb.append(s.charAt(i));
	}
}
```

---

# How Recursion Works

Suppose:

```java
reverseString("abcd")
```

Recursive calls:

```text
helper("abcd", 0)
    helper("abcd", 1)
        helper("abcd", 2)
            helper("abcd", 3)
                helper("abcd", 4) -> return
```

While returning from recursion:

```text
append d
append c
append b
append a
```

Final Output:

```text
dcba
```

---

# Why We Use StringBuilder

Strings in Java are immutable.

Every modification creates a new object.

`StringBuilder` helps perform efficient string modifications.

```java
StringBuilder sb = new StringBuilder();
```

---

# Important Note About Global StringBuilder

Problematic code:

```java
class Solution {

	static StringBuilder sb = new StringBuilder();

	public static String reverseString(String s) {

		// code here
		helper(s, 0);

		return sb.toString();
	}

	static void helper(String s, int i) {

		if (i == s.length()) {
			return;
		}

		helper(s, i + 1);

		sb.append(s.charAt(i));
	}
}
```

---

# Problem in This Code

Since `sb` is declared as `static`, it becomes shared across all function calls.

So old values remain stored inside it.

Example:

```java
reverseString("abc"); // cba

reverseString("xy");  // cbayx
```

Expected:

```text
yx
```

Actual:

```text
cbayx
```

Because previous data (`cba`) already exists inside `sb`.

---

# Why Local StringBuilder is Better

Correct approach:

```java
StringBuilder sb = new StringBuilder();
```

Now every function call gets a fresh `StringBuilder`.

No old data remains.

---

# Time Complexity

## Time Complexity

```text
O(n)
```

Each character is visited once.

---

# Space Complexity

```text
O(n)
```

Due to:
- Recursion stack
- StringBuilder storage

---

# Key Learning

- Recursion first goes deep.
- Work happens while returning back.
- Avoid using global mutable objects unless required.
- Prefer local objects for safer function behavior.

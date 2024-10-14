package Oct11;

public class OperatorsInJava {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10;
        int b = 3;
        int sum = a + b;  // Addition: 13
        System.out.println(sum);
        int diff = a - b; // Subtraction: 7
        System.out.println(diff);
        int product = a * b; // Multiplication: 30
        System.out.println(product);
        int quotient = a / b; // Division: 3
        System.out.println(quotient);
        int remainder = a % b; // Modulus: 1
        System.out.println(remainder);
        int c = 5;
        c++; // Increment: c is now 6
        c--; // Decrement: c is back to 5
        System.out.println(c++);
        System.out.println(c--);
// 2. Assignment Operators
        int x = 10; // Simple assignment
        x += 5;  // x = x + 5; x is now 15
        System.out.println(x);
        x -= 3;  // x = x - 3; x is now 12
        System.out.println(x);
        x *= 2;  // x = x * 2; x is now 24
        System.out.println(2);
        x /= 4;  // x = x / 4; x is now 6
        System.out.println(x);
        x %= 4;  // x = x % 4; x is now 2
        System.out.println(x);

// 3. Comparison Operators
        boolean isEqual = (a == b);  // false
        System.out.println(isEqual);
        boolean isNotEqual = (a != b);  // true
        System.out.println(isNotEqual);
        boolean isGreater = (a > b);  // true
        System.out.println(isGreater);
        boolean isLess = (a < b);  // false
        System.out.println(isLess);
        boolean isGreaterOrEqual = (a >= b);  // true
        System.out.println(isGreaterOrEqual);
        boolean isLessOrEqual = (a <= b);  // false
        System.out.println(isLessOrEqual);

// 4. Logical Operators
        boolean p = true, q = false;
        boolean andResult = p && q;  // false
        System.out.println(andResult);
        boolean orResult = p || q;   // true
        System.out.println(orResult);
        boolean notResult = !p;      // false
        System.out.println(notResult);

// 5. Bitwise Operators
        int m = 5;  // binary: 0101
        int n = 3;  // binary: 0011
        int bitwiseAnd = m & n;  // 0001 (1 in decimal)
        System.out.println(bitwiseAnd);
        int bitwiseOr = m | n;   // 0111 (7 in decimal)
        System.out.println(bitwiseOr);
        int bitwiseXor = m ^ n;  // 0110 (6 in decimal)
        System.out.println(bitwiseXor);
        int bitwiseComplement = ~m;  // 1111...1010 (-6 in decimal, assuming 32-bit integer)
        System.out.println(bitwiseComplement);
        int leftShift = m << 1;  // 1010 (10 in decimal)
        System.out.println(leftShift);

        int rightShift = m >> 1; // 0010 (2 in decimal)
        System.out.println(rightShift);
        int unsignedRightShift = -8 >>> 1; // 2147483644 (31 1's followed by 2 0's in binary)
        System.out.println(unsignedRightShift);

// 6. Ternary Operator
        int max = (a > b) ? a : b;  // max will be 10 (the value of a)

        System.out.println(max);

// 7. instanceof Operator
        String str = "Hello";
        boolean isString = str instanceof String;  // true
        System.out.println(isString);

// 8. String Concatenation Operator
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;  // "Hello World"
        System.out.println(s3);
    }
}

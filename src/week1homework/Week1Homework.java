package week1homework;

public class Week1Homework {

    public static void main(String[] args) {
        // 5. Primitive & NonPrimitive variables
        boolean doILikeJava = true;
        boolean enoughPractice = false;
        char z = 'D';
        long e = 1000L;
        double f = 543.5435;
        int d = 6;
        String myText = "HelloWorld";
        System.out.println("doILikeJava: " + doILikeJava);
        System.out.println("enoughPractice: " + enoughPractice);
        System.out.println("primitiveChar: " + z);
        System.out.println("longNum: " + e);
        System.out.println("doubleNum: " + f);
        System.out.println("integerNum: " + d);
        System.out.println("String: " + myText);

        // 6. Operations with integer variables:
        int x = 9;
        int y = 3;
        System.out.println("increment: " + ++x);
        System.out.println(x + y);
        System.out.println(y - x);
        System.out.println(x / y);
        System.out.println(x * y);
        System.out.println(x > y);
        System.out.println(x == y);
        System.out.println(x != y);

        // 7. if-else statement
        int a = 3;
        int b = 3;
        if (a > b) {
            System.out.println(a + " is larger than " + b);
        } else if (a < b) {
            System.out.println(a + " is lower than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }

        // 8. for loop, even numbers
        int [] n = new int [10];
        for (int i=0; i<n.length; i++) {
            n[i] = (int)(Math.floor(Math.random()*100 + 1));
            if (n[i] % 2 == 0)
                System.out.println("evenNumbers " + n[i]);
        }
    }
}

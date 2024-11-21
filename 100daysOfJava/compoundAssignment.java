public class compoundAssignment {
    public static void main(String[] args) {
        
        int num = 44;
        System.out.println("Num value is: " + num);

        num++;
        System.out.println("After post-increment (num++): " + num);
        ++num;
        System.out.println("After pre-increment (++num): " + num);
        num--;
        System.out.println("After post-decrement (num--): " + num);
        --num;
        System.out.println("After pre-decrement (--num): " + num);

        System.out.println();

        int value = 14;
        System.out.println("Value is: " + value);

        value += 10;
        System.out.println("After += 10: " + value);

        value -= 10;
        System.out.println("After -= 10: " + value);

        value *= 10;
        System.out.println("After *= 10: " + value);

        value /= 10;
        System.out.println("After /= 10: " + value);

        value %= 10;
        System.out.println("After %= 10: " + value);

 /*
    **  100 days of code DAY 5
    **  (https://www.100daysofcode.io/learn/java/compound-assignment-operators)
    **
    **  1. Write a program that utilizes increment(++) and decrement(--) operators. [DONE]
    **  2. Write a program that utilizes the following compound operators +=, -=, *=, /=, and %=. [DONE]
    **
    **      Why is this useful? (https://chatgpt.com/share/673fac41-e438-8005-baa4-7f044d355d55)
    **      Increment and decrement operators (++ and --) and compound assignment operators (+=, -=, *=, /=, %=) may seem simple, but they are incredibly useful in real-world applications because they streamline common tasks, improve code readability, and enhance maintainability. Increment and decrement operators are widely used in scenarios involving iteration, counters, and loops. For instance, when processing items in a collection, these operators provide a concise way to traverse elements efficiently. They are also used to track user actions, such as counting button clicks or login attempts, and are essential for features like pagination, where page numbers increment or decrement dynamically.
    **
    **      Compound assignment operators simplify repetitive arithmetic operations by combining an operation with assignment, making the code more concise and readable. In financial applications, for example, they are used to calculate running totals by adding transaction amounts to a balance (totalAmount += transactionAmount). In graphic applications or simulations, they adjust values for scaling or resizing objects (scale *= 2). These operators are also helpful in tracking progress in video games or fitness apps by updating scores or completed tasks and are commonly used in budgeting apps to subtract expenses from a remaining balance (remainingBudget -= expense). Additionally, %= is especially useful for cyclic operations, such as rotating through a list of items.
    **
    **
    **    Overall, these operators improve code clarity and reduce potential errors, especially in applications where these operations occur frequently. Their compact syntax makes repetitive logic easier to implement and maintain, which is why they are indispensable in various fields, from small scripts to large-scale systems like financial software, analytics platforms, and web applications.
    **
    */


    }
}
package sample;


public class Example {


    public static boolean f1()
    {
        System.out.println("f1 RUNNING");
        return false;
    }
    public static boolean f2()
    {
        System.out.println("f2 RUNNING");
        return true;
    }
    public static void main(String[] args) {
        int a = 19;
        byte b = (byte)a;
        System.out.println("b="+b);
        //String
        /*

The string pool is the JVM's particular implementation of the concept of string interning:

In computer science, string interning is a method of storing only one copy of each
distinct string value, which must be immutable. Interning strings makes some string
 processing tasks more time- or space-efficient at the cost of requiring more time
 when the string is created or interned. The distinct values are stored in a string intern pool.
Basically, a string intern pool allows a runtime to save memory by preserving immutable
strings in a pool so that areas of the application can reuse instances of common strings
instead of creating multiple instances of it.

As an interesting side note, string interning is an example of the flyweight design pattern:

Flyweight is a software design pattern. A flyweight is an object that minimizes memory
use by sharing as much data as possible with other similar objects; it is a way to use
objects in large numbers when a simple repeated representation would use an unacceptable
amount of memory.
         */
        String pr=new StringBuilder().append("Hello ").append("word!").toString();
        //pr=pr.intern();
        String pr1="Hello word!";
        System.out.println(pr==pr1);
        String str1 = new String("str");
        //str1 = str1.intern();
        String str2 = "str";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        /*
        String str = new String("str");
        String str2 = new String("str");

        String str3 = "str";
        String str4 = "str";

        System.out.println(str3==str4);

        System.out.println(str==str2);
*/
        //&&
        /*
       && - это укороченный вариант &. Отличия в том, что в укороченной версии (&&),
        если первый операнд false, то второй даже не проверяется, сразу
        ясно что выражения false. Так же и с || и |, в укороченной версии (||) если первый
        операнд true, то второй даже не рассматривается. Это довольно удобно, если например имеем

func1() & func2()
в этом случае вызываются обе функции, даже если первая false, а это уже значит результат ясен,
 все выражение false, а func2() все равно проверяется (а это лишние затраты). А вот так

func1() && func2()
если первое выражение false, то func2() даже не вызывается для проверки, т.к результат уже ясен.

Код
(a & b) - будет проверено и a, и b
(a | b) - будет проверено и а, и b
(a && b) - если а=false, то b проверено не будет
(a || b) - если а=true, то b проверено не будет
         */

        if(f1()&&f2()){
            System.out.println("&&");
        }


        //preincrement / postincrement
        /*
Variable++ means: Increment variable AFTER evaluating the expression.
++Variable means: Increment variable BEFORE evaluating the expression.
         */
        int i=1;
        int j=1;
        int k=1;
        int l=1;

        System.out.println(i++ + i++);  //1 + 2
        //System.out.println("i="+i);
        System.out.println(++j + ++j);  //2 + 3
        System.out.println("j="+j);
        System.out.println(k++ + ++k);  //1 + 3
        System.out.println(++l + l++);  //2 + 2

    }
}

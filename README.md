Java runs in ram 
Java compiler concert the java into byte code
Jvm request from os  divided memory by 

Method area ,heap,stack 

Compiler : covert into class.java
Interpreter: runs and executed using jvm 


Preparation 
1.Primitive and non primitive 
2. Type casting   * widening * Narrowing 
Explicit casting (int )

3.operator :
Arithmetic 
Relational
Logical 
Assignment 
Bitwise 

I++ post 
++I pre 


4. If(condition)
If elif
For(ini , cond ,update )
While 
Do while 

Print -- same line
Ln -- next line 

Continue break 

Practice 
Largest number 
Integer.Max_value;
Arr.length


4. String 
CharAt()
Str.length()
Str.equal(str).  For // str == str

For rev java provide 
StringBuilder sb = new StringBuilder(str)
Sb.reverse()

5.Method 
Static int add (int a ,int b )
Return int a +int b 

Static void greed()

6. Oops
7.object is instance of class its also called entity with its state and behaviour the new is created with the allocated heap


constructor  and method 
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

encapsulation : wrapping the data and method into class and avoid direct access of using the data with private field and public getter adn setter 
  class Student {
    private String name;
    private int age;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}

2.inheritance is child class that uses properties / method of parent class with extend classs


3.polymorphism same method /interface acts different depends on obj and contxet 

  1.compile poly method overload here same class same method diff parameter 2.runtime poly @override 

4.abstraction hides implemenet detail and expose only essential functional using abstaract class and interface

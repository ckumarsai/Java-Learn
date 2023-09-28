class Parent
{ Parent() {System.out.println("parent 0-arg constructor");}
};
class Child extends Parent
{ Child()
{ this(10); //current class 1-arg constructor calling
System.out.println("Child 0-arg constructor");
}
Child(int a)
{ super(); //super class 0-arg constructor calling
System.out.println("child 1-arg constructor--->"+a);
}
public static void main(String[] args)
{ new Child();
}
}

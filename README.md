# CORE JAVA

## JDK

JDK consists of:
1. Compiler
2. JRE --> JVM (JIT - Just In Time), API

## Compiler
Covert source code into Byte Code (App.java --> App.class)

For a program to run, it needs an environment. JDK comes with JRE as an envrionment. In C, C++, they use Operating System as environment. While in JAVA there's JRE that convert source code into machine language. 

## API

Application Programming Interface. It provides predefined functions, without having to know much background knowledge about them. 
Example: Reading and writing files, we could use Java IO Library. This way we do not need to write low level code for our app to work. 


## Dependency

Java is a platform independent language because it can run on any OS with the help of JVM.

App.java(code) --> compiler --> byte code (app.class) --> Windows JVM(JIT) for Windows OR Linux JVM JIT for Linux

## Object Orientated Programming

Helps with mapping real world problems to software solutions

The 4 object oriented principles:

1. Encapsulation
2. Inheritance
3. Abstraction
4. Polymorphism

These are common in all programming languages.

## Encapsulation

Protecting the properties and functionality of an object from other obejcts

Another definition is writing the data and code in one single unit. In Java we use Class to achieve encapsulation.

## Inheritance
Process of defining a new object with the help of an existing object. In Java we use the keyword "extends" to inherit.

Accessing existing obejcts' functionality. 

Two other terms when talking about inheritance are "Re-usability" and "IS-A Relation".

## Abstraction
Hiding all the unnecessary details of an object and only showing essential features that other objects need to communicate with that object. In Java, it is done by "Interface". 

## Polymorphism

Poly means multi/multiple, morphic means shape or behavior. 

Object when it behaves differently when different objects access it.

In Java, when you use function overloading or function overriding, it is called Polymorphism. 

## Building blocks of a Java Program

1. Class
2. Variables
3. Methods
4. Blocks

## Class
In every programming language, all objects will be represented by a Class. Every Class should have a unique identity name, these methods can be static/non-static.

## Variables
Variables are identity we give to a memory location/locations where our data is stored. Instead of using memory location, we delare variables and we use them throughout our program. 


Syntax:
```
data_type identity;
```

Example:
```
int a = 100;
```

Non-static variables in a Bank app will be accountNumber, balance. They are object level variables. 

Static Variables examples are bankName, something that is common across object instances. Then it is static or class-level variables.

##  Methods

A set of programming instructions, that take some input and provide an output.

Syntax:
```
return_type identity(arglist)

{

}
```
Example:
```
int add(int a, int b)
{
    int sum = a+b;
    return sum;
}
```

In programming language, the communication happens between methods, the methods call each other. 

There can only be 4 types of methods:

1. void methodName(void) -  Methods that don't have any arguments, nor do they return anything
2. int methodName(void) - Methods that do not have any  input but produce output
3. int methodName(int) - Methods have input and produce some output
4. void methodName(int) - Methods that take input but they don't return output


```

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}
```

public  - access specifiers (private, protected)
class - keyword used to define a class
HelloWorld - identity given to class
public static void main(String[] args) - starting point of every Java program

If we used "static", that method can be invoked by using class name, meaning HelloWorld.java will directly run the program

(String[] args) - Arguments to use in the method

## Static and Non Static Context

Static - Class Level - Can be used in entire class
Non Static - Object Level - Can be used per object


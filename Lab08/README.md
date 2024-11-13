# Lab08AbstractShapes
abstract classes (warmup)

# In the src folder is some code
Review the code provided. Answer the following questions by adding comments to your code! You are free to talk with other students, and seek better understanding to these questions. See below for reminders on types, variables, and input

# Step One
Answer the following questions as comments in your code:
1. What would happen if we added a new class that extended Shape and did not implement its methods?
2. Notice that the use of @Override appears to be unnecessary for Circle and Rectangle, even though they are technically overriding area(), perimeter(), and toString(). Why do you think this is?
3. Notice that your IDE (Eclipse or Intellij) already seems to have some issues with the Triangle class. Write your best interpretation of these errors.
4. What is the value of using abstract classes instead of always having a default that other classes inherit from?

# Step Two: Coding: Triangle
Find the class `Triangle`.
As you have likely noticed, Triangle is not complete. It inherits from Shape, but does not implement its area(), perimeter(), or toString(). We want to fix this. 

Implement these three functions as follows:
```
For area(), make it return length * width divided by 2.
For perimeter(), make it return all three sides added together.
For toString(), make it return "This Triangle has a perimeter of [perimeter] and an area of [area]". Where area and perimeter only go to 2 decimal places. If you are unsure of how to do this, try looking at the other toString()s for Circle and Rectangle.
```

For example, if someone calls
```java
Triangle myTriangle = new Triangle(1.4, 3.5, 3.77);
System.out.println(myTriangle.toString()); //should return "This Triangle has a perimeter of 8.67 and an area of 2.45"
```

# Step Three: Test Triangle
How do you test code? You simply add the lines to your java file (in the future, you will have test lines in separate files).

As such, we would recommend adding the following just above def main().

```java
Triangle myTriangle = new Triangle(1.4, 3.5, 3.77);
System.out.println("TESTING: " + myTriangle.toString());
System.out.println("TESTING: " + myTriangle.area());
System.out.println("TESTING: " + myTriangle.perimeter());
```
Also add your own tests!

# Submitting the Assignment
Make sure to submit the assignment for grading! If you haven't clicked through the canvas link in a while, we would suggest clicking through it again before submitting.

# Reminder on Abstract classes
Abstract classes essentially give a basic outline of the classes that everything that inherits from it are expected to have. In our specific case, these classes are area(), perimeter(), and toString(). The idea is essentially that in a situation like this, having a default would serve no purpose, so there is no default. You are expected to ALWAYS provide the implementation for every abstract method that you inherit.

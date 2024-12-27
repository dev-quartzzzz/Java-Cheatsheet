# From Writer


# Content
1. Basic Java [On-Going]
2. Object-Oriented-Programming [On-Going]
3. Data Structure & Algorithm [On-Going]
4. JavaFX [On-Going]

# Basic Java

# Object-Oriented Programming

## 6 Main Concepts
There are 6 main concepts of object-oriented programming.
(2 Definition, 4 Ideals)

### 1. Object
Object is a group of related state and behavior, explained by the concept of real-world objects, for example, animal, rock, pencil, bicycle, etc. 

An object has two characteristic:
1. State/Field (Variable and static value) 
2. Behavior (Method) - The action that the object can act

**Example 1: Animal**

State: name, age, phylum

Behavior: eat, sleep

**Example 2: Car**

State: speed, velocity, left light(on/off), right light(on/off)

Behavior: turn left, turn right, change speed, change velocity, brake

### 2. Class

Class is the blueprint or prototype for creating object, priscribing what object will have and can act after it is created. 

```Java
public class Animal {
    //These are state of object.
    String name;
    int age;
    String phylum;

    //These are behavior.
    void eat();

    void sleep();
}
```

To create an instance of object, we use `new` keyword.

e.g.
```Java
    // Class_name instace_name = new class_name(); 
    Animal animal1 = new Animal();
```
In the code above:
- `Animal` is the class name.
- `animal1` is the instance name.
- `new` is keyword for creating a new instance of object.
- `Animal()` is the constructor method for creating an instance.

> [!NOTE]
> All function which is in java class is called "method". 


**Constructor** is the method
## Credit

## License

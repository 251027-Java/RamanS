# QC 1 Notes

# Bash Notes
~ - Home Directory
- Absolute Path - a file path starting with / that specifies a unique location
- Relative Path - a file path starting with . that defines the relation to the working directory

# Java Notes
- A class has fields and methods
- Your application will start from the "entrypoint" which defaults to the main method
- Pseudo-code - describe the logic of your plan, don't worry about the exact syntax
- Access Modifiers - to stop other classes from accessing / modifying certain fields / methods

# Object Oriented Programming (OOP)
- Abstraction - Showing only essential features of an object and hiding unnecessary details
	      - Use interfaces (or abstract classes) to define a contract; concrete classes implement the details
	      - Hiding unnecessary values from the user (hide certain fields from an object or class)
	      - Game Service Class, main method doesn't even know there is a game object being created
 
- Polymorphism - having many forms / traits (method overloading and method overriding)
	       - have two methods with the same name but different parameters (they do different things)
	       - same interface, different behavior
	       - Allows objects of different classes tp be treated as objects of a common superclass, but they behave differently when the same method is called
	       - Same call different behavior
	       - Method overloading means having multiple methods with the same name but different parameter lists within the same class (constructors)
                   - The compiler decides which method to call based on the method signature at compile time
                   - Overloading = same method name, different parameters, decided at compile time
               - Method overriding means redefining a method in a subclass that already exists in the superclass, keeping the same name, parameters, and return type
                   - Overriding = same method signature in child class, different behavior, decided at runtime.

- Inheritance - Allows one class (child/subclass) to inherit attributes and methods from another class (parent/superclass)
	      - Promotes code reuse and helps establish hierarchical relationships.
	      - Dog extends Animal - a subclass inherits from a superclass
              - Can add new behavior or override existing methods

- Encapsulation - Process of wrapping data (attributes) and methods (functions) together into one single unit (class) and restricting data access to some components
		- "Protecting Data"
		- Keeping fields private
		- Controlled access via public methods (getters/setters/operations)
		- Enforce invariants/validation inside the class
		- *** Prevents outside code from accidentally changing internal state and enforces controlled access through getters and setters 


# Interfaces
- Interface is like a contrcact or blueprint for classes.
- Defines what mehthods a class must have, but not how those methods are implemented.
- When creating an interface, you would create the methods but they all the methods are only created, but are not do not have anything inside those methods
- Classes that implement the interface must provide the actual method logic
- *** Interfaces allow use to achieve abstraction - Interfaces let you sperate the definition from the implementation

# Abstract Classes
- An abstract class in Java is a partially implemented blueprint for other classes
- It defines common behavior and shared data, but leaves some methods unimplemented for subclasses to fill in
- You cannot create an object of an abstract class (no new Animal())
- It can have both abstract methods (no body) and concrete methods (with body)

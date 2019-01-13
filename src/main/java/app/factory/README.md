# **Description:**
    1. Factory method/Factory:
        - The Factory Pattern allows you to create objects without specifying the exact class of object that will be created
        
	2. Abstract Factory:
	    - It is like a factory, but everything is encapsulated
          	- the method that orders the object
          	- the factories that build the object
          	- the final objects
          	- the final objects contain objects that use the Strategy Pattern.
          		- composition: object class fields are objects
          - Allows you to create families of related objects without specifying a concrete class.
          - you can model anything you can imagine and have those objects interact through common interfaces
	
# **When to use:**
    - when you don't know ahead of time what class object you need.
    - when all of the potential classes are in the same subclass hierarchy
    - to centralize class selection code
    - when you don't want the user to have to know every subclass
    - to encapsulate object creation
    - use when you have many objects that can be added, or changed dynamically during runtime
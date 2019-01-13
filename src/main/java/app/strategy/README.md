# **Description:**
	- Ensures open-closed principle (open for extension - closed for modification)
	- Capture the abstraction in an interface, hide implementation details in derived classes. 
	- Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Lets the algorithm vary independently from clients that use it.
	- Since, clients are using an interface - Strategy Pattern ensures that there is no impact when the number of derived classes changes, and no impact when the implementation of a derived class changes.
	- Often reduces long lists of conditionals
    - Avoids duplicate code
    - Keeps class changes from forcing other class changes- can hide complicated/secret code from the user
	
# **When to use:**
    - Good for solving a problem where you should pick some option. 
        E.g.: Modes of transportation to an airport is an example of a Strategy. Several options exist such as driving
        one’s own car, taking a taxi, an airport shuttle, a city bus, or a limousine service. For some airports, subways
        and helicopters are also available as a mode of transportation to the airport. Any of these modes of transportation
        will get a traveler to the airport, and they can be used interchangeably. The traveler must chose the Strategy
        based on trade-offs between cost, convenience, and time.
    - When you need to use one of several behaviors dynamically (at runtime)
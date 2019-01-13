# **Description:**
    - The Adapter pattern allows incompatible classes to work together by converting the interface of one class into an interface expected by the client.
    - Makes a wrapper (Adapter) to create compatibility/conversion from one interface to the other interface which are incompatible.
    - Wrapper (Adapter) works on two incompatible interfaces/classes.
    - The intenstion of writing the wrapper class is to resolve the differences and make the interfaces 
	- Allows 2 incompatible interfaces to work together
    - the Adapter class allows the use of the available interface and the Target interface
	
# **When to use:**
    - Used when we already have some interface and class that work OK, but we also want to add some more classes/interfaces (that have same behavior) but they are incompatible with that interface.
    - An “off the shelf” component offers compelling functionality that you would like to reuse, but its “view of the world” is not compatible with the philosophy and architecture of the system currently being developed.
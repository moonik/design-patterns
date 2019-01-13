# **Description:**
	- a way to store previous states of an object
    - Memento: the basic object that is stored in different states.
    - Originator: Sets and Gets values from the currently targeted Memento. Creates new Mementos and assigns current values to them.
    - Caretaker: Holds an ArrayList that contains all previous versions of the Memento. It can store and retrieve stored Mementos.
	
# **When to use:**
    - When you want to store state of some object and restore to this state later.
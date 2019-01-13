# **Description:**
    - If we have to change behavior of an object based on its state, we can have a state variable in the Object and use if-else condition block to perform different actions based on the state. State pattern is used to provide a systematic and lose-coupled way to achieve this through Context and State implementations.
	- allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
    - Context: Defines an interface to client to interact. It maintains references to concrete state object which may be used to define current state of object.
    - State: Defines interface for declaring what each concrete state should do.
    - ConcreteState: Provides implementation for methods defined in State.
	
# **When to use:**
    - Is used when an Object changes its behavior based on its internal state.
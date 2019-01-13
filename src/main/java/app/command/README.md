# **Description:**
	- the command pattern is a behavioural design pattern in which an object is used to represent and encapsulate all the information needed to call a method at a later time.
    - client says I want a specific Command to run when execute() is called on 1 of these encapsulated(hidden) Objects.
    - an object called the Invoker transfers this Command to another Object called Receiver to execute the right code.
    - Encapsulate a request as an object, thereby letting you parametrize clients with different requests, queue or log requests, and support undoable operations.
    - the pattern encapsulates everything required to take an action and allows the execution of the action to occur completely independently of any of that context. If that is not a requirement for you then the pattern is probably not helpful for your problem space.
	
# **When to use:**
    - when the executor of the command does not need to know anything at all about what the command is, what context information it needs on or what it does. All of that is encapsulated in the command.
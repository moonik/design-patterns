# **Description:**
	- Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
    - The new operator considered harmful.
    - Creating new objects by cloning other objects.
    - Allows for adding any subclass instance of a known super class at run time.
    - It eliminates the (potentially expensive) overhead of initializing an object
	
# **When to use:**
    - The pattern is useful to remove a bunch of boilerplate code, when the configuration
    required would be onerous. I think of Prototypes as a preset object, where you save a bunch
    of state as a new starting point.
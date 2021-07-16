Encapsulation
--------------

When we declare variables and methods in single unit called - class, that is encapsulation. 
And for more better implementaion of encapsulation, we should make our data/variables private and 
define their getter and setter methods so that others can initialize data from outside of that class


INHERITANCE
-----------
Is the property of inheriting public assete of superclass by its subclass. We use inheritance to maintian
IS-A relationship among objects.

Constructors are used to initialize objects at creation time. Constructors play very important role in
inheritance as well. When we call OR JVM call a constructor, it always invokes onstructor of super 
class to initialize it first. super() method is always default call to super class constructor from 
this class's constructor body.

Method Overriding - Is when we redefine a super class method in its subclass for more specific implementation
with same signature (same method name and same arguments). 

Method Overloading - Is when we define multiple methods with same name but different arguments in same class

---------------

Polymorphism
------------
When JVM (Java Virtual Machine) gets to know on runtime that which version of method is going to be 
invoked for this method reference, this is known as polymorphism.
Polymorphism means - the same thing but behaves differently according to the context.

Static/Compile-time Polymorphism -- Using method Overloading

Dynamic/Runtime polymorphism -- Using method Overriding

Dynamic Method Dispatch ---> Superclass reference variable can refer subclass Object
							i.e. - > Animal a = new Cat();
							In this process, when we invoke any method which is common to both classes,
							actual method from avaiable object would be invoked on runtime. This is dynamic
							method dispatch

Abstraction
-----------
			Hiding the implementation or unnecessary details and providing sufficient information to
			invoke the services. 
		
			. 




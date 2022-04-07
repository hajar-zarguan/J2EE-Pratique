
# Inversion of Control and Dependency Injection

Inversion of Control is a design concept that enables the creation of dependent objects to be inverted. On the flipside, Dependency Injection, a software architectural pattern, is an implementation of the Inversion of control principle.
[here is the app report](https://github.com/hajar-zarguan/J2EE-Pratique/blob/main/2.%20Injection_du_controle_des%20dependence/Compte%20rendu%20Activit%C3%A9%20pratique%20N%C2%B01.pdf)




## 1. What Is Inversion of Control?
Inversion of Control is a principle in software engineering which transfers the control of objects or portions of a program to a container or framework. We most often use it in the context of object-oriented programming.

In contrast with traditional programming, in which our custom code makes calls to a library, IoC enables a framework to take control of the flow of a program and make calls to our custom code. To enable this, frameworks use abstractions with additional behavior built in. If we want to add our own behavior, we need to extend the classes of the framework or plugin our own classes.

### The advantages of this architecture are:

- decoupling the execution of a task from its implementation
- making it easier to switch between different implementations
- greater modularity of a program
- greater ease in testing a program by isolating a component or mocking its dependencies, and allowing components to communicate through contracts

## 2. What Is Dependency Injection
Dependency injection is a pattern we can use to implement IoC, where the control being inverted is setting an object's dependencies.

Connecting objects with other objects, or “injecting” objects into other objects, is done by an assembler rather than by the objects themselves.


## TUTO 
### 1. Create the IDao interface
<img src="https://user-images.githubusercontent.com/82539023/162325121-a45d98d2-e066-464a-917e-55759747f345.png" width="60%" >

### 2. Create an implementation of this interface
<img src="https://user-images.githubusercontent.com/82539023/162325365-99416359-0300-457d-b7cf-6e6f91bfd4a0.png" width="60%" >


### 3. Create the IMetier interface
<img src="https://user-images.githubusercontent.com/82539023/162325653-4fa41393-ada1-4eca-8654-f6de457da12c.png" width="60%" >

### 4. Create an implementation of this interface using loose coupling
Loose coupling is an approach to interconnecting the components in a system or network so that those components, also called elements, depend on each other to the least extent practicable. Coupling refers to the degree of direct knowledge that one element has of another.

<img src="https://user-images.githubusercontent.com/82539023/162325887-83e5a487-a937-4703-aab5-e116a777abb1.png" width="60%" >

### 5. Do the dependency injection:

#### a. By static instantiation:

<img src="https://user-images.githubusercontent.com/82539023/162326104-79e9b700-ff41-4401-a394-89d8af8d08db.png" width="60%" >

#### b. By dynamic instantiation:
<img src="https://user-images.githubusercontent.com/82539023/162326315-17d24e6d-390f-411f-9622-04f6a02d6a7e.png" width="60%" >

### 6. Using the Spring Framework

#### a. XML version
<img src="https://user-images.githubusercontent.com/82539023/162326866-aaa85379-9a96-44e9-9ba1-b7791bf5c25e.png" width="60%" >
<img src="https://user-images.githubusercontent.com/82539023/162326901-3df834c9-a5b4-455f-aaa7-9320ecfa65cf.png" width="60%" >

#### b. Annotation version
<img src="https://user-images.githubusercontent.com/82539023/162326768-dd4da13a-c355-4a28-8dc3-0a2a4d83d3f3.png" width="60%" >









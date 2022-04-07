
# Hibernate - JPA - Spring Data 

[here is the app report](https://github.com/hajar-zarguan/J2EE-Pratique/blob/main/2.%20Injection_du_controle_des%20dependence/Compte%20rendu%20Activit%C3%A9%20pratique%20N%C2%B01.pdf)

To help address the object-relational impedance mismatch, a number of frameworks exist that simplify the task of moving data between a relational database and a Java program. Popular object-relational mapping (ORM) frameworks include Hibernate, TopLink and DataNucleus. While each framework has its own set of unique capabilities, all of them comply with the Java Persistence API standard, which is now part of the Java EE/Jakarta EE specification.

## 1. What is Hibernate?

<img src="https://user-images.githubusercontent.com/82539023/162328328-1241b471-6e63-4b25-80fb-12df18ac08d5.png" width="20%" >
Hibernate is an open source object relational mapping (ORM) tool that provides a framework to map object-oriented domain models to relational databases for web applications.

Object relational mapping is based on the containerization of objects and the abstraction that provides that capacity. Abstraction makes it possible to address, access and manipulate objects without having to consider how they are related to their data sources.

The Hibernate ORM framework guides mapping Java classes to database tables and Java data types to SQL data types and provides querying and retrieval.

### - Benefits of Hibernate

Any changes made are encapsulated in the data source itself, so that when those sources or their application programming interfaces (APIs) change, the applications that use ORM don't have to make changes or even be aware of that information. Similarly, programmers can have a consistent view of objects over time, although the sources that deliver them, the sinks that receive them and the applications that access them may change.

### - How does Hibernate work?

Hibernate is an open source Object-Relational Persistence and Query service for any Java Application. Hibernate maps Java classes to database tables and from Java data types to SQL data types and relieves the developer from most common data persistence related programming tasks.

Hibernate sits between traditional Java objects and database server to handle all the works in persisting those objects based on the appropriate O/R mechanisms and patterns.

### - Why use Hibernate?

Hibernate reduces lines of code by maintaining object-table mapping itself and returns result to application in form of Java objects. It relieves programmer from manual handling of persistent data, hence reducing the development time and maintenance cost.


## 2. What is JPA?

<img src="https://user-images.githubusercontent.com/82539023/162329527-44ffa6c8-f23a-4cfd-ae78-711a6016c770.png" width="10%" >

The Java Persistence API (JPA) is a specification of Java. It is used to persist data between Java object and relational database. JPA acts as a bridge between object-oriented domain models and relational database systems.
As JPA is just a specification, it doesn't perform any operation by itself. It requires an implementation.

## 3. What is Spring Data?
Spring Data’s mission is to provide a familiar and consistent, Spring-based programming model for data access while still retaining the special traits of the underlying data store.

It makes it easy to use data access technologies, relational and non-relational databases, map-reduce frameworks, and cloud-based data services. This is an umbrella project which contains many subprojects that are specific to a given database. The projects are developed by working together with many of the companies and developers that are behind these exciting technologies.

#### Features
- Powerful repository and custom object-mapping abstractions
- Dynamic query derivation from repository method names
- Implementation domain base classes providing basic properties
- Support for transparent auditing (created, last changed)
- Possibility to integrate custom repository code
- Easy Spring integration via JavaConfig and custom XML namespaces
- Advanced integration with Spring MVC controllers
- Experimental support for cross-store persistence

## 4. Spring Data JPA

Spring Data JPA, part of the larger Spring Data family, makes it easy to easily implement JPA based repositories. This module deals with enhanced support for JPA based data access layers. It makes it easier to build Spring-powered applications that use data access technologies.

Implementing a data access layer of an application has been cumbersome for quite a while. Too much boilerplate code has to be written to execute simple queries as well as perform pagination, and auditing. Spring Data JPA aims to significantly improve the implementation of data access layers by reducing the effort to the amount that’s actually needed. As a developer you write your repository interfaces, including custom finder methods, and Spring will provide the implementation automatically.
 
 
 
 
 # TUTO 
 
 [here is the app report (Details) ](https://github.com/hajar-zarguan/J2EE-Pratique/blob/main/2.%20Injection_du_controle_des%20dependence/Compte%20rendu%20Activit%C3%A9%20pratique%20N%C2%B01.pdf)

 
 ## Pom FILE
 ![image](https://user-images.githubusercontent.com/82539023/162329676-f8949488-a342-4890-bac6-82d544f3814e.png)
 
## Java Bean
![image](https://user-images.githubusercontent.com/82539023/162329733-a5a93da6-b4d9-4da8-99b7-98da99bc99b4.png)

## Repository 
![image](https://user-images.githubusercontent.com/82539023/162329980-e6222762-fcb6-41f8-82e4-b67d87d71b43.png)

## Configuration file

![image](https://user-images.githubusercontent.com/82539023/162330037-d90f0bf7-00de-4bc0-b4c8-828ab5721eae.png)

## Spring Boot Application 
![image](https://user-images.githubusercontent.com/82539023/162330143-56aa25eb-e51d-41dc-8035-ed934840d49d.png)




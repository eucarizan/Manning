# Technique: Managing domain objects with many-to-many relationships in a relational database with Spring Data JPA

- [Technique: Managing domain objects with many-to-many relationships in a relational database with Spring Data JPA](#technique-managing-domain-objects-with-many-to-many-relationships-in-a-relational-database-with-spring-data-jpa)
  - [Description](#description)
  - [Problem](#problem)

## Description
In this technique, we'll demonstrate how to manage many-to-many relationships in domain objects.

## Problem
While managing object relationships in your application, you often encounter scenarios in which objects maintain many-to-many relationships.
For instance, in the CourseTracker application, entities Author and Course maintain a many-to-many relationship.
You need to manage the many-to-many relationship among two entities using Spring Data JPA.
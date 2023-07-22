# Technique: Initializing a relational database schema with a Spring Boot application

- [Technique: Initializing a relational database schema with a Spring Boot application](#technique-initializing-a-relational-database-schema-with-a-spring-boot-application)
  - [Description](#description)
  - [Problem](#problem)
  - [Try](#try)

## Description
In this technique, we’ll discuss how to initialize a relational database schema in a
Spring Boot application.

## Problem
In the configuring a relational database in a spring boot application technique, you
saw how to configure a relational database in your Spring Boot application. However,
before you start accessing the database, you need to ensure the database schema is initialized
properly. For instance, all the required tables and indexes are created, and
associated insert scripts are executed. You need to initialize the database schema at
the application startup.

## Try
- [ ] Using not in-memory database
- [ ] Using custom schema and data file name with a different location
- [ ] Using schema and data files by providing a file system location
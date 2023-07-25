# Technique: Using Criteria API to manage domain objects in a relational database with Spring Data JPA

- [Technique:](#technique)
  - [Description](#description)
  - [Problem](#problem)

## Description
In this technique, we'll demonstrate the use of Criteria API.

## Problem
Previously, you've used JPQL or native SQL queries to access data from the database. However, both JPQL and SQL do not provide any mechanism to validate the correctness of the queries at compile time. Instead, all query syntax issues are detected at runtime. You need to implement a technique that lets you define queries programmatically in a type-safe manner to reduce execution-time errors in the queries.


# Technique: Defining a custom Spring Boot actuator HealthIndicator

- [Technique: Defining a custom Spring Boot actuator HealthIndicator](#technique-defining-a-custom-spring-boot-actuator-healthindicator)
  - [Description](#description)
  - [Problem](#problem)

## Description
In this technique, we’ll discuss how to define a custom Spring Boot actuator `Health-Indicator`.

## Problem
Spring Boot’s built-in `HealthIndicator` does not allow you to inquire about the
health status of your application-specific components. You need to define a custom
`HealthIndicator` that allows you to monitor the health status of the critical REST API
system your application is integrated with.
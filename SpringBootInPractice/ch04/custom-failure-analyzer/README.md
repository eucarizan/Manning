# Technique: Creating a custom Spring Boot FailureAnalyzer

- [Technique: Creating a custom Spring Boot FailureAnalyzer](#technique-creating-a-custom-spring-boot-failureanalyzer)
  - [Description](#description)
  - [Problem](#problem)

## Description
In this technique, we'll demonstrate how to create a custom FailureAnalyzer

## Problem
Your applicaiton has a dependency on an external REST service. You need to ensure its reachability at the time of application startup. You also need to provide a detailed message if the service is not accessible.
# Microservices Spring Boot Project

This is a Java Spring Boot project that demonstrates the implementation of microservices architecture using Spring Boot 3.

This project was created by following the tutorial: [Microservices using SpringBoot 3.0 (YouTube/DailyCodeBuffer)](https://www.youtube.com/watch?v=HFl2dzhVuUo&ab_channel=DailyCodeBuffer)

## Table of Contents

- [Microservices Spring Boot Project](#microservices-spring-boot-project)
  - [Table of Contents](#table-of-contents)
  - [Overview](#overview)
  - [Features](#features)
  - [Prerequisites](#prerequisites)

## Overview

This project provides a sample implementation of microservices using Spring Boot and Spring Cloud. It showcases the usage of various Spring Cloud components to build a distributed system. The project includes multiple microservices that communicate with each other through RESTful APIs.

## Features

- Demonstrates the usage of Spring Boot and Spring Cloud for building microservices.
- Implements service discovery and client-side load balancing using Eureka.
- Uses Spring Cloud Config for externalized configuration management.
- (!)Illustrates circuit breaker pattern and fault tolerance with Hystrix.
- Includes distributed tracing and monitoring using Spring Cloud Sleuth and Zipkin.
- Implements API gateway pattern with Zuul to provide a unified entry point for the microservices.
- Utilizes Spring Cloud Stream for event-driven communication between microservices.

## Prerequisites

To run this project locally, you need to have the following prerequisites installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Docker (optional, for running with containers)

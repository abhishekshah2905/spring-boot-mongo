# Spring Boot Application with MongoDB

This is a simple Spring Boot application that demonstrates the usage of MongoDB with Spring Data MongoDB.

## Overview
The application includes a Derived entity that extends a Base entity. It uses MongoDB to store and retrieve Derived entities.

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- Maven
### Installation
1. Clone the repository:
```bash
  git clone https://github.com/abhishekshah2905/spring-boot-mongo.git
```
2. Navigate to the project directory:
```bash
  cd bookmark-service
```
3. Build the project:
```bash
  mvn clean install
```
4. Run the application:
```bash
  mvn spring-boot:run
```
5. Access the application at http://localhost:8080
### Usage
- The application includes a DerivedRepository that provides methods to interact with the MongoDB database.
- It uses MongoDB's native query methods to perform CRUD operations on the Derived entity.
# Spring Boot GraphQL

This project showcases how to build a Spring Boot application with GraphQL, enabling powerful, flexible queries for accessing and manipulating data.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Usage](#usage)

## Features
- GraphQL API: Define schemas and resolvers to support complex queries and mutations.
- Spring Boot Integration: Simplifies setup and configuration for GraphQL with Spring Boot.
- Schema-Driven Development: Define types, queries, and mutations in a single schema file.
- Error Handling: Structured error responses for a smoother client experience.
- Pagination and Filtering: Enables efficient data retrieval for large datasets.

## Technologies Used
- **Spring Boot** (backend framework)
- **MySQL/PostgreSQL** (database)
- **GraphQL Spring Boot Starter, Spring Data JPA** 
- **Maven** (dependency management)

## Prerequisites
- **JDK 8** or higher
- **Maven** for dependency management
- **MySQL/PostgreSQL** database

## Setup
1. **Clone the repository**:
   ```bash
   git clone https://github.com/rabiyag/spring-boot-graphql.git
   cd spring-boot-graphql
   ```

2. **Update application.properties with your database connection details:**:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database
    spring.datasource.username=your_db_username
    spring.datasource.password=your_db_password
    ```
   
3. **Build the project with Maven**:
   ```bash
   mvn clean install
   ```

## Running the Application
1. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

2. **Access the application**:
   - The application will be available at http://localhost:8080:
  

## Usage

1. Define GraphQL Schema: Use .graphqls schema files to outline types, queries, and mutations.

2. Send Queries and Mutations: Use GraphQL clients (like GraphiQL, Insomnia, or Postman) to interact with the API.

**Sample Query**: 

```graphql
   query {
  getAllItems {
    id
    name
    description
  }
}
   ```
**Sample Mutation**

   ```graphql
mutation {
  createItem(name: "New Item", description: "Item Description") {
    id
    name
  }
}   ```

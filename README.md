# Student Service Core Microservice
- This microservice is responsible for managing student data and providing core functionalities related to student information.
- It is built using Spring Boot and follows a RESTful architecture.
- The service interacts with a database to perform CRUD operations on student records.
- It includes features such as:
  - Student registration
  - Student information retrieval
  - Student data updates
  - Student deletion
- The service also includes error handling, logging, and validation mechanisms to ensure data integrity and reliability.
- It is designed to be scalable and can handle a large number of student records efficiently.
- The microservice is containerized using Docker, making it easy to deploy and manage in various environments.
- It also includes unit and integration tests to ensure the quality and reliability of the codebase.
- The service is documented using Swagger, providing an interactive API documentation for developers to understand and use the endpoints effectively.
- Overall, the Student Service Core Microservice is a robust and efficient solution for managing student data in an educational institution.

## Getting Started
This is a Spring Boot application that uses Gradle to manage dependencies and build the project.

### Prerequisites
This application uses Java 21. Download and install Java from [here](https://www.oracle.com/java/technologies/downloads/#java21) or, if homebrew is installed, via `brew install openjdk@21`.

### Build the application
To build the application, run the following command in the root directory of the project:

```shell
./gradlew build
```
- This will compile the code, run tests, and package the application into a JAR file.

### Running the application locally
Run the application using the following command:
```shell
./gradlew bootRun
```
- The `bootRun` task will compile the code and start the Spring Boot application on port
  - 8080 by default.

### Rest API Endpoints
- The application exposes the following External API endpoints for managing student data:
- | HTTP Method | Endpoint               | Description                        |
- |-------------|------------------------|------------------------------------|
- | GET         | /students              | Retrieve all students              |
- | GET         | /students/{id}         | Retrieve a student by ID           |
- | POST        | /students              | Create a new student               |
- | PUT         | /students/{id}         | Update an existing student         |
- | DELETE      | /students/{id}         | Delete a student by ID             |

### References
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Java 21](https://www.oracle.com/java/technologies/downloads/#java21)
- [Gradle](https://gradle.org/)
- [Docker](https://www.docker.com/)
- [Swagger](https://swagger.io/)
- Quick guide for mySQL: https://www.youtube.com/watch?v=4LZKnegAm4g

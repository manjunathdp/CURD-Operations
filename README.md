# CURD Operations Using Spring Boot

## Overview

This is a Spring Boot CRUD (Create, Read, Update, Delete) API that manages `Details` records with MySQL as the database. It follows a three-layer architecture: Controller, Service, and Repository.

## Technologies Used

- Java 21
- Spring Boot 3.4.4
- Spring Data JPA
- MySQL
- Lombok
- Maven

## Project Structure

```
CURD/
│-- src/main/java/com/mdp/CURD
│   │-- controller/CurdController.java
│   │-- model/Details.java
│   │-- service/
│   │   │-- GetService.java
│   │   │-- PostService.java
│   │   │-- PutService.java
│   │   │-- DeleteService.java
│   │-- repo/DetailsRepo.java
│-- src/main/resources
│   │-- application.properties
│-- pom.xml
│-- README.md
```

## API Endpoints

| Method | Endpoint                | Description                     |
| ------ | ----------------------- | ------------------------------- |
| GET    | `/api/curd/get`         | Fetch all details               |
| POST   | `/api/curd/post`        | Add a new detail record         |
| PUT    | `/api/curd/put/{id}`    | Update an existing record by ID |
| DELETE | `/api/curd/delete/{id}` | Delete a record by ID           |

## Setup Instructions

### 1. Clone the Repository

```sh
git clone https://github.com/manjunathdp/CURD.git
cd CURD
```

### 2. Configure the Database

Update `src/main/resources/application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Build and Run the Project

```sh
mvn spring-boot:run
```

### 4. Test the API

You can test the API using Postman or `curl` commands.

#### Fetch all records:

```sh
curl -X GET http://localhost:8080/api/curd/get
```

#### Add a new record:

```sh
curl -X POST http://localhost:8080/api/curd/post -H "Content-Type: application/json" -d '{
  "firstName": "John",
  "middleName": "D.",
  "lastName": "Doe"
}'
```

#### Update a record:

```sh
curl -X PUT http://localhost:8080/api/curd/put/1 -H "Content-Type: application/json" -d '{
  "firstName": "Jane",
  "middleName": "E.",
  "lastName": "Doe"
}'
```

#### Delete a record:

```sh
curl -X DELETE http://localhost:8080/api/curd/delete/1
```

## Reach Me

- [GitHub](https://github.com/manjunathdp)
- [Repo](https://github.com/manjunathdp/CURD-Operations)

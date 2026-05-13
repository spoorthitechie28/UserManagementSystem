
# Secure User Management System using Spring Boot, JWT & Role-Based Access Control

A production-ready backend application built using Spring Boot and Spring Security that provides secure authentication and authorization using JWT tokens and Role-Based Access Control (RBAC).

This project is designed to simulate a real-world enterprise user management platform where administrators can manage users securely while enforcing protected access to APIs.

---

# Project Highlights

- Secure Authentication using JWT
- Role-Based Authorization (ADMIN / USER)
- RESTful API Architecture
- BCrypt Password Encryption
- Spring Security Integration
- MySQL Database Connectivity
- DTO Validation & Exception Handling
- Layered Architecture
- Clean and Scalable Backend Design

---

# Tech Stack

| Technology | Usage |
|---|---|
| Java 17 | Core Programming |
| Spring Boot | Backend Framework |
| Spring Security | Authentication & Authorization |
| JWT | Secure Token Authentication |
| Spring Data JPA | Database Operations |
| Hibernate | ORM Framework |
| MySQL | Relational Database |
| Maven | Dependency Management |
| Postman | API Testing |

---

# System Architecture

```text
Client Request
      ↓
JWT Authentication Filter
      ↓
Spring Security
      ↓
Controller Layer
      ↓
Service Layer
      ↓
Repository Layer
      ↓
MySQL Database
````

---

# Project Structure

```text
src/main/java/com/example

├── config          -> Security & Application Configuration
├── controller      -> REST Controllers
├── dto             -> Request & Response DTOs
├── entity          -> Database Entities
├── repository      -> JPA Repositories
├── security        -> JWT & Security Classes
├── service         -> Business Logic
└── exception       -> Global Exception Handling
```

---

# Features Implemented

## Authentication & Security

* User Registration
* Secure User Login
* JWT Token Generation & Validation
* BCrypt Password Hashing
* Stateless Authentication
* Role-Based API Protection

---

## User Management

* Create Users
* View User Details
* Update User Information
* Delete Users
* Admin/User Access Separation

---

## Validation & Error Handling

* DTO-Based Validation
* Proper HTTP Status Responses
* Centralized Exception Handling

---

# API Endpoints

## Authentication APIs

| Method | Endpoint         | Description                      |
| ------ | ---------------- | -------------------------------- |
| POST   | `/auth/register` | Register a new user              |
| POST   | `/auth/login`    | Authenticate user & generate JWT |

---

## Admin APIs

| Method | Endpoint           | Access |
| ------ | ------------------ | ------ |
| GET    | `/admin/home`      | ADMIN  |
| GET    | `/admin/users`     | ADMIN  |
| GET    | `/admin/user/{id}` | ADMIN  |
| PUT    | `/admin/user/{id}` | ADMIN  |
| DELETE | `/admin/user/{id}` | ADMIN  |

---

## User APIs

| Method | Endpoint     | Access       |
| ------ | ------------ | ------------ |
| GET    | `/user/home` | USER / ADMIN |

---

# Sample Registration Request

```json
{
  "name": "Admin",
  "email": "admin@gmail.com",
  "password": "1234",
  "role": "ADMIN"
}
```

---

# Sample Login Request

```json
{
  "email": "admin@gmail.com",
  "password": "1234"
}
```

---

# JWT Authorization Header

```text
Authorization: Bearer your_jwt_token
```

---

# Database Configuration

Update your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/CSRDB
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# How to Run the Application

## 1. Clone Repository

```bash
git clone https://github.com/your-username/UserManagementSystem.git
```

---

## 2. Open Project

Import the project into:

* Spring Tool Suite (STS)
* Eclipse
* IntelliJ IDEA

---

## 3. Configure MySQL

Create database:

```sql
CREATE DATABASE CSRDB;
```

Update MySQL credentials in `application.properties`.

---

## 4. Install Dependencies

```bash
mvn clean install
```

---

## 5. Run the Application

```bash
mvn spring-boot:run
```

Application runs on:

```text
http://localhost:8080
```

---

# Testing APIs

Use:

* Postman
* Thunder Client
* Swagger (Future Enhancement)

Test:

* Registration
* Login
* JWT Authorization
* Admin/User Protected APIs

---

# Security Features

* JWT-Based Authentication
* Role-Based Access Control
* BCrypt Password Encryption
* Stateless Session Management
* Protected REST APIs
* Secure Endpoint Authorization

---

# Future Enhancements

* React Frontend Integration
* Docker Containerization
* AWS Cloud Deployment
* Swagger API Documentation
* Refresh Token Mechanism
* Email Verification
* Password Reset Feature
* Audit Logging
* Microservices Architecture

---

# Learning Outcomes

Through this project, I gained hands-on experience in:

* Spring Boot Development
* REST API Design
* Authentication & Authorization
* JWT Security Implementation
* Database Integration
* Layered Backend Architecture
* Real-World Backend Development Practices

---

# Author

## Spoorthi K




```
```

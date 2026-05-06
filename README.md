# User Management System using Spring Boot & JWT

A secure Role-Based User Management System built using Spring Boot, Spring Security, JWT Authentication, MySQL, and REST APIs.

---

## Features

- User Registration
- User Login Authentication
- JWT Token Generation
- Role-Based Authorization
- Admin and User Access Control
- Password Encryption using BCrypt
- REST API Architecture
- MySQL Database Integration
- Spring Security Implementation
- Validation using DTOs

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

---

## Project Structure

```text
src/main/java/com/example

├── config
├── controller
├── dto
├── entity
├── repository
├── security
└── service
```

---

## API Endpoints

### Authentication APIs

| Method | Endpoint | Description |
|--------|-----------|-------------|
| POST | `/auth/register` | Register new user |
| POST | `/auth/login` | Login user |

---

### Admin APIs

| Method | Endpoint | Access |
|--------|-----------|--------|
| GET | `/admin/home` | ADMIN |
| GET | `/admin/users` | ADMIN |
| GET | `/admin/user/{id}` | ADMIN |
| PUT | `/admin/user/{id}` | ADMIN |
| DELETE | `/admin/user/{id}` | ADMIN |

---

### User APIs

| Method | Endpoint | Access |
|--------|-----------|--------|
| GET | `/user/home` | USER / ADMIN |

---

## Registration Request Example

```json
{
  "name":"Admin",
  "email":"admin@gmail.com",
  "password":"1234",
  "role":"ADMIN"
}
```

---

## Login Request Example

```json
{
  "email":"admin@gmail.com",
  "password":"1234"
}
```

---

## Authorization Header

```text
Authorization : Bearer your_jwt_token
```

---

## Database Configuration

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/CSRDB
spring.datasource.username=root
spring.datasource.password=your_password
```

---

## How to Run the Project

1. Clone the repository
2. Open project in Eclipse or IntelliJ
3. Configure MySQL database
4. Update Maven dependencies
5. Run Spring Boot application
6. Test APIs using Postman

---

## Security Features

- JWT Authentication
- Stateless Session Management
- Role-Based Access
- Password Encryption
- Secure API Access

---

## Future Enhancements

- React Frontend
- Swagger Documentation
- Refresh Tokens
- Docker Deployment
- Cloud Deployment (AWS)

---

## Author

Spoorthi K

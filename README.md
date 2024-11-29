# Role-Based Access Control (RBAC) with Authentication and Authorization

Overview
This project implements a secure Authentication and Role-Based Access Control (RBAC) system using Java Spring Boot. The system ensures:

Users can securely register, log in, and access resources based on their roles.
Access to APIs is granted based on user roles (e.g., ADMIN, USER).
Tokens are generated using JWT (JSON Web Token) for authentication and authorization.
Features
User Registration: Users can sign up with a username and password.
User Login: Users can log in and receive a JWT token.
JWT-Based Authentication: Tokens are used to secure endpoints.
Role-Based Access Control (RBAC): Endpoints are restricted based on roles.
Secure Password Storage: Passwords are hashed using BCrypt.
RESTful API Design: Fully functional REST API with clear role-based restrictions.
Technologies Used
Backend Framework: Spring Boot
Authentication: JSON Web Tokens (JWT)
Security: Spring Security
Database: H2 Database (can be replaced with MySQL, PostgreSQL, etc.)
Build Tool: Maven
Programming Language: Java


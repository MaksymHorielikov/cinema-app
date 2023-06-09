# Cinema-App

### Description
This REST API application is a system for booking tickets at the cinema.

The framework used is SPRING, Hibernate.

Application Features:
1. Session-based authentication, encrypted password storing in DB;
2. Role-based authorization for "ADMIN" and "USER";
3. Separated access to endpoints for different roles (see API);
4. Admin tools: get user info, add movies, cinema halls, manage movie sessions
5. User tolls: register, obtaining shopping cart, add tickets on movie session, complete order;
---------
### Technologies
| Technology        | Version      |
| ----------------- |--------------|
| Java              | 16           |
| Apache Maven      | 3.10.1       |
| Apache Tomcat     | 9.0.73       |
| MySQL             | 8.0.22       |
| Hibernate ORM     | 5.6.14.Final |
| Spring Framework  | 5.3.20       |
| Spring Security   | 5.6.10       |
---------
### Project Architecture
The project follows a 3-layer architecture:
- Presentation layer (controllers)
- Application layer (services)
- Data access layer (DAO)
---------
### Project Structure
| Package    | Description                                                                                      |
|------------|--------------------------------------------------------------------------------------------------|
| config     | classes for configuration of application operation                                               |
| controller | controllers for endpoints (see api)                                                              |
| dao        | Data Access Objects are responsible for correct CRUD operations with DB                          |
| dto        | Data Transfer Objects are representing communication objects for customer requests and responses |
| exception  | custom exception                                                                                 |
| lib        | contains custom annotations and logic for email and password validation                          |
| model      | Plain Old Java Objects are defining operational data (objects) type and structure                |
| service    | provides business logic, includes <code>mapper</code>-s for dto                                  |
| util       | utility class used to determine DateTime pattern                                                 |
| resources  | contains configuration file with JDBC and Hibernate params                                       |
---------
### Cinema-app API
| Controller     | End point                     | Method | Description                                     | ADMIN | USER | No-authentication |
|----------------|-------------------------------|--------|-------------------------------------------------|-------|------|-------------------|
| Authentication | /register                     | POST   | register new user                               |       |      | x                 |
| CinemaHall     | /cinema-halls                 | GET    | get all cinema halls                            | x     | x    |                   |
| CinemaHall     | /cinema-halls                 | POST   | add new cinema halls                            | x     |      |                   |
| Movie          | /movies                       | GET    | get all movies                                  | x     | x    |                   |
| Movie          | /movies                       | POST   | add new movie                                   | x     |      |                   |
| MovieSession   | /movie-sessions/available     | GET    | get all available movie session                 | x     | x    |                   |
| MovieSession   | /movie-sessions               | POST   | add new movie session                           | x     |      |                   |
| MovieSession   | /movie-sessions/{id}          | PUT    | update movie session by id                      | x     |      |                   |
| MovieSession   | /movie-sessions/{id}          | DELETE | delete movie session by id                      | x     |      |                   |
| Order          | /orders                       | GET    | get all orders                                  |       | x    |                   |
| Order          | /orders/complete              | POST   | complete current order                          |       | x    |                   |
| ShoppingCart   | /shopping-carts/by-user       | GET    | get contents of the current users shopping cart |       | x    |                   |
| ShoppingCart   | /shopping-carts/movie-session | PUT    | add movie session to shopping cart              |       | x    |                   |
| User           | /users/by-email               | GET    | get user by email                               | x     |      |                   |

By default, two users are created:

| Role  | Username        | Password |
|-------|-----------------|----------|
| ADMIN | admin@gmail.com | admin    |
| USER  | user@gmail.com  | user     |

----------
### How to Run and Test
- ✅ Make sure you have Apache Tomcat and MySQL installed on your system.
- ✅ Clone the project repository to your local machine.
- ✅ Configure the database connection parameters in the `resources/db.properties` file.
- ✅ Set up a local Tomcat configuration in your IDE.
- ✅ Run the Tomcat configuration and deploy the application.
- ✅ Access the application using the specified URL.
- ✅ Use the provided credentials to test the application's functionalities.
---------
### Author
[Maksym Horielikov](https://www.linkedin.com/in/maksym-horielikov-738347275/)


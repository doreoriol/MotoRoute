# MotoRoute 🏍️

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue)
![Docker](https://img.shields.io/badge/Docker-ready-blue)

MotoRoute is a backend-focused project that allows motorcycle riders to **discover, share and rate scenic riding routes**.

The goal of the project is to practice building a **clean and scalable REST API** using Spring Boot.

Users can create routes, explore routes from other riders, save favorites and rate the best riding experiences.

---

# Features

- User authentication (JWT)
- Create, update and delete motorcycle routes
- Discover routes with filters
- Save favorite routes
- Rate and comment routes
- Route recommendation score

---

# Tech Stack

## Backend
- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA

## Database
- PostgreSQL
- Flyway migrations

## Other
- JWT authentication
- Docker
- OpenAPI / Swagger

---

# Project Structure

```
motoroute
│
├── src/main/java/com/motoroute
│   ├── controller
│   ├── service
│   ├── repository
│   ├── model
│   ├── dto
│   ├── mapper
│   └── config
│
├── src/main/resources
│   ├── db/migration
│   └── application.yml
│
└── docker
```

---

# Main Entities

## User
- id
- username
- email
- password
- bio
- motorcycle

## Route
- id
- title
- description
- startLocation
- endLocation
- distanceKm
- durationMin
- difficulty
- visibility
- createdAt

## Rating
- userId
- routeId
- score
- comment

## Favorite
- userId
- routeId

---

# Project Goals
## This project is built to:
- Practice Spring Boot backend architecture
- Work with authentication and authorization
- Design a REST API
- Manage relational data
- Build a real-world backend portfolio project

---

# Future Improvements
- GPX route uploads
- Map visualization
- Route difficulty calculation
- Weather integration
- Social features between riders

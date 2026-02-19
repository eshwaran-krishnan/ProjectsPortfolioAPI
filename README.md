# ProjectsPortfolioAPI

A REST API for managing a personal projects portfolio. Built with **Spring Boot** and **MongoDB**.

## Endpoints

| Method | Path | Description |
|--------|------|-------------|
| GET | `/api/v1/projects` | List all projects |
| GET | `/api/v1/projects/{projectId}` | Get a single project |
| POST | `/api/v1/reviews` | Add a review to a project |

## Data Model

```json
{
  "projectId": "string",
  "projectTitle": "string",
  "projectWebLink": "string",
  "websiteName": "string",
  "reviewIDs": []
}
```

## Setup

### Prerequisites
- Java 17+
- Maven
- MongoDB Atlas account

### Environment Variables

Copy `.env.example` to `.env` and fill in your values:

```
MONGO_DATABASE=your-db-name
MONGO_USER=your-username
MONGO_PASSWORD=your-password
MONGO_CLUSTER=your-cluster.mongodb.net
```

### Run locally

```bash
mvn spring-boot:run
```

### Run with Docker

```bash
docker build -t portfolio-api .
docker run -p 8080:8080 --env-file .env portfolio-api
```

## Tech Stack

- Java / Spring Boot
- Spring Data MongoDB
- Lombok
- Docker

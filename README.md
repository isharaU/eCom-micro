
# 🛒 Simple Online Shop - Microservices Architecture (Spring Boot + Spring Cloud)

Welcome to the **Simple Online Shop** project! This is a practical microservices-based e-commerce backend application built with **Spring Boot** and modern **Spring Cloud** technologies. The goal is to demonstrate how to design, build, and integrate robust, production-ready microservices with real-world tools and patterns.

> **🚧 Status:** In Progress  
> **✅ Current Modules Implemented:** Product Service, Order Service, Inventory Service

---

## 📦 Architecture Overview

This application is composed of multiple independently deployable services, each responsible for a specific business capability.

### ✅ Implemented Services

| Service         | Description                                                                 | Database |
|-----------------|-----------------------------------------------------------------------------|----------|
| **Product**     | Manages product catalog and CRUD operations                                 | MongoDB  |
| **Inventory**   | Tracks product availability and stock management                            | MySQL    |
| **Order**       | Handles placing orders and checks product availability with Inventory       | MySQL    |

### 🔜 Coming Soon

- Notification Service (RabbitMQ/Kafka + Email)
- API Gateway (Spring Cloud Gateway)
- Keycloak (Authentication & Authorization)
- Config Server (Centralized Configuration)
- Vault (Secrets Management)
- Zipkin (Distributed Tracing)
- ELK Stack (Centralized Logging)

---

## ⚙️ Tech Stack

- **Java 17**
- **Spring Boot 3.x**
- **Spring Cloud** (Config, Gateway, Discovery, etc.)
- **MongoDB** for Product Service
- **MySQL** for Order and Inventory Services
- **Maven Multi-Module Project**
- **RabbitMQ/Kafka** for async communication (planned)
- **Lombok** for boilerplate reduction
- **Testcontainers** + **MockMvc** for integration testing

---

## 📁 Project Structure

```bash
simple-online-shop/
├── product-service/
├── inventory-service/
├── order-service/
├── pom.xml (parent project)
````

Each service follows a layered structure:

* `controller` – handles HTTP requests
* `service` – contains business logic
* `repository` – database access layer
* `dto` – for API input/output

---

## 🧪 Testing

Integration tests are written using:

* **JUnit 5**
* **MockMvc** for REST API testing
* **Testcontainers** for MongoDB/MySQL containers

---

## 🚀 Getting Started (Dev)

> Make sure you have Docker running (for DBs via Testcontainers), Java 17, and Maven installed.

```bash
# Clone the repo
git clone https://github.com/your-username/simple-online-shop.git
cd simple-online-shop

# Run a service (example: product-service)
cd product-service
./mvnw spring-boot:run
```

Each service can be run independently.

---

## 💬 Services Overview

### 🔸 Product Service

* Stores product data (name, description, price)
* MongoDB-backed
* REST API: `POST /api/product`, `GET /api/product`

### 🔸 Inventory Service

* Tracks stock quantity
* MySQL-backed
* REST API: `GET /api/inventory?skuCode=...`

### 🔸 Order Service

* Places orders after checking stock from Inventory
* MySQL-backed
* REST API: `POST /api/order`

---

## 📌 Next Steps

* Add asynchronous communication using RabbitMQ/Kafka
* Integrate API Gateway & Auth with Keycloak
* Enable centralized config, secrets, logging & tracing
* Containerize services with Docker & orchestrate with Docker Compose/K8s

---

## 📜 License

This project is licensed under the MIT License.

---

## 🤝 Contributing

Feel free to fork this repo, open issues, or suggest improvements!

---

## 📧 Contact

Created with ❤️ by **Ishara**
Reach out via [GitHub](https://github.com/isharaU) or email for any collaboration or feedback.





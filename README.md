# HR Management System - Backend

This is the backend component of the **HR Management System**, built using **Java Spring Boot**. It handles employee information, leave management, department and role allocation, and user authentication functionalities.

## 🚀 Features

- 🧑‍💼 Employee Management (CRUD)
- 🗓️ Leave Request and Approval Workflow
- 🏢 Department and Role Management
- 🔐 User Authentication & Authorization (Spring Security)
- 📊 Attendance & Salary Management *(optional, based on features)*
- 📨 Email Notifications *(if configured)*

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Security**
- **Spring Data JPA**
- **MySQL**
- **Lombok**
- **Maven**


## ⚙️ Getting Started

### Prerequisites

- Java 17+
- Maven
- MySQL

### Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/Hr-management-system-backend.git
   cd Hr-management-system-backend

### Configure Database
Update the src/main/resources/application.properties file with your MySQL database credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/hr_management
spring.datasource.username=root
spring.datasource.password=yourpassword

### Run the application
mvn spring-boot:run



# Employee Management System

A menu-driven Employee Management System developed using **Java, JDBC, and MySQL**. This application allows users to manage employee records through a simple console-based interface.

## 📌 Project Overview

The Employee Management System is designed to perform basic employee record management operations. It connects a Java application with a MySQL database using JDBC and provides CRUD operations through a menu-driven program.

## ✨ Features

* Add a new employee
* View all employees
* Search employee by ID
* Update employee details
* Delete employee
* Duplicate email handling
* Input validation
* Menu-driven console interface
* MySQL database integration
* JDBC database connectivity

## 🛠️ Technologies Used

| Technology      | Purpose                 |
| --------------- | ----------------------- |
| Java            | Application development |
| JDBC            | Database connectivity   |
| MySQL           | Data storage            |
| Eclipse IDE     | Development environment |
| MySQL Workbench | Database management     |

## 📂 Project Structure

```text
EmployeeManagementSystem
│
├── src
│   └── com.ems
│       ├── Main.java
│       ├── Employee.java
│       ├── EmployeeDAO.java
│       └── DBConnection.java
│
├── .gitignore
└── README.md
```

## 🗄️ Database Structure

The application uses a MySQL database to store employee information.

### Employee Table

| Column      | Description            |
| ----------- | ---------------------- |
| emp_id      | Unique employee ID     |
| emp_name    | Employee name          |
| department  | Employee department    |
| designation | Employee designation   |
| salary      | Employee salary        |
| email       | Employee email address |

## 🔄 CRUD Operations

The application implements all four basic CRUD operations:

### Create

Add a new employee to the database.

### Read

View all employees or search for a specific employee using Employee ID.

### Update

Modify existing employee information such as name, department, designation, salary, and email.

### Delete

Delete an employee record using Employee ID.

## 📋 Application Menu

```text
===== Employee Management System =====

1. Add Employee
2. View All Employees
3. Search Employee
4. Update Employee
5. Delete Employee
6. Exit

Enter your choice:
```

## ✅ Input Validation

The application performs basic validation to improve data quality.

* Employee name cannot be empty
* Department cannot be empty
* Designation cannot be empty
* Salary cannot be negative
* Email format is validated
* Duplicate email addresses are handled

## 🔌 JDBC Connection

The application uses **JDBC (Java Database Connectivity)** to connect the Java application with MySQL.

The database operations are handled using:

* `Connection`
* `PreparedStatement`
* `ResultSet`

`PreparedStatement` is used for executing SQL queries with user-provided values.

## ▶️ How to Run the Project

### Prerequisites

Make sure the following are installed:

1. Java JDK
2. Eclipse IDE
3. MySQL Server
4. MySQL Workbench
5. MySQL Connector/J

### Database Setup

Create a MySQL database and employee table.

Example:

```sql
CREATE DATABASE employee_management;

USE employee_management;

CREATE TABLE employee (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    emp_name VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL,
    designation VARCHAR(100) NOT NULL,
    salary DOUBLE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);
```

### Configure Database Connection

Update the database connection details in `DBConnection.java` according to your local MySQL configuration.

> **Note:** Do not upload your actual MySQL password or other sensitive credentials to GitHub.

### Run the Application

1. Open the project in Eclipse.
2. Add MySQL Connector/J to the project.
3. Configure the database connection.
4. Run `Main.java`.
5. Select an option from the menu.
6. Perform employee management operations.

## 🧪 Example

```text
===== Employee Management System =====

1. Add Employee
2. View All Employees
3. Search Employee
4. Update Employee
5. Delete Employee
6. Exit

Enter your choice: 1

Enter Employee Name: Anushiya
Enter Department: IT
Enter Designation: Java Developer
Enter Salary: 30000
Enter Email: anushiya@example.com

Employee Added Successfully!
```

## 🎯 Learning Outcomes

Through this project, the following concepts were implemented:

* Core Java
* Object-Oriented Programming
* JDBC
* SQL
* MySQL database operations
* CRUD operations
* PreparedStatement
* Exception handling
* Input validation
* Menu-driven programming
* Java and MySQL integration

## 🚀 Future Enhancements

The project can be further enhanced by adding:

* Login and authentication
* Role-based access
* Graphical User Interface
* Advanced employee search
* Department-wise filtering
* Salary reports
* Pagination
* Better exception handling
* Connection pooling
* Spring Boot REST API

## 👩‍💻 Author

**Anushiya A S**

### Technologies

`Java` `JDBC` `MySQL` `SQL` `Eclipse`

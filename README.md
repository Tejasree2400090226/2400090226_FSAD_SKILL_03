# Hibernate HQL Skill 3 - Sorting, Pagination & Aggregates

## Overview
This project demonstrates advanced HQL operations using the Product entity.

## Features
- Sorting by price in ascending and descending order
- Sorting by quantity in descending order
- Pagination using HQL
- Aggregate functions like COUNT, MIN, MAX, AVG, and SUM
- GROUP BY operations
- Filtering products by price range
- LIKE queries for pattern matching

## Technologies Used
- Java
- Hibernate ORM
- MySQL
- Maven
- Jakarta Persistence

## Project Structure
- `Product.java` - Entity class
- `ProductDataLoader.java` - Inserts sample product records
- `HibernateUtil.java` - Creates SessionFactory
- `HQLDemo.java` - Runs HQL queries
- `hibernate.cfg.xml` - Hibernate configuration

## Database
Database name:
`hibernate_hql_skill3`

Table name:
`products`

## Sample Records
- Laptop
- Mouse
- Keyboard
- Monitor
- Desk Chair
- Desk Lamp
- Notebook
- Pen Set

## How to Run
1. Create the database in MySQL Workbench:
   ```sql
   CREATE DATABASE hibernate_hql_skill3;

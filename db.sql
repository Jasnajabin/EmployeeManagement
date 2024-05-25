CREATE DATABASE  IF NOT EXISTS `myemployee` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `myemployee`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: myemployee
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `id` int NOT NULL,
  `creation_date` date DEFAULT NULL,
  `department_head` varchar(255) DEFAULT NULL,
  `dname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'2019-11-04','Manoj','Marketing'),(2,'2019-11-04','Manoj','Marketing'),(3,'2019-11-04','Manoj','Marketing'),(4,'2019-11-04','Manoj','Marketing'),(5,'2019-11-04','Manoj','Marketing'),(6,'2019-11-04','Manoj','Marketing'),(7,'2019-11-04','Manoj','Marketing'),(8,'2019-11-04','Manoj','Marketing'),(9,'2019-11-04','Manoj','Marketing'),(10,'2019-05-01','Kayling','Finance'),(11,'2019-05-01','Kayling','Finance'),(12,'2019-05-01','Kayling','Finance'),(13,'2019-05-01','Kayling','Finance'),(14,'2019-05-01','Kayling','Finance'),(15,'2019-05-01','Kayling','Finance'),(16,'2019-05-01','Kayling','Finance'),(17,'2019-05-01','Kayling','Finance'),(18,'2019-05-01','Kayling','Finance'),(19,'2019-05-01','Kayling','Finance'),(20,'2019-05-01','Kayling','Finance'),(21,'2019-02-05','Julius','Audit'),(22,'2019-02-05','Julius','Audit'),(23,'2019-02-05','Julius','Audit'),(24,'2019-02-05','Julius','Audit'),(25,'2019-02-05','Julius','Audit');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department_seq`
--

DROP TABLE IF EXISTS `department_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department_seq`
--

LOCK TABLES `department_seq` WRITE;
/*!40000 ALTER TABLE `department_seq` DISABLE KEYS */;
INSERT INTO `department_seq` VALUES (151);
/*!40000 ALTER TABLE `department_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `ename` varchar(255) DEFAULT NULL,
  `j_date` date DEFAULT NULL,
  `r_manager` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `salary` int NOT NULL,
  `yearlybp` varchar(255) DEFAULT NULL,
  `department_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKhr5ovw667hkx0jl5cmyo66wb8` (`department_id`),
  CONSTRAINT `FKbejtwvg9bxus2mffsm3swj3u9` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Kozhikode','2001-02-22','Arun','2019-02-12','Akhil','Salesman',12000,'5%',1),(2,'Kozhikode','1997-02-22','Manoj','2018-02-12','Top level','Marketing Head',45000,'10%',2),(3,'Malappuram','1999-04-26','Akhil','2019-12-03','Top level','Reporting Manager',25000,'8%',3),(4,'Kannur','1999-11-23','Blaze','2023-12-03','Akhil','Saleswoman',12000,'8%',4),(5,'Malappuram','2001-06-26','Manu','2020-12-05','Top level','Assistant Manager',25000,'10%',5),(6,'Kollam','2001-07-15','Ananya','2021-06-05','Akhil','Saleswoman',12000,'8%',6),(7,'Kottayam','1999-10-02','Joy','2018-10-03','Akhil','Clerk',15000,'5%',7),(8,'Kottayam','2001-04-26','Kavya','2020-10-13','Akhil','Saleswoman',12000,'5%',8),(9,'Malappuram','2000-04-24','Rahila','2020-10-13','Akhil','Saleswoman',12000,'5%',9),(10,'Australia','1999-12-03','Clare','2020-12-03','Top level','Manager',100000,'10%',10),(11,'Australia','1999-12-03','Clare','2020-12-03','Top level','Manager',100000,'10%',11),(12,'NewYork','2000-02-22','Marker','2018-12-08','Clare','Clerk',15000,'10%',12),(13,'Malappuram','2001-04-17','Janas','2019-06-25','Clare','Team Head',65000,'10%',13),(14,'Kottayam','2000-04-03','Frank','2019-05-03','Clare','Accoundant',35000,'8%',14),(15,'Kannur','2000-11-26','Laila','2021-06-15','Clare','Accoundant',35000,'10%',15),(16,'Trivandrum','1999-06-23','Reshma','2021-06-25','Clare','Accoundant',35000,'10%',16),(17,'Alapuzha','2000-08-02','Parvathy','2019-06-23','Clare','Accoundant',35000,'10%',17),(18,'Kottayam','2001-08-11','Aleena','2019-06-23','Clare','Intern',35000,'5%',18),(19,'Kottayam','1999-12-24','Sijo','2020-10-25','Clare','Intern',15000,'10%',19),(20,'America','1997-04-23','Julius','2019-05-03','Top level','Manager',55000,'10%',20),(21,'Malappuram','2001-11-23','Jasna','2024-05-03','Julius','Analyst',25000,'10%',21),(22,'Kozhikode','2000-06-15','Nazri','2024-05-03','Julius','Analyst',25000,'10%',22),(23,'Kasargod','1999-06-15','Roja','2023-05-03','Julius','Analyst',25000,'10%',23),(24,'Malappuram','1999-06-23','Bargees','2020-05-03','Julius','Clerk',17000,'10%',24),(25,'Kottayam','2002-06-23','Tony','2024-05-03','Julius','Trainee',15000,'10%',25);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_seq`
--

DROP TABLE IF EXISTS `employee_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_seq`
--

LOCK TABLES `employee_seq` WRITE;
/*!40000 ALTER TABLE `employee_seq` DISABLE KEYS */;
INSERT INTO `employee_seq` VALUES (101);
/*!40000 ALTER TABLE `employee_seq` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-25 12:31:49

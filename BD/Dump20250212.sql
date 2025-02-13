-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: adminpeliculas
-- ------------------------------------------------------
-- Server version	8.0.40

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
-- Table structure for table `horario`
--

DROP TABLE IF EXISTS `horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horario` (
  `id_horario` bigint NOT NULL AUTO_INCREMENT,
  `id_pelicula` bigint NOT NULL,
  `fecha` date NOT NULL,
  `horario` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_horario`),
  KEY `fk_peliculas` (`id_pelicula`),
  CONSTRAINT `fk_peliculas` FOREIGN KEY (`id_pelicula`) REFERENCES `peliculas` (`id_pelicula`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horario`
--

LOCK TABLES `horario` WRITE;
/*!40000 ALTER TABLE `horario` DISABLE KEYS */;
INSERT INTO `horario` VALUES (1,3,'2025-02-14','14:00:00'),(2,3,'2025-02-13','17:00:00'),(3,3,'2025-02-13','21:00:00'),(4,1,'2025-02-14','15:00:00'),(5,2,'2025-02-13','20:00:00'),(6,3,'2025-02-15','16:00:00'),(7,7,'2025-02-14','14:00:00'),(8,7,'2025-02-13','20:00:00'),(9,2,'2025-02-14','14:00:00'),(10,10,'2025-02-14','17:00:00');
/*!40000 ALTER TABLE `horario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peliculas`
--

DROP TABLE IF EXISTS `peliculas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `peliculas` (
  `id_pelicula` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `duracion` varchar(255) DEFAULT NULL,
  `clasificacion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_pelicula`),
  UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peliculas`
--

LOCK TABLES `peliculas` WRITE;
/*!40000 ALTER TABLE `peliculas` DISABLE KEYS */;
INSERT INTO `peliculas` VALUES (1,'Flow','https://pics.filmaffinity.com/Flow_un_mundo_que_salvar-382508168-large.jpg','130','B'),(2,'Barbie','https://es.web.img2.acsta.net/img/4a/a3/4aa3265d76c8d07e0315f48a76205386.jpg','130','A'),(3,'Sonic 3','https://pics.filmaffinity.com/Sonic_la_pelaicula-450124674-large.jpg','90','A'),(7,'Deadpool','https://pics.filmaffinity.com/Flow_un_mundo_que_salvar-382508168-large.jpg','120','R'),(8,'Sherk','https://es.web.img2.acsta.net/img/4a/a3/4aa3265d76c8d07e0315f48a76205386.jpg','150','B'),(10,'Avengers','https://es.web.img2.acsta.net/img/4a/a3/4aa3265d76c8d07e0315f48a76205386.jpg','150','B');
/*!40000 ALTER TABLE `peliculas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-12 18:13:34

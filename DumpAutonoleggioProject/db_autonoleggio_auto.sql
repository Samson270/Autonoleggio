-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: db_autonoleggio
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `auto`
--

DROP TABLE IF EXISTS `auto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `auto` (
  `id_auto` int NOT NULL,
  `cilindrata` int DEFAULT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `modello` varchar(255) DEFAULT NULL,
  `potenza` int DEFAULT NULL,
  `prezzo_giornaliero` double DEFAULT NULL,
  `targa` varchar(255) DEFAULT NULL,
  `descrizione` varchar(500) DEFAULT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_auto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auto`
--

LOCK TABLES `auto` WRITE;
/*!40000 ALTER TABLE `auto` DISABLE KEYS */;
INSERT INTO `auto` VALUES (102,5200,'Lamborghini','Gallardo',410,1000,'XD111LL','La Gallardo RWD adotta la tecnologia tipica delle sportive “classiche”: un motore estremamente potente abbinato alla trazione posteriore con un sistema ESP sviluppato specificatamente per le due ruote motrici.\nUna soluzione assolutamente insolita per una Lamborghini e perfetta per chi ama il divertimento ed emozioni forti.','assets/lamborghiniGallardo.jpg'),(103,4000,'Lamborghini','Urus',650,900,'XD121LL','La Lamborghini Urus ospita sotto al cofano un motore V8 biturbo da 4,0 litri, capace di 650 CV e 850 Nm di coppia già a 2250 giri/min in grado di garantire uno scatto da 0 a 100 km/h in 3,6 secondi e una velocità massima di 305 km/h.','assets/lamborghiniUrus.jpg'),(152,3900,'Ferrari','Portofino',620,1000,'XD124LL','Con i suoi 600 cv e accelerazioni da 0 a 100 km/h in soli 3,5 secondi, la Ferrari Portofino è, infatti, la più potente convertibile a offrire contemporaneamente il tetto rigido retrattile, un baule capiente e una grande abitabilità, arricchita da due posti posteriori utilizzabili per brevi percorrenze.','assets/ferrariPortofino.jpg');
/*!40000 ALTER TABLE `auto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-27  9:46:25

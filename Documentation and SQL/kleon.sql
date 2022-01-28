-- MySQL dump 10.13  Distrib 5.1.34, for Win32 (ia32)
--
-- Host: localhost    Database: kleon
-- ------------------------------------------------------
-- Server version	5.1.34-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `billing`
--

DROP TABLE IF EXISTS `billing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `billing` (
  `CustId` int(11) NOT NULL,
  `ShowId` int(11) NOT NULL,
  `SnackCost` int(11) NOT NULL,
  `TicketCost` int(11) NOT NULL,
  `TotalCost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billing`
--

LOCK TABLES `billing` WRITE;
/*!40000 ALTER TABLE `billing` DISABLE KEYS */;
/*!40000 ALTER TABLE `billing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cinema`
--

DROP TABLE IF EXISTS `cinema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cinema` (
  `CinemaId` int(11) DEFAULT NULL,
  `CinemaName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cinema`
--

LOCK TABLES `cinema` WRITE;
/*!40000 ALTER TABLE `cinema` DISABLE KEYS */;
INSERT INTO `cinema` VALUES (1,'Inox'),(2,'PVR'),(3,'Cinepolis'),(4,'BigCinemas');
/*!40000 ALTER TABLE `cinema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `CustUsername` varchar(255) NOT NULL,
  `CustPassword` varchar(255) NOT NULL,
  `CustId` int(11) NOT NULL AUTO_INCREMENT,
  `Mail` varchar(255) NOT NULL,
  PRIMARY KEY (`CustId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('JohnDoe','password',1,'johndoe@gmail.com'),('JaneDoe','pass',2,'janedoe@gmail.com');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `EmpUsername` varchar(255) NOT NULL,
  `EmpPassword` varchar(255) NOT NULL,
  `AdvantageCode` int(11) NOT NULL,
  `EmpId` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`EmpId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('JoseDoe','pass',101,1),('JoshDoe','pass',100,2);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movies`
--

DROP TABLE IF EXISTS `movies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movies` (
  `MovieName` varchar(255) NOT NULL,
  `MovieThumb` varchar(255) NOT NULL,
  `MovieDesc` varchar(255) NOT NULL,
  `MovieCertification` varchar(255) NOT NULL,
  `MovieTrailer` varchar(255) NOT NULL,
  `MovieRating` int(11) NOT NULL,
  `MovieDuration` varchar(255) NOT NULL,
  `MovieLang` varchar(255) NOT NULL,
  `MovieId` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`MovieId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movies`
--

LOCK TABLES `movies` WRITE;
/*!40000 ALTER TABLE `movies` DISABLE KEYS */;
INSERT INTO `movies` VALUES ('Interstellar','\"/SourceImages/interstellar-christopher-nolan-poster-modified.jpg\"','In future, a global crop blight and second Dust Bowl are slowly rendering the planet uninhabitable. Professor Brand , a brilliant NASA physicist, is working on plans to save mankind by transporting Earth population to a new home via a wormhole.','UA','https://www.youtube.com/watch?v=0vxOhd4qlnA',10,'2h 55mins','English',1),('Dunkirk','\"/SourceImages/dunkirk.jpg\"','During World War II, soldiers from the British Empire, Belgium and France try to evacuate from the town of Dunkirk during a arduous battle with German forces.','UA','https://www.youtube.com/watch?v=F-eMt3SrfFU',6,'1h 55mins','English',2),('Joker','\"/SourceImages/joker.jpg\"','Forever alone in a crowd, failed comedian Arthur Fleck seeks connection as he walks the streets of Gotham City. Arthur wears two masks -- the one he paints for his day job as a clown','UA','https://www.youtube.com/watch?v=zAGVQLHvwOY',6,'1h 30mins','English',3);
/*!40000 ALTER TABLE `movies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `offers`
--

DROP TABLE IF EXISTS `offers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `offers` (
  `DiscountCode` varchar(255) NOT NULL,
  `DiscountPercent` int(11) NOT NULL,
  `EmpUsername` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `offers`
--

LOCK TABLES `offers` WRITE;
/*!40000 ALTER TABLE `offers` DISABLE KEYS */;
INSERT INTO `offers` VALUES ('abc20',20,'JoshDoe'),('xyz40',40,'JoseDoe');
/*!40000 ALTER TABLE `offers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reviews`
--

DROP TABLE IF EXISTS `reviews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reviews` (
  `ReviewId` int(11) NOT NULL,
  `CustId` varchar(100) DEFAULT NULL,
  `MovieId` int(11) NOT NULL,
  `ReviewText` varchar(255) NOT NULL,
  `Rating` int(11) NOT NULL,
  `MovRevId` int(3) DEFAULT NULL,
  PRIMARY KEY (`ReviewId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reviews`
--

LOCK TABLES `reviews` WRITE;
/*!40000 ALTER TABLE `reviews` DISABLE KEYS */;
INSERT INTO `reviews` VALUES (1,'MannanGoyal',1,'sdsdsds',1,1),(7,'MannanGoyal',1,'234234234234234',2,2),(8,'JohnDoe',1,'Great.',8,3);
/*!40000 ALTER TABLE `reviews` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shows`
--

DROP TABLE IF EXISTS `shows`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shows` (
  `ShowId` int(11) NOT NULL,
  `MovieId` int(11) NOT NULL,
  `MovieName` int(11) NOT NULL,
  `CinemaId` int(11) NOT NULL,
  `Show_Month` int(2) NOT NULL,
  `Show_Date` int(2) NOT NULL,
  `Show_Time` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shows`
--

LOCK TABLES `shows` WRITE;
/*!40000 ALTER TABLE `shows` DISABLE KEYS */;
/*!40000 ALTER TABLE `shows` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `snacks`
--

DROP TABLE IF EXISTS `snacks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `snacks` (
  `SnackName` varchar(255) NOT NULL,
  `SnackPrice` int(11) NOT NULL,
  PRIMARY KEY (`SnackName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `snacks`
--

LOCK TABLES `snacks` WRITE;
/*!40000 ALTER TABLE `snacks` DISABLE KEYS */;
INSERT INTO `snacks` VALUES ('Bottled Water',25),('Burger',60),('Burger+A Drink',180),('Buttered',185),('Caramel',200),('Cheese&Mayo',210),('Cold Coffee',150),('French Fries',90),('Hot Chocolate',125),('Hot Coffee',150),('Hot Dog',69),('Hot Dog+A Drink',175),('Iced Tea',90),('Nachos',100),('Nachos+A Drink',225),('Pizza',150),('Pizza+A Drink',260),('Plain',175),('Popcorn+A Drink',320),('Salted',180),('Sandwich',50),('Sandwich+A Drink',160),('Soft Drinks',150),('Tomato',190);
/*!40000 ALTER TABLE `snacks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `snacktally`
--

DROP TABLE IF EXISTS `snacktally`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `snacktally` (
  `CustId` varchar(100) DEFAULT NULL,
  `SnackName` varchar(30) DEFAULT NULL,
  `Size` varchar(1) NOT NULL,
  `MovieId` int(11) NOT NULL,
  `Qty` int(11) NOT NULL,
  `ShowId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `snacktally`
--

LOCK TABLES `snacktally` WRITE;
/*!40000 ALTER TABLE `snacktally` DISABLE KEYS */;
INSERT INTO `snacktally` VALUES ('1','Buttered','M',1,1,1),('MannanGoyal','Hot Coffee','M',2,1,507022),('MannanGoyal','Cold Coffee','L',2,1,507022),('MannanGoyal','Popcorn+A Drink','S',2,1,507022),('MannanGoyal','Hot Chocolate','M',2,1,507022),('MannanGoyal','French Fries','L',2,1,507022),('MannanGoyal','Pizza+A Drink','M',1,1,1302021),('MannanGoyal','Sandwich+A Drink','M',2,1,2203012),('MannanGoyal','Caramel','M',1,4,1203011),('MannanGoyal','Pizza+A Drink','M',1,3,2203011),('MannanGoyal','Pizza+A Drink','M',3,1,2321023),('a','Pizza','S',1,1,1101011),('a','Cold Coffee','M',1,1,1101011),('MannanGoyal','Burger','M',1,4,3204011),('MannanGoyal','Hot Chocolate','L',1,4,3204011),('MannanGoyal','Popcorn+A Drink','S',1,4,3204011);
/*!40000 ALTER TABLE `snacktally` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `temp`
--

DROP TABLE IF EXISTS `temp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `temp` (
  `CustUsername` varchar(30) DEFAULT NULL,
  `ShowId` int(11) DEFAULT NULL,
  `MovieId` int(11) DEFAULT NULL,
  `MovieName` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `temp`
--

LOCK TABLES `temp` WRITE;
/*!40000 ALTER TABLE `temp` DISABLE KEYS */;
INSERT INTO `temp` VALUES ('JohnDoe',NULL,NULL,NULL);
/*!40000 ALTER TABLE `temp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tickets`
--

DROP TABLE IF EXISTS `tickets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tickets` (
  `CustUsername` varchar(100) DEFAULT NULL,
  `ShowId` int(11) DEFAULT NULL,
  `SeatNo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tickets`
--

LOCK TABLES `tickets` WRITE;
/*!40000 ALTER TABLE `tickets` DISABLE KEYS */;
INSERT INTO `tickets` VALUES ('',402031,2),('',402031,6),('',402031,49),('',402031,95),('',422022,48),('',330031,36),('',330031,37),('',415022,35),('',415022,36),('',525022,33),('',525022,79),(' MannanGoyal',402021,61),(' MannanGoyal',402021,68),('MannanGoyal',606022,37),('MannanGoyal',606022,47),('MannanGoyal',606022,49),('MannanGoyal',606022,65),('MannanGoyal',403022,33),('MannanGoyal',403022,35),('MannanGoyal',403022,36),('MannanGoyal',304021,35),('MannanGoyal',507022,19),('MannanGoyal',1302021,35),('MannanGoyal',1302021,36),('MannanGoyal',2203012,33),('MannanGoyal',2203012,37),('MannanGoyal',1203011,25),('MannanGoyal',1203011,26),('MannanGoyal',2203011,35),('MannanGoyal',2203011,36),('MannanGoyal',2321023,36),('MannanGoyal',2321023,37),('a',1201021,35),('a',1201021,36),('a',1208031,51),('a',1101011,21),('a',1404023,23),('a',1404023,65),('MannanGoyal',3204011,36),('MannanGoyal',3204011,37);
/*!40000 ALTER TABLE `tickets` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-10 15:21:07

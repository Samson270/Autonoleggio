-- MySQL dump 10.13  Distrib 8.0.34, for macos13 (arm64)
--
-- Host: localhost    Database: db_autonoleggio
-- ------------------------------------------------------
-- Server version	8.1.0

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
INSERT INTO `auto` VALUES (102,5200,'Lamborghini','Gallardo',410,1000,'XD111LL','La Gallardo RWD adotta la tecnologia tipica delle sportive “classiche”: un motore estremamente potente abbinato alla trazione posteriore con un sistema ESP sviluppato specificatamente per le due ruote motrici.\nUna soluzione assolutamente insolita per una Lamborghini e perfetta per chi ama il divertimento ed emozioni forti.','assets/lamborghiniGallardo.jpg'),(103,4000,'Lamborghini','Urus',650,900,'XD121LL','La Lamborghini Urus ospita sotto al cofano un motore V8 biturbo da 4,0 litri, capace di 650 CV e 850 Nm di coppia già a 2250 giri/min in grado di garantire uno scatto da 0 a 100 km/h in 3,6 secondi e una velocità massima di 305 km/h.','assets/lamborghiniUrus.jpg'),(152,3900,'Ferrari','Portofino',620,1000,'XD124LL','Con i suoi 600 cv e accelerazioni da 0 a 100 km/h in soli 3,5 secondi, la Ferrari Portofino è, infatti, la più potente convertibile a offrire contemporaneamente il tetto rigido retrattile, un baule capiente e una grande abitabilità, arricchita da due posti posteriori utilizzabili per brevi percorrenze.','assets/ferrariPortofino.jpg'),(202,4499,'Ferrari','458 Italia',416,850,'XD125LL','La Ferrari 458 è un\'autovettura sportiva con carrozzeria di tipo berlinetta costruita dalla casa automobilistica italiana Ferrari dal 2009 al 2015. La Ferrari 458 Italia è lunga 4527 mm per 1937 mm di larghezza e 1213 mm di altezza con un passo di 2650 mm, dimensioni che la rendono la più piccola delle vetture prodotte dalla casa di Maranello.','assets/ferrari458Italia.jpg'),(203,3,'Porsche','911',525,550,'XD126LL','È la nuova Porsche Carrera 911, un’auto per pochi, in grado di arrivare ad una velocità di punta di 308 km/h. Ma il punto non è soltanto la velocità, l’accelerazione, la potenza del motore. È anche la sinuosità della nuova Porsche 911 Carrera. Il design maturo e moderno abbraccia lo stile ereditato dalle precedenti generazioni e guarda ammiccando ad un presente che è già futuro.','assets/porsche911.jpg'),(204,3,'Ferrari','Roma',620,1000,'XD127LL','Sotto una carrozzeria dalle forme slanciate, ispirata a quella delle sportive degli anni 60, si cela una moderna (basta dare un’occhiata al cruscotto digitale di 16”) e raffinata granturismo destinata a chi vuole una sportiva di Maranello un po’ fuori dagli schemi e meno estrema rispetto alle berlinette con motore posteriore centrale. La FERRARI ROMA cela il suo potente V8 (ben 620 cavalli) sotto il lungo cofano, mentre la trazione è, ovviamente, posteriore.','assets/ferrariRoma.jpg'),(205,3902,'Ferrari','F8',530,1300,'XD128LL','La Ferrari F8 Tributo è la massima espressione della sportività, con un V8 biturbo da ben 721 CV e raffinate soluzioni aerodinamiche e di controllo della dinamica. Ma su strada sa anche lasciarsi domare.','assets/ferrariF8.jpg'),(206,6,'Lamborghini','Aventador',515,1500,'XD129LL','Questa biposto da 700 cavalli esprime cattiveria da ogni spigolo della sua carrozzeria di alluminio e fibra di carbonio. Ma, nella guida rasoterra, che regala emozioni forti, risulta più “facile” di quanto il suo aspetto lasci intuire. E il ruggito del motore a dodici cilindri è di quelli che non si dimenticano.','assets/lamborghiniAventador.jpg'),(207,2143,'Mercedes','GLA 200',100,150,'XD130LL','La crossover tedesca ha un aspetto dinamico e nella guida si rivela svelta e piacevole. Di linea aggressiva e personale, compatta (442 cm di lunghezza) Mercedes GLA assomiglia quasi più a una berlina sportiva che a una suv: può essere vista come un’alternativa alla Classe A (con cui condivide la meccanica) da chi desidera una vettura dinamica nell’aspetto ed efficace nella guida, ma più spaziosa.','assets/mercedesGla200.jpg'),(208,1995,'BMW','320',140,170,'XD131LL','Fin dall’ormai lontano 1975, la BMW Serie 3 rappresenta la berlina media di riferimento per tutti coloro che sono alla ricerca di una vettura premium, ma che dietro camicia e cravatta nascondono un’indole sportiva. Vuoi per la trazione posteriore, per l’attenta calibratura dell’assetto o per la buona ripartizione dei pesi, la BMW Serie 3 è sempre stata una fedele compagna di tutti colore che, tra una riunione e l’altra, intendono togliersi qualche sfizio su una strada tutta curve.','assets/bmw320.jpg'),(209,2979,'Maserati','Ghibli',243,850,'XD132LL','La Maserati Ghibli è una berlina di gran classe, che allo stile aggressivo unisce un carattere da vera sportiva: agile nonostante le dimensioni imponenti, conta su un vigoroso 3.0 diesel (275 CV) valorizzato dal cambio automatico sequenziale ZF a 8 marce.','assets/maseratiGhibli.jpg'),(210,2,'Audi','A5',331,200,'XD133LL','L\'audi A5 è una “quasi berlina” a cinque porte, di impostazione sportiva: la linea è molto filante, e sottolineata dalle profonde nervature che corrono lungo la fiancata, ma al bagagliaio si accede comodamente attraverso un esteso portellone. Omologata per trasportare anche cinque persone, ha un abitacolo assai curato ed è spaziosa.','assets/audiA5.jpg'),(211,999,'Volkswagen','Golf',81,80,'XD134LL','Volkswagen Golf è una vettura del segmento C, punto di riferimento tra le medie a due volumi nel mercato europeo. Gli interni sono da sempre un fiore all’occhiello ed i suoi progettisti tedeschi: design sobrio e moderno, materiali di elevata qualità ed tecnologia infotainment all’avanguardia creano un ambiente raffinato ed accogliente. Lo spazio è sufficiente per cinque adulti, il bagagliaio generoso e ben sfruttabile.','assets/volkswagenGolf.jpg'),(212,1,'Audi','Q3',110,180,'XD135LL','L\'Audi Q3 è un SUV compatto prodotto dalla casa automobilistica tedesca Audi. È il 3° modello della serie \"Q\", più compatto delle Audi Q5 e Q7. Conserva lo stesso stile delle altre Audi ed è stata presentata nel 2011. Un\'auto elegante, sportiva e comoda allo stesso tempo.','assets/audiQ3.jpg'),(213,1,'Peugeot','208',74,50,'XD136LL','La Peugeot 208 è una piccola a cinque porte. Caratterizzata da forme morbide, ma non priva di aggressività per via del disegno particolare di luci e mascherina, ha interni personali e ben rifiniti. Lo spazio per le persone e i bagagli è discreto, come pure l\'accessibilità.','assets/peugeot208.jpg'),(214,1,'','2008',96,70,'XD112LL','La Peugeot 2008 è una crossover medio-piccola costruita sulla stessa base dell\'utilitaria 208. Caratterizzata da forme scolpite e aggressive, con vistose luci diurne anteriori composte da tre strisce a led affiancate, ha interni moderni, personali e ben rifiniti. La posizione di guida è quella di tutte le Peugeot recenti, con il volante piccolo e posto in basso, per leggere il cruscotto sopra la corona; cosa che però si ottiene solo restando piuttosto vicini alla plancia.','assets/peugeot2008.jpg'),(215,1,'Citroen','C3',61,50,'XD115LL','La Citroen C3 è un\'utilitaria personale, dalle forme tondeggianti e con il tipico frontale dei modelli più recenti della casa francese, con le luci su tre livelli e la mascherina posta in alto e molto sottile. Lo spazio è buono per le persone e discreto per i bagagli, la guida è di buon livello.','assets/citroenC3.jpg'),(216,1,'Citroen','C4',75,60,'XD116LL','La Citroen C4 può essere classificata fra le crossover. Ha il tetto ad arco, come le più filanti berline a cinque porte, ma d\'altro canto le ruote grandi. Tanto spazio, sedili comodi, sospensioni morbide e insonorizzazione curata: è un\'auto comoda. ','assets/citroenC4.jpg'),(217,1400,'Citroen','C2',60,40,'XD118LL','La Citroen C2 è una piccola autovettura, economica e perfetta per muoversi con agilità tra le vie cittadine.','assets/citroenC2.jpg'),(218,1,'Peugeot','3008',96,80,'XD114LL','Crossover media moderna e di forte personalità, la Peugeot 3008 ha un possente frontale con mascherina a piccoli listelli di lunghezza variabile che incorpora i fari. Sottili led che scendono quasi in verticale caratterizzano ulteriormente il frontale. ','assets/peugeot3008.jpg'),(219,999,'Fiat','500',52,50,'XD190LL','A tanti anni dalla nascita, la Fiat 500 mantiene un aspetto unico e intramontabile. Pratica, comoda e affidabile, perfetta per sfrecciare tra le vie del centro con stile.','assets/fiat500.jpg');
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

-- Dump completed on 2023-10-27 14:48:26

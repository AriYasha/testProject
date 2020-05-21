CREATE DATABASE  IF NOT EXISTS `mixmind` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `mixmind`;
-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: mixmind
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `geoip`
--

DROP TABLE IF EXISTS `geoip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `geoip` (
  `geoname_id` int(11) NOT NULL,
  `locale_code` varchar(45) DEFAULT NULL,
  `continent_code` varchar(45) DEFAULT NULL,
  `continent_name` varchar(45) DEFAULT NULL,
  `country_iso_code` varchar(45) DEFAULT NULL,
  `country_name` varchar(45) DEFAULT NULL,
  `is_in_european_union` int(11) DEFAULT NULL,
  `id_country` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_country`),
  UNIQUE KEY `geoname_id_UNIQUE` (`geoname_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `geoip`
--

LOCK TABLES `geoip` WRITE;
/*!40000 ALTER TABLE `geoip` DISABLE KEYS */;
INSERT INTO `geoip` VALUES (49518,'en','AF','Africa','RW','Rwanda',0,1),(51537,'en','AF','Africa','SO','Somalia',0,2),(69543,'en','AS','Asia','YE','Yemen',0,3),(99237,'en','AS','Asia','IQ','Iraq',0,4),(102358,'en','AS','Asia','SA','Saudi Arabia',0,5),(130758,'en','AS','Asia','IR','Iran',0,6),(146669,'en','EU','Europe','CY','Cyprus',1,7),(149590,'en','AF','Africa','TZ','Tanzania',0,8),(163843,'en','AS','Asia','SY','Syria',0,9),(174982,'en','AS','Asia','AM','Armenia',0,10),(192950,'en','AF','Africa','KE','Kenya',0,11),(203312,'en','AF','Africa','CD','DR Congo',0,12),(223816,'en','AF','Africa','DJ','Djibouti',0,13),(226074,'en','AF','Africa','UG','Uganda',0,14),(239880,'en','AF','Africa','CF','Central African Republic',0,15),(241170,'en','AF','Africa','SC','Seychelles',0,16),(248816,'en','AS','Asia','JO','Hashemite Kingdom of Jordan',0,17),(272103,'en','AS','Asia','LB','Lebanon',0,18),(285570,'en','AS','Asia','KW','Kuwait',0,19),(286963,'en','AS','Asia','OM','Oman',0,20),(289688,'en','AS','Asia','QA','Qatar',0,21),(290291,'en','AS','Asia','BH','Bahrain',0,22),(290557,'en','AS','Asia','AE','United Arab Emirates',0,23),(294640,'en','AS','Asia','IL','Israel',0,24),(298795,'en','AS','Asia','TR','Turkey',0,25),(337996,'en','AF','Africa','ET','Ethiopia',0,26),(338010,'en','AF','Africa','ER','Eritrea',0,27),(357994,'en','AF','Africa','EG','Egypt',0,28),(366755,'en','AF','Africa','SD','Sudan',0,29),(390903,'en','EU','Europe','GR','Greece',1,30),(433561,'en','AF','Africa','BI','Burundi',0,31),(453733,'en','EU','Europe','EE','Estonia',1,32),(458258,'en','EU','Europe','LV','Latvia',1,33),(587116,'en','AS','Asia','AZ','Azerbaijan',0,34),(597427,'en','EU','Europe','LT','Republic of Lithuania',1,35),(607072,'en','EU','Europe','SJ','Svalbard and Jan Mayen',0,36),(614540,'en','AS','Asia','GE','Georgia',0,37),(617790,'en','EU','Europe','MD','Republic of Moldova',0,38),(630336,'en','EU','Europe','BY','Belarus',0,39),(660013,'en','EU','Europe','FI','Finland',1,40),(661882,'en','EU','Europe','AX','Aland',1,41),(690791,'en','EU','Europe','UA','Ukraine',0,42),(718075,'en','EU','Europe','MK','North Macedonia',0,43),(719819,'en','EU','Europe','HU','Hungary',1,44),(732800,'en','EU','Europe','BG','Bulgaria',1,45),(783754,'en','EU','Europe','AL','Albania',0,46),(798544,'en','EU','Europe','PL','Poland',1,47),(798549,'en','EU','Europe','RO','Romania',1,48),(831053,'en','EU','Europe','XK','Kosovo',0,49),(878675,'en','AF','Africa','ZW','Zimbabwe',0,50),(895949,'en','AF','Africa','ZM','Zambia',0,51),(921929,'en','AF','Africa','KM','Comoros',0,52),(927384,'en','AF','Africa','MW','Malawi',0,53),(932692,'en','AF','Africa','LS','Lesotho',0,54),(933860,'en','AF','Africa','BW','Botswana',0,55),(934292,'en','AF','Africa','MU','Mauritius',0,56),(934841,'en','AF','Africa','SZ','Eswatini',0,57),(935317,'en','AF','Africa','RE','Réunion',1,58),(953987,'en','AF','Africa','ZA','South Africa',0,59),(1024031,'en','AF','Africa','YT','Mayotte',1,60),(1036973,'en','AF','Africa','MZ','Mozambique',0,61),(1062947,'en','AF','Africa','MG','Madagascar',0,62),(1149361,'en','AS','Asia','AF','Afghanistan',0,63),(1168579,'en','AS','Asia','PK','Pakistan',0,64),(1210997,'en','AS','Asia','BD','Bangladesh',0,65),(1218197,'en','AS','Asia','TM','Turkmenistan',0,66),(1220409,'en','AS','Asia','TJ','Tajikistan',0,67),(1227603,'en','AS','Asia','LK','Sri Lanka',0,68),(1252634,'en','AS','Asia','BT','Bhutan',0,69),(1269750,'en','AS','Asia','IN','India',0,70),(1282028,'en','AS','Asia','MV','Maldives',0,71),(1282588,'en','AS','Asia','IO','British Indian Ocean Territory',0,72),(1282988,'en','AS','Asia','NP','Nepal',0,73),(1327865,'en','AS','Asia','MM','Myanmar',0,74),(1512440,'en','AS','Asia','UZ','Uzbekistan',0,75),(1522867,'en','AS','Asia','KZ','Kazakhstan',0,76),(1527747,'en','AS','Asia','KG','Kyrgyzstan',0,77),(1546748,'en','AN','Antarctica','TF','French Southern Territories',0,78),(1547314,'en','AN','Antarctica','HM','Heard Island and McDonald Islands',0,79),(1547376,'en','AS','Asia','CC','Cocos [Keeling] Islands',0,80),(1559582,'en','OC','Oceania','PW','Palau',0,81),(1562822,'en','AS','Asia','VN','Vietnam',0,82),(1605651,'en','AS','Asia','TH','Thailand',0,83),(1643084,'en','AS','Asia','ID','Indonesia',0,84),(1655842,'en','AS','Asia','LA','Laos',0,85),(1668284,'en','AS','Asia','TW','Taiwan',0,86),(1694008,'en','AS','Asia','PH','Philippines',0,87),(1733045,'en','AS','Asia','MY','Malaysia',0,88),(1814991,'en','AS','Asia','CN','China',0,89),(1819730,'en','AS','Asia','HK','Hong Kong',0,90),(1820814,'en','AS','Asia','BN','Brunei',0,91),(1821275,'en','AS','Asia','MO','Macao',0,92),(1831722,'en','AS','Asia','KH','Cambodia',0,93),(1835841,'en','AS','Asia','KR','South Korea',0,94),(1861060,'en','AS','Asia','JP','Japan',0,95),(1873107,'en','AS','Asia','KP','North Korea',0,96),(1880251,'en','AS','Asia','SG','Singapore',0,97),(1899402,'en','OC','Oceania','CK','Cook Islands',0,98),(1966436,'en','OC','Oceania','TL','East Timor',0,99),(2017370,'en','EU','Europe','RU','Russia',0,100),(2029969,'en','AS','Asia','MN','Mongolia',0,101),(2077456,'en','OC','Oceania','AU','Australia',0,102),(2078138,'en','OC','Oceania','CX','Christmas Island',0,103),(2080185,'en','OC','Oceania','MH','Marshall Islands',0,104),(2081918,'en','OC','Oceania','FM','Federated States of Micronesia',0,105),(2088628,'en','OC','Oceania','PG','Papua New Guinea',0,106),(2103350,'en','OC','Oceania','SB','Solomon Islands',0,107),(2110297,'en','OC','Oceania','TV','Tuvalu',0,108),(2110425,'en','OC','Oceania','NR','Nauru',0,109),(2134431,'en','OC','Oceania','VU','Vanuatu',0,110),(2139685,'en','OC','Oceania','NC','New Caledonia',0,111),(2155115,'en','OC','Oceania','NF','Norfolk Island',0,112),(2186224,'en','OC','Oceania','NZ','New Zealand',0,113),(2205218,'en','OC','Oceania','FJ','Fiji',0,114),(2215636,'en','AF','Africa','LY','Libya',0,115),(2233387,'en','AF','Africa','CM','Cameroon',0,116),(2245662,'en','AF','Africa','SN','Senegal',0,117),(2260494,'en','AF','Africa','CG','Congo Republic',0,118),(2264397,'en','EU','Europe','PT','Portugal',1,119),(2275384,'en','AF','Africa','LR','Liberia',0,120),(2287781,'en','AF','Africa','CI','Ivory Coast',0,121),(2300660,'en','AF','Africa','GH','Ghana',0,122),(2309096,'en','AF','Africa','GQ','Equatorial Guinea',0,123),(2328926,'en','AF','Africa','NG','Nigeria',0,124),(2361809,'en','AF','Africa','BF','Burkina Faso',0,125),(2363686,'en','AF','Africa','TG','Togo',0,126),(2372248,'en','AF','Africa','GW','Guinea-Bissau',0,127),(2378080,'en','AF','Africa','MR','Mauritania',0,128),(2395170,'en','AF','Africa','BJ','Benin',0,129),(2400553,'en','AF','Africa','GA','Gabon',0,130),(2403846,'en','AF','Africa','SL','Sierra Leone',0,131),(2410758,'en','AF','Africa','ST','São Tomé and Príncipe',0,132),(2411586,'en','EU','Europe','GI','Gibraltar',1,133),(2413451,'en','AF','Africa','GM','Gambia',0,134),(2420477,'en','AF','Africa','GN','Guinea',0,135),(2434508,'en','AF','Africa','TD','Chad',0,136),(2440476,'en','AF','Africa','NE','Niger',0,137),(2453866,'en','AF','Africa','ML','Mali',0,138),(2461445,'en','AF','Africa','EH','Western Sahara',0,139),(2464461,'en','AF','Africa','TN','Tunisia',0,140),(2510769,'en','EU','Europe','ES','Spain',1,141),(2542007,'en','AF','Africa','MA','Morocco',0,142),(2562770,'en','EU','Europe','MT','Malta',1,143),(2589581,'en','AF','Africa','DZ','Algeria',0,144),(2622320,'en','EU','Europe','FO','Faroe Islands',0,145),(2623032,'en','EU','Europe','DK','Denmark',1,146),(2629691,'en','EU','Europe','IS','Iceland',0,147),(2635167,'en','EU','Europe','GB','United Kingdom',1,148),(2658434,'en','EU','Europe','CH','Switzerland',0,149),(2661886,'en','EU','Europe','SE','Sweden',1,150),(2750405,'en','EU','Europe','NL','Netherlands',1,151),(2782113,'en','EU','Europe','AT','Austria',1,152),(2802361,'en','EU','Europe','BE','Belgium',1,153),(2921044,'en','EU','Europe','DE','Germany',1,154),(2960313,'en','EU','Europe','LU','Luxembourg',1,155),(2963597,'en','EU','Europe','IE','Ireland',1,156),(2993457,'en','EU','Europe','MC','Monaco',0,157),(3017382,'en','EU','Europe','FR','France',1,158),(3041565,'en','EU','Europe','AD','Andorra',0,159),(3042058,'en','EU','Europe','LI','Liechtenstein',0,160),(3042142,'en','EU','Europe','JE','Jersey',0,161),(3042225,'en','EU','Europe','IM','Isle of Man',0,162),(3042362,'en','EU','Europe','GG','Guernsey',0,163),(3057568,'en','EU','Europe','SK','Slovakia',1,164),(3077311,'en','EU','Europe','CZ','Czechia',1,165),(3144096,'en','EU','Europe','NO','Norway',0,166),(3164670,'en','EU','Europe','VA','Vatican City',0,167),(3168068,'en','EU','Europe','SM','San Marino',0,168),(3175395,'en','EU','Europe','IT','Italy',1,169),(3190538,'en','EU','Europe','SI','Slovenia',1,170),(3194884,'en','EU','Europe','ME','Montenegro',0,171),(3202326,'en','EU','Europe','HR','Croatia',1,172),(3277605,'en','EU','Europe','BA','Bosnia and Herzegovina',0,173),(3351879,'en','AF','Africa','AO','Angola',0,174),(3355338,'en','AF','Africa','NA','Namibia',0,175),(3370751,'en','AF','Africa','SH','Saint Helena',0,176),(3371123,'en','AN','Antarctica','BV','Bouvet Island',0,177),(3374084,'en','NA','North America','BB','Barbados',0,178),(3374766,'en','AF','Africa','CV','Cabo Verde',0,179),(3378535,'en','SA','South America','GY','Guyana',0,180),(3381670,'en','SA','South America','GF','French Guiana',1,181),(3382998,'en','SA','South America','SR','Suriname',0,182),(3424932,'en','NA','North America','PM','Saint Pierre and Miquelon',0,183),(3425505,'en','NA','North America','GL','Greenland',0,184),(3437598,'en','SA','South America','PY','Paraguay',0,185),(3439705,'en','SA','South America','UY','Uruguay',0,186),(3469034,'en','SA','South America','BR','Brazil',0,187),(3474414,'en','SA','South America','FK','Falkland Islands',0,188),(3474415,'en','AN','Antarctica','GS','South Georgia and the South Sandwich Islands',0,189),(3489940,'en','NA','North America','JM','Jamaica',0,190),(3508796,'en','NA','North America','DO','Dominican Republic',0,191),(3562981,'en','NA','North America','CU','Cuba',0,192),(3570311,'en','NA','North America','MQ','Martinique',1,193),(3572887,'en','NA','North America','BS','Bahamas',0,194),(3573345,'en','NA','North America','BM','Bermuda',0,195),(3573511,'en','NA','North America','AI','Anguilla',0,196),(3573591,'en','NA','North America','TT','Trinidad and Tobago',0,197),(3575174,'en','NA','North America','KN','St Kitts and Nevis',0,198),(3575830,'en','NA','North America','DM','Dominica',0,199),(3576396,'en','NA','North America','AG','Antigua and Barbuda',0,200),(3576468,'en','NA','North America','LC','Saint Lucia',0,201),(3576916,'en','NA','North America','TC','Turks and Caicos Islands',0,202),(3577279,'en','NA','North America','AW','Aruba',0,203),(3577718,'en','NA','North America','VG','British Virgin Islands',0,204),(3577815,'en','NA','North America','VC','Saint Vincent and the Grenadines',0,205),(3578097,'en','NA','North America','MS','Montserrat',0,206),(3578421,'en','NA','North America','MF','Saint Martin',1,207),(3578476,'en','NA','North America','BL','Saint Barthélemy',0,208),(3579143,'en','NA','North America','GP','Guadeloupe',1,209),(3580239,'en','NA','North America','GD','Grenada',0,210),(3580718,'en','NA','North America','KY','Cayman Islands',0,211),(3582678,'en','NA','North America','BZ','Belize',0,212),(3585968,'en','NA','North America','SV','El Salvador',0,213),(3595528,'en','NA','North America','GT','Guatemala',0,214),(3608932,'en','NA','North America','HN','Honduras',0,215),(3617476,'en','NA','North America','NI','Nicaragua',0,216),(3624060,'en','NA','North America','CR','Costa Rica',0,217),(3625428,'en','SA','South America','VE','Venezuela',0,218),(3658394,'en','SA','South America','EC','Ecuador',0,219),(3686110,'en','SA','South America','CO','Colombia',0,220),(3703430,'en','NA','North America','PA','Panama',0,221),(3723988,'en','NA','North America','HT','Haiti',0,222),(3865483,'en','SA','South America','AR','Argentina',0,223),(3895114,'en','SA','South America','CL','Chile',0,224),(3923057,'en','SA','South America','BO','Bolivia',0,225),(3932488,'en','SA','South America','PE','Peru',0,226),(3996063,'en','NA','North America','MX','Mexico',0,227),(4030656,'en','OC','Oceania','PF','French Polynesia',0,228),(4030699,'en','OC','Oceania','PN','Pitcairn Islands',0,229),(4030945,'en','OC','Oceania','KI','Kiribati',0,230),(4031074,'en','OC','Oceania','TK','Tokelau',0,231),(4032283,'en','OC','Oceania','TO','Tonga',0,232),(4034749,'en','OC','Oceania','WF','Wallis and Futuna',0,233),(4034894,'en','OC','Oceania','WS','Samoa',0,234),(4036232,'en','OC','Oceania','NU','Niue',0,235),(4041468,'en','OC','Oceania','MP','Northern Mariana Islands',0,236),(4043988,'en','OC','Oceania','GU','Guam',0,237),(4566966,'en','NA','North America','PR','Puerto Rico',0,238),(4796775,'en','NA','North America','VI','U.S. Virgin Islands',0,239),(5854968,'en','OC','Oceania','UM','U.S. Minor Outlying Islands',0,240),(5880801,'en','OC','Oceania','AS','American Samoa',0,241),(6251999,'en','NA','North America','CA','Canada',0,242),(6252001,'en','NA','North America','US','United States',0,243),(6254930,'en','AS','Asia','PS','Palestine',0,244),(6255147,'en','AS','Asia','','',0,245),(6255148,'en','EU','Europe','','',0,246),(6290252,'en','EU','Europe','RS','Serbia',0,247),(6697173,'en','AN','Antarctica','AQ','Antarctica',0,248),(7609695,'en','NA','North America','SX','Sint Maarten',0,249),(7626836,'en','NA','North America','CW','Curaçao',0,250),(7626844,'en','NA','North America','BQ','Bonaire, Sint Eustatius, and Saba',0,251),(7909807,'en','AF','Africa','SS','South Sudan',0,252);
/*!40000 ALTER TABLE `geoip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rooms`
--

DROP TABLE IF EXISTS `rooms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `rooms` (
  `idRoom` int(11) NOT NULL AUTO_INCREMENT,
  `roomName` varchar(45) NOT NULL,
  `idCountry` int(11) NOT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`idRoom`),
  UNIQUE KEY `idRoom_UNIQUE` (`idRoom`),
  KEY `idCountry_idx` (`idCountry`),
  CONSTRAINT `idCountry` FOREIGN KEY (`idCountry`) REFERENCES `geoip` (`id_country`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rooms`
--

LOCK TABLES `rooms` WRITE;
/*!40000 ALTER TABLE `rooms` DISABLE KEYS */;
INSERT INTO `rooms` VALUES (49,'sun',4,0),(50,'',1,0),(51,'1234',1,0),(52,'1234',39,0),(53,'spring',39,1),(54,'winter',39,1),(55,'summer',39,0),(56,'autumn',39,0),(57,'moon',39,0),(58,' bonya',1,0),(59,'karina',39,0),(60,'lesya',39,0),(61,'hello',39,0);
/*!40000 ALTER TABLE `rooms` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-21 20:30:41

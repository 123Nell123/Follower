
CREATE TABLE IF NOT EXISTS `clients` (
  `Idclient` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) NOT NULL DEFAULT '',
  `prenom` varchar(30) NOT NULL DEFAULT '',
  `email` varchar(30) DEFAULT NULL,
  `adresse` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`Idclient`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `utilisateurs`
--

INSERT INTO `clients` (`nom`, `prenom`, `email`, `adresse`) VALUES
('MBIANDOU', 'Douglas', 'douglas.mbiandou@objis.com', 'Lyon');


CREATE TABLE IF NOT EXISTS `conseillers` (
  `Idconseiller` int(10) NOT NULL AUTO_INCREMENT,
  `login` varchar(25) NOT NULL DEFAULT '',
  `password` varchar(10) NOT NULL DEFAULT '',
  `nom` varchar(30) NOT NULL DEFAULT '',
  `prenom` varchar(30) NOT NULL DEFAULT '',
  `email` varchar(30) DEFAULT NULL,
  `adresse` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`Idconseiller`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `conseillers` (`login`, `password`, `nom`, `prenom`) VALUES
('Alex', 'Alex', 'Chadeneau', 'Alexandre');


CREATE TABLE IF NOT EXISTS `investissements` (
 `Idinvestissement` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) NOT NULL DEFAULT '',
  `descriptif` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`Idinvestissement`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `investissements` (`nom`,`descriptif`) VALUES
('parking', 'truc tout moche a paris');


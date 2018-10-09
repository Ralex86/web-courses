# Introduction a JEE (Java Entreprise Edition)

developpement dapplication web

architecures client/serveur

- centralisation des donnees
- facilite dadministration
- client lourd: application plutot du cote du client
- client leger: application plutot du cote serveur

## differents types darchitectures C/S

n-tiers: client <=> n serveurs dapplication (architecture _distribuee_) <=> n serveurs de base de donnees
3-tiers: client <=> 1 serveur dapplication <=> 1 serveur de base de donnees
2-tiers: client <=> 1 serveur

sil y a communication entre les serveurs de base de donnes on parle de base de donnees _reparties_

avec JEE on a l'habitude de travailler avec des architecutres _distribuee_ et _reparties_

## architecture Mainframe

architecture C/S
serveur lourd/client leger, les serveurs sont robustes, fiabilites et supporte _la montée en charge_

# Presentation de JEE

JEE definit un ensemble de standards eou de normes, decrivant des services
Dans ce cours on se concentre sur la partie métier

# Objectifs de JEE

- disponibilite: haute disponibilite des composants => qualite de service
- evolutivite: facilite de montee en charge
- maintenabilite: independances des modules qui permet la maintenace et assure une rapidite de correction

developper des modules independant les uns des autres
respecter les mm normes

## architecture JEE

|                       | Serveur dapplication    |                      |                       |
| --------------------- | ----------------------- | -------------------- | --------------------- |
| navigateur internet   | JSP Servlets            | JTA                  | Annuaire              |
|                       | Conteneur Web           | JPA                  | SGBD                  |
|                       | Serveur internet        | JDBC                 |                       |
|                       |                         | JNDI                 |                       |
|                       |                         | JMS                  |                       |
| --------------------- | ----------------------- | -------------------- | --------------------- |
| --------------------- | ----------------------- | -------------------- | --------------------- |
| applications Java     | EJB entite              |
|                       | EJB session             |
|                       | EJB message             |
|                       | Conteneur dEJBS         |

JSP: Java => du Html
Servlets intercepte une requete HTTP
le servlet joue le role de _controller_

rappel
M: Objets metiers qui interagissent avec la base de donnees
V: JSP
C: Servlet

Ejv = objet metier quon acced a distance
api = application programming interface
interface = ensemble de methodes auquel on acces en tant que developpeur a acces mais on ne sait pas comment elles sont programmees derriere
annuaire = permet aussi de stocker une base de donnee, stocke avec des arbres avec des noeuds ex: annuaire LDAP (utilisateurs, groupes, login)
ex: informations sur les serveurs de manieres hierarchiques
SGBD = stocke dans des tables

## conteneurs et composants

il y a des conteneurs, composants et connecteurs
en tant que developpeur on se concentrera sur les composants

### composants web

les servlets: code java avec du html au milieu

### composants web

les jsp

### composants metiers

les composants metier de JEE sont les EJBS (Entreprise Java Bean)
EJB standardise:

- fournit des services
- dispose dinterface

### Conteneur web

execute le JSP

- web container
- un applet container: petit morceau dapplication qui tourne du cote client
  petit programme java qui necessite une machine Java, qui supporte Java dans le navigateur

### Connecteurs

se connecter avec un SGBD
il faut un driver pour se connecter au SGBD (MySQL driver)

- JDBC (Java Data Base Connectivity) = interface qui permet de se connecter au SGBD
  connecteur = pilote JDBC
  on appelle les methodes de lapi JDBC

- JNDI (Java Naming Directory Interface)
  API permettant lacces a divers espaces de nommage et annuraires tels que LDAP ou DNS

- JTA (Java Transaction API)
  cest une API qui permet deffectuer des transactions
  transactions = ensembles de requetes de MAJ de bases de donnes qui fonctionnents ensemble
  ex: 2 requetes update, probleme de requetes indisociables

=> besoin de revenir en arriere = _rollback_
=> si transaction interrompue => _rollback_
=> si transaction bien effectuee => _commit_

JTA est une interface qui permet de gerer les transactions

- JPA (Java Persistence API)
  permet de gerer la persistance des donnees

notion _ORM_ = Object Relationnal Mapping (ex: Hibernate, Toplink)
carte des objets = diagramme de classe <=> modele relationnel (les tables)

- autres API: JMS, JavaMail, RMI, JAAs ...

## Avantages de JEE

- JEE est une architecture orientee metier
- architecture securisee
- architecture ouverte (dialoguer avec des clients lourds)

- architecure exploitable (montee en charge)

## Desavantages de JEE

- JEE est une architecure complexe
  la separation des couches est importante

- JEE est une archi trop ouverte
  trop dapplications qui travaillent en mm temps

=> solution: application RESTfull

## Framework

un framework est un ensemble de classe (bibliothe) ou on doit respecter un cadre
Hibernate = ORM gere la persistence
Junit = tests unitaires
Spring = application JEE

modele application avec le framework Spring
Model
Front (controller) /Service/Dao

POM = project object model utilise par loutil Mavel pr le compile (equivalent de Bible) avant deploiement
fichier XML utilise pr la compilation du projet
indique un certain nombre de dependances (les modules exterieurs au projet)

serveur TOMCAT != serveur web
= execute les servlets et les JSP

tests unitaires = permet de tester chaque classe

- les classes sont rangees dans des packages (org)
  package pour la couche service, utilitaire, web, model
  les classes metiers (DTO) => attributs, accesseurs

- repository => persistance

- controlleur web

les jsps sont dans le dossier `/webapp/WEB-inf`

ensemble de classe dans un fichier `.jar` = archive de code java

## commandes pour le serveur SGBD

```bash
mysql -u root -p
```

```sql
show databases;
```

```sql
use [table_name];
```

## exo

prof: rajouter des memos

moi: operations sur les animaux, un veterinaire soccupe dun animal

```sql
CREATE DATABASE IF NOT EXISTS petclinic;

USE petclinic;

CREATE TABLE IF NOT EXISTS vets (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(30),
  last_name VARCHAR(30),
  INDEX(last_name)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS specialties (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(80),
  INDEX(name)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS vet_specialties (
  vet_id INT(4) UNSIGNED NOT NULL,
  specialty_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (vet_id) REFERENCES vets(id),
  FOREIGN KEY (specialty_id) REFERENCES specialties(id),
  UNIQUE (vet_id,specialty_id)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS types (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(80),
  INDEX(name)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS owners (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(30),
  last_name VARCHAR(30),
  address VARCHAR(255),
  city VARCHAR(80),
  telephone VARCHAR(20),
  INDEX(last_name)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS pets (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(30),
  birth_date DATE,
  type_id INT(4) UNSIGNED NOT NULL,
  owner_id INT(4) UNSIGNED NOT NULL,
  INDEX(name),
  FOREIGN KEY (owner_id) REFERENCES owners(id),
  FOREIGN KEY (type_id) REFERENCES types(id)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS visits (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  pet_id INT(4) UNSIGNED NOT NULL,
  visit_date DATE,
  description VARCHAR(255),
  FOREIGN KEY (pet_id) REFERENCES pets(id)
) engine=InnoDB;
```

## rappel MCV merise

entite, relation, association
on lit lentite puis sa relation par rapport a une autre entite
one to one relationship: 1:1

## diagramme de classe

navigabilite = a partir dune classe on accede a une autre classe
chaque classe est une table
on met les attributs et la navigabilite dans le diagramme

un memo concerne un seul veterinaire mais un veterinaire peut avoir plusieurs memos
dans memo => navigabilite vers vet
dans vet => navigabilite vers memos

## Cardinalite

- Many to one: plusieurs memos pour un seul veterinaire
  plusieurs mos vers un seul veterinaires
  jointure se fait avec la foreign key `vet_id`
  => le mapping: comment je relie mes classes

le constructeur initialise la date

getteur et setteur

```java
    public List<Memo> getMemos() {
        List<Memo> sortedMemos = new ArrayList<Memo>(getMemosInternal());
        PropertyComparator.sort(sortedMemos, new MutableSortDefinition("date", false, false));
        return Collections.unmodifiableList(sortedMemos);
    }
```

- Many to many: pour les specialites

une operation: un animal, un veto, une date, une description
une classe operation avec attribut

### Table Operation

```sql
CREATE TABLE IF NOT EXISTS operations (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  vet_id INT(4) UNSIGNED NOT NULL,
  pet_id INT(4) UNSIGNED NOT NULL,
  operation_date DATE,
  description VARCHAR(80),
  FOREIGN KEY (vet_id) REFERENCES vets(id)
) engine=In
```

### Classe Operation

```
public class Operation extends BaseEntity{
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "vet", fetch = FetchType.EAGER)
    private Set<Operation> operations;

	protected void setOperationsInternal(Set<Operation> operations) {
        this.operations = operations;
    }

    protected Set<Operations> getOperationsInternal() {
        if (this.operations == null) {
            this.operations = new HashSet<Operation>();
        }
        return this.operations;
    }


    public List<Operation> getOperations() {
        List<Operation> sortedOperations = new ArrayList<Operation>(getOperationsInternal());
        PropertyComparator.sort(sortedOperations, new MutableSortDefinition("date", false, false));
        return Collections.unmodifiableList(sortedOperations);
    }

    public void addOperations(Operation operation) {
        getMemosInternal().add(memo);
        memo.setVet(this);
    }
}
```

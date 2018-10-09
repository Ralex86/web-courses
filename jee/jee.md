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

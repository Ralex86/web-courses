# Cours de java

classe
donnees membres attributs
fonctions membres methode et operations
comme en C++

objet = instance de classe
donnees encapsules dans des classes

envoie de message a => b
une methode de a apple de methode message de b avec prametres (x,y)
specialisation des classes = heritages
des objets de types distincs mm regroupes sous un mm type peuvent
comporter un comportement specifique => polymorphisme

## types primitifs

types primitis = int float double char boolean

```java
{
	int a = 10; // déclaration et initialisation
	a = a + b; // operation
} // la variable a nexiste plus
```

## classe

```java
public Etudiant (String n, int note1, int note2){
	nom = n;
	notes[0]=  note1;
	notes[1] = note2;
	... /// attributs
	private int[] notes;
	public String nom;
}
```

- type dun attribut : type primitif ou clase de lAPI ou classe définie par lutilisateur

### instanciation des classes I

- une variable dont le type T est une classe est une variable objet
- une variable objet nest pas un objet (en JAVA) cest une reference/pointeur soit (null) soit vers un objet de type T
- une instance de classe T (ie un objet de type T) est cree par la commande new
- lorsquun objet nest plus referencie il est detruit par un processus asynchrone le _garbage collector_
- pas de delete en java

## association

plusieurs objets peuvent collaborer pour realiser une tache

- un groupe connait tous ses etudiants pour pouvoir calculer la moyenne dans un module donné. Un etudiant connait les modules quil suit
- dans une interface une fenetre connait les elements qui la composent pour povoir se reafficher ou faire une bonne mise en page

certains objets sont donc lies certains classes sont donc _associees_
les associations ne sont pas forcements sympetriques

### association I

les associations de multiplicite 0 ou 1 se font simplement en introduisant un attribut du bon type

### association II

ecrire une methode qui calcule la masse salariale de la societe

```java
public class Societe
{
	...
	Employe[] mes_employes;
}
```

agregation de reference par opposiotn agregation de valeur

## heritage

relation dheritage => generalisation specilaisation

en java cel secrit

```class B extends A {
...
}
```

## exercice 1

compilation

```bash
javac *.java -cp ./unit-4.10.jar
java Main
java Executable
```

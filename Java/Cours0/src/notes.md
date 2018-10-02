# Notes de JEE

- une classe est un objet consitute de methodes et dattributs
- instancier une classe = on creer un objet
- encapsulation => il y a des parties prives et publics
- on protege les attributs dun objet en les mettant en _private_
- certaines methodes sont mises en _public_

un constructeur sert a instancier une classe
a chaque fois que je cree un nouvel objet jappelle le constructuur

## exemple de constructeur

```java
	// Création d'un objet "vide" (pas de valeurs dans les attributs)
	AnimalFamilier monAnimal1= new AnimalFamilier();

	// Appel des setters pour initialiser les attributs de l'objet
	monAnimal1.setAge(3);
	monAnimal1.setPoids(2);
	monAnimal1.setTaille(27);
	monAnimal1.setCouleur("Rouge");
```

## surcharge des methodes

on appelle les memes methodes mais avec des parametres differents
cela permet de specialiser des fonctions

## heritage

```java
public class Poisson extends AnimalFamilier {
   ...
    public Poisson()
    {
        super(); // appel du constructeur de la classe mere
    }
}
```

un poisson est un AninamlFamilier donc on appelle le constructeur de la classe mere
avec `super`

la classe fille est specialisee il y a un attribut profondeur

```java
    // Attribut privé
    private int profondeur;
```

heritage est aussi mis en oeuvre dans la methode `afficher`

```java
    // Méthode d'affichage de l'objet
    // Complète la méthode d'affichage de la classe mère
    public void afficher()
    {
        // Appel de la méthode afficher() de la classe mère
        super.afficher();
        System.out.println("Profondeur: "+this.profondeur);

    }
```

## polymorphisme et heritage

quand deux classes partagent des methodes qui ont le meme nom on parle de _polymorphisme_

- Redéfinition de la méthode manger(...)
- pas d'appel de la méthode manger(...) de la classe mère
- on parle de POLYMORPHISME de méthode
- c'est le type réel de l'objet qui détermine quelle méthode est appelée

```java
    public void manger()
    {
        System.out.println("J'ai si faim!!!...Donne-moi des algues!");
    }
```

## attributs protected

attributs accessibles par la classe meme et les classes filles

## Divers

- Navigabilite, UML, merise
- `arrayList` est une structure de donnee tres utilisee en Java, cest un _tableau dynamique_, sa taille est dynamique
- `hmap` est une sorte de tableau cles/valeurs

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

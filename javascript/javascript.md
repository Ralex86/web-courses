# Cours de javascript

- seul language cote client
- javascript repose sur la norme ECMAscript
- gros changement en 2015 => ECMAscript 6
- apparaition de `class` et de `extends`
- on regardera quand mm la notion de _prototype_

```html
<html>
	<head>
	<script type="application/javascript" src="
	FichierJavascript.js" async ></script > <head>
	<body></body>
</html>
```

si on ne met pas `async` larborescence html nest pas cree tant que le script nest pas charge
neanmoins on peut charger le script `.js` de maniere _asynchrone_
=> on gagne en vitesse chargement de la page html

cependant charger un script de maniere asynchrone peut poser probleme quand il y a des dependances entre les scripts

a quel moment le javascript peut il modifier le htmtl ?

nouveau mot clé : `defer` depuis html5 => respecte lordre des scripts
optimiser le chargement des scripts avec `await` et `defer`
certains navigateurs ont leur propre optimisation

> Attention a lordre dappel

## Conseils utiles

- Par convention l’extension d’un fichier est .js Si vous changez : attention au type MIME retourné par le serveur
- Possibilité de placer l’inclusion des scripts avant la balise `</body>`
- Eviter le code inline : peu maintenable, très bon système de cache des navigateurs.

## Syntaxe du js

typage des donnees non obligatoire

```javascript
var message = 'hi'; //type mis à string
message = 100; //legal mais non recommandé car le type est changé en "numeric"
var val; //type "undifined"
```

## Quelques specificites

on ne declare par explicitement le type des variables
on peut savoir le type dune variable avec `typeof`

for in

```javascript
var person = ['John', 'Doe', 25];
var x;
for (x in person) {
  alert(person[x]);
}
for (var propName in window) {
  alert(propName);
}
```

> objet javacript = agreagation dattribut ~ struct en C (Rubi)

## Functions

```javascript
function sayHi(name, message, age, ville) {
  alert('Hello ' + name + ' , ' + message + ' ' + age);
}
sayHi('Nicholas', 'how are you?');
```

ici on peut appeler la fonction seulement avec 2 parametres mm si celle ci est definie avec 4 parametres
on peut mm definir la fonction sans arguments et lui en passer quand mm
les i-arguments passes sont dans le tableau `arguments[i]`

## types primitifs et references

- Les types primitifs (undefined, null, boolean, number, string) sont atomiques et sont accédés par valeur
- Les références : objets composés de plusieurs valeurs auquelles
  on accède par référence uniquement (au sens java)

```javascript
var person = new Object();
person.name = 'Nicholas';
alert(person.name);
```

```javascript
var num1 = 5;
var num2 = num1; //valeur copiée
var obj1 = new Object();
var obj2 = obj1;
obj1.name = 'Nicholas';
alert(obj2.name); //"Nicholas"
```

> Attention ici on manipule des references
> Attention au effet de bord
> Mais Attention ! ! !. Un peu comme en C++ avec le passage par adresse. Le passage par référence est un abus de langage. C’est en fait un passage par copie de référence. Si la référence est réaffectée sur un autre objet, la référence à l’objet d’orgine est perdue.

## Les objets

Il existe plusieurs facons dinstancier un objet. Voici la plus courante

```javascript
var obj = {
attribut: "valeur",
methode: function(parametre1 , parametre2) { alert("parametres: " + parametre1 + ", " +
}
parametre2);
}
// Affichage de la valeur de attribut de obj
alert("Valeur de attribut: " + obj.attribut); // Exécution de la méthode methode de obj
obj.methode("valeur1", "valeur2");
```

la version moderne depuis ECMAscript6 on peut faire des classes

```javascript
class Person {
  //constructeur
  constructor(name) {
    this._name = name;
    this.friends = ['Seb', 'Fred'];
  }
  //  accesseur propriété
  get sayName() {
    return this._name;
  }
  // mutateur propriété
  set changeName(name) {
    this._name = name;
  }
  // méthodes
  addFriend(name) {
    this.friends.push(name);
  }
  viewFriends() {
    return this.friends;
  }
}
```

## Serveur HTTP

apache nginx ou lighttpd
nginx supporte plus de charge
apache => php
http = protocole
www.domain.com = nom de lhote
path/ressource.html = ressource demandee
URI appartient a lURL

## HTTP

ligne qui indique la methode et la page demande (requete)
code de retour (serveur)

les codes serveurs sont classes par ex code 200 = code succes

exemple de requete/reponse HTTP

> messages envoyes
> < message recues

```bash
curl http://gregwar.com/hello.txt

> GET /hello.txt HTTP/1.1
> Host: gregwar.com
>
< HTTP/1.1 200 OK
< Content-Length: 13 #metadonnes sur la reponse
< Content-Type: text/plain #format de la reponse
< # separe le header du contenu (body)
< Hello world!
```

## CGI Common Gateway Interface (normalisation)

la passarellle CGI

## PHP et HTTP

fonctionement
apache converse avec php

```php
Bonjour, il est <?php echo date('H:i:s'); ?> !
```

## variables superglobales

- `$_SERVER`: Contient les informations sur la requête _HTTP_
- `$_GET`: Variables GET
- `$_POST`: Variables POST
- `$_COOKIES`: Cookies définis
- `$_SESSION`: Données de la session

tout ce qui est suivi apres un `?` sont les donnees de `GET` qui sont stokes dans un tableau
par exemple pour les formulaires

## Donnees GET

ex: http://monsite.com/page.php?x=42&y=1337

```
<?php

var_dump($_GET);

/*
	 array(2) {
	 ["x"]=>
	 string(2) "42"
	 ["y"]=>
	 string(4) "1337"
	 }
 */
```

## les formulaires

```html
<form method="post">
    Votre prénom :
    <input type="text" name="firstname" /><br />
    Votre nom :
    <input type="text" name="lastname" /><br />

    <input type="submit" value="Envoyer" />
</form>
```

## GET vs POST

```bash
> GET /form.html?firstname=Marty&lastname=McFly HTTP/1.1
> ...
>
> POST /form.html HTTP/1.1
> Content-Type: application/x-www-form-urlencoded
> Content-Length: 30
>
> firstname=Marty&lastname=McFly
```

recuperation donnees POST

```php
<?php

var_dump($_POST);

/*
array(2) {
  ["firstname"]=>
  string(5) "Marty"
  ["lastname"]=>
  string(5) "McFly"
}
*/
```

les en-tetes

```bash
HTTP/1.1 200 OK
Server: Apache
Content-Type: text/html
Date: Fri, 21 Dec 2012 03:53:16 GMT
Content-Length: 334

(data)
```

```php
<?php

// Créé une image rouge de 100x100
$i = imagecreatetruecolor(100, 100);
imagefill($i, 0, 0, 0xff0000);

// Précise au navigateur du client que le contenu
// est une image jpeg, et non pas une page HTML
// (text/html est le type par défaut)
header('Content-type: image/jpeg');

// Envoie l'image au client et libère ses resources
imagejpeg($i);
imagedestroy($i);
25/45
# Utilité des en-têtes
Les en-têtes peuve
```

utilites des entetes

- Modifier le type du fichier envoyé (`Content-type`)
- Rediriger le client (`Location`)
- Faire télécharger le fichier au client (`Content-Disposition`)
- Contrôler l'expiration (`Expires`): gestion de la mise en cache
- changer le code de reponse

la methode header doit etre envoye en premier

## les cookies

```php
<?php

if (isset($_COOKIE['seen']))
{
    echo "J'ai l'impression de vous connaître";
}
else
{
    // Definit le cookie seen à 1, qui expire
    // dans une heure (=3600 secondes)
    setcookie('seen', 1, time()+3600);
    echo 'Tiens, un nouveau visage !';
}
```

stocker des cles valeurs sur le navigateur

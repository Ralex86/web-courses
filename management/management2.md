## service worker

- script charge en parallele activable sur appelle meme fenetre fermee
- pas dacces au dom ou interactions clients
- communique via API Postmessage
- on peut le qualifier de proxy qui intercepte vos eechanges
- utilisation cache LocalStorage ou IndexedDB pour la gestion deconnectee (gestion de version du cache pour remise a jour)

> Bonne pratique: on gere la version et cache

## Arborescence du site internet

> creer larborescence du site web est une etape cruciale du projet

squelette du site, elle servira aussi bien au maquettage fonctionnel des pages quau remplissage de contenus

finalite => presenter linformation afin que le visiteur de votre puisse le parcourir intuitivement sans avoir une notice dutilisation pour y parvenir

- intuitif
- repondre a des besoins

## Exercice

- rassembler les contenus
- nommer la catgeorie
  Contexte: site vitrine qui vend des cheminees

| Infos generales |       Les produits        |     Services      |    Divers    | Les marques partenaires |
| :-------------- | :-----------------------: | :---------------: | :----------: | ----------------------: |
| presentation    |      nouveautes 2014      |   Installation    | Accessoires  |                    HWAM |
| nos competences |     peoles a granules     |      Design       | Consommables |                PIAZETTA |
| nos engagements | cheminees, inserts, foyer |     Ramonage      |              |        VERMONT-CASTINGS |
| show-room       |                           | aides financieres |              |                  HERGOM |
| financement     |                           |                   |              |                  SEGUIN |

- presentation
- nos competences
- Nos engagements
- notre show room
- les consommables
- HWAM
- PIAZZETTA
- VERMONT-CASTINGS
- HERGOM
- SEGUIN
- Le ramonage et lentretien
- nouveaut 2014
- cheminees, inserts, foyers
- les accessoires
- poeles a bois
- Design et creation orignale
- le financement
- les aides financieres
- poeles a granules
- linstalation et la mise en route

Correction:

- Qui sommes nous
- La collection
- Les marques
- Les services

Faire attention a la semantique

Methodologie

1. Enumerer: lister tous les contenus du site web
   - lister ensemble des contenus qui vont y etre presents
   - logique
2. Categoriser: organiser vos contenus par themes
   - rasssembler les contenus
   - nommer la categorie (ne pas utiliser les mots metier et parler le mm langage que le client)

> lorganisation de vos contenus differe selon la cible visee

3. Structurer: Hierachiser les themes

Definitions des termes (equilibre SEO/comprehnesion)
Niveau 1: sous lacceuil cest le menu principal de votre site
Niveau 2: sous rubrique du niveau 2
Niveau 3: sous rubrique du niveau 2

Attention, la profondeur de niveau rend complexe la navigation

Xmind

### le cas de la page dacceuil

- Ce site parle de quoi
- Quest ce que ce site peut moffrir
- Comment puis je acceder aux differentes informations
- Y a til du nouveau depuis ma dzerniere visite

page dacceuil = vitrine du magasin

- la page dacceuil nest pas le sommaire de votre site
- trop de choix tue le choix
- une page longue a affihcer
- ne mettez pas de dates dactu si vous ne les changez pas

> il faut compter une journee pour une arborescence

## phase de realisation du site internet

=> faire rediger le contenu par les clients
=> organiser les taches: trelo, jira
=> faites un suivi des heures, estimer le temps

## phase de test (recette)

Qualites communes a tous vos sites

- mentions legales completes
- faviocn
- minification CSS/JS

Specifique a votre realisation

- reprendre le cahier fonctionnel et TOUT tester
- tester sur plusieurs navigateurs differents
- noubliez pas les emails
- tester les formulaires

## Performances web

- Google crawl plus si ca va vite
- google vous declasse si ca rame
- parce que time is money

Quelques outils

- GTMetrix
- Dareboost
- Webpagetest
- Yslow

Tester plusieurs outils

web page performance test
amelioration progressive

- pour 80% des utilisateurs premier rend < 2 secondes
- fonctionnalite princiale < 5 sec (menu/recherche ..)
- ux riche

pour les 20% restants

- faite au mieux le plus rapidement possible

performances dun site

- agreger fichiers feuilles de styles et vos javascript
- minifier compresser vos fichiers js et css
- appeler vos fichier javascript en fin de page (charger le DOM et charger les script js qui manipulent le DOM apres)
- domain sharding (preferer CDN pour linternationnal)
  creer des sous domaines pour les fichiers statiques ex: static0.nomdedomaine.com static1.nomdedomaine.com etc...

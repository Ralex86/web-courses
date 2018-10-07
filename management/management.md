# Management de projet

## Hebergement a suivre

le futur de lhebergement
limmutabilite chez les serveurs
clonage du serveur => modif => on rebranche sur le clone

solution cloud

- amazon aws (amazon web service)

  - stockage
  - calcul
  - api
  - arret en ligne de commande
  - ex: 15 instances en parralleles => calcul fini on ferme les instances

- google platform
- microsoft azur

## Realisation du site

### Gestion de projet

- les methodes agiles
- cycle en v (methode a privilegier)
- cycle iteratif ou semi iteratif

### Cycle en V

1. Ananlyse des besoin
2. Specifications
3. Conception
4. Realisation
5. Tests unitaires
6. Validation
7. Recette metier

#### Avantages

isoperimetre ??

- definition des specs et du fonctionnel avant
  on sait ce quon va avoir a la fin

- on avance etapes par etapes

- garantie sur le respect des fonctionnalites

#### Inconvenients

- evolution du perimetre complique (avenant, temps et...)
- risque de derapage dans le temps si les etapes precedentes sont en retard
- effet tunnel, erreur de logique/conception ne se voit qua la fin
  => ca coute cher

### Cycle iteratif (agile)

agilite marche bien pour un produit (difference semantique entre projet et produit)

#### Avantages

- Evolution du premietre possilbe
- des test tout au long
- satisfaction client

#### Inconvenients

- peu de documentation
- risque de derapage budgetaire
- grande disponibilite du client necessaire

dans le cas des projets web a courte duree difficile a mettre en place

## La phase de conception

Cette phase se decoupe en plusieurs etapes

- reunion de lancement
- reunion conception graphique
- reunion cahier fonctionnel
- validation des maquettes
- validation du cahier fonctionnel

se preparer a toutes les eventualites (pas dinternet, pas de pc, pas de logiciel presentationnel)

## Deroulement de la realisation dun site internet

Princiaples etapes du projet

1. Cahier des charges
2. Brief graphique
3. Zoning/Maquette (boucle)

## Conception

defininr la chartre graphique, ergonomie et les enchainements de votre site internet

## UX vs UI

UI = user interface, conception dinterface utilisateur, fait le lien entre lhumain

- interaction desing
- wireframes & prototypes
- informations architect
- user research
- scenarios

UX = user eXperience, conception dexperience utilisateur apporter des solutions efficaces aux problemes

- visual design
- colors
- graphic designer
- layout

UX (une route quon utilise pas on prend un raccourci)
des fois lutilisateur utilise le site differement qd on regarde le tracking

## Graphisme le zoning

organisation visuelle non chartee de la page (bandeaux, blocs , texte, menus)
positionner les elements

realise par le client ou le chef de projet pour transmission au infographistes
realisation du wireframe

## Methodologie pr le wireframe

- definition de persona: personne ficitive dotee dattributs et de carateristiques sociales et psychologiques et qui represent un groupe cible
- on interview des personnes pr etablir un profil
- ecrire sur postit chaque caracteristique
- regrouper les post it par caracteristique en fonction de leur appetence
- grouper les profiles communs, definir votre persona
- age
- profil sociologique

- experience map
- wireframe

## experience map

cartographier lexperience dun utilisateur et ditenifeier
derouler linterface avec des cartes (code couleur par exmeple pour une action)

realtimeboard.com

## graphisme

- fil dariane
- navigation principale
- ligne de flotaison
- navigation secondaire

## Bonnes pratiques

- charte graphique homogene
- retour a la page dacceuil depuis toutes les pages
- eviter es popups
- mettre en evidence les liens hypertexte (norme de soulignement)
- navigation transversale

## lergonomie

- les internautes lisent en F
- la regle des 3 clicks nest pas toujours vraie

## Conception

conception fonctionnelle

- definition detaille des fonctionalités
- définition des éléments à fournir
- définition des regles metiers
- definition de l'arborescences

## organisation interne

- reunion avec lequipe pour presenter le projet
- definition des roles et taches
- definition du niveau de qualite attendu
- mise en place des outils

Livrables: cahier des charges, PV de validation du CDC

normes daccessibilites chronophage (pr personne en situation dhandicap mais pas que)
=> constrate obligatoire entre le texte et le fond

## les outils de developpement

- versionning: CVS/SVN/Git/Mercurial/Bazaar

- IDE: Eclipse/ Notepad ++/SublimeText/Atom/Phptorm/Visual Studio code
  (PhpStrom, VScode)

- integration continue: outils pour faire de la regression
  (Jenkins, CircleCI, Octopus Deploy, CodeShip)

- automatiseur de taches
  (Gulp, Grunt, Yeoman, Feri)
  modification CSS, minification
  lancement de maj, chercher librairie manquante

- test de lappli web
  (Selenium, casper, phantom, pincers, chrome)
  scenario: automatiser interaction avec site, cliquer sur un item etc...
  a chaque etape on peut faire une capture decran
  faire un rollback si probleme

## quelques conseils git

- 1 jour <> 1 git. Gitter les fonctionnalités, par pour sauvegarder
- creer des branches dans votre projet pour experimenter ou pour organiser le dev / prod
- lire la doc: cherrick-pick (prendre un commit de nimporte quelle branche et laffecte a la ou on est)

## evaluer la difficulte

evaluer la difficulte: _le planning poker_
formulaire de contact

but de lexercice:

- definir leffort minimum: quelle est la fonctionnalite qui va demander le moins deffort
- repartir en proport de leffort minimum

echelle deffort: `1/2/3/5/8/13/21`

## la mobilite

3 solutions pour faire du responsive

- site dedie mobile
  avntages: optimisation 100% sur mesure, sadapter et cibler fonctionnalites variées, alternatives rapide
  inconvenients: contenu duplique (SEO), maintenance de plusieurs versions de sites et de plusieurs adresses web

- responsible design
  mobile first: ON DEVELOPPE POUR LES MOBILES ET ON ADAPTE LE RESTE
  on ne part pas de la vue PC ça sappelle du retro fitting
  avantages: une maintenance de projet facilitee, un seul site, une mise à jour transparente et un deploiement multiplateformes, adapation sans refonte necessaire, strategie multi support, optimise pour lergonomie et la performance
  inconvenients: performance, optimisation de surface
  mobile first on se concentre sur le contenu et on l'enrichi avec la surface

- faire une applicaiton
  une application native est developpé specifiquement pour un OS et que se telecharge et se reference au sein dun store
  avantages: acces a des fonctionnalites natives du telephone, performances, review, _totalement acclimate au peripherique_
  inconvenients: language specifique a lOS, cout de developpement, des licences et de la mainteannce pour chaque systeme dexploitation, contenus non indexable pour un moteur web, mise a jour de lapplication necessaire une action de lutilisateur

disparite cote des versions suivant les OS (bcp plus homogene chez apple, 85% des users changent de version 2mois apres la sortie du nouvel OS)

- progressive web app

## Quelques trucs a retenir

pieges
mobile-first: content is like water
survol hover pas possible en mobile
un pouce = `40 px`

utiliser des trucs classiques comme le slide et le swipe
integrer les gestes

penser SVG

repertorier et prioriser les contenus
priorite mobilite et grand ecran
pas mal pour sorganiser

les points de ruptures
demarrer en posants des points de ruptures provisoire
avec une echelle de 0 à 1000 px on prend 2 points de rupture
on affine
0 400 500 1000 par exemple

importance strategie coherente multi supports
profiter des usages de la mobilite: les QR codes, le NFC, realite augmente, les wallets, Ibeacon, les chatbot

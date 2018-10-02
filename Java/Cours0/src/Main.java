public class Main {

    public static void main(String[] args) {
	    
	    // TEST DE LA CLASSE AnimalFamilier
	    System.out.println("---------TESTS DE LA CLASSE ANIMALFAMILIER----------");
	    // Instanciation de la classe AnimalFamilier
	    // Appel du constructeur par défaut
	    // Création d'un objet "vide" (pas de valeurs dans les attributs)
	    AnimalFamilier monAnimal1= new AnimalFamilier();
	    
	    // Appel des setters pour initialiser les attributs de l'objet
	    monAnimal1.setAge(3);
	    monAnimal1.setPoids(2);
	    monAnimal1.setTaille(27);
	    monAnimal1.setCouleur("Rouge");
	    
	    // Affichage de l'objet créé
	    System.out.println("Affichage du 1er animal");
	    monAnimal1.afficher();
	    
	    // Saut de ligne
	    System.out.println("");
	    
	    // Instanciation de la classe AnimalFAmilier
	    // Appel du constructeur paramétré
	    // Création d'un objet "non vide" (attributs initialisés)
	    AnimalFamilier monAnimal2= new AnimalFamilier(2,1.5,50,"jaune");
	    
	    // Affichage de l'objet créé
	    System.out.println("Affichage du 2ème animal");
	    monAnimal2.afficher();
	    
	    // Appel de la méthode manger() sur l'objet monAnimal1
	    // C'est une procédure: on ne récupère pas de résultat
	    // Il suffit juste d'appeler la procédure sur l'objet
	    System.out.println("");
	    monAnimal1.manger();
	    
	    // Appel de la méthode manger() sur l'objet monAnimal1
	    // C'est une procédure également
	    System.out.println("");
	    monAnimal1.dormir();
	    
	    System.out.println("");
	    
	    // Appel de la fonction dire(...)
	    // C'est une fonction: elle retourne un résultat 
	    // qui est récupéré dans la variable phrase
	    String phrase=monAnimal1.dire("Je vais bien!");
	    
	    // Affichage du résultat retourné par la fonction
	    System.out.println("L'animal veut vous dire: "+phrase);
	    
	    System.out.println("");
	    
        // Appel des getter sur l'objet monAnimal2
        // Un getter est une fonction qui retourne la valeur d'un attribut
        
        // Valeur de retour du getter stockée dans la variable lage
	    int lage=monAnimal2.getAge();
	    
	    // Affichage de la variable lage
	    System.out.println("L'age est: "+ lage + " ans");
	    
	    // On peut aussi appeler directement le getter dans l'affichage
	    // sans passer par une variable intermédiaire
	    System.out.println("Le poids est: "+monAnimal2.getPoids()+ " kg");
	    System.out.println("La taille est: "+monAnimal2.getTaille()+ " cm");
	    System.out.println("La couleur est: "+monAnimal2.getCouleur());     
	    
	    System.out.println("");
	    
	    // TEST DE LA CLASSE Poisson
	    System.out.println("---------TESTS DE LA CLASSE POISSON----------");
	    // Instanciation de la classe Poisson
	    // Appel du constructeur par défaut
	    // Objet déclaré de type AnimalFamilier
	    // mais c'est le constructeur de la classe Poisson qui est appelé
	    AnimalFamilier monPoisson1=new Poisson();
	    
	    // Appel des setters
	    monPoisson1.setAge(4);
	    monPoisson1.setPoids(0.5);
	    monPoisson1.setTaille(15);
	    monPoisson1.setCouleur("rouge");
	   
	    // Appel de la méthode d'affichage de l'objet créé
	    // C'est la méthode afficher(...) de la classe fille qui est appelée
	    // même si l'objet a été déclaré de type AnimalFamilier
	    System.out.println("Affichage du 1er poisson:");
	    monPoisson1.afficher();
	   
	    System.out.println("");
	   
	    // Instanciation de la classe Poisson
	    // Appel du constructeur paramétré
	    Poisson monPoisson2=new Poisson(7,50,2,"gris",20);
	    
	    // Affichage de la méthode d'affichage de l'objet créé
	    System.out.println("Affichage du 2ème poisson:");
	    monPoisson2.afficher();
	    
	    System.out.println("");
	    
	    // Appel de la méthode manger
	    monPoisson2.manger();
	    
	    System.out.println("");
	    
	    // Appel de la méthode dormir
	    monPoisson2.dormir();
	    
	    System.out.println("");
	    
	    // Appel de la fonction dire(...)
	    // Résultar retourné par la fonction
	    // récupéré dans la variable phrase2
	    String phrase2=monPoisson2.dire("Je suis comme un poisson dans l'eau!");
	    
	    // Affichage de la variable phrase 2
	    System.out.println("Le poisson veut vous dire: "+ phrase2);
	    
	    System.out.println("");
	    
	    // Appel de la méthode plonger(...)
	    monPoisson2.plonger(6);
	    
	    // Affichage de l'objet pour vérifier que la profondeur a bien changé
	    monPoisson2.afficher();
	    
	    System.out.println("");
	    
	    // TEST de la classe Proprietaire
	    System.out.println("---------TESTS DE LA CLASSE PROPRIETAIRE----------");
	    // Instanciation de la classe Proprietaire
	    Proprietaire leproprio1 = new Proprietaire("DUPOND","Marcel");
	    Proprietaire leproprio2 = new Proprietaire("DUPRAT","Léon");
	    
	    // Appel de la méthode ajouterAnimal(...) pour ajouter les AnimalFamilier créés ci-dessus au propriétaire leproprio1
	    leproprio1.ajouterAnimal(monAnimal1);
	    leproprio1.ajouterAnimal(monPoisson2);
        
        // Appel de la méthode ajouterAnimal(...) pour ajouter les AnimalFamilier créés ci-dessus au propriétaire leproprio2
	    leproprio2.ajouterAnimal(monAnimal2);
	    leproprio2.ajouterAnimal(monPoisson1);
	    
	    // Affichage de l'objet leproprio1
	    System.out.println("Affichage du 1er propriétaire:");
	    leproprio1.afficher();
	    
	    System.out.println("");
	     // Affichage de l'objet leproprio2
	    System.out.println("Affichage du 2ème propriétaire:");
	    leproprio2.afficher();
	    
	     System.out.println("");
	    
	    //TEST de la classe CLINIQUE
	    System.out.println("---------TESTS DE LA CLASSE CLINIQUE----------");
	    // Instanciation de la classe AnimalFamilier
	    AnimalFamilier animal3= new AnimalFamilier(5,14,150,"vert");
	    AnimalFamilier animal4= new AnimalFamilier(7,1,20,"rose");
	    AnimalFamilier animal5= new AnimalFamilier(14,3,170,"marron");
        
        // Instanciation de la classe Poisson
	    Poisson poisson3= new Poisson(2,1,70,"turquoise",14);
	    Poisson poisson4= new Poisson(18,6,174,"violet",5);
	    Poisson poisson5= new Poisson(7,3.4,82.5,"blanc",10);
	    
	    // Instanciation de la classe Proprietaire
	    Proprietaire leproprio3 = new Proprietaire("DELPECH","Bernard");
	    Proprietaire leproprio4 = new Proprietaire("DUMONT","Alban");
	    
	    // Appel de la méthode statique ajouterAnimal(...) pour ajouter des objets AnimalFamilier
	    // à la liste complète des animaux familiers répertoriée (dans une ArrayList)
	    // Pour appeler une méthode statique: inutile de créer un objet de la classe (NomClasse.NomMethode)
	    Clinique.ajouterAnimal(monAnimal1);
	    Clinique.ajouterAnimal(monAnimal2);
	    Clinique.ajouterAnimal(animal3);
	    Clinique.ajouterAnimal(animal4);
	    Clinique.ajouterAnimal(animal5);
	    
	    // Appel de la méthode statique ajouterAnimal(...) pour ajouter des objets Poisson
	    // à la liste complète des animaux familiers répertoriée (dans une ArrayList)
	    Clinique.ajouterAnimal(monPoisson1);
	    Clinique.ajouterAnimal(monPoisson2);
	    Clinique.ajouterAnimal(poisson3);
	    Clinique.ajouterAnimal(poisson4);
	    Clinique.ajouterAnimal(poisson5);
	    
	    
	     // Appel de la méthode statique ajouterAnimal(...) pour ajouter des objets Proprietaire
	    // à la liste complète des propriétaires répertoriée (dans une HashMap)
	    Clinique.ajouterProprietaire(leproprio1);
	    Clinique.ajouterProprietaire(leproprio2);
	    Clinique.ajouterProprietaire(leproprio3);
	    Clinique.ajouterProprietaire(leproprio4);
	    
	    System.out.println("");
	    // Appel de la méthode statique pour afficher la liste complète des propriétaires 
	    // avec un parcours de la HashMap par clé
	    Clinique.afficherTousLesProprietairesParCle();
	    
	    System.out.println("");
	    // Appel de la méthode statique pour afficher la liste complète des propriétaires 
	    // avec un parcours de la HashMap par clé
	    Clinique.afficherTousLesProprietairesParValeur();
	    
	    // Appel de la méthode statique afficherAnimalParTrancheAge(...)
	    Clinique.afficherAnimalParTrancheAge(2,6);
        Clinique.afficherAnimalParTrancheAge(8,16);
	   	    
    }
}

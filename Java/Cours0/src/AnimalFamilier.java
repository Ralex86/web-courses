
public class AnimalFamilier {
    
    // Attributs privés
    // Principe d'ENCAPSULATION 
    private int age;
    private double poids;
    private double taille;
    private String couleur;
    
    // Méthodes publiques
    
    // Constructeur par défaut
    public AnimalFamilier()
    {
        
    }
    
    
    // Constructeur paramétré
    // On parle de SURCHARGE du constructeur
    public AnimalFamilier(int page, double ppoids, double ptaille, String pcouleur)
    {
        this.age=page;
        this.poids=ppoids;
        this.taille=ptaille;
        this.couleur=pcouleur;
    }
    
    // Méthode qui affiche "J'ai si faim!!!...Donne-moi un biscuit!" 
    public void manger()
    {
        System.out.println("J'ai si faim!!!...Donne-moi un biscuit!");
    }
    
    // Méthode qui affiche "Bonne nuit, à demain! "
    public void dormir()
    {
        System.out.println("Bonne nuit, à demain! ");
    }
    
    // Fonction qui retourne la chaîne "Ok!!Ok!! " 
    // concaténée à la chaîne pmot passée en paramètre
    public String dire(String pmot)
    {
        String res="Ok!!Ok!! "+ pmot;
        return res;
    }
    
    // Méthode d'affichage de l'objet
    public void afficher()
    {
        System.out.println("Age: "+this.age);
        System.out.println("Poids: "+this.poids);
        System.out.println("Taille: "+this.taille);
        System.out.println("Couleur: "+this.couleur);
    }

    // Accesseurs (getter / setter)  
    
    // Getter qui retourne la valeur de l'attribut age
    public int getAge()
    {
        return this.age;
    }
    
    // Setter qui met à jour la veleur de l'attribut age
    public void setAge(int page)
    {
        this.age=page;
    }
    
    public double getPoids()
    {
        return this.poids;
    }
    
    public void setPoids(double ppoids)
    {
        this.poids=ppoids;
    }
    
    public double getTaille()
    {
        return this.taille;
    }
    
    public void setTaille(double ptaille)
    {
        this.taille=ptaille;
    }
    
    public String getCouleur()
    {
        return this.couleur;
    }
    
    public void setCouleur(String pcouleur)
    {
        this.couleur=pcouleur;
    }
    
    
}

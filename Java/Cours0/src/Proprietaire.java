import java.util.ArrayList;

public class Proprietaire {
    
    // Attribut statique utilisé pour générer les numéros de Proprietaire
    private static int dernierNumProp=0;
    
    // Attributs privés
    private int numero;
    private String nom;
    private String prenom;
    
    // Liste d'AnimalFamilier de l'objet Proprietaire courant this
    // Attribut permettant de gérer la NAVIGABILITE entre classe(voir diagramme de classe)
    private ArrayList<AnimalFamilier> mesAnimaux;
    
    // Constructeur paramétré
    public Proprietaire(String pnom, String pprenom)
    {
        // Numéro de l'objet courant this généré à partir de l'attribut statique dernierNumProp
        this.numero=dernierNumProp+1;
        // Incrémentation de l'attribut statique pour le prochain numéro qui sera généré
        dernierNumProp++;
        
        // Initialisation des attributs
        this.nom=pnom;
        this.prenom=pprenom;
        
        //Instanciation de l'ArrayList<AnimalFamilier> qui est vide pour l'instant
        this.mesAnimaux=new ArrayList<AnimalFamilier>();
        
        
    }
    
    // Méthode d'affichage de l'objet
    public void afficher()
    {
        System.out.println("Numéro: "+this.numero);
        System.out.println("Nom: "+this.nom);
        System.out.println("Prenom: "+this.prenom);
        
        // Affichage de la liste mesAnimaux
        // Solution 1 avec un foreach
        System.out.println("Affichage des animaux avec un foreach:");
        for (AnimalFamilier unAnimal: this.mesAnimaux)
        {
            unAnimal.afficher();
            System.out.println("");
        }
        System.out.println("");
        // Affichage de la liste mesAnimaux
        // Solution 2 avec une "boucle indicée"
        System.out.println("Affichage des animaux avec un parcours indicé:");
        for (int i=0; i<this.mesAnimaux.size();i++)
        {
            this.mesAnimaux.get(i).afficher();
            System.out.println("");
        }
        System.out.println("");
        
    }
    
    // Méthode permettant d'ajouter un objet AnimalFamilier dans l'ArrayList mesAnimaux
    public void ajouterAnimal (AnimalFamilier panimal)
    {
        this.mesAnimaux.add(panimal);
    }    
    
    
    // Accesseurs (getter/setter)
    public int getNumero()
    {
        return this.numero;
    }
    
            
    public String getNom()
    {
        return this.nom;
    }
    
    public void setNom(String pnom)
    {
        this.nom=pnom;
    }
    
    public String getPrenom()
    {
        return this.prenom;
    }
    
     public void setPrenom(String pprenom)
    {
        this.prenom=pprenom;
    }
    
}

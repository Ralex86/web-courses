public class Voyage {
    
    // Attributs privés
    // Principe d'ENCAPSULATION 
    private String referenceVoyage;
    private String libelleVoyage;
    
    // Méthodes publiques
    
    // Constructeur par défaut
    public Voyage()
    {
        
    }
    
    
    // Constructeur paramétré
    // On parle de SURCHARGE du constructeur
    public Voyage(String vreferenceVoyage, String vlibelleVoyage)
    {
		// this pas obligatoire ?
        this.referenceVoyage = vreferenceVoyage;
        this.libelleVoyage = vlibelleVoyage;
    }
    
    // Méthode d'affichage de l'objet
    public void afficher()
    {
        System.out.println("Reference Voyage: " + this.referenceVoyage);
        System.out.println("Reference Voyage: " + this.libelleVoyage);
    }

    // Accesseurs (getter / setter)  
    
    public String getReferenceVoyage()
    {
        return this.referenceVoyage;
    }
    
    public String getLibellleVoyage()
    {
        return this.libelleVoyage;
    }

    public void setReferenceVoyage(String ref)
    {
        this.referenceVoyage = ref;
    }
    
    public void setLibelleVoyage(String lib)
    {
        this.libelleVoyage = lib;
    }
}

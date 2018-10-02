
public class Poisson extends AnimalFamilier {
    
    // Attribut privé
    private int profondeur;
    
    // Constructeur par défaut
    // Appel du constructeur par défaut de la classe mère
    public Poisson()
    {
        super();
    }
    
    // Constructeur paramétré
    public Poisson(int page, double ppoids, double ptaille, String pcouleur, int pprofondeur)
    {
        // Appel du constructeur paramétré de la classe mère
        super(page, ppoids, ptaille, pcouleur);
        this.profondeur=pprofondeur;
    }
    
    // Redéfinition de la méthode manger(...)
    // pas d'appel de la méthode manger(...) de la classe mère
    // on parle de POLYMORPHISME de méthode
    // c'est le type réel de l'objet qui détermine quelle méthode est appelée
    public void manger()
    {
        System.out.println("J'ai si faim!!!...Donne-moi des algues!");
    }
    
    // Méthode qui met à jour l'attribut profondeur
    public void plonger(int pprofondeur)
    {
        this.profondeur=this.profondeur + pprofondeur;
    }
    
    // Méthode d'affichage de l'objet
    // Complète la méthode d'affichage de la classe mère
    public void afficher()
    {
        // Appel de la méthode afficher() de la classe mère
        super.afficher();
        System.out.println("Profondeur: "+this.profondeur);
               
    }
   
    // Accesseurs (getter/setter)
    public int getProfondeur()
    {
        return this.profondeur;
    }
    
    public void setProfondeur(int pprofondeur)
    {
        this.profondeur=pprofondeur;
    }
}

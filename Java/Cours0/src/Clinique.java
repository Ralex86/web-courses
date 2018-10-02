import java.util.HashMap;
import java.util.ArrayList;

public class Clinique {
    // Attribut statique contenant une HashMap de tous les propriétaires existants
    // Les clés de la HashMap sont les noms des Proprietaire
    // Les valeurs de la HashMap sont des objets Proprietaire
    // Attribut permettant de gérer la NAVIGABILITE entre classe (voir diagramme de classe)
    private static HashMap<String,Proprietaire> lesProprietaires=new HashMap<String,Proprietaire>();
    
    // Attribut statique contenant une ArrayList de tous les animaux existant
    // Attribut permettant de gérer la NAVIGABILITE entre classe (voir diagramme de classe)
    private static ArrayList<AnimalFamilier> lesAnimaux=new ArrayList<AnimalFamilier>();
     
    // Méthode statique affichant l'ensemble des animaux d'une tranche d'âge
    // passée en paramètres
    public static void afficherAnimalParTrancheAge(int pagemin, int pagemax)
    {
        // Parcours de l'ArrayList avec un foreach
        for (AnimalFamilier unAnimal:lesAnimaux)
        {
            if (unAnimal.getAge()>=pagemin && unAnimal.getAge()<=pagemax)
            {
                unAnimal.afficher();
                System.out.println("");
            }
        }
    }
    
    // Méthode statique affichant tous les Proprietaires existant
    // en parcourant les clés de la HashMap (avec la méthode keySet())
    public static void afficherTousLesProprietairesParCle()
    {
        Proprietaire leProprio;
        System.out.println("Parcours de la HashMap par clé:");
        for (String leNom: lesProprietaires.keySet())
        {
            System.out.println("Clé:"+leNom);
            leProprio=lesProprietaires.get(leNom);
            System.out.println("Valeur:");
            leProprio.afficher();
            System.out.println("");
            
        }
    }
    
    // Méthode statique affichant tous les Proprietaires existant
    // en parcourant les valeurs de la HashMap (avec la méthode values())
    public static void afficherTousLesProprietairesParValeur()
    {
        System.out.println("Parcours de la HashMap par valeur:");
        for (Proprietaire leProprio: lesProprietaires.values())
        {
            leProprio.afficher();
            System.out.println("");
        }
    }
    
    // Méthode statique qui ajoute un AnimalFamilier dans l'ArrayList lesAnimaux
    public static void ajouterAnimal(AnimalFamilier panimal)
    {
        lesAnimaux.add(panimal);
    }
    
    // Méthode staique qui ajoute un Proprietaire dans la HashMap lesProprietaires
    // La clé correspond au nom du Proprietaire
    // La valeur correspond à l'objet Proprietaire
    public static void ajouterProprietaire(Proprietaire pproprio)
    {
        lesProprietaires.put(pproprio.getNom(),pproprio);
    }
    
    
}

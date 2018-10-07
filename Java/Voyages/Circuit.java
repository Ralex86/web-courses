import java.util.ArrayList;

public class Circuit extends Voyage {

	private Boolean enAutonomie;
	private ArrayList<Etape> lesEtapes = new ArrayList<Etape>();

	public Circuit(){
		super();
	}

	public Circuit(boolean cenAutonomie, String creferenceVoyage, String clibelleVoyage){

		super(creferenceVoyage, clibelleVoyage);
		this.enAutonomie = cenAutonomie;
	}

 
 	public void afficher(){
        System.out.println("Affichage des circuit avec un foreach:");
        for (Etape uneEtape: this.lesEtapes)
        {
            uneEtape.afficher();
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Circuit en autonomie ? " + this.enAutonomie);
    }

	public void ajouterEtape(Etape etap){
		this.lesEtapes.add(etap);
	}

}

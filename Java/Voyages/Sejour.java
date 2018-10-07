public class Sejour extends Voyage {

	private String lieuSejour;

	public Sejour(){

	}


	public Sejour(String slieuSejour, String vreferenceVoyage, String vlibelleVoyage){

		super(vreferenceVoyage, vlibelleVoyage);
		this.lieuSejour = slieuSejour;
	}

    public void afficher()
    {
        System.out.println("Reference Voyage: "+ this.lieuSejour);
    }

}

public class Etape {

	private int numeroEtape;
	private String lieuEtape;
	private int dureeEtape;

    public Etape()
    {
        
    }
    
    public Etape(int enumeroEtape, String elieuEtape, int edureeEtape)
    {
		this.numeroEtape = enumeroEtape;
		this.lieuEtape = elieuEtape;
		this.dureeEtape = edureeEtape;
    }

    public void afficher()
    {
        System.out.println("Numero etape: " + this.numeroEtape);
        System.out.println("Lieu etape: " + this.numeroEtape);
        System.out.println("Duree etape: " + this.numeroEtape);
    }
}

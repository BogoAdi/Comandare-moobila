public class ProdusExistent extends Exception{
    String nume, lemn;

    public ProdusExistent(String nume,String lemn) {
        super(String.format("Acest produs este existent:  %s de %s", nume,lemn));
        this.nume=nume;
        this.lemn=lemn;
    }
    public String getNumeProdus() {
        return nume;
    }
    public String getLemn(){return  lemn;}
}

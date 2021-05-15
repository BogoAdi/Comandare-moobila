import java.util.Objects;

public class Produs {

    private String nume;
    private String lemn;
    private int pret;

    public Produs(){}

    public Produs(String numeProdus ,String lemn,int pret ){


        this.nume=numeProdus;
        this.lemn=lemn;
        this.pret=pret;
    }

    public  String getLemn(){return lemn;}

    public  String getNume(){ return nume;}

    public String getTot(){String s=nume+" "+lemn+" "+pret;
        return s;}

    public void setNume(String nume) {
        this.nume=nume;
    }
    public int getPret() {
        return pret;
    }

    public void setLemn(String lemn) {
        this.lemn = lemn;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs = (Produs) o;
        return pret == produs.pret && Objects.equals(nume, produs.nume) && Objects.equals(lemn, produs.lemn);
    }

}
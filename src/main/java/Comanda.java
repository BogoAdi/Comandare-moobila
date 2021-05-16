import java.util.Objects;

public class Comanda {
    private long id;
    private String numeSiPrenume="";
    private  String client="";
    private String strada="";
    private String Data="";
    private String numarCasa="";
    private String oras="";
    private  String Mobila;
    private  String Lemn;
    private  int pret;
    private Boolean asistenta;

    public Comanda(String client,String numeSiPrenume, String oras, String strada, String numarCasa,  Produs produs, Boolean asistenta,String Data) {
        this.numeSiPrenume=numeSiPrenume;
        this.strada=strada;
        this.client=client;
        this.oras=oras;
        this.Mobila=produs.getNume();
        this.Lemn= produs.getLemn();
        this.pret=produs.getPret();
        this.numarCasa=numarCasa;
        this.asistenta=asistenta;
        this.Data=Data;
    }
    public Comanda(){

    }
    public  String getNumeSiPrenume(){return  numeSiPrenume;}
    public void setNumeSiPrenume(String numeSiPrenume){
        this.numeSiPrenume=numeSiPrenume;
    }
    public String getData(){
        return  Data;}
    public void setData(String Data){
        this.Data=Data;}
    public String getClient(){
        return client;}
    public String getStrada(){
        return  strada;}
    public String getOras(){
        return  oras;}
    public String getMobila(){
        return  Mobila;}
    public String getLemn(){
        return  Lemn;}
    public int getPret(){
        return  pret;}
    public long  getId(){
        return id;}
    public String getNumarCasa(){
        return  numarCasa;}
    public Boolean getAsistenta(){
        return asistenta;}
    public void setMobila(String produs){

        this.Mobila=produs;
    }
    public void setLemn(String lemn){

        this.Lemn=lemn;
    }
    public void setPret(int pret){

        this.pret=pret;
    }
    public void setStrada(String strada){
        this.strada=strada;}
    public void setOras(String oras){
        this.oras=oras;}
    public void setId(int id){
        this.id=id;}
    public void setNumarCasa(String numarCasa) {
        this.numarCasa=numarCasa;}


    public void setAsistenta(boolean asistenta){
        this.asistenta=asistenta;
    }



    public int hashCode() {
        return Objects.hash(client,numeSiPrenume,oras, strada, numarCasa, Mobila,Lemn,pret,asistenta);
    }
}

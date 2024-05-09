public class CD {
    private int brani, durata;
    private String titolo, autore;
    public CD(String tit, String aut, int bran, int dura){
        brani = bran;
        titolo = tit;
        autore = aut;
        durata = dura;
    }
    public CD(CD gigio){
        setAutore(gigio.getAutore());
        setBrani(gigio.getBrani());
        setDurata(gigio.getDurata());
        setTitolo(gigio.getTitolo());
    }
    public String getAutore() {
        return autore;
    }
    public int getBrani() {
        return brani;
    }
    public int getDurata() {
        return durata;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public void setBrani(int brani) {
        this.brani = brani;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String toString(){
        String s;
        s = titolo.toUpperCase()+"\n"+autore+"\n n brani: "+brani+"\n durata: "+durata+ " min";
        return s;
    }
    public int compareCD(CD gigio){
        int s = -1;
        if (durata>gigio.getDurata()) {
            s = 1;
        }else if (durata==gigio.getDurata()) {
            s = 0;
        }
        return s;
    }
    public boolean equals(CD robarto) {
        boolean s = false;
        if (brani == robarto.getBrani() && autore.equals(robarto.getAutore()) && titolo.equals(robarto.getTitolo()) && durata==robarto.getDurata()) {
            s = true;
        }
        return s;
    }
}

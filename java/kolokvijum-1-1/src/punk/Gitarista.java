package punk;

public class Gitarista extends Muzicar {
    int faktorSujete;
    int koeficijentEkspresije;
    String scenskoIme;

    public Gitarista(String scenskoIme, int brojGodina, int faktorSujete, int koeficijentEkspresije) {
        super(brojGodina);
        this.faktorSujete = faktorSujete;
        this.koeficijentEkspresije = koeficijentEkspresije;
        this.scenskoIme = scenskoIme;
    }

    public int getFaktorSujete() {
        return faktorSujete;
    }

    public void setFaktorSujete(int faktorSujete) {
        this.faktorSujete = faktorSujete;
    }

    public int getKoeficijentEkspresije() {
        return koeficijentEkspresije;
    }

    public void setKoeficijentEkspresije(int koeficijentEkspresije) {
        this.koeficijentEkspresije = koeficijentEkspresije;
    }

    public String getScenskoIme() {
        return scenskoIme;
    }

    public void setScenskoIme(String scenskoIme) {
        this.scenskoIme = scenskoIme;
    }

    @Override
    public String toString() {
        return this.getScenskoIme() + " " + this.getFaktorSujete() + " " + this.getKoeficijentEkspresije() + " " + this.getBrojGodina();
    }
}

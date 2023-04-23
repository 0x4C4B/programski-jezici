package nft;

public class Fajl extends NFT {
    String ekstenzija;
    int velicina;
    String ime;

    public Fajl(int cena, String ime, String ekstenzija, int velicina) {
        super(cena);
        this.velicina = velicina;
        this.ekstenzija = ekstenzija;
        this.ime = ime;
    }

    public int getVelicina() {
        return velicina;
    }

    public void setVelicina(int velicina) {
        this.velicina = velicina;
    }

    public String getEkstenzija() {
        return ekstenzija;
    }

    public void setEkstenzija(String ekstenzija) {
        this.ekstenzija = ekstenzija;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return this.getCena() + " " + this.getVelicina() + " " + this.getIme() + " " + this.getEkstenzija();
    }
}

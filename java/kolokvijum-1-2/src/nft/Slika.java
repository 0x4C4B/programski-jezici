package nft;

public class Slika extends NFT {
    private int visina;
    private int sirina;
    private int brojBoja;
    private String motiv;

    public Slika(int visina, int sirina, int brojBoja, int cena, String motiv) {
        super(cena);
        this.visina = visina;
        this.sirina = sirina;
        this.brojBoja = brojBoja;
        this.motiv = motiv;
    }

    public String getMotiv() {
        return motiv;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
    }

    public int getBrojBoja() {
        return brojBoja;
    }

    public void setBrojBoja(int brojBoja) {
        this.brojBoja = brojBoja;
    }

    public int getSirina() {
        return sirina;
    }

    public void setSirina(int sirina) {
        this.sirina = sirina;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    @Override
    public String toString() {
        return this.getCena() + " " + this.getSirina() + " " + this.getVisina();
    }
}

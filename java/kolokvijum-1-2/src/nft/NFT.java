package nft;

public class NFT implements Comparable<NFT> {
    private int cena;

    public NFT(int cena) {
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public int compareTo(NFT other) {
        return cena - other.getCena();
    }
}

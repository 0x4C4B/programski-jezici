package nft;

/****************************************************************
 * Nije moguce implentirati custom exception kao podklasu
 * genericke klase.
 ****************************************************************/
public class BesplatanNFT extends Exception {
    public BesplatanNFT(String info) {
        super(info);
    }
}

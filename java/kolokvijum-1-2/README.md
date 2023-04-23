# Priprema za Kolokvijum 1

Na programskom jeziku Java, unutar paketa nft, modelovati prodajnu galeriju NFT tokena. Klasa NFT sadrži samo
celobrojnu cenu tokena, dok specifičnosti različitih tokena sadrže njene potklase: Fajl, Slika i Pesma. Fajl ima
celobrojnu dužinu, ime i ekstenziju, Slika ima celobrojne dimenzije (visinu i širinu), celobrojni broj boja koje sadrži i
opisni motiv slike, a Pesma sadrži celobrojno trajanje, celobrojnu glasnoću i tekst.

Prodajnu galeriju modelovati klasom Galerija parametrizovanom klasom NFT i njenim
potklasama. Ova klasa ima mogućnost da prima elemente bez zadavanja pozicije (funkcija
dodaj(T t)). Kada se formira objekat Galerije, njegov niz ne treba da se inicijalizuje dok mu se
ne pošalje prvi elemenat, nakon čega treba da se povećava sa svakim novim elementom koji
mu se pošalje. Sve ovo vezano za niz uraditi kao sopstvenu implementaciju (ne koristiti
fabričke klase za nizove). Ukoliko se Galeriji pošalje token sa nultom cenom funkcija treba da
baci izuzetak BesplatanNFT koji se hvata unutar same funkcije (a dati token neće biti upisan
u Galeriju). Galerija treba da ima funkciju dajNajveći() koja će pronaći NFT token sa najvećom
cenom, njegovu cenu će upisati u binarnu datoteku sa imenom koje je autorov broj indeksa
(ekstenzija je .bin) na desktopu i sve atribute datog tokena odštampaće na ekran.

U main funkciji, izvan bilo kog paketa, napraviti jedan Fajl, jednu Sliku i jednu Pesmu, a
njihove atribute učitati iz tekstualnog fajla (primer izgleda fajla je na slici). Upisati ove tokene u Galeriju i narediti
Galeriji da dâ najveći. Jednom tokenu dati nultu cenu da bi se izazvao izuzetak.

### Primer `nft.txt` datoteke

```text
0
ništa
.nft
1000
0
0
0
5000
praznina
0
0
muk
10000
```

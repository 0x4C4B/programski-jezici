# Primprema za Kolokvijum 1

Na programskom jeziku Java projektovati simulator vokalno-instrumentalnog sastava u žanru punk. Sastav se sastoji
iz pevača, gitariste, basiste i bubnjara. Svaki od ovih muzičara modelovati istoimenom klasom. Klase u svojim
atributima čuvaju specifičnosti muzičara. Pevača karakterišu raspon glasa u oktavama (int), koeficijent telesne
aktivnosti na podijumu (int) i scensko ime (String). Gitaristu karakterišu faktor sujete (int), koeficijent facijalne
ekspresije (int) i scensko ime (String). Basistu karakteriše ukupan broj tonova koje poznaje (byte), dok bubnjara
karakteriše telesna masa (int) i količina alkoholnih napitaka neophodnih za ispravno funkcionisanje na sceni (long).
Svi muzičari dele istu natklasu Muzičar koja vodi računa o broju godina članstva tog muzičara u bendu. Sve klase osim
glavne treba da budu u paketu punk.

Za evidenciju vokalno-instrumentalnog sastava predvideti klasu PunkBand koja ima ulogu
kolekcije muzičara. Muzičare čuvati listi tipa ArrayList sa odgovarajućom parametrizacijom. Za
ubacivanje muzičara u bend koristiti funkciju evidentiraj(Muzičar mu) koja izbacuje izuzetak
tipa Antimaterija u slučaju da je broj godina članstva muzičara u bendu negativan, a prilikom
testiranja programa izazvati jednu pojavu ovog izuzetka. Izuzetak treba da bude obrađen u
samoj funkciji, a taj muzičar neće biti evidentiran. Klasa PunkBand treba da ima i funkciju
vođaBenda() koja na ekran ispisuje sve osobine člana benda sa najdužim stažom, a njegov staž
upisuje u binarnu datoteku čije ime je broj indeksa a ekstenzija bin. Pronalaženje vođe benda
treba realizovati sortiranjem liste muzičara pomoću fabričke funkcije sort(null). Da bi muzičari
mogli biti sortirani, oni moraju implementirati fabrički interfejs Comparable koji je
parametrizovan njihovom sopstvenom klasom Muzičar.

U main funkciji napraviti po jednog od svih tipova muzičara, njihove parametre učitati iz tekstualne datoteke
punk.txt i evidentirati ih, a onda zatražiti vođu benda.

### Primer `punk.txt` datoteke
```text
3
90
Mare
5
80
90
Šomi
-4
5
2
120
1000000
1
```

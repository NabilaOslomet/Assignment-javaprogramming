Oppgaven er løst meg, Nabila Enayati med studentnummer S232069. Kildekoden for oppgaven er utviklet alene.
 De ulike oppgavene løses ved hjelp av Eclipse IDE. Jeg gir den korte beskrivelsen her:

1) Beskrivelse av oppgave 1:
public int antall (): Denne metoden returnerer ganske enkelt forekomstvariablen antall som bestemmer lengden på listen.
public boolean tom (): Denne metoden returnerer true når listen er tom ellers returnerer den false.
offentlig DobbeltLenketListe (T [] a): Denne konstruktøren vil bygge listen. Den vil også sjekke de nødvendige forholdene om listen er tom og den første noden er tildelt Hode og den siste noden er tildelt som hale. Pekerne er satt og antall variabler økes hver gang en ny elent legges til i listen.

2) Beskrivelse av oppgave 2:
a) public String toString (): Metoden bruker stringbuilder java-klasse for å bygge strengen. Den gjentas i listen ved hjelp av neste peker og bygger stringbuilder. Hvis listen er tom, returnerer den bare []. Ellers returnerer den streng i ønsket format.
public String omvendtString (): Denne metoden bruker også Java-klassen stringbuilder, men den gjentas i listen ved hjelp av forrige peker. Den skriver ut listen i omvendt rekkefølge.

b) public boolsk leggInn (T verdi): Denne metoden vil sette inn et element på slutten av listen. Hvis listen er tom, blir første elelemt tildelt hode og hale. Ellers blir elementet lagt til på slutten av listen og elementet som legges til, tildeles som hale. Variabelen entall og endringer økes også med en hver gang elementet legges til.

3) Beskrivelse av oppgave 3:
a) Node <T> finnNode (int indeks): Metoden finner noden ved spesifiserte indeks og returnerer den noden. Hvis indeksene er mindre enn eller lik halvparten av lengden, itererer den fra hode ellers itererer fra hale og returnerer noden ved de angitte indeksene.
b) public Liste <T> underliste (int fra, int til): Metoden returnerer underlisten fra start- og sluttindeks spesifisert i argumentet. Det må først kontrolleres om argumentet er lovlig eller gyldig, ellers gir det passende unntak. alle argumentene er gyldige, så gjentas det i listen fra startindeks til sluttindeks og legg til element i listen. det returnerer deretter listen.

4) Beskrivelse av oppgave 4:
public int indeksTil (T verdi): Metoden returnerer heltallverdien til indeksen der verdien finnes i listen. Hvis denne verdien ikke er i listen, returnerer den -1.
public boolean inneholder (T verdi): Metoden return true hvis verdi er funnet i listen eller andrevis returnerer den false.


5) Beskrivelse for oppgave 5:
 public void leggInn (int indeks, T verdi): Metoden legger til elementet i lsit i de spesifiserte indeksene. Metoden sjekker først for gyldige indeks og verdi og kaster passende unntak. Metoden sjekker deretter forskjellige forhold om indeksene er start eller på slutten eller mellom de to verdiene. Metoden itererer i listen ved hjelp av neste peker og gjør passende modifikasjoner i hode- og hale-pekere etter å ha lagt til verdien i listen. Den viktigste avgjørende delen av metoden er kodisjonen hvis (indeks> 0 && indeks <antall). Varier Null pekere unntak ble kastet i starten, men til slutt fjernes alle disse unntakene, metoden fungerer bra nå. Pekerne antall og endringer økes tilsvarende.

6) Beskrivelse av oppgave 6:

 public T fjern (int indeks): Metoden fjerner elementet fra listen ved den angitte indeksen. Metoden sjekker for indeks og fjerner elementet i de angitte indeksene. Metoden returnerer verdien på noden. De forskjellige pekerne justeres deretter og antallet blir redusert av en og endringer økes av en.

8) Beskrivelse av oppgave 8:
 public Iterator <T> iterator (): Metoden returnerer en forekomst av DobbeltLenketListeIterator klasse.
public Iterator <T> iterator (int indeks): Metoden sjekker for gyldig indeks og kjører gjenstanden til DobbeltLenketListeIterator klasse.
public T neste (): Metoden returnerer gjeldende verdi og skyver pekeren til neste.







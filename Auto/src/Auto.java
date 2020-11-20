class Opony {
    String marka;
    double tarcie;
}

public class Auto  {
    String color = "Czarny";
    int liczba_miejsc;
    int pojemnosc_silnika;
    double velocity = 10;
    Opony opony;

    void  jedz() {System.out.println("wrrrr wziuuum");}

    Opony get_opony() {return opony;}

    void set_all(String color, int liczba_miejsc, int pojemnosc_silnika, double velocity){
        this.color = color;
        this.liczba_miejsc = liczba_miejsc;
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.velocity = velocity;

    }
}

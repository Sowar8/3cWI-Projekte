package at.luca.school.handy;

public class Sim {
    private int id;
    private int telefonnummer;

    public Sim(int id, int telefonnummer) {
        this.id = id;
        this.telefonnummer = telefonnummer;
    }

    public void docall() {
        System.out.println("Calling: " + telefonnummer + " from SIMCARD " + id);
    }

    public int getId() {
        return id;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }
}

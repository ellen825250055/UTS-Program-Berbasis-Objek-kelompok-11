public class Unit {

    private String nama;
    private String noUnit;

    // Constructor dengan parameter
    public Unit(String nama, String noUnit) {
        this.nama = nama;
        this.noUnit = noUnit;
    }

    // Constructor kosong
    public Unit() {
    }

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter no unit
    public void setNoUnit(String noUnit) {
        this.noUnit = noUnit;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Getter no unit
    public String getNoUnit() {
        return noUnit;
    }
}
import java.util.ArrayList;

public abstract class Tagihan implements CetakTagihan {

    private String jenis;
    private String periode;
    private double jumlah;
    private double meterAwal;
    private double meterAkhir;
    private double harga;
    private double pemakaian;

    private Unit unit;

    private ArrayList<Unit> listUnit;

    public Tagihan(String jenis, String periode, double jumlah) {
        this.jenis = jenis;
        this.periode = periode;
        this.jumlah = jumlah;

        listUnit = new ArrayList<>();
    }

    public Tagihan() {
        listUnit = new ArrayList<>();
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public void setMeterAwal(double meterAwal) {
        this.meterAwal = meterAwal;
    }

    public void setMeterAkhir(double meterAkhir) {
        this.meterAkhir = meterAkhir;
    }

    public void setPemakaian(double pemakaian) {
        this.pemakaian = pemakaian;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public String getPeriode() {
        return periode;
    }

    public double getJumlah() {
        return jumlah;
    }

    public double getMeterAwal() {
        return meterAwal;
    }

    public double getMeterAkhir() {
        return meterAkhir;
    }

    public double getPemakaian() {
        return pemakaian;
    }

    public double getHarga() {
        return harga;
    }

    public void addUnit(Unit unit) {
        this.unit = unit;
        listUnit.add(unit);
    }

    public ArrayList<Unit> getListUnit() {
        return listUnit;
    }

    public double hitungPemakaian() {
        pemakaian = meterAkhir - meterAwal;
        return pemakaian;
    }

    public abstract double hitungTagihan();

    // Mengambil nama dari Unit
    @Override
    public String getNama() {
        return unit.getNama();
    }

    // Mengambil nomor unit dari Unit
    @Override
    public String getNoUnit() {
        return unit.getNoUnit();
    }


    // Mengambil total tagihan
    @Override
    public double getTotalTagihan() {
        return hitungTagihan();
    }

    // Mencetak tagihan
    @Override
public void cetakTagihan() {

    // Menghitung tagihan terlebih dahulu
    double total = hitungTagihan();

    System.out.println("===== TAGIHAN =====");
    System.out.println("Nama        : " + getNama());
    System.out.println("No Unit     : " + getNoUnit());
    System.out.println("Jenis       : " + jenis);
    System.out.println("Periode     : " + periode);
    System.out.println("Pemakaian   : " + hitungPemakaian());
    System.out.println("Harga       : Rp " + harga);
    System.out.println("Total       : Rp " + total);
   }
}
public class TagihanAir extends Tagihan {

    private double hargaPerM3;

    public TagihanAir(double hargaPerM3) {
        super("Air", "", 0);
        this.hargaPerM3 = hargaPerM3;
    }

    public TagihanAir() {
        super();
    }

    public void setHargaPerM3(double hargaPerM3) {
        this.hargaPerM3 = hargaPerM3;
    }

    public double getHargaPerM3() {
        return hargaPerM3;
    }

    @Override
    public double hitungTagihan() {
        double pemakaian = hitungPemakaian();

        setHarga(hargaPerM3);
        setPemakaian(pemakaian);

        return pemakaian * hargaPerM3;
    }
}
public class TagihanListrik extends Tagihan {

    private double kva;

    public TagihanListrik(double kva) {
        super("Listrik", "", 0);
        this.kva = kva;
    }

    public TagihanListrik() {
        super();
    }

    public void setKVA(double kva) {
        this.kva = kva;
    }

    public double getKVA() {
        return kva;
    }

    @Override
    public double hitungTagihan() {
        double pemakaian = hitungPemakaian();

        setHarga(kva);
        setPemakaian(pemakaian);

        return pemakaian * kva;
    }
}
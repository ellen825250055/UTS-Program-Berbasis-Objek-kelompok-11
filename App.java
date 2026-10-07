public class App {

    public static void main(String[] args) {

        // Membuat objek TagihanAir
        TagihanAir air = new TagihanAir(5000);

        air.setPeriode("September 2026");
        air.setMeterAwal(100);
        air.setMeterAkhir(125);

        // Membuat Unit Air
        Unit unitAir = new Unit("Budi", "A-101");

        // Menambahkan Unit ke tagihan
        air.addUnit(unitAir);

        // Menampilkan Tagihan Air
        air.cetakTagihan();

        System.out.println();


        // Membuat objek TagihanListrik
        TagihanListrik listrik = new TagihanListrik(1500);

        listrik.setPeriode("September 2026");
        listrik.setMeterAwal(200);
        listrik.setMeterAkhir(250);

        // Membuat Unit Listrik
        Unit unitListrik = new Unit("Budi", "A-102");

        // Menambahkan Unit ke tagihan
        listrik.addUnit(unitListrik);

        // Menampilkan Tagihan Listrik
        listrik.cetakTagihan();

        System.out.println();


        // Menampilkan jumlah Unit
        System.out.println("Jumlah Unit Air     : "
                + air.getListUnit().size());

        System.out.println("Jumlah Unit Listrik : "
                + listrik.getListUnit().size());
    }
}
public class InvoicePembayaran {

    private String nomorInvoice;
    private double jumlahPembayaran;

    // Constructor dengan parameter
    public InvoicePembayaran(String nomorInvoice, double jumlahPembayaran) {
        this.nomorInvoice = nomorInvoice;
        this.jumlahPembayaran = jumlahPembayaran;
    }

    // Constructor kosong
    public InvoicePembayaran() {
    }

    // Setter nomor invoice
    public void setNomorInvoice(String nomorInvoice) {
        this.nomorInvoice = nomorInvoice;
    }

    // Setter jumlah pembayaran
    public void setJumlahPembayaran(double jumlahPembayaran) {
        this.jumlahPembayaran = jumlahPembayaran;
    }

    // Getter nomor invoice
    public String getNomorInvoice() {
        return nomorInvoice;
    }

    // Getter jumlah pembayaran
    public double getJumlahPembayaran() {
        return jumlahPembayaran;
    }
}
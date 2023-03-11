package OOP;

public class Product {
    private String nama;
    private String deskripsi;
    private int harga;
    private int jmlStok;

    public Product(String nama, String deskripsi, int harga, int jmlStok) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jmlStok = jmlStok;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi(){
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga(){
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJmlStok(){
        return this.jmlStok;
    }

    public void setJmlStok(int jmlStok){
        this.jmlStok = jmlStok;
    }

    public void infoProduct(){
        System.out.println("===" +
                "\nINFO PRODUK"+
                "\nNama: " + this.nama +
                "\nDeskripsi: " + this.deskripsi +
                "\nHarga: " + this.harga +
                "\nJumlah Stok: " + this.jmlStok +
                "\n===");
    }
}
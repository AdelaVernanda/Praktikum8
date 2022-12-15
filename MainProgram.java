public class MainProgram {
    public static void main(String[] args) {
        Customer adela = new Customer();
        adela.nama = "Adela Vernanda";
        adela.alamat = "Cikarang";

        Order laptop = new Order();

        laptop.date = 18;
        laptop.status = "Baru";

        Payment baru = new Payment();

        baru.jumlah = 10000000;
    }
}
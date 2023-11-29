import java.util.Scanner;

public class Pelanggan extends DataPelanggan{

    //method untuk mengisi data pelanggan
    public void isiDataPelanggan(){
        Scanner scanStr = new Scanner(System.in);
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Masukkan no faktur = ");
        faktur = scanStr.next();
        System.out.println("Masukkan nama pelanggan = ");
        namaPelanggan = scanStr.next();
        System.out.println("Masukkan nama barang = ");
        namaBarang = scanStr.next();
        System.out.println("Masukkan harga barang = ");
        hargaBarang = scanIn.nextInt();
        System.out.println("Masukkan jumlah barang = ");
        jumlahBarang = scanIn.nextInt();
    }

    //menthod untuk mencetak struk
    @Override
    public void Struk() {
        Integer totalBayar = hargaBarang*jumlahBarang;
        this.totalBayar = totalBayar;

        System.out.println("----------- Struk -----------");
        System.out.println("No Faktur = " + faktur);
        System.out.println("Nama Pelanggan " + namaPelanggan);
        System.out.println("Nama Barang = " + namaBarang);
        System.out.println("Harga = " + hargaBarang);
        System.out.println("Jumlah = " + jumlahBarang);
        System.out.println("Total Bayar = " + this.totalBayar);
        System.out.println("-----------------------------");
    }
    

}

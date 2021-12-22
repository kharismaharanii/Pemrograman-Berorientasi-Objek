import java.util.*;

class Novel
{
    String judul, nama_pengarang, deskripsi;
    int tahun_terbit, harga_jual;
    private int harga_beli1, harga_beli2, harga_beli3;
    Scanner inputUser = new Scanner(System.in);

    Novel(String judul, String nama_pengarang, String deskripsi, int tahun_terbit)
    {
        harga_beli1 = 45000;
        harga_beli2 = 38000;
        harga_beli3 = 58000;
        System.out.println("1. Judul =" + judul);
        System.out.println("2. Nama pengarang =" + nama_pengarang);
        System.out.println("3. Deskripsi =" + deskripsi);
        System.out.println("4. Tahun terbit = " + tahun_terbit);
    }

    public int getharga_beli1()
    {
        System.out.println("5. Harga beli = Rp" + harga_beli1);
        harga_jual = harga_beli1 - ((20*harga_beli1)/100);   
        System.out.println("6. Harga jual = Rp" + harga_jual);
        return harga_beli1;
    }

    public int getharga_beli2()
    {
        System.out.println("5. Harga beli = Rp" + harga_beli2);
        harga_jual = harga_beli2 - ((20*harga_beli2)/100);   
        System.out.println("6. Harga jual = Rp" + harga_jual);
        return harga_beli2;
    }

    public int getharga_beli3()
    {
        System.out.println("5. Harga beli = Rp" + harga_beli3);
        harga_jual = harga_beli3 - ((20*harga_beli3)/100);   
        System.out.println("6. Harga jual = Rp" + harga_jual);
        return harga_beli3;
    }
}
public class Tugas3 {
    public static void main(String[] args) {
        System.out.println("Novel 1");
        Novel novel1 = new Novel(" A Study in Scarlet", " A. Conan Doyle"," Tentang misteri pembunuhan", 1887);
        novel1.getharga_beli1();
        System.out.print("\n");
        System.out.println("Novel 2");
        Novel novel2 = new Novel(" The Hound of the Baskervilles", "  A. Conan Doyle"," Tentang anjing misterius", 1902);
        novel2.getharga_beli2();
        System.out.print("\n");
        System.out.println("Novel 3");
        Novel novel3 = new Novel(" The Murder of Roger Ackroyd", " Agatha Christie"," Tentang misteri pembunuhan", 1926);
        novel3.getharga_beli3();
    }
}

import java.util.*;

class deret
{
    Scanner inputUser = new Scanner(System.in);
    int isideret, nilai_awal, beda, muncul, total, rata;

    deret()
    {
        input();
        rata2();
        print();
        System.out.println("Maka, rata-rata : " + rata);
    }
    void input()
    {
        System.out.print("Masukkan nilai awal : ");
        nilai_awal = inputUser.nextInt();
        System.out.print("Masukkan beda deret : ");
        beda = inputUser.nextInt();
        System.out.print("Masukkan jumlah kemunculan pada deret : ");
        muncul =  inputUser.nextInt();
    }
    void rata2()
    {
        total = (muncul*(2*nilai_awal + (muncul-1)*beda))/2;
        rata = total/muncul;
    }
    void print()
    {
        System.out.println("\nDERET");
        System.out.println("Angka ke-1 : " + nilai_awal);
        for( int i = 2; i <= muncul; i++)
        {
            nilai_awal += beda;
            System.out.println("Angka ke-" + i + " : " + nilai_awal);
        }
    }
}
public class Tugas2 {
    public static void main(String[] args) {
        deret obj = new deret();
    }
}

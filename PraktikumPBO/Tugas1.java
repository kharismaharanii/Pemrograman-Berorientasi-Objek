import java.util.*;

class Kriteria
{
    int angka;
    Scanner inputUser = new Scanner(System.in);
    Kriteria()
    {
        angka = inputUser.nextInt();
        if (angka > 0 && angka%2 == 0)
        {
            System.out.println("Positif Genap");
        }
        else if (angka > 0 && angka%2 == 1)
        {
            System.out.println("Positif Ganjil");
        }
        else if (angka < 0 && angka%2 == 0)
        {
            System.out.println("Negatif Genap");
        }
        else
        {
            System.out.println("Negatif Ganjil");
        }
    }
}

public class Tugas1 {
    public static void main(String[] args) {
        System.out.print("Input angka : ");
        Kriteria kriteria1 = new Kriteria();
    }
}

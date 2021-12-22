package com.tutorial.Tugas1;
import java.util.Scanner;

class Saldoakun{
    Scanner inputuser = new Scanner(System.in);
    String Nama_akun;
    int Saldo1 , Saldo2, Saldo, Kredit, Debit, getBalance;

    Saldoakun()
    {
        System.out.print("Nama Nasabah : ");
        Nama_akun = inputuser.next();

        System.out.print("Masukkan saldo awal anda : ");
        Saldo = inputuser.nextInt();
        if(Saldo <= 0)
        {
            System.out.println("Saldo tidak valid!\n");
        }
    }

    void Kredit()
    {
        System.out.print("Masukkan saldo yang akan anda isikan : ");
        Saldo2 = inputuser.nextInt();
        Saldo = Saldo + Saldo2;
        System.out.println("Total saldo anda : " + Saldo);
    }

    void Debit()
    {
        System.out.print("Masukkan debit : ");
        Debit = inputuser.nextInt();
        if(Debit > Saldo)
        {
            System.out.println("Debit lebih dari saldo!");
        }
        else
        {
            Saldo = Saldo - Debit;
            System.out.println("Total saldo anda : " + Saldo);
        }
    }

    void getBalance(){
        System.out.println("Saldo anda : " + Saldo);
    }

    void display()
    {
            System.out.println("Selamat datang");
            System.out.println("1. Kredit");
            System.out.println("2. Debit");
            System.out.println("3. Saldo saat ini");
            System.out.print("Masukkan pilihan anda : ");
            int pil = inputuser.nextInt();
            if(pil == 1)
                {
                    Kredit();
                }
            else if (pil == 2)
                {
                    Debit();
                }
            else if (pil == 3)
                {
                    getBalance();
                }
    }
}

public class Akun{
    public static void main(String[] args) {
    System.out.println("Nasabah 1");
    Saldoakun Nasabah = new Saldoakun();
    Nasabah.display();
    System.out.println("\nNasabah 2");
    Saldoakun Nasabah2 = new Saldoakun();
    Nasabah2.display();
    }
}


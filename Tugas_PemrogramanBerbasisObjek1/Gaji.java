package com.tutorial.Tugas1;
import java.util.Scanner;

class Karyawan
{
    Scanner inputuser = new Scanner(System.in);
    String nama_depan;
    String nama_belakang;
    int Total, Totalgt, Totalp;
    private int gaji_bulanan;

    Karyawan()
    {
        System.out.print("Nama depan : ");
        nama_depan = inputuser.next();
        System.out.print("Nama belakang : ");
        nama_belakang = inputuser.next();
        System.out.print("Gaji bulanan karyawan : ");
        gaji_bulanan = inputuser.nextInt();
    }

    public int getgaji_bulanan()
    {
        return gaji_bulanan;
    }

    public void setgaji_bulanan()
    {
        if(getgaji_bulanan() < 0)
        {
            System.out.println("Gaji anda 0");
        }
    }
    
    void gaji_setahun()
    {
        Totalgt = getgaji_bulanan()*12;
        System.out.println("Gaji dalam satu tahun : " + Totalgt);
        Totalp = (10*Totalgt)/100;
        System.out.println("Tambahan 10% per tahun : " + Totalp);
        Total = Totalgt + Totalp;
        System.out.println("Total gaji seluruhnya : " + Total);
    }
}
public class Gaji {
    public static void main(String[] args)
    {
        System.out.println("Karyawan A");
        Karyawan objkaryawan = new Karyawan();
        System.out.println("Gaji dalam satu bulan : " + objkaryawan.getgaji_bulanan());
        objkaryawan.setgaji_bulanan();
        objkaryawan.gaji_setahun();
        System.out.println("\n");
        System.out.println("Karyawan B");
        Karyawan objkaryawan2 = new Karyawan();
        System.out.println("Gaji dalam satu bulan : " + objkaryawan2.getgaji_bulanan());
        objkaryawan2.setgaji_bulanan();
        objkaryawan2.gaji_setahun();
    }
}

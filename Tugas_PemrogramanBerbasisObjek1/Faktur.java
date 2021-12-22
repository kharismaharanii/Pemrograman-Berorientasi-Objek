package com.tutorial.Tugas1;
import java.util.Scanner;

class Invoice
{
    Scanner inputuser = new Scanner(System.in);
    String kode;
    String deskripsi;
    int item_dibeli;
    int item_harga;

    Invoice()
    {
        System.out.print("\nKode : ");
        kode = inputuser.next();
        if(kode.length() < 5)
        {
            System.out.println("Tidak valid!");
        }
        else{
            System.out.print("Deskripsi : ");
            deskripsi = inputuser.next();
            if(kode.length() < 5)
            {
                System.out.println("Tidak valid!");
            }
            else
            {
                System.out.print("Item dibeli : ");
            this.item_dibeli = inputuser.nextInt();
            if (item_dibeli < 0)
            {
                item_dibeli = 0;
                System.out.println("Tidak valid!");
            }
            else
            {
                System.out.print("Item harga : ");
                this.item_harga = inputuser.nextInt();
                if (item_harga < 0)
                {
                    item_harga = 0;
                    System.out.println("Tidak valid!");
                }
            }
            
            }
            
        }
       
    }

    public void setkode(String kode)
    {
        if(kode.length() < 5)
        {
            System.out.println("Tidak valid!");
        }
    }

    String getkode()
    {
        return kode;
    }

    public void setdeskripsi(String deskripsi)
    {
        if(deskripsi.length() < 5)
        {
            System.out.println("Tidak valid!");
        }
    }

    String getdeskripsi()
    {
        return deskripsi;
    }

    public void setitem_dibeli(int item_dibeli)
    {
        if (item_dibeli < 0)
        {
            item_dibeli = 0;
            System.out.println("Tidak valid!");
        }
    }
    
    int getitem_dibeli()
    {
        return this.item_dibeli;
    }

    public void setitem_harga(int item_harga)
    {
        if (item_harga < 0)
        {
            item_harga = 0;
            System.out.println("Tidak valid!");
        }
    }
    
    int getitem_harga()
    {
        return this.item_harga;
    }

    int getInvoceAmount()
    {
        return item_dibeli*item_harga;
    }
}

public class Faktur {
    public static void main(String[] args) {
        Invoice databeli = new Invoice();
        System.out.println("Maka, total faktur A : " + databeli.getInvoceAmount());
        
        Invoice databeli2 = new Invoice();
        System.out.println("Maka, total faktur B : " + databeli2.getInvoceAmount());
    }

}


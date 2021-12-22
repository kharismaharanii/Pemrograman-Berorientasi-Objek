class Tim
{
    String nama;
    Member m;
    Trainee t;

    void setmember(Member m)
    {
        this.m = m;
    }
    void displayfullmember()
    {
        this.m.display();
    }

    void displaytrainee(Trainee t)
    {
        this.t = t;
        this.t.display();
    }
    
    String getnama()
    {
        return this.nama;
    }

    void setnama(String nama)
    {
        this.nama = nama;
    }
}

class Member
{
    String nama;
    int umur;
    
    Member(String nama, int umur)
    {
        this.nama = nama;
        this.umur = umur;
    }

    void setumur(int umur)
    {
       this.umur = umur;
    }

    void display()
    {
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur + " tahun\n");
    }
}

class Trainee
{
    int lamatraining;
    String nama;
    int umur;

    Trainee(String nama, int umur, int lamatraining)
    {
        this.nama = nama;
        this.umur = umur;
        this.lamatraining = lamatraining;
    }

    int getlamatraining()
    {
        return lamatraining;
    }

    void display()
    {
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur + " tahun");
        System.out.println("Lama trainee : " + this.lamatraining + " bulan\n");
    }
}

public class Teamwork {
    public static void main(String[] args) {
        Tim Tim = new Tim();
        Member Member1 = new Member("Zayn Malik" , 24);
        Member Member2 = new Member("Harry Style" , 25);
        Trainee Trainee1 = new Trainee("Liam Payne", 20, 2);
        Trainee Trainee2 = new Trainee("Naill Horan", 21, 2);

        System.out.println("---TEAM WORK 2020---");
        System.out.println("---DAFTAR MEMBER---");
        Tim.setmember(Member1);
        Tim.displayfullmember();
        Tim.setmember(Member2);
        Tim.displayfullmember();

        System.out.println("---DAFTAR TRAINEE---");
        Tim.displaytrainee(Trainee1);
        Tim.displaytrainee(Trainee2);
    }
}
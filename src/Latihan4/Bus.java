
package Latihan4;

public class Bus {
    public int penumpang;
    public int maxPenumpang;

    public Bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //method mutator
    public void addPenumpang(int penumpang) {
        int temp ;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang){
        System.out.println("Penumpang melebihi kuota");
    }else{
            this.penumpang = temp;
    }
    }
    public void getPenumpang(int password) {
        if (password == 24){
            System.out.println("Password Benar");
        } else {
            System.out.println("Password Salah");
        }
    }
    public void cetakPenumpang(){
        System.out.println("Penumpang Bus Sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxPenumpang);
    }
    
}

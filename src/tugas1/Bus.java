
package tugas1;

public class Bus {
    public double penumpang;
    public double maxPenumpang;
    public double average;
    public double beratPenumpang;

    public Bus(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 5;
    }
    
    //method mutator
    public void addBeratPenumpang(double beratPenumpang) {
        double temp ;
        temp = this.beratPenumpang+beratPenumpang;
        {
            this.beratPenumpang = temp;
    }

    }
    public void average(){
        average = beratPenumpang / penumpang;
        System.out.println("Rata-Rata penumpang ditambahkan adalah = " + average);
        
    
}
    public void setBeratPenumpang(double beratPenumpang){
        this.beratPenumpang = beratPenumpang;
    }
    public void cetakBeratPenumpang(){
        System.out.println("Berat Penumpang Bus Sekarang = " + beratPenumpang);
}
}
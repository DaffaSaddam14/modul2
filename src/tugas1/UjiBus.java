
package tugas1;

public class UjiBus {

    public static void main(String[] abc) {
        Bus Bus1 = new Bus(5);
        Bus1.setBeratPenumpang(35);
        Bus1.addBeratPenumpang(30);
        Bus1.cetakBeratPenumpang();
        Bus1.addBeratPenumpang (54);
        Bus1.cetakBeratPenumpang ();
        Bus1.addBeratPenumpang (50);
        Bus1.cetakBeratPenumpang();
        Bus1.addBeratPenumpang(48);
        Bus1.cetakBeratPenumpang();
        Bus1.addBeratPenumpang(62);
        Bus1.cetakBeratPenumpang();
        Bus1.average();
        
        
    }

}
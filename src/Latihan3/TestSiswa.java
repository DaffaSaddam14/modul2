
package Latihan3;

public class TestSiswa {

    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Saddam");
        siswa.setAbsen(14);
        siswa.setAddress("Malang");
        
        System.out.println("Name : " + siswa.getName() + "\nAbsen : " + siswa.getAbsen() + "\nAddress : " + siswa.getAddress());
    }
    
}

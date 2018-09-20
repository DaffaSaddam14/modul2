
package tugas2;

public class Bola {
    private double jari;
    private double showDiameter;
    private double showLP;
    private double volume;

    public double getJari() {
        return jari;
    }

    public double getShowDiameter() {
        return showDiameter;
    }

    public double getShowLP() {
        return showLP;
    }

    public double getVolume() {
        return volume;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    void cetakJari(){
        System.out.println("Jari-Jari = " + jari);
    }
    
    public void cetakDiameter() {
        System.out.println("Diameter = " + 2 * jari);
    }

    public void cetakLP() {
        System.out.println("Luas Permukaan = " + (4 * Math.PI * jari * jari));
    }

    void cetakVolume() {
        System.out.println("Volume = " + (4 / 3 * Math.PI * jari * jari * jari));
    }
    
    
    
    
    
}

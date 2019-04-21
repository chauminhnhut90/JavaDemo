package buoi_3;

public class Animal {

    // Thuoc tinh
    int sochan;
    int soduoi;
    int sosung;

    // Phuong thuc khoi tao
    public Animal(){

    }

    public Animal(int sochan, int soduoi, int sosung){
        this.sochan = sochan;
        this.sochan = soduoi;
        this.sosung = sosung;
    }

    // Phuong thuc
    public void chay(){
        System.out.println("Chạy");
    }

    public void vayduoi(){
        System.out.println("Vẩy đuổi");
    }

    public void an(){

    }

    // Getter & Setter

    public int getSochan() {
        return sochan;
    }

    public void setSochan(int sochan) {
        this.sochan = sochan;
    }

    public int getSoduoi() {
        return soduoi;
    }

    public void setSoduoi(int soduoi) {
        this.soduoi = soduoi;
    }

    public int getSosung() {
        return sosung;
    }

    public void setSosung(int sosung) {
        this.sosung = sosung;
    }
}

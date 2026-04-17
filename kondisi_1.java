public class kondisi_1 {
    public static void main(String[] args) {
        int usia = 200;
        double totalBelanja = 180000;
    
        if (usia < 18) {
            System.out.println("Ases dibatasi : Dibawah umur 18 tahun");
        } else if (totalBelanja >= 149000){
            System.out.println("Akses diberikan + Diskon 15%");
        }else {
            System.out.println("Akses diberikan, tanpa diskon");
     }
    }
}

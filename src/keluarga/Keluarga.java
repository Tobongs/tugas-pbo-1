/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keluarga;
/**
 *
 * @author user
 */
public class Keluarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person bapakAAL_ARIYANTO = new Parent("AAL", "semarang", "25 Mei 1968", "TNI_AD", "Magelang", "082283693100");
        Person ibuRETMAWATI = new Parent("RETMAWATI", "Magelang", "10 Juni 1981", "Ibu_rumah tangga", "Magelang", "082283693100");
        Person ARA_MINTA = new Child("ARA MINTA", "Magelang", "21 April 2002", "Pelajar/Mahasiswa", "Magelang", "082283693100");
        Person HAMAS = new Child("HAMAS ARDHANA", "Magelang", "16 April 2003", "Pelajar/mahasiswa", "Magelang", "082283693100");

        // Mencetak informasi ke konsol
        System.out.println("Keluarga dari Bapak AAL:");
        System.out.println("------ BAPAK ------ ");
        System.out.println(bapakAAL_ARIYANTO.getDetails());

        System.out.println("------ IBU ------ ");
        System.out.println(ibuRETMAWATI.getDetails());

        System.out.println("Mereka berdua memiliki 2 anak:");
        System.out.println("Anak pertama yaitu anak perempuan");
        System.out.println(ARA_MINTA.getDetails());

        System.out.print("Dan dia memiliki adik laki-laki yang merupakan anak kedua bagi kedua orang tuanya\n");
        System.out.println(HAMAS.getDetails());
    }
}

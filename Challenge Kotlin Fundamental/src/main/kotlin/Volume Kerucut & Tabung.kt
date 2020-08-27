import java.awt.SystemColor.menu
import java.util.*
public var input = Scanner(System.`in`);
fun main() {

    print("Nama :")
    val nama: String? = input.nextLine()

    if (nama.isNullOrEmpty()) {
        println("Di isi ya guys !!")
        main()
    }
    print("Kelas :")
    val kelas: String = input.nextLine()
    print("No Absen:")
    val Absen = input.nextInt()
    print("GitHub:")
    val git: String? = null
    val gitLength = git?.length ?: "Regina-Permatasari"
    println(gitLength)
    println("================================")
    menu()
}
fun menu(){
    print ("Kamu ingin menghitung apa?\n")
    println("1. Kerucut\n2. Tabung\n3. Batal ")
    print ("Pilih Menu Bangun Ruang : ")
    val pill:Int? = input.nextInt()
    when (pill) {
        1 -> kerucut()
        2 -> tabung()
        else -> {
            println("Menu tidak tersedia")
            menu()
        }
    }
}
fun kerucut() {
    println("================================");
    print("Masukan Tinggi Kerucut : ");
    val tinggi: Double = input.nextDouble();
    print("Masukan Jari-jari Kerucut : ");
    val jari: Double = input.nextDouble();

    val v: Double = (0.33333) * Math.PI * (jari * jari) * tinggi;
    println("================================");
    print("Volume kerucut adalah = ");
    System.out.printf("%.2f", v);
    println()
    println("================================");
    menu()

}
fun tabung() {
    println("================================");
    print("Masukan Tinggi tabung : ");
    var tinggi: Double? = null
    tinggi = input.nextDouble();
    print("Masukan jari-jari tabung: ");
    var jari: Double? = null
    jari = input.nextDouble();
    val v = Math.PI * jari * jari * tinggi;
    println("================================");
    print("Volume tabung adalah = ")
    System.out.printf("%.2f", v);
    println()

}
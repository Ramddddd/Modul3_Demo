import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * kelas deteksi umur
 */
public class DeteksiUmur {
    private int tahunlahir;

    /**
     * digunakan untuk men set tahunmlahir
     * @param tahunLahir tahun kelahiran user
     */
    public void setTahunLahir(int tahunLahir) {
        this.tahunlahir = tahunLahir;
    }

    /**
     * digunakan untuk mendapatkan tahun melahiran
     * @return tahun lahir
     */
    public int getTahunLahir() {
        return tahunlahir;
    }

    /**
     * metode utama buat
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeteksiUmur tahunKelahiran = new DeteksiUmur();

        System.out.println("Enter your birth year:");
        int tahunLahir = scanner.nextInt();
        tahunKelahiran.setTahunLahir(tahunLahir);

        System.out.println("Enter your birth month (1-12):");
        int bulanLahir = scanner.nextInt();

        System.out.println("Enter your birth day (1-31):");
        int tanggalLahir = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(tahunLahir, bulanLahir, tanggalLahir);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        System.out.println("tahun lahir " + years + " years, " + months + " months, and " + days + " days.");
    }
}

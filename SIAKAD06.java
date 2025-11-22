import java.util.Scanner;

public class SIAKAD06 {
     public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in); 
 
    System.out.println("Masukkan jumlah siswa:"); 
    int jumlahSiswa = sc.nextInt(); 
    System.out.println("Masukkan jumlah mata kuliah:"); 
    int jumlahMatkul = sc.nextInt(); 
    System.out.println("========================================="); 
 
    int[][] nilai = new int[jumlahSiswa][jumlahMatkul]; 
 
    for (int i = 0; i < nilai.length; i++) { 
      System.out.println("Input nilai mahasiswa ke-" + (i + 1)); 
      double totalPerSiswa = 0; 
 
      for (int j = 0; j < nilai[i].length; j++) { 
        System.out.println("Nilai mata kuliah " + (j + 1) + ": "); 
        nilai[i][j] = sc.nextInt(); 
        totalPerSiswa += nilai[i][j]; 
      } 
 
      System.out.println("Nilai rate-rata: " + totalPerSiswa / nilai[i].length); 
    } 
 
    System.out.println("========================================="); 
    System.out.println("Rata-rata nilai setiap mata kuliah:");
     for (int j = 0; j < jumlahMatkul; j++) { 
      double totalPerMatkul = 0; 
 
      for (int i = 0; i < jumlahSiswa; i++) { 
        totalPerMatkul += nilai[i][j]; 
      }
      System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa); 

    } 
    sc.close(); 
  } 
}
import java.util.Scanner;
public class Soal1 {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    // Masukkan Nilai Pertama
    int nilaiPertama = inp.nextInt();

    // Masukkan Nilai Kedua
    int nilaiKedua = inp.nextInt();
    inp.close();

    System.out.println("FPB dari " + nilaiPertama + " dan " + nilaiKedua + " = " + nilaiFPB(nilaiPertama,nilaiKedua));
  }
  static int nilaiFPB(int nilaiX, int nilaiY){
      int hasil = 0;
      int nilaiMax = Math.max(nilaiX, nilaiY);
      
      for(int i = nilaiMax; i > 0; i--){
        if(nilaiX % i == 0 && nilaiY % i == 0){
          hasil += i;
          break;
        }
    }
    return hasil;
  }
}
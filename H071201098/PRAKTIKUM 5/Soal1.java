import java.util.Scanner;
public class Soal1 {
  public static void main(String[] args) {
    Scanner inpt = new Scanner(System.in);

    System.out.print("Masukkan Nilai Pertama: ");
    int nilaiPertama = inpt.nextInt();

    System.out.print("Masukkan Nilai Kedua: ");
    int nilaiKedua = inpt.nextInt();

    System.out.println("FPB dari " + nilaiPertama + " dan " + nilaiKedua + " = " + nilaiFPB(nilaiPertama,nilaiKedua));
  }
  static int nilaiFPB(int nilaiX, int nilaiY){
      int nilaiZ = 0;
      int nilaiMax = Math.max(nilaiX, nilaiY);
      int i = nilaiMax;
      while(i > 0){
        i--;
        if(nilaiX % i == 0 && nilaiY % i == 0){
          nilaiZ += i;
          break;
        }
    }
    return nilaiZ;
  }
}
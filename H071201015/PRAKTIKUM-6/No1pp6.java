import java.util.Scanner;

 class No1pp6 {

   static String stringManip (String stc) {
     stc = stc.replace(" ", "");
     stc = stc.toUpperCase();
     String rev = "";
     int panjang = stc.length();

     for (int i = 0;i < panjang/2 ;i++) {
       rev = rev + stc.charAt(i);
     }

     panjang = rev.length();
     for (int j = panjang-2;j >= 0 ;j-- ) {
       rev = rev + rev.charAt(j);
     }

     return rev;
   }

   static String hexManip (String stc) {
     int p = stc.length();
     p = p*p;
     String hexM = String.format("%x", p);

     return hexM;
   }

   static String octManip (String stc) {
     int panjang = stc.length();
     String oct = String.format("%o", panjang);
     return oct;
   }

   static String simbol (String stc) {
     String satu = "" + stc.charAt(0);
     String simbol = "";

     try {
       int n = Integer.parseInt(satu);
     }
     catch(Exception e) {
        simbol = "?";
       return simbol;
     }

     simbol = "!";
     return simbol;
   }

  public static void main(String[] args) {
      Scanner val = new Scanner(System.in);
      System.out.printf("input kalimat : ");
      String stc = val.nextLine();

      String hex = hexManip(stc);
      String oct = octManip(stc);
      String palind = stringManip(stc);
      String simb = simbol(hex);

      System.out.printf("kode unik : ");
      System.out.println("#" + hex + palind + oct + simb);

      val.close();
  }
}

import java.util.Scanner;

 class No2pp6 {
    static String codePointA(String stc, int i) {

    if (i % 2 != 0) {
      char x = stc.charAt(i);
      int uni = (int) x;
      stc = Integer.toString(uni);
      return stc;
    }

     char s1 = stc.charAt(i);
     stc = String.valueOf(s1);
    return stc;
   }

  public static void main(String[] args) {
    Scanner val = new Scanner (System.in);

    String stc = val.nextLine();
    int leng = stc.length();

    String stc1 = "";
    String uniChar = "";
    for (int i = 0;i < leng;i++) {
      stc1 = codePointA(stc, i);
       uniChar = uniChar + stc1;
    }

    double maksKarakter = (uniChar.length()/16f);
    int ctrl =(int) (Math.ceil(maksKarakter)); // maksCeil = pembulatan keatas

      int count = 0;
      int count2 = 0;
      for (int m = 0;m < 16*ctrl ;m++ ) {

        try {
          System.out.print(uniChar.charAt(m));
        } catch(Exception e) {
          System.out.print('?');
        }
        count++;
        count2++;

        if (count == ctrl) {
          System.out.print(" ");
          count = 0;
        }

        if (count2 == ctrl*4) {
          System.out.println(" ");
          count2 = 0;
        }

      }

    val.close();
  }
}

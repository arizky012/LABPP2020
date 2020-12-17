import java.util.Scanner;


import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

class P8Nomor2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    String fileSource = "file/" + obj.nextLine() + ".txt";
    String fileDestination = "file/" + obj.nextLine() + ".txt";
    copyFile(fileSource, fileDestination); 
    obj.close();
  }

  static void copyFile(String source, String dest) {
    File file = new File (source);
    if (!file.exists() || !file.isFile()){
      System.out.println();
      System.out.println("\"gagal\"");
      return;
    }else{
    String copyFileName = source.replace(source,dest);
    // use filestreaminput and filestreamoutput  
    try (BufferedReader in = new BufferedReader(new FileReader(source));
        BufferedWriter out = new BufferedWriter(new FileWriter(copyFileName))) {
      BufferedReader a = new BufferedReader(new FileReader(source));
      int sum = 0;
      while (a.readLine() !=null){
        sum++;
      }
      int [] charArray = new int[sum];
      a.close();
      
      BufferedReader b = new BufferedReader(new FileReader(source));
      String line = new String();
      int sum2=0;
      int length;
      while ((  line  = b.readLine())   !=null){
      length = line.length();
      charArray[sum2]= length;
      sum2++;
      }  
      b.close();
      //menentukan nilai maks
      int max = charArray[0];
      for (int i =0; i< charArray.length;i++){
        if(charArray[i]>max){
          max= charArray [i];
        }
      }
      //menulis hasil salinan menjadi rata kanan
      String line2 = new String();
      length = line2.length();
      while ((line2= in.readLine())!=null){
        out.write(String.format("%"+max+"s",line2));
        out.newLine();
      }
      out.close();
      System.out.println();
      System.out.println("\"Berhasil\"");
    }
     catch (Exception e) {
       e.printStackTrace();
    } 
  }
  }
}

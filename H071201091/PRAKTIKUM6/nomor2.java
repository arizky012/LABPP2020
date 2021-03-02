import java.util.*;

/**
 * nomor2
 */
public class nomor2 {
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        String input = scan.nextLine();
        char [] ver = input.toCharArray();
        int kode = 0;
        for (int i = 0; i<ver.length;i++){
            if(i%2==1){
                String code = String.valueOf(ver[i]);
                kode = code.indexOf(ver[i]);
            }
            System.out.print(ver[i] + " " + kode);
        }
        

    // String s=scan.next();
    // String spasi = 
    // char [] arr= s.toCharArray();
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println("Data at ["+i+"]="+arr[i]);
    }
}
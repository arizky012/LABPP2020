import java.util.HashMap;
import java.util.Scanner;

public class P7no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> favmov = new HashMap<>();
        favmov.put(1, "Avenger: Endgame");
        favmov.put(2, "Spiderman: Far From Home");
        favmov.put(3, "Venom");
        favmov.put(4, "Thor: Ragnarok");

        HashMap<Integer, String> rilis = new HashMap<>();
        rilis.put(1, "24 April 2019");
        rilis.put(2, "26 Juni 2019");
        rilis.put(3, "1 Oktober 2018 ");
        rilis.put(4, "10 Oktober 2017");

        HashMap<Integer, String> durasi = new HashMap<>();
        durasi.put(1, "3 Jam 1 Menit");
        durasi.put(2, "2 Jam 9 Menit");
        durasi.put(3, "1 Jam 52 Menit");
        durasi.put(4, "2 Jam 10 Menit");

        HashMap<Integer, String> genre = new HashMap<>();
        genre.put(1, "Adventure, Sci-Fi, Action");
        genre.put(2, "Adventure, Sci-Fi, Action");
        genre.put(3, "Adventure, Sci-Fi, Action");
        genre.put(4, "Adventure, Sci-Fi, Action, Fantasy, Comedy");

        HashMap<Integer, String> sinopsis = new HashMap<>();
        sinopsis.put(1, "ini sinopsis");
        sinopsis.put(2, "ini sinopsis");
        sinopsis.put(3, "ini sinopsis");
        sinopsis.put(4, "ini sinopsis");

        HashMap<Integer, String> cast = new HashMap<>();
        cast.put(1, "Robert Downey Jr., Chris Evan, Mark Ruffalo");
        cast.put(2, "Tom Holland, Samuel L. Jackson, Jake Gyllenhall");
        cast.put(3, "Tom Hardy, Michelle Williams, Riz Ahmed");
        cast.put(4, "Chris Hemsworth, Tom Hiddleston, Cate Blanchett");

        while (true) {
            System.out.println("Favorite Movie");
            favmov.forEach((k, v) -> {
                System.out.println(k + ". " + v);
            });

            System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
            String op = input.next();

            if (op.equals("d")) {
                int x = input.nextInt();
                String judul = favmov.get(x);
                String r = rilis.get(x);
                String d = durasi.get(x);
                String g = genre.get(x);
                String s = sinopsis.get(x);
                String c = cast.get(x);

                System.out.println("Judul: " + judul);
                System.out.println("Rilis: " + r);
                System.out.println("Durasi: " + d);
                System.out.println("Genre: " + g);
                System.out.println("Sipnopsis: " + s);
                System.out.println("Cast: " + c);
            } else if (op.equals("s")) {
                String y = input.next();
                boolean ada = false;
                for (int i = 1; i <= favmov.size(); i++) {
                    if (favmov.get(i).contains(y)) {
                        System.out.println("Hasil Pencarian : " + favmov.get(i));
                        ada = true;
                    }
                    
                    
                }
                if (ada == false) {
                    System.out.println("Film Tidak Ada");
                }

            } else if (op.equals("a")) {
                String name = input.nextLine();
                System.out.println("Judul  :" + name);
                System.out.print("Rilis: ");
                String date = input.nextLine();
                System.out.print("Durasi: ");
                String duration = input.nextLine();
                System.out.print("Genre: ");
                String genr = input.nextLine();
                System.out.print("Sipnopsis: ");
                String sip = input.nextLine();
                System.out.print("Cast: ");
                String ca = input.nextLine();

                favmov.put(favmov.size() + 1, name);
                rilis.put(rilis.size() + 1, date);
                durasi.put(durasi.size() + 1, duration);
                genre.put(genre.size() + 1, genr);
                sinopsis.put(sinopsis.size() + 1, sip);
                cast.put(cast.size() + 1, ca);
                System.out.println("Favorite Movie");
                favmov.forEach((k, v) -> {
                    System.out.println(k + ". " + v);
                });
                System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
            }

            else if (op.equals("r")) {
                int r = input.nextInt();

                for (int i = 0; i < favmov.size() - 1; i++) {
                    favmov.replace(r + i, favmov.get(r + i + 1));
                    rilis.replace(r + i, rilis.get(r + i + 1));
                    durasi.replace(r + i, durasi.get(r + i + 1));
                    genre.replace(r + i, genre.get(r + i + 1));
                    sinopsis.replace(r + i, sinopsis.get(r + i + 1));
                    cast.replace(r + i, cast.get(r + i + 1));
                }

                favmov.remove(favmov.size());
                rilis.remove(rilis.size());
                durasi.remove(durasi.size());
                genre.remove(genre.size());
                sinopsis.remove(sinopsis.size());
                cast.remove(cast.size());

                System.out.println("Favorite Movie");
                favmov.forEach((k, v) -> {
                    System.out.println(k + ". " + v);
                });
            }
            System.out.println("continue? yes/no");
            String lanjut = input.next();
            if (lanjut.equals("no")) {
                break;
            }
        }

    }
}

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        System.out.println("İsme göre Sırala");

        TreeSet<Book> kitaplar = new TreeSet<>();

      kitaplar.add(new Book("80 günde devri alem",150,"Jules Verne","1960" ));
      kitaplar.add(new Book("Sherlocke Holmes",250,"Conen Doyle","1970"));
      kitaplar.add(new Book("Daha",180,"Yazar1","2010"));
      kitaplar.add(new Book("Azil",280,"Yazar2","2012"));
      kitaplar.add(new Book("Zamir",320,"Yazar3","2022"));

     for (Book book : kitaplar){
         System.out.println(book.getBookName());

     }

        System.out.println("Sayfa Sayısına göre Sırala");

     TreeSet<Book>  kitaplar2 = new TreeSet<>(new pageCountComparator());
     kitaplar2. addAll(kitaplar);

     for (Book book : kitaplar2){

            System.out.println(book.getBookName());
            System.out.println("   Sayfa Sayısı: "+ book.getPageCount());


        }














    }
}

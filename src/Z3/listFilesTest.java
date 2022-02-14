package Z3;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class listFilesTest {
    public static void main(String[] args) {
        File katalog1 = new File("C://katalog");
        File[] katalogiTablica = listFiles.wszystkiePodkatalogi(katalog1);
        if(katalogiTablica != null){
            ArrayList<File> katalogiLista = new ArrayList<>(List.of(katalogiTablica));
            System.out.println(katalogiLista + "\n");
        }
        else {
            System.out.println("Podany katalog nie istnieje!");
            System.exit(1);
        }


    }
}

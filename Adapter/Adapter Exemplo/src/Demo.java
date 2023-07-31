import java.io.File;

public class Demo {
    public static void main(String[] args) {

        String caminhoFile = "/tmp/teste.txt";
        DropBox dropBox = new DropBox();
        Persistencia persistencia = new DropBoxAdapter(dropBox);
        persistencia.gravar(new File(caminhoFile));
    }
}
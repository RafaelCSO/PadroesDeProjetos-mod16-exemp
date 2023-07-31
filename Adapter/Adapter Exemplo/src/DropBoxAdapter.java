import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DropBoxAdapter implements Persistencia{
    private DropBox dropBox;
    public DropBoxAdapter(DropBox dropBox){
        this.dropBox = dropBox;
    }
    public void gravar(File file){
        try {
            byte[] bytes = Files.readAllBytes(file.toPath());
        } catch (IOException e){
            e.printStackTrace();
        }
        dropBox.upload(new DropBoxFile(file.getAbsolutePath()));
    }
    public File ler(String id){
        DropBoxFile dbFile = dropBox.download(id);
        return new File(dbFile.getLocalPath());
    }
}

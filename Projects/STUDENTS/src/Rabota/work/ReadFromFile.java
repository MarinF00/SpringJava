package Rabota.work;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface ReadFromFile {
     List<String> getList(File file) throws IOException;
}

package lab21.task4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class task4 {
    public static void Filelist(String path) {
        File f = new File(path);
        String[] fArr = null;
        if (f.exists()||f.isDirectory()) fArr = f.list(null);
        else System.out.println("Not found");
        ArrayList<String> list = new ArrayList(Arrays.asList(fArr));

        for (int i = 0; i < list.size(); i++) {
            if (i < 5) System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        Filelist("T:\\studying\\2kurs\\AVM");
    }
}

//получить состав директории

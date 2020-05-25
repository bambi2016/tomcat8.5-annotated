import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyIoUtils {
    public static void fun(Object o) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/wujianhua/allcode/java/sourceCodeclass/tomcat-8/demo.txt"));
        oos.writeObject(o);

    }
}

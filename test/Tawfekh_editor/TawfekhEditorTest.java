package Tawfekh_editor;

import java.io.File;
import java.nio.file.Files;
import org.junit.Test;
import static org.junit.Assert.*;
import sun.misc.Unsafe;
import java.lang.reflect.Field;

public class TawfekhEditorTest {
    private static Tawfekh_editor newInstance() throws Exception {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe u = (Unsafe) f.get(null);
        return (Tawfekh_editor) u.allocateInstance(Tawfekh_editor.class);
    }

    @Test
    public void testUpdateTextWritesFile() throws Exception {
        File temp = File.createTempFile("tawfekh", ".txt");
        temp.deleteOnExit();
        Tawfekh_editor editor = newInstance();
        String content = "Sample content";
        editor.updateText(temp.getAbsolutePath(), content);
        String result = Files.readString(temp.toPath());
        assertEquals(content, result);
    }
}

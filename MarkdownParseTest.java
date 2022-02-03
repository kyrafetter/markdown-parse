import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinks1() throws IOException{
        List<String> expect = List.of("https://something.com", "some-page.html");
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(expect, MarkdownParse.getLinks(contents));
    } 

    @Test
    public void getLinks2() throws IOException{
        List<String> expect = List.of("image.jpg");
        Path fileName = Path.of("new-test.md");
	    String contents = Files.readString(fileName);
        assertEquals(expect, MarkdownParse.getLinks(contents));
    } 

    @Test
    public void getLinks3() throws IOException{
        List<String> expect = List.of("google.com");
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinks4() throws IOException{
        List<String> expect = List.of();
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinks5() throws IOException{
        List<String> expect = List.of();
        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
}  
package in.dpk.nitro.perspective;

import in.dpk.nitro.beans.Details;
import in.dpk.nitro.beans.Header;
import in.dpk.nitro.beans.Trailer;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class FlatFileWriterTest {
    List<Object> objects;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Header header = new Header("H", "India", "Mumbai", " ", 123456L);
        Details detailsD = new Details("D", "Chaudhary", "Deepak", new Date(), 12345678987L, " ", 12000000D);
        Details detailsN = new Details("D", "Mishra", "Nayan", new Date(), 12345678987L, " ", 13000000D);
        Trailer trailer = new Trailer("T", " ", 2L);

        objects = new ArrayList<>();
        objects.add(header);
        objects.add(detailsD);
        objects.add(detailsN);
        objects.add(trailer);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void executeFlatFileWriter() {
        new FlatFileWriter().doWrite(objects, "contactsInput");
    }

    @Test
    @Ignore
    void executeXmlWriter() {
        new FlatFileWriter().doWrite(objects, "contactsOutput");
    }
}
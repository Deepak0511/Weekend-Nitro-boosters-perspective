package in.dpk.nitro.perspective;

import in.dpk.nitro.beans.Details;
import in.dpk.nitro.beans.Header;
import in.dpk.nitro.beans.Trailer;
import in.dpk.nitro.perspective.core.FlatFileWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 */
class FlatFileWriterTest {
    private List<Object> objects;
    private String flatFileName;
    private String xmlFileName;
    private String xmlDetailsOnlyFileName;
    private String mappingFileName;
    private String csvFilename;

    @BeforeEach
    void setUp() {
        mappingFileName = "src/main/resources/mapping.xml";
        Header header = new Header("H", "India", "Mumbai", " ", 123456L);
        Details detailsD = new Details("D", "Chaudhary", "Deepak", new Date(), 12345678987L, " ", 12000000D);
        Details detailsN = new Details("D", "Mishra", "Nayan", new Date(), 12345678987L, " ", 13000000D);
        Trailer trailer = new Trailer("T", " ", 2L);

        objects = new CopyOnWriteArrayList<>();
        objects.add(header);
        objects.add(detailsD);
        objects.add(detailsN);
        objects.add(trailer);

        flatFileName = "target/output.flf";
        xmlFileName = "target/output.xml";
        xmlDetailsOnlyFileName = "target/xmlData.xml";
        csvFilename = "target/out.csv";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void executeFlatFileWriter() {
        new FlatFileWriter(new File(mappingFileName), new File(flatFileName)).doWrite(objects, "contactsInput");
    }

    @Test
    void executeXmlWriter() {
        new FlatFileWriter(new File(mappingFileName), new File(xmlFileName)).doWrite(objects, "contactsOutput");
    }

    @Test
    void executeXmlDetailsOnlyWriter() {
        objects.forEach(o -> {
            if (o instanceof Header) {
                objects.remove(o);
            } else if (o instanceof Trailer) {
                objects.remove(o);
            }
        });
        new FlatFileWriter(new File(mappingFileName), new File(xmlDetailsOnlyFileName)).doWrite(objects, "onlyDetails");
    }

    @Test
    void executeCSVDetailsOnlyWriter() {
        objects.forEach(o -> {
            if (o instanceof Header) {
                objects.remove(o);
            } else if (o instanceof Trailer) {
                objects.remove(o);
            }
        });
        new FlatFileWriter(new File(mappingFileName), new File(csvFilename)).doWrite(objects, "onlyDetailsCSV");
    }
}
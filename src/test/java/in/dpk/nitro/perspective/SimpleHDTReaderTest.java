package in.dpk.nitro.perspective;

import in.dpk.nitro.perspective.core.SimpleHDTReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

class SimpleHDTReaderTest {

    @BeforeEach
    void setUp() {
    }


    @Test
    public void executeOnlyDetailsCSV() {
        new SimpleHDTReader(new File("src/main/resources/mapping.xml"))
                .doRead("onlyDetailsCSV", new File("src/test/resources/input.csv"));
    }
}
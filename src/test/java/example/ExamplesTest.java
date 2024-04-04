package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExamplesTest {

    @Test
    void concatenateStrings() {
        // tag::exampleCode[]
        String example = "1" + "1";
        // end::exampleCode[]
        String expected =
                // tag::exampleResult[]
                "11"
                // end::exampleResult[]
                ;
        assertEquals(expected, example);
    }

}


package ex1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfterTest {

    After a;

    @BeforeEach
    public void setup() {
        a = new After();
    }

    @Test
    void getMinMax() {
        int[] testData = new int[]{1,2,3,4};
        assertArrayEquals(a.getMinMax(testData), new int[]{1, 4});

        testData = new int[]{-1,2,3,34};
        assertArrayEquals(a.getMinMax(testData), new int[]{-1, 34});

        testData = new int[]{2,2,32,-90};
        assertArrayEquals(a.getMinMax(testData), new int[]{-90, 32});

        testData = new int[]{7,0,3,23};
        assertArrayEquals(a.getMinMax(testData), new int[]{0, 23});
    }
}
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void hypotenuse() {
        Assertions.assertEquals(Main.hypotenuse(20,10), 22.360679774997898);
    }
}
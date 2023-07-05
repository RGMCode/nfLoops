package RGMCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    void fakultaetTest0() {
        int zahl = 0;
        int actual = Main.calcFakultaet(zahl);
        assertEquals(1, actual);
    }

    @Test
    void fakultaetTest1() {
        int zahl = 1;
        int actual = Main.calcFakultaet(zahl);
        assertEquals(1, actual);
    }

    @Test
    void fakultaetTest2() {
        int zahl = 2;
        int actual = Main.calcFakultaet(zahl);
        assertEquals(2, actual);
    }

    @Test
    void fakultaetTest3() {
        int zahl = 3;
        int actual = Main.calcFakultaet(zahl);
        assertEquals(6, actual);
    }



}
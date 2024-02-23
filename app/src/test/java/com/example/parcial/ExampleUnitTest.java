package com.example.parcial;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Carrito carrito = new Carrito();

    @Test
    public void n_tomate() {
        for (int i = 0; i < 30; i++) {
            carrito.n_tomate += 1;
        }
        assertEquals(30, carrito.getN_tomate());
    }
    @Test
    public void n_magos() {
        for (int i = 0; i < 6; i++) {
            carrito.n_mango += 1;
        }
        assertEquals(6, carrito.getN_mango());
    }
    @Test
    public void n_cebollas() {
        for (int i = 0; i < 5; i++) {
            carrito.n_cebolla += 1;
        }
        assertEquals(5, carrito.getN_cebolla());
    }
    @Test
    public void n_lechugas() {
        for (int i = 0; i < 10; i++) {
            carrito.n_lechuga += 1;
        }
        assertEquals(10, carrito.getN_lechuga());
    }
}
package ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Tests {
	@ Test
	public void camino1() {
        SumaNumeros suma = new SumaNumeros();
        int resultado = suma.sumaNumeros(0);
        assertEquals(0, resultado);
	}

    @ Test
    public void camino2() {
        SumaNumeros suma = new SumaNumeros();
        int resultado = suma.sumaNumeros(1);
        assertEquals(0, resultado);
	}

    @ Test
    public void camino3() {
        SumaNumeros suma = new SumaNumeros();
        int resultado = suma.sumaNumeros(2);
        assertEquals(2, resultado);
	}
}

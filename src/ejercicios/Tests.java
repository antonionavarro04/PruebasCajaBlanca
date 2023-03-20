package ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Tests {
	@ ParameterizedTest
    @ MethodSource("suma")
    public void pruebasSuma(int num1, int num2) {
        SumaNumeros suma = new SumaNumeros();
        int resultado = suma.sumaNumeros(num1);
        assertEquals(num2, resultado);
    }

    private static Stream<Arguments> suma() {
        return Stream.of(
            Arguments.of(0, 0),
            Arguments.of(1, 0),
            Arguments.of(2, 2)
        );
    }

    @ ParameterizedTest
    @ MethodSource("cuenta")
    public void pruebasImpares(int num1, int num2) {
        CuentaImpares cuenta = new CuentaImpares();
        int resultado = cuenta.cuentaImpares(num1);
        assertEquals(num2, resultado);
    }

    private static Stream<Arguments> cuenta() {
        return Stream.of(
            Arguments.of(0, 0),
            Arguments.of(1, 1),
            Arguments.of(2, 1)
        );
    }
}

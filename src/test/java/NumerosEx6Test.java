import org.example.NumerosEx6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumerosEx6Test {
    NumerosEx6 num;
    @BeforeEach
    public void inicia(){
        num = new NumerosEx6();
    }
    @Test
    public void testMediaNumeros(){
        int testa = num.mediaNumeros(123456789);
        int esperado = 5;
        assertEquals(testa,esperado,"Erro");
    }
}

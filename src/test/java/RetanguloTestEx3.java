import org.example.RetanguloEx3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetanguloTestEx3 {

    RetanguloEx3 ret;
    @BeforeEach
    public void setUp(){
         ret = new RetanguloEx3();
    }
    @Test
    public void testeAreaRetangulo(){
        int result = ret.area(3,5);
        int esper = 15;
        assertEquals(result,esper,"área incorreta");
        result = ret.area(5,8);
        esper = 40;
        assertEquals(result,esper,"área incorreta");
        result = ret.area(2,4);
        esper = 8;
        assertEquals(result,esper,"área incorreta");
    }
    @Test
    public void testePerimRetangulo(){
        int result = ret.perimetro(3,5);
        int esper = 16;
        assertEquals(result,esper,"perimetro incorreto");
        result = ret.perimetro(5,8);
        esper = 26;
        assertEquals(result,esper,"perimetro incorreto");
        result = ret.perimetro(2,4);
        esper = 12;
        assertEquals(result,esper,"perimetro incorreto");
    }


}

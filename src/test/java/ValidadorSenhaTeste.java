
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.aula10.ValidadorSenha;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTeste {
    class ValidadorSenhaTest {
        
    @Test
    void testValidarSenha() {
        ValidadorSenha val = new ValidadorSenha();
        assertTrue(val.validar("Senha123"));
        assertFalse(val.validar("senha123"));
        assertFalse(val.validar("SENHA"));
        assertFalse(val.validar("123456"));
        assertTrue(val.validar(""));

    }
}
}

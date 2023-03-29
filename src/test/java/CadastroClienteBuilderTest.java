import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastroClienteBuilderTest {
    @Test
    void deveRetornarExcecaoClintesemID() {
        try {
            CadastroClienteBuilder clienteBuilder = new CadastroClienteBuilder();
            CadastroCliente cliente = clienteBuilder
                    .setNome("cliente 1")
                    .setCep("999999999-99")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("id inválida", e.getMessage());
        }
    }
}
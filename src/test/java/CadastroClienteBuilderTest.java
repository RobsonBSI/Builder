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
    @Test
    void deveRetornarExcecaoParaAlunoSemNome() {
        try {
            CadastroClienteBuilder clienteBuilder = new CadastroClienteBuilder();
            CadastroCliente cliente = clienteBuilder
                    .setId(1)
                    .setCep("999999999-99")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarAlunoValido() {
        CadastroClienteBuilder clienteBuilder = new CadastroClienteBuilder();
        CadastroCliente cliente= clienteBuilder
                .setId(1)
                .setNome("cliente 1")
                .setCep("999999999-99")
                .build();

        assertNotNull(cliente);
    }

}
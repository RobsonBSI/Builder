public class CadastroClienteBuilder {
    private CadastroCliente cliente;

    public  CadastroClienteBuilder() {
        cliente= new CadastroCliente();
    }

    public  CadastroCliente build() {
        if (cliente.getId() == 0) {
            throw new IllegalArgumentException("id inválida");
        }
        if (cliente.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return cliente;
    }
    public CadastroClienteBuilder setId(int id) {
        cliente.setId(id);
        return this;
    }

    public CadastroClienteBuilder setNome(String nome) {
        cliente.setNome(nome);
        return this;
    }

    public CadastroClienteBuilder setCpf(String cpf) {
        cliente.setCpf(cpf);
        return this;
    }
    public CadastroClienteBuilder setCep(String cep) {
        cliente.setCep(cep);
        return this;
    }


    public CadastroClienteBuilder setLogradouro(String logradouro) {
        cliente.setLogradouro(logradouro);
        return this;
    }

    public CadastroClienteBuilder setNumero(int numero) {
        cliente.setNumero(numero);
        return this;
    }

    public CadastroClienteBuilder setComplemento(String complemento) {
        cliente.setComplemento(complemento);
        return this;
    }

    public CadastroClienteBuilder setBairro(String bairro) {
        cliente.setBairro(bairro);
        return this;
    }

    public CadastroClienteBuilder setCidade(String cidade) {
        cliente.setCidade(cidade);
        return this;
    }

    public CadastroClienteBuilder setEstado(String UF) {
        cliente.setEstado(UF);
        return this;
    }

    public CadastroClienteBuilder setTelefone(String tel) {
        cliente.setTelefone(tel);
        return this;
    }
}
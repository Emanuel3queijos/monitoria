## Cenário

Uma revenda trabalha com três tipos de veículos: motos, veículos de passeio e veículos de carga. Todos os veículos possuem placa, ano de fabricação e um valor. 

### Detalhamento dos Veículos
- **Motos**: 
  - Categoria (texto)
  - Quantidade de cilindradas

- **Veículos de Passeio**: 
  - Quantidade máxima de passageiros
  - Capacidade do porta-malas (em litros)

- **Veículos de Carga**: 
  - Capacidade máxima de carga (em toneladas)
  - Quantidade de eixos
  - Capacidade do tanque de combustível (em litros)

### Detalhamento do Comprador
- **Dados do Comprador**:
  - CPF
  - Nome
  - Endereço (CEP, logradouro, número e bairro)
  - Telefone

- **Relacionamento**:
  - Uma mesma pessoa pode comprar diversos veículos, mas um veículo pode ter apenas um comprador.

## Requisitos para Implementação

1. **Exceção para Valores Negativos**:
   - Crie uma exceção chamada `NegocioException` para tratar valores numéricos negativos.
   - A exceção deve ser lançada com a mensagem: `<nome-do-atributo> não pode ser negativo(a).`
   - A seleção da superclasse da exceção (Exception, RuntimeException ou Error) faz parte da avaliação.

2. **Hierarquia de Classes para Veículos**:
   - Crie classes para cadastro de veículos, assegurando que apenas motos, veículos de passeio e veículos de carga possam ser instanciados.
   - As classes devem ter:
     - Construtores parametrizados com todos os atributos.
     - Métodos getters e setters para todos os atributos.
     - Implementação do método `toString` para facilitar a listagem dos dados.
     - Métodos que validem valores numéricos, lançando `NegocioException` em caso de valores negativos.

3. **Classe `VeiculoDAO`**:
   - Crie métodos estáticos para gerenciar os veículos cadastrados em uma única lista, que armazenará todos os tipos de veículos.

4. **Classe `PessoaDAO`**:
   - Crie métodos estáticos para gerenciar as pessoas (compradores) em uma lista dedicada.

5. **Classe `VeiculoTUI`**:
   - Métodos estáticos para cadastrar veículos:
     - `cadastrarMoto`: obtém os dados necessários para instanciar uma moto e a persiste usando `VeiculoDAO`.
     - `cadastrarVeiculoPasseio`: obtém os dados necessários para instanciar um veículo de passeio e a persiste usando `VeiculoDAO`.
     - `cadastrarVeiculoCarga`: obtém os dados necessários para instanciar um veículo de carga e a persiste usando `VeiculoDAO`.

6. **Classe `PessoaTUI`**:
   - Método estático `cadastrarPessoa`: obtém os dados necessários para instanciar uma pessoa e a persiste usando `PessoaDAO`.

### Considerações Importantes
- As validações devem ser feitas nas classes de domínio.
- A classe TUI deve acessar diretamente a classe de DAO, sem uma camada de negócio intermediária.
- Não é necessário implementar um menu para acesso às funcionalidades.

## Arquitetura a ser seguida: <img width="290" alt="image" src="https://github.com/user-attachments/assets/5e40ce0d-6d58-4f48-9fc6-56b308a3ed88">

## Cenário

Uma doceria deseja informatizar o cadastro dos seus produtos

Os produtos são caracterizados por código número inteiro descrição texto e valor unitário número fracionário. A doceria trabalha com apenas dois tipos de produto: bolos e doces

Sobre os bolos é necessário saber também a quantidade de fatias número inteiro e o tema texto. Sobre os doces é necessário saber também a quantidade mínima para pedido número inteiro

É importante observar que a quantidade mínima para pedido no cadastro de doces não pode ser inferior a 50

Crie uma exceção para tratar o caso de informação de uma quantidade mínima para pedido de doces inferior a 50. A correta seleção da superclasse desta exceção Exception RuntimeException e Error faz parte da avaliação. Fica como sugestão para o nome da exceção `QtdMinPedidoInvalidaException`

Defina uma hierarquia e crie as classes necessárias ao cadastro de produtos observando as seguintes recomendações:

- Apenas doces e bolos podem ser cadastrados, ou seja, não deve ser possível instanciar um produto que não seja de um desses tipos
- As classes devem ter construtores parametrizados com todos os seus atributos para facilitar a instanciação das mesmas
- As classes devem ter métodos getters e setters para viabilizar alteração em seus atributos
- As classes devem ter implementação do método `toString` para facilitar a listagem de dados
- O(s) método(s) que definir(em) o atributo quantidade mínima para pedido deve(m) fazer o adequado tratamento de que a mesma deve ser maior ou igual a 50 utilizando adequadamente a exceção `QtdMinPedidoInvalidaException`

Crie uma classe `DoceriaDAO`:

- Atributo estático: uma lista para todos os produtos tanto doces quanto bolos. A lista deve ser instanciada na declaração do atributo. Esta classe deve ter também os métodos estáticos necessários ao atendimento das demandas da camada de apresentação TUI

Crie uma classe `DoceriaTUI`:

- Métodos estáticos:
  - `cadastrarDoce`: interface para cadastramento de doces
  - `cadastrarBolo`: interface para cadastramento de bolos
  - `listarProdutosPorValorEDescricao`: este método deve listar os produtos por ordem crescente de valor unitário e por ordem crescente de descrição caso o valor se repita
  - `listarTemas`: este método deve listar os diferentes temas de bolo cadastrados. Não devem ser exibidos temas repetidos


## arquiitetura a ser seguida: ![image](https://github.com/user-attachments/assets/734d7961-e322-4fa4-8274-685292a5f085)

# Aula-Monitoria-OO-Guide


Seguiremos a orientação dessa [atividade](https://docs.google.com/document/d/18p-7S7QSl2tXeem1ws7X06EgSYS4JVh0dMEw_5cP3xc/edit) para realização do projeto


## Arquitetura em Camadas e pacotes


Vamos iniciar criando um projeto com o seguinte indentificador:  
```css
2023-2-monitoria-oo-atv01
```

Em seguida o pacote com a seguinte hierarquia:  
```css
br.com.ucsal.monitoria.javaoo."Seu nome"
```

Em seguida criaremos os seguintes pacotes dentro do pacote anterior:


### `Domain` (Domínio):
- Representa a camada de domínio.
- Contém regras de negócio e entidades principais.
- Foca em classes que representam conceitos centrais do aplicativo.

### `DAO` (Data Access Object):
- Responsável pela camada de persistência de dados.
- Contém lógica para acessar e manipular dados armazenados.
- Inclui classes como repositórios e adaptadores de acesso a dados.
- Promove métodos para criar, ler, atualizar e excluir (CRUD) objetos relacionados a dados.

### `Exception` (Exceção):
- Trata exceções específicas do domínio.
- Define classes de exceção personalizadas para erros do aplicativo.

### `TUI` (Text User Interface):
- Representa a interface de usuário baseada em texto.
- Cuida da interação por comandos de texto em uma CLI.
- Inclui classes para processar entradas, exibir saídas e gerenciar fluxos de texto.

Lembre-se de que essa é uma sugestão de organização, e a estrutura pode variar com base nas necessidades do projeto e nas convenções adotadas.


>A hierarquia de pacotes no Java é essencial para o desenvolvimento de software, organizando o código em unidades lógicas que facilitam a compreensão e manutenção. Ela evita conflitos de nomes, controla o acesso a classes, promove a reutilização de código, facilita a manutenção e contribui para o encapsulamento.

No final, a organização de pacotes deve estar assim: ![img.png](images/img.png)


## Exception:

seguindo a orientação da atividade, criaremos a Classe exception:

```java
package Exception;
public class ProdutoException extends Exception {
    private static final long serialVersionUID = 1L;
    public ProdutoException(String message){
        super(message);
    }
    
}
```
>Aqui é definida uma classe chamada ``Exception``, que estende a classe ``java.lang.Exception``, Isso significa que a classe ``Exception`` é uma exceção verificada do java

>O ``serialVersionUID`` é usado para controlar a versão de serialização da classe. Isso é útil quando você está lidando com persistência de objetos em Java. A serialização em Java refere-se ao processo de converter um objeto em uma sequência de bytes, que pode ser posteriormente recriada para reconstituir o objeto original.


```java
  public Exception(String message){
        super(message);
    }
```

> esse construtor recebe uma mensagem como parametro, que é a mensagem que será exibida quando uma instancia dessa exceção for lançada. O construtor chama o contrutor da classe pai ``java.lang.Exception``, passando a mensagem


Basicamente usaremos esse cara para criar Exceptions personalizadas


## Domain:


Seguindo a orientação da atividade, criaremos a classe Produto

### classe ``Produto``

```java 
package domain;

public abstract class Produto {


    private Integer codigo;
    private String descricao;
    private Double valorUnitario;

    public Produto(){
    }

    public Produto(Integer codigo, String descricao, Double valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
```


>seguindo a orientação da atividade, deixaremos a classe Produto como abstract. Isso significa dizer que ela não pode ser instanciada diretamente, em vez disso ela serve de modelo para as classes que a extenderão;

```java

public abstract class Produto {
    ...
}
```

### Atributos necessários:
```java
private Integer codigo;
private String descricao;
private Double valorUnitario;
```
>Seguindo a orientação da atividade, criaremos os atributos privados, juntamente com os metodos `get` e `set`, que são fornecidos para acessar e modificar atributos privados, promovendo um controle preciso sobre a manipulação dos dados. Isso aumenta a segurança, permite validações e facilita a evolução do código ao isolar as mudanças internas da interface externo

### construtor parametrizado

>Seguindo a orientação da atividade, criaremos um construtor parametrizado com todos os atributos
```java
    public Produto(Integer codigo, String descricao, Double valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }
```
### ToString

```java
    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
```
>Override do método toString(), que retorna uma representação de string do objeto. Esse método é frequentemente usado para imprimir informações úteis sobre o objeto. No caso, ele retorna uma string que contém o código, a descrição e o valor unitário do produto.

## Classe `Bolo`

```java
package domain;

public class Bolo extends Produto {


    private Integer quantFatias;
    private String tema;

    public Bolo() {
        super();
    }

    public Bolo(Integer codigo, String descricao, Double valorUnitario, Integer quantFatias, String tema) {
        super(codigo, descricao, valorUnitario);
        this.quantFatias = quantFatias;
        this.tema = tema;
    }

    public Integer getQuantFatias() {
        return quantFatias;
    }

    public void setQuantFatias(Integer quantFatias) {
        this.quantFatias = quantFatias;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public String toString() {
        return "Bolo [quantFatias=" + quantFatias + ", tema=" + tema + ", getCodigo()=" + getCodigo()
                + ", getDescricao()=" + getDescricao() + ", getValorUnitario()=" + getValorUnitario() + "]";
    }
}

```

>atributos necessários, com base na atividade:

```java
  private Integer quantFatias;
    private String tema;
```

>Contrutores:

```java
  public Bolo() {
        super();
    }

    public Bolo(Integer codigo, String descricao, Double valorUnitario, Integer quantFatias, String tema) {
        super(codigo, descricao, valorUnitario);
        this.quantFatias = quantFatias;
        this.tema = tema;
    }
```
>A necessidade de chamar explicitamente o construtor da superclasse em uma subclasse, mesmo que a superclasse não tenha um construtor sem argumentos é uma prática necessária para garantir uma inicialização adequada e consistente dos objetos, especialmente quando se lida com hierarquias de classes.

## Classe `Doce`

```java
package domain;

import Exception.ProdutoException;

public class Doce extends Produto {


    private Integer minPedido;


    public Doce() {
        super();
    }

    public Doce(Integer codigo, String descricao, Double valorUnitario, Integer minPedido) {
        super(codigo, descricao, valorUnitario);
        this.minPedido = minPedido;
    }

    public Integer getMinPedido() {
        return minPedido;
    }

    public void setMinPedido(Integer minPedido) throws ProdutoException {
        validarMinPedido(minPedido);
        this.minPedido = minPedido;
    }

    public static void validarMinPedido(Integer minPedido) throws ProdutoException {
        if (minPedido < 50) {
            throw new ProdutoException("O Numero de doces é muito baixo para continuar a operação, Por Favor peça pelo menos 50 docinhoS S2");
        }

    }


    @Override
    public String toString() {
        return "Doce{" +
                "minPedido=" + minPedido +
                "} " + super.toString();
    }
}



```

> Seguindo a orientação da atividade, criamos os `construtores`, `gettes and setters`, e `ToString`. 

### Função `validarMinPedido`

>Criamos a função que verifica se a quantidade de docinhos é maior que 50. Caso não seja, retorna uma Exception personalizada com a respectiva mensagem;

>Ela é chamada no ato de settar o valor para os docinhos 

```java

    public void setMinPedido(Integer minPedido) throws ProdutoException {
        validarMinPedido(minPedido);
        this.minPedido = minPedido;
    }

    public static void validarMinPedido(Integer minPedido) throws ProdutoException {
        if (minPedido < 50) {
            throw new ProdutoException("O Numero de doces é muito baixo para continuar a operação, Por Favor peça pelo menos 50 docinhoS S2");
        }

    }

```

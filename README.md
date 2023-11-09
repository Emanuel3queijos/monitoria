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
public class Exception extends java.lang.Exception {
    private static final long serialVersionUID = 1L;
    public Exception(String message){
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
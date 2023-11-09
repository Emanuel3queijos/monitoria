# Aula-Monitoria-OO-Guide

>## Arquitetura do Projeto

Neste guia, abordaremos o conceito de arquitetura em camadas, que consiste no processo de decomposição de sistemas complexos em camadas para facilitar a compreensão e manutenção.

## Tipologia:
A topologia desta arquitetura pode ser representada da seguinte forma:

>Apresentação:
Lida com a interface do usuário e lógicas de comunicação com navegadores.

>Negócio:
Executa operações e fluxos de negócios associados a uma requisição.

>Persistência:
Responsável por persistir ou recuperar informações fisicamente salvas.

>Banco de dados:
Mantém os dados salvos de forma física.

No caso do projeto abordado, não usaremos banco para salvar os dados. Utilizaremos collections do próprio Java.



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


A hierarquia de pacotes no Java é essencial para o desenvolvimento de software, organizando o código em unidades lógicas que facilitam a compreensão e manutenção. Ela evita conflitos de nomes, controla o acesso a classes, promove a reutilização de código, facilita a manutenção e contribui para o encapsulamento.

No final 
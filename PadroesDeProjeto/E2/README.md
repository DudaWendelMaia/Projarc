# Exercício Prático 2

<div align="center">
 <img height=250 width=300 src="https://refactoring.guru/images/patterns/content/singleton/singleton-3x.png">
</div>

### Enunciado
- Escolher Padrão de Projeto:
O escolhido pelo nosso grupo foi o Singleton

- Etapas:

1. Pesquisa (10 minutos): Cada grupo deve usar o livro da GoF e a Internet para pesquisar sobre o padrão atribuído. Entender o propósito do padrão, sua estrutura e um cenário real onde ele pode ser aplicado. 

2. Implementação (20 minutos): Os grupos irão implementar um exemplo simples do padrão atribuído em Java (ou outra linguagem de POO com a qual estejam familiarizados). Por exemplo, o padrão Singleton pode ser demonstrado criando um utilitário de logging que garante que apenas uma instância seja usada em toda a aplicação.

3. Apresentação e Discussão (10 minutos)


## Resolução:

- códigos : realizamos duas implementações

- Propósito:
utilizado para garantir que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância. 
É útil em situações onde é necessário controlar o acesso a um recurso compartilhado, como em um sistema de logging, gerenciador de conexão com banco de dados, ou um gerenciador de configuração.

- Cenário Real:
Sistema de logging -> onde é importante garantir que todos os logs da aplicação sejam gerados pela mesma instância do logger, evitando conflitos ou múltiplas instâncias desnecessárias.


- Estrutura do Padrão Singleton:

-   Classe Singleton -> Contém um construtor privado para impedir a criação de novas instâncias.
-   Método estático getInstance() -> Fornece o ponto de acesso global à instância única da classe.
-   Instância privada -> A instância única é armazenada como um campo estático privado da classe.

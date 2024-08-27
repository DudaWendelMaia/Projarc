# 🛠️ Exercício Prático 2

<div align="center">
 <img height=250 width=300 src="https://refactoring.guru/images/patterns/content/singleton/singleton-3x.png">
</div>

### 📜 Enunciado

**Escolha do Padrão de Projeto:**  
O padrão escolhido pelo nosso grupo foi o **Singleton**.

**Etapas:**

1. **Pesquisa (10 minutos):**  
   Cada grupo deve usar o livro da GoF (Gang of Four) e a Internet para pesquisar sobre o padrão atribuído. O objetivo é entender o propósito do padrão, sua estrutura e identificar um cenário real onde ele pode ser aplicado.

2. **Implementação (20 minutos):**  
   Os grupos irão implementar um exemplo simples do padrão atribuído em Java (ou outra linguagem de POO com a qual estejam familiarizados). Por exemplo, o padrão Singleton pode ser demonstrado criando um utilitário de logging que garante que apenas uma instância seja usada em toda a aplicação.

3. **Apresentação e Discussão (10 minutos):**  
   Os grupos irão apresentar sua implementação e discutir como o padrão foi aplicado.

## ✅ Resolução

- **Código:**  
  Realizamos duas implementações para demonstrar o uso do padrão Singleton.

- **Propósito:**  
  O padrão Singleton é utilizado para garantir que uma classe tenha apenas uma instância e forneça um ponto global de acesso a essa instância. É útil em situações onde é necessário controlar o acesso a um recurso compartilhado, como em um sistema de logging, gerenciador de conexão com banco de dados, ou um gerenciador de configuração.

- **Cenário Real:**  
  Um exemplo de aplicação do padrão Singleton é em um sistema de logging, onde é importante garantir que todos os logs da aplicação sejam gerados pela mesma instância do logger, evitando conflitos ou múltiplas instâncias desnecessárias.

- **Estrutura do Padrão Singleton:**

  - **Classe Singleton:**  
    Contém um construtor privado para impedir a criação de novas instâncias.

  - **Método estático `getInstance()`:**  
    Fornece o ponto de acesso global à instância única da classe.

  - **Instância privada:**  
    A instância única é armazenada como um campo estático privado da classe.

  - **PlantUML código 1:**
 <div align="center">
 <img src="https://github.com/user-attachments/assets/a91d0ad0-e2b8-4fdb-a88f-f1b4d2f77c51" alt="PlantUML código 1" width="250">
</div>
 
  - **PlantUML código 2:**
 <div align="center">
 <img src="https://github.com/user-attachments/assets/b75b5c4f-9b60-4afb-bf83-2775f7c0b0fa" alt="PlantUML código 1" width="250">
</div>

---

Este exercício prático ajudou a reforçar a compreensão do padrão Singleton, sua aplicação e implementação em um contexto real. 🎓✨

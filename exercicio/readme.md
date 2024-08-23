# 💻 Exercício Prático: Somar Números Inteiros

<div align="center">
 <img height=150 width=300 src="https://miro.medium.com/v2/resize:fit:700/0*R60lnmJl4hanOBaJ.png">
</div>

## ℹ️ Informações
- **Requisitos:** Java 21 e Spring Boot
- **Status:** Concluído
- **Realizada em:** 2024
- **Colaboradores** Maria Maia e Maurício K.

## 📝 Enunciado:

Em grupos de 2 ou 3 participantes, desenvolva as seguintes atividades:

#### Repositório
Armazene o código desenvolvido nesta atividade em um repositório do grupo.

#### Prática
Execute os guias práticos indicados abaixo:

a) [Spring Boot Guide](https://spring.io/guides/gs/spring-boot)  
b) [Serving Web Content](https://spring.io/guides/gs/serving-web-content)

#### Desafios
i) Desenvolva um formulário que permite somar dois números inteiros. Utilize o servidor para realizar a soma.

ii) Opcional: Desenvolva a mesma aplicação utilizando outro framework, ex. Node.js.

Armazene todo o código em um ou mais repositórios. Configure um Github Codespace, conforme material apresentado na primeira semana. Documente o processo com a captura de telas em issues ou no README do seu repositório. Anote comentários, dúvidas, erros e etapas concluídas.

## ⌨️ Resolução: 

i) O primeiro passo que realizamos foi adicionar as dependencias e criar o projeto em spring boot com o [Spring Initializr](https://start.spring.io/)
![image](https://github.com/user-attachments/assets/dfc5dff8-d8c4-45b1-9349-6d2e8e3d6e7b)

ii) Configuramos um Github Codespace
![image](https://github.com/user-attachments/assets/a6af251c-02ce-4fbb-a822-91326d9919a3)

iii) Realizamos o desenvolvimento do formulário
![image](https://github.com/user-attachments/assets/b3e69670-b156-49e7-a44c-4fed67dbb6a6)

iv) Criação do HTML para o formulário
![image](https://github.com/user-attachments/assets/19830f7a-ffcb-4ce7-823f-07d33e183b5d)

v) Testamos
![image](https://github.com/user-attachments/assets/cd306a0d-9616-4a93-ad47-2094b854edb2)

![image](https://github.com/user-attachments/assets/a717a8df-16d7-4add-b430-1b16c0180cce)

### Comentários
- Desafio 1: Resolvemos fazer apenas o desafio 1 devido ao tempo disponível para a conclusão da atividade.
- Facilidade: Achamos o exercício tranquilo para realizar, especialmente considerando nossa familiaridade com o Spring Boot.

### Dúvidas
- Ficamos com dificuldade apenas no primeiro momento para criar o projeto em spring boot pois não estavamos achando o link para a criação

### Erros
- Problemas com Porta em Uso: Em uma das tentativas de rodar a aplicação, encontramos um erro relacionado à porta 8080 já estar em uso por outra aplicação. Resolvemos isso parando a outra aplicação para conseguir utilizar esta porta

### Etapas Concluídas
- Configuração inicial do projeto no Spring Initializr.
- Implementação do controlador que processa a soma dos números inteiros.
- Criação do formulário em Thymeleaf para entrada dos números.
- Testes locais para garantir que o resultado da soma é exibido corretamente.
- Documentação do processo no README.md.




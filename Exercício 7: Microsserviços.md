# Exercício E7: Microsserviços

<div align="center">
 <img height=200 width=200 src="https://media.tenor.com/iviIq2uXz-kAAAAi/work-office.gi">
</div>

## Opção Escolhida: Letra "c"

Neste exercício, foi solicitada a escolha entre três opções para a execução da atividade relacionada a microsserviços:

- **a)** Executar o roteiro da aula anterior
- **b)** Executar um exemplo da Spring sobre microsserviços (dica: usar a spring-petclinic-microservices)
- **c)** Elaborar um diagrama da UML: componentes ou implantação (destacar serviços da aplicação e dependencias)

A opção escolhida foi a *letra "c", onde foi elaborado um **diagrama UML** de componentes para o spring-petclinic-microservices.

### 1. Contexto

A aplicação escolhida para a elaboração do diagrama foi a **spring-petclinic-microservices**, que é o exemplo prático e bem estabelecido no uso de arquitetura de microsserviços utilizando **Spring Cloud* que foi passado em aula. A aplicação simula uma clínica veterinária, onde os serviços são divididos em diversos microsserviços independentes, como o serviço de gerenciamento de donos de pets, visitas, veterinários, entre outros.

### 2. Descrição do Diagrama

O diagrama criado aborda .... Nele, são evidenciadas as principais funcionalidades da aplicação Spring PetClinic Microsserviços e as dependências entre elas.

#### 2.1 Componentes

-

#### 2.2 Dependências

- 

### 3. Diagrama UML

*Colocar imagem*

### 4. Script para a criação do diagrama UML

```plantuml
@startuml

package "PetClinic Microservices" {
    [Customers Service] --> [Customers DB]
    [Vets Service] --> [Vets DB]
    [Visits Service] --> [Visits DB]
    
    [Customers Service] --> [Vets Service] : REST API
    [Customers Service] --> [Visits Service] : REST API
    [Vets Service] --> [Visits Service] : REST API
}

package "Infrastructure" {
    [API Gateway] --> [Customers Service]
    [API Gateway] --> [Vets Service]
    [API Gateway] --> [Visits Service]
    
    [Discovery Server] --> [Customers Service] : Service Registration
    [Discovery Server] --> [Vets Service] : Service Registration
    [Discovery Server] --> [Visits Service] : Service Registration

    [Config Server] --> [Customers Service] : Configuration
    [Config Server] --> [Vets Service] : Configuration
    [Config Server] --> [Visits Service] : Configuration
    
    [Message Broker] --> [Visits Service] : Asynchronous Messaging

    [Tracing Service] --> [API Gateway] : Distributed Tracing
    [Tracing Service] --> [Customers Service] : Distributed Tracing
    [Tracing Service] --> [Vets Service] : Distributed Tracing
    [Tracing Service] --> [Visits Service] : Distributed Tracing
    
    [Prometheus] --> [API Gateway] : Monitoring
    [Prometheus] --> [Customers Service] : Monitoring
    [Prometheus] --> [Vets Service] : Monitoring
    [Prometheus] --> [Visits Service] : Monitoring

    [Grafana] --> [Prometheus] : Visualization
    
    [Resilience4j] --> [API Gateway] : Circuit Breaker
    [Resilience4j] --> [Customers Service] : Circuit Breaker
    [Resilience4j] --> [Vets Service] : Circuit Breaker
    [Resilience4j] --> [Visits Service] : Circuit Breaker
}

@enduml
```

### 5. Conclusão

A arquitetura de microsserviços, conforme ilustrada no diagrama, permite que a aplicação *Spring PetClinic* seja modular, escalável e resiliente. Cada componente desempenha um papel crucial na integração e comunicação entre os serviços, utilizando ferramentas robustas do *Spring Cloud* como *Eureka, **Feign, **Hystrix* e *Ribbon*.

Com a divisão dos serviços, a aplicação se beneficia de maior flexibilidade, uma vez que cada parte pode ser desenvolvida, mantida e escalada de forma independente, seguindo os princípios da arquitetura de microsserviços.

---

*Referências:*

- Spring PetClinic Microsservices [GitHub](https://github.com/spring-petclinic/spring-petclinic-microservices)
- Documentação do [Spring Cloud](https://spring.io/projects/spring-cloud)

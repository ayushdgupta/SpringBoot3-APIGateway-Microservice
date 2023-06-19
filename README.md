### API Gateway 
1. Here we are creating one API Gateway with the help of which we can call our microservices registered with this API Gateway.
2. To create an API Gateway we need to follow below steps -
   1. First create one simple microservice with below dependencies -
      ```
       implementation 'org.springframework.boot:spring-boot-starter-webflux'
       implementation 'org.springframework.cloud:spring-cloud-starter'
       implementation 'org.springframework.cloud:spring-cloud-starter-gateway'
       implementation 'org.springframework.cloud:spring-cloud-starter-netflix-eureka-client'
       ```
   2. We need to include the dependency of spring-cloud, webflux, sprin-cloud-gateway but here we are also including the
      dependency of eureka-client because we need to register this gateway as well to eureka client.
   3. In Spring-Boot 3 we need to provide another configuration in our API Gateway to keep our API-Gateway application UP -
   ```yaml
    spring:
      main:
        web-application-type: reactive
    ```
   4.  Now we need to configure our microservices to our gateway.
3. For Spring-cloud API Gateway follow below link -  
   https://cloud.spring.io/spring-cloud-gateway/reference/html/

4. Below is the Eureka Server where this APIGateway is configured -  
   [Eureka Server](https://github.com/ayushdgupta/SpringBoot3-Eureka-Service-Microservice)
5. Below Microservices are configured to this APIGateway -  
   1. [Hotel microservice](https://github.com/ayushdgupta/SpringBoot3-Hotel-Microservice).
   2. [User microservice](https://github.com/ayushdgupta/SpringBoot3-User-Microservice/tree/master).
   3. [Rating microservice](https://github.com/ayushdgupta/SpringBoot3-Rating-Microservice).

### API-Gateway Working Flow Diagram
![Our API Gateway Flow Diagram](src/main/resources/images/APIGateway.png)

![Octocat](https://springdoc.org/img/banner-logo.svg)
[![Build Status](https://ci-cd.springdoc.org:8443/buildStatus/icon?job=springdoc-openapi-starter-IC)](https://ci-cd.springdoc.org:8443/view/springdoc-openapi/job/springdoc-openapi-starter-IC/)
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=springdoc_springdoc-openapi&metric=alert_status)](https://sonarcloud.io/dashboard?id=springdoc_springdoc-openapi)
[![Known Vulnerabilities](https://snyk.io/test/github/springdoc/springdoc-openapi.git/badge.svg)](https://snyk.io/test/github/springdoc/springdoc-openapi.git)
[![Stack Exchange questions](https://img.shields.io/stackexchange/stackoverflow/t/springdoc)](https://stackoverflow.com/questions/tagged/springdoc?tab=Votes)


``springdoc-openapi`` is on [Open Collective](https://opencollective.com/springdoc). If you ❤️ this project consider becoming
a [sponsor](https://github.com/sponsors/springdoc).

IMPORTANT: 
* For Spring Boot 2.x and 1.x.
  * ``springdoc-openapi v1.8.0`` is the latest Open Source release supporting  
  * [*springdoc-openapi v1*](https://springdoc.org/v1)  

# Table of Contents

- [Full documentation](#full-documentation)
- [**Introduction**](#introduction)
- [**Getting Started**](#getting-started)
    - [Library for springdoc-openapi integration with spring-boot and swagger-ui](#library-for-springdoc-openapi-integration-with-spring-boot-and-swagger-ui)
    - [Spring-boot with OpenAPI Demo applications.](#spring-boot-with-openapi-demo-applications)
        - [Source Code for Demo Applications.](#source-code-for-demo-applications)
        - [Demo Spring Boot 2 Web MVC with OpenAPI 3.](#demo-spring-boot-2-web-mvc-with-openapi-3)
        - [Demo Spring Boot 2 WebFlux with OpenAPI 3.](#demo-spring-boot-2-webflux-with-openapi-3)
        - [Demo Spring Boot 2 WebFlux with Functional endpoints OpenAPI 3.](#demo-spring-boot-2-webflux-with-functional-endpoints-openapi-3)
        - [Demo Spring Boot 2 and Spring Hateoas with OpenAPI 3.](#demo-spring-boot-2-and-spring-hateoas-with-openapi-3)
    - [Integration of the library in a Spring Boot 3.x project without the swagger-ui:](#integration-of-the-library-in-a-spring-boot-3x-project-without-the-swagger-ui)
    - [Error Handling for REST using @ControllerAdvice](#error-handling-for-rest-using-controlleradvice)
    - [Adding API Information and Security documentation](#adding-api-information-and-security-documentation)
    - [spring-webflux support with Annotated Controllers](#spring-webflux-support-with-annotated-controllers)
- [Acknowledgements](#acknowledgements)
    - [Contributors](#contributors)
    - [Additional Support](#additional-support)

# [Full documentation](https://springdoc.org/)

# **Introduction**

* := Java library /
  * based on Spring Boot projects -- automate the generation of -- API documentation in format
    * JSON/YAML
    * HTML
  * how does it work?
    * infer API semantics -- based on -- examine an application at runtime
      * Spring configurations
      * class structure 
      * various annotations
    * +`swagger-api` annotations

* Supports:
  * OpenAPI 3
  * Spring-boot v3 (Java 17 & Jakarta EE 9)
  * JSR-303, specifically for @NotNull, @Min, @Max, and @Size.
  * Swagger-ui
  * OAuth 2
  * GraalVM native images
* [https://youtu.be/utRxyPfFlDw](https://youtu.be/utRxyPfFlDw)
  * introductory video
* For *spring-boot v3* support -> use [springdoc-openapi v2](https://springdoc.org/)
* community-based project / NOT maintained by the Spring Framework Contributors (Pivotal)

# **Getting Started**
## springdoc-openapi -- integrated with -- spring-boot and swagger-ui
* Swagger-ui 
  * -- is automatically deployed to -- a Spring Boot 3.x application
  * page at "http://server:port/context-path/swagger-ui.html" 
    * `server`: server name or IP
    * `port`: server port
    * `context-path`: context path of the application
* Documentation -- using the official [swagger-ui jars](https://github.com/swagger-api/swagger-ui.git) -- is available in
  * HTML format
  * .yaml at "http://server:port/context-path/v3/api-docs.yaml"
* OpenAPI description (.json) at "http://server:port/context-path/v3/api-docs"
* How to set up?
  * Add the `springdoc-openapi-ui` library to the list of your project dependencies
    ```xml
       <dependency>
          <groupId>org.springdoc</groupId>
          <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
          <version>last-release-version</version>
       </dependency>
    ```
  * if you want to customize the path of the swagger documentation in HTML format -> , add in your spring-boot configuration file
    ```properties
    # swagger-ui custom path
    springdoc.swagger-ui.path=/swagger-ui.html
    ```
---

### Spring-boot with OpenAPI Demo applications.
* [Source Code for Demo Applications](https://github.com/springdoc/springdoc-openapi-demos/tree/master).
* [Demo Spring Boot 3 Web MVC with OpenAPI 3](https://demos.springdoc.org/demo-spring-boot-3-webmvc).
* [Demo Spring Boot 3 WebFlux with OpenAPI 3](https://demos.springdoc.org/demo-spring-boot-3-webflux/swagger-ui.html).
* [Demo Spring Boot 3 WebFlux with Functional endpoints OpenAPI 3](https://demos.springdoc.org/demo-spring-boot-3-webflux-functional/swagger-ui.html).
* [Demo Spring Boot 3 and Spring Cloud Function Web MVC](https://demos.springdoc.org/spring-cloud-function-webmvc).
* [Demo Spring Boot 3 and Spring Cloud Function WebFlux](http://158.101.191.70:8085/swagger-ui.html).
* [Demo Spring Boot 3 and Spring Cloud Gateway](https://demos.springdoc.org/demo-microservices/swagger-ui.html).

![Branching](https://springdoc.org/img/pets.png)

---

## springdoc-openapi -- integrated with -- Spring Boot 3.x BUT without swagger-ui
* Documentation
  * at json format: "http://server:port/context-path/v3/api-docs"
    * `server`: The server name or IP
    * `port`: The server port
    * `context-path`: The context path of the application
  * at yaml format: "http://server:port/context-path/v3/api-docs.yaml"
* How to set up?
  * add to your project dependencies
    ```xml
       <dependency>
          <groupId>org.springdoc</groupId>
          <artifactId>springdoc-openapi-starter-webmvc-api</artifactId>
          <version>last-release-version</version>
       </dependency>
    ```
  * if you want to customize the path of the OpenAPI documentation in Json format -> add in your spring-boot configuration file
    ```properties
    # /api-docs endpoint custom path
    springdoc.api-docs.path=/api-docs
    ```
  * if you want to disable `springdoc-openapi` endpoints -> add in your `spring-boot` configuration file:
    ```properties
    # disable api-docs
    springdoc.api-docs.enabled=false
    ```

## Error Handling for REST -- via -- @ControllerAdvice
* Requirements to generate the documentation
  * 👁️ ALL the methods must declare the HTTP Code responses -- via -- `@ResponseStatus` 👁️

## Adding API Information and Security documentation
* Declare within a 👁️ Spring managed bean 👁️,
  * the annotations
    * `@OpenAPIDefinition`
    * `@SecurityScheme`
  * Reason: 🧠 scan the spring-boot application auto-configured packages, looking for beans 🧠
    * OpenAPIDefinition
    * Info

## spring-webflux support with Annotated Controllers
* Documentation available in
  * yaml format at "http://server:port/context-path/v3/api-docs.yaml"
* How to set up?
  * add the library
    ```xml
       <dependency>
          <groupId>org.springdoc</groupId>
          <artifactId>springdoc-openapi-starter-webflux-ui</artifactId>
          <version>last-release-version</version>
       </dependency>
    ```
  * if you want to customize path of the swagger documentation in HTML format ->  add in your spring-boot configuration file
    ```properties
    # swagger-ui custom path
    springdoc.swagger-ui.path=/swagger-ui.html
    ```

## Releases and Snapshots  
* Releases:
  * [https://s01.oss.sonatype.org/content/groups/public/org/springdoc/](https://s01.oss.sonatype.org/content/groups/public/org/springdoc/)
* Snapshots:
  * [https://s01.oss.sonatype.org/content/repositories/snapshots/org/springdoc/](https://s01.oss.sonatype.org/content/repositories/snapshots/org/springdoc/)

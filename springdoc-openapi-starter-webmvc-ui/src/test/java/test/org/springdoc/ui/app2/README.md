# Goal
* test `springdoc.swagger-ui.enabled` property

## Structure
* "SpringDocApp2Real"
  * real spring boot app
* "SpringDocApp2Test"
  * test spring boot app

## SpringDocApp2Real
* Run it locally
* Open in your browser
  * "http://localhost:8080/v3/api-docs"
    * Check how ALL is based on the defined beans -- "HelloController" --
  * "http://localhost:8080/swagger-ui/index.html"
    * Check how NOTHING is displayed, since it's disabled
    * Problems:
      * Problem1: How to pass this property?
        * Attempt1: `@PropertySource(value = "springdoc.swagger-ui.enabled=false")`
        * Solution: Via `SpringApplication.setDefaultProperties()` -- Check [documentation](https://docs.spring.io/spring-boot/reference/features/external-config.html) --

## Rest
* TODO:

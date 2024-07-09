# Goal
* 👁️check Swagger UI behavior -- based on -- Spring Configuration 👁️

## Structure
* "SpringDocTestApp"
  * real spring boot app
* rest
  * test spring boot app

## SpringDocTestApp
* Run it locally
* Open in your browser
  * in any page -> redirect to "http://localhost:8080/login"
    * Problems:
      * Problem1: What are the credentials to access?
        * Attempt1: Switch to release org.springdoc:springdoc-openapi version
        * Solution: Add 'application.properties' here in this pathwith `spring.autconfigure.exclude:org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration`
      * Problem2: "Process finished with exit code 1"
        * Solution: `spring.main.lazy-initialization: true`
    * Note: It comes from adding 'org.springframework.boot:spring-boot-starter-security' to this maven module
  * "http://localhost:8080/v3/api-docs"
    * Check how ALL is based on the defined beans -- "HelloController" --
  * "http://localhost:8080/swagger-ui/index.html"
    * Check how ALL is based on the defined beans -- "HelloController" --

## Rest
* TODO:

## Notes
* 'test/resources/application.properties'
  * uses
    * make it run real spring boot applications

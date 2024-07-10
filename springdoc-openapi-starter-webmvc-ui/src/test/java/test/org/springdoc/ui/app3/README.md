# Goal
* Spring MVC Path matching customization
  * [Documentation](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-config/path-matching.html) 

## Structure
* "SpringDocApp3Real"
  * real spring boot app
* "SpringDocApp3Test"
  * test spring boot app

## SpringDocApp3Real
* Run it locally
* Open in your browser
  * "http://localhost:8080/"
    * -- redirect to -- "http://localhost:8080/index.html"
  * "http://localhost:8080/v3/api-docs/swagger-config"
    * -- redirect to -- "http://localhost:8080/v3/api-docs"
  * "http://localhost:8080/v3/api-docs"
    * NO path configured -- since there is NO bean on it --
  * "http://localhost:8080/swagger-ui/index.html"
    * NO path configured -- since there is NO bean on it --

## SpringDocApp3Test
* TODO:

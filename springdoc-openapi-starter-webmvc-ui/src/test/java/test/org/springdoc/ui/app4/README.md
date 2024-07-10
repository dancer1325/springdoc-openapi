# Goal
* Comprehend "/v3/api-docs/swagger-config" 

## Structure
* "SpringDocTestApp"
  * real spring boot app
* "SpringDocApp4Test"
  * test "SpringDocTestApp"

## SpringDocApp3Real
* Run it locally
* Open in your browser
  * "http://localhost:8080/"
    * -- redirect to -- "http://localhost:8080/index.html"
  * "http://localhost:8080/v3/api-docs/swagger-config"
    * Check that 👁️ it host external configuration document 👁️-- [configUrl](https://github.com/swagger-api/swagger-ui/blob/master/docs/usage/configuration.md#core) --
      * "http://localhost:8080/v3/api-docs/stores"
        * OpenAPI specification without path -- since there is NO bean on it --
      * "http://localhost:8080/v3/api-docs/pets"
        * OpenAPI specification without path -- since there is NO bean on it --
  * "http://localhost:8080/v3/api-docs"
    * NO path configured -- since there is NO bean on it --
  * "http://localhost:8080/swagger-ui/index.html"
    * NO path configured -- since there is NO bean on it --

## SpringDocApp3Test
* TODO:

# ms-bootstrap

The following repo represents a Microservice scaffolding. The structure represents a multi build project
and is made up of a service.

Steps to run application in local system:

To run the service execute the following command at the root of the project. This will download and install the
gradle wrapper and then execute the service.

```
> ./gradlew service:bootRun 
```


## Swagger -  Running in local

The service exposes the swagger ui at the following URL.  Within the swagger ui page you will see the example endpoints 
implemented by the microservice skeleton.

```
http://localhost:9288/swagger-ui.html
```
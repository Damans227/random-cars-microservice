# Random-Cars-Microservice

Random-Cars-Microservice is a spring-boot and elasticsearch based REST-API web service that allows you to perform CRUD operations by leveraging different HTTP METHODS such as GET/PUT/POST/DELETE and explore random cars from various manufacturers. This webservice offers an OPEN API based documentation to better understand all different endpoints available to the consumer. 

## How to run the application

1. In order to get this application up and running quickly, you will need to have `java` & `docker` run-time installed on your computer. 
2. Now, run the following docker command:<br />
   a) `docker run -dt -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.9.3`<br />
3. Clone this repository. Go to `Deployment` folder, and run the following command:<br />
   a) `java -jar practical-java-2.0.0.jar`<br />
4. The application should be up and running on the following `URL: http://localhost:8080/swagger-ui.html`


 ## How to use Random-Cars-Microservice

1. Follow the swagger-ui documentation by going to `http://localhost:8080/swagger-ui.html`. 

 ## User Stories

- Users can show or update different records using various GET/ POST endpoints depicted in the documentation. 
- Deployment of the application is pretty quick due to all the dependencies packed in a single fat jar file as a spring boot application.  

 ## Features

 - Easy to understand JAVA EE code which is built using Spring DATA JPA dependency.

 ## Future features
 - Resolve obvious defects. 
 - Complete docker-compose file to further simplify the deployment of the application. 

 ## Dependencies 

- Java
- Spring & Spring Boot
- Gradle
- Elasticsearch
- Automatic API documentation with Swagger

## What the app looks like

![screenshot1](https://raw.githubusercontent.com/Damans227/random-cars-webservice/main/screenshots/random-cars.gif)


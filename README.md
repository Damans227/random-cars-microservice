# Random-Cars-Webservice

Random-Cars-Webservice is a spring-boot and elasticsearch based REST-API web service that allows you to perform CRUD operations by leveraging different HTTP METHODS such as GET/PUT/POST/DELETE etc. This webservice offers a swagger-ui enabled documentation to better understand all different endpoints available to the consumer. 

## How to run the application

1. In order to get this application up and running quickly, you will need to have `java` & `docker` run-time installed on your computer. 
2. Now, run the following docker command:<br />
   a) `docker run -dt -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.9.3`<br />
3. Clone this repository and go to `Deployment` folder, and run the following command:
   a) `java -jar practical-java-2.0.0.jar`<br />
4. The application should be up and running on the following `URL: http://localhost:8080/swagger-ui.html`


 ## How to use Random-Cars-Webservice

1. Follow the swagger-ui documentation by going to `http://localhost:8080/swagger-ui.html`. 

 ## User Stories

- Users can execute various such as GET/POST endpoints to show and add cars to the elasticsearch repository. 
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

![screenshot1](https://raw.githubusercontent.com/Damans227/Resume-Generator/main/screenshots/resume-generator.gif)


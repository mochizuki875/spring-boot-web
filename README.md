# Spring Boot Web
The sample web application of spring boot.  
The display changes according to the environment variable.

## Prerequisites

- java 11
- maven 3.6.3

## Quick Start

Set environment variable.

~~~
export APP_VERSION=v1
~~~

Run the web app.

~~~
mvn spring-boot:run
~~~

Access web browser.

~~~
http://localhost:8080/
~~~

Set environment variable to change the display.

~~~
export APP_VERSION=v2
~~~

Run the web app again.

~~~
mvn spring-boot:run
~~~

Access web browser again.

~~~
http://localhost:8080/
~~~

## Unit Test

Unit test by JUnit.

~~~
mvn test
~~~

## Docker build & run

Build docker image and run as container.

~~~
docker build -t spring-boot-web .
docker run -p 8080:8080 -e APP_VERSION=v2 spring-boot-web
~~~

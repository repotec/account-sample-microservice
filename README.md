### account-sample-microservice

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [IDEs](#ides)
* [Setup](#setup)

## General info
* This project is simple microservice demonstration using springboot/cloud and netflix.
* The main purpose is to demonstrate the benifites of:
	- netflix eureka discovery service and discovery registery.
	- netflix zuul gateway/load balancing and reverse proxy.
	
## Technologies
Project is created with:
* springboot 2.3.8.RELEASE
* spring cloud Hoxton.SR9
* Java 11
* Netflix Eureka
* Netflix Zuul
* Maven 3.6
* H2 database
* MapStruct
* Lombok

## IDEs
* Spring Tool Suite 4.9.0.RELEASE
* ConEmu-Maximus5 

## Setup
To run this project, install it locally through windows-10 using ConEmu windows terminal:
* mvn package
* java -jar discovery-eureka-server\target\discovery-eureka-server-0.0.1-SNAPSHOT.jar --server.port=8761
* java -jar gateway-api-zuul-server\target\gateway-api-zuul-server-0.0.1-SNAPSHOT.jar --server.port=8762
* java -jar account-info-service\target\account-info-service-0.0.1-SNAPSHOT.jar --server.port=8700
* java -jar account-info-service\target\account-info-service-0.0.1-SNAPSHOT.jar --server.port=8701
# account-smaple-microservice

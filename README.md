# cnj-resilience

> __@deprecated__: Replaced by new repositories [cnj-resilience-backend-micro](https://github.com/msgoat/cnj-resilience-backend-micro),
> [cnj-resilience-backend-quarkus](https://github.com/msgoat/cnj-resilience-backend-quarkus), 
> [cnj-resilience-backend-spring](https://github.com/msgoat/cnj-resilience-backend-spring), 
> [cnj-resilience-downstream-a](https://github.com/msgoat/cnj-resilience-downstream-a),
> and [cnj-resilience-downstream-b](https://github.com/msgoat/cnj-resilience-downstream-b).

Showcase of resilient cloud native Java applications.

The actual implementation of resilience or fault tolerance is demonstrated with different Java backend technologies:

* Eclipse MicroProfile (see: [cnj-resilience-backend-micro](cnj-resilience-backend-micro/README.md))
* Spring Boot (see: [cnj-resilience-backend-spring](cnj-resilience-backend-spring/README.md))
* Quarkus (see: [cnj-resilience-backend-quarkus](cnj-resilience-backend-quarkus/README.md))

All applications are using two common downstream services:

* [cnj-resilience-downstream-a](cnj-resilience-downstream-a/README.md)
* [cnj-resilience-downstream-b](cnj-resilience-downstream-b/README.md)

## Status
![Build status](https://drone.cloudtrain.msgoat.eu/api/badges/msgoat/cnj-resilience/status.svg)

## Release information

Check [changelog](changelog.md) for latest version and release information.

## Build this showcase 

### Prerequisites

In order to run the build, you have to install the following tools locally:
* Docker
* Docker Compose 
* Maven
* Java JDK 11   

### Run Maven

You can build all showcase applications by running Maven:
```
mvn clean install -P pre-commit-stage
```

The Maven build will create Docker images for all showcase applications and run system tests on them.

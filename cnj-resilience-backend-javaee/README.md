# cnj-resilience-backend-javaee

Simplest possible cloud native java application based on Java EE 8.

## Docker Pull Command
`docker pull docker.at41tools.k8s.aws.msgoat.eu/cloudtrain/cnj-resilience-backend-javaee`

## Run this application 

``` 
docker run --name cnj-resilience-backend-javaee -p 8080:8080 docker.at41tools.k8s.aws.msgoat.eu/cloudtrain/cnj-resilience-backend-javaee
```

## Build this application 

See [cnj-resilience](../README.md) for build instructions.

``` 
mvn clean verify -P pre-commit-stage
```

Build results: a Docker image containing an Payara Full Profile application server plus the deploy application.

## Exposed REST endpoints

### /api/v1/hello

Returns a simple welcome message to the currently authenticated user.

Method
: GET

URI
: /api/v1/hello

Parameter(s)
: none

Response
: welcome message as JSON document

Authentication type
: none

Role(s) required
: none


## Exposed environment variables

## Exposed Ports

| Port | Protocol | Description |
| --- | --- | --- |
| 8080 | HTTP | HTTP endpoint of this application | 
 
## Version / Tags

| Tag(s) | Remarks |
| --- | --- |
| latest, 4.0.0 | first release |

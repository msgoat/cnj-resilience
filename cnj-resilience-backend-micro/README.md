# cnj-resilience-backend-micro

Simplest possible cloud native java application based on Eclipse Micro Profile.

## Docker Pull Command
`docker pull docker.at41tools.k8s.aws.msgoat.eu/cloudtrain/cnj-resilience-backend-micro`

## Run this application 

``` 
docker run --name cnj-resilience-backend-micro -p 8080:8080 docker.at41tools.k8s.aws.msgoat.eu/cloudtrain/cnj-resilience-backend-micro
```

## Build this application 

See [cnj-resilience](../README.md) for build instructions.

## Exposed REST endpoints

### /api/v1/hello

Returns a simple welcome message user in JSON format

Method
: GET

URI
: /v1/hello

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
| 8080 | HTTP | HTTP endpoint of this microprofile application | 
 
## Version / Tags

| Tag(s) | Remarks |
| --- | --- |
| latest, 1.0.0 | first release |

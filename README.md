# Micro-Service Docker

micro-service-docker

## Requirements

* [Java8](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)


## Installation

##### Setup

```
git clone https://github.com/GuilhermeLaia/microservice-docker.git
mvn clean install
mvn spring-boot:run
```

### Unit Tests

```
mvn install
```
### Docker Image

Image Oracle 

* [Image Oracle](https://hub.docker.com/_/oracle-database-enterprise-edition)

Connection:

```
url=jdbc:oracle:thin:@oracle:1521/ORCLCDB
username=sys as sysdba
password=Oradoc_db1
```

#### API Doc

```
http://localhost:8090/swagger-ui.html
```

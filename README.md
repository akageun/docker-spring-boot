# Docker & Spring Boot (작성중)

## Command

> mvn clean

#### maven으로 packaging 하기

> mvn package

#### docker build

> docker build --tag docker-boot:0.0.1 .


 

#### docker run

> docker run --name docker-boot --rm -p 8081:8081 docker-boot:0.0.1

###### background 로 실행할 경우 
- 아래와 같이 `-d`를 추가한다.

> docker run --rm -d -p 8081:8082 docker-boot:0.0.1

#### process 확인

> docker ps

## url 호출

> curl localhost:8081

- 결과

```
OK
```

## process Stop
- container id 는 `docker ps` 로 알 수 있다.

> docker stop {container id}

or

> docker run --rm -d  --name docker-boot-8081
> docker stop docker-boot-8081


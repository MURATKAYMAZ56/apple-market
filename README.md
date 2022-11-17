# Apple Market  Project


This application manages apple bags on the apple market.

## How to Run
- Clone this repository.
- Make sure you are using JDK 19 and Maven 3.X
- You can build the project by running `mvn clean package`
- Once successfully built, you can run the service by following command *(assuming that you have Maven already instlalled)*

```
     java -jar /target/market-0.0.1-SNAPSHOT.jar
or
     mvn spring-boot:run
```

Once the application runs you should see something like this

~~~
2022-11-16 20:44:17.728  INFO 63864 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8081 (http) with context path ''
2022-11-16 20:44:17.737  INFO 63864 --- [           main] c.i.p.market.AppleMarketApplication      : Started AppleMarketApplication in 1.819 seconds (JVM running for 2.128)

~~~

## About the Service

The service is Apple Market RESTful Api . It is persisted data at the runtime duration.

Here are some endpoints you can call:

**1. Get list of apple bags**

via Postman
```
 GET http://localhost:8081/api/bags                  // by default will return 3 bags
 GET http://localhost:8081/api/bags?numberOfBags=X  // will return X bags
```

or 

via Curl

```
curl -X GET http://localhost:8081/api/bags

```


**2. Add an apple bag**

via Postman

```
 POST http://localhost:8081/api/bags
  {
    "numberOfApples" : 3,
    "supplier": "Royal Gala",
    "price" : 4,
	"packedTime" : "2022-11-16T14:13:12"
  }

```
or 

via Curl

```
curl -X POST localhost:8081/api/bags -H 'Content-type:application/json' -d '{"numberOfApples":13,"supplier": "Pink Lady","packedTime": "2022-07-12T14:13:12","price": 4}'

```

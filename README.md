# springboot-data-example

There are 2 ways to do this - without using Dev Tools and with using Dev Tools. We will see both ways

## How to run without using Dev Tools
```
git clone git@github.com:101bits/springboot-data-example.git
cd springboot-data-example
git checkout tags/without_dev_tools
mvn spring-boot:run
```

This will start the application, import data (from `import.sql`) and start the `Tomcat` web-server.

#### Login to the database
On your choice of browser, enter [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
Enter the following for
```
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Pasword: <leave this empty>
```

## How to run without using Dev Tools
Add the Spring-Boot Dev Tools dependency
```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>

```
That's it. There is no need to change anything in `application.properties`. Follow the *Login to the database* section
and you would be able to connect to `H2` database using a browser.

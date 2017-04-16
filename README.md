# springboot-data-example

#### How to run
```
git clone git@github.com:101bits/springboot-data-example.git
cd springboot-data-example
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


Connect and you would see a page similar to following  

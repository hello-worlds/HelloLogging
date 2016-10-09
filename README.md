# HelloLogging
eclipse sample java logging implementation

##Tools
* java.util.logging.Logger;
* org.apache.commons.logging
* org.apache.log4j
* com.mysql.jdbc

## Methods
* basic logging basic : trace, debug, info, warn, error, fatal
* logging exception
* log4j.properties implementation
* log4j.xml implementation
* console logging
* log file logging
* interfal log file logging
* html logging
* xml logging
* mysql logging

## log4j.properties implementation
* less verbose than using xml

File Location
```java
src/main/resources/log4j.preperties
```

## log4j.xml implementation
* more verbose than using .properties
* recomended to use if you want to implement newest log4j feature
* DTD structure validation

File Location
```java
src/main/resources/log4j.xml
```

## MySQL logging DDL
Table structure for db logging
```sql
CREATE TABLE `LOGS` (
  `USER_ID` varchar(20) NOT NULL,
  `DATETIME` datetime NOT NULL,
  `LOGGER` varchar(100) NOT NULL,
  `LEVEL` varchar(10) NOT NULL,
  `MESSAGE` varchar(1000) NOT NULL
);

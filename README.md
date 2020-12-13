# Learning-Cache-Backend

Created a repo in my Github

Used https://start.spring.io/ to created my Springboot app

Use https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-introduction to understand spring

Create in com.learning.cache a folder configuration
    Create a Class (DataSourceConfiguration) to connect to the database

DAO is a class that usually has operations like save, update, delete.
    DAO layer is that if you need to change the underlying persistence mechanism you only have to change the DAO layer, and not all the places in the domain logic where the DAO layer is used from.

DTO is just an object that holds data. 
    DTO layer is that it adds a good deal of flexibility to the service layer and subsequently to the design of the entire application

model
E-CommicBookStore


Introduction

The E-CommicBookStore will manage buying or selling of comic books over the internet, and the transfer of data to execute the transactions. All users can log into the online comic bookstore by role (customer or store worker). New customers can register. Customers can search books by creator, genre, and character. Customers can also place order and checkout. Store workers can check inventories and add new products.

E-Commerce System Use Case Diagram
![](https://github.com/tjhodge121/RevComicPrG3/blob/main/diagram.png?raw=true)

Technologies

The back-end system will use Object Relational Mapping Framework - Hibernate to connect to a Postgres database which will be hosted remotely on GCP Cloud SQL, map the database tables, and manipulate the data in the database. The middle tier will use Javalin technology for dynamic Web application development. The front-end view will use HTML/CSS/ Angular to make an application that can call server-side components in a generally RESTful manner. The middle tier will follow proper layered architecture, and have reasonable JUnit test coverage of the service layer. Webpages will be styled to be functional and readable.

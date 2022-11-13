# qa-assessment-nov12


# Task #1 : UI Tests

* Sample setup only

# Task #2 : API Tests

file - Booker-nov12.json

tools used - POSTMAN, NEWMAN

command - newman run Booker-nov12.json


# Task #3 : Database Querying

* assumption - Oracle DB

  1). select * from Contacts where email is not NULL AND phone is not NULL
  
  2). select groupId, count(*) from Users group by groupId
  
  3). select c.customerName, o.orderId, o.orderDate from Customers c join Orders o on c.id = o.customerId

HTTP Methods are: GET, POST, PUT, DELETE

HTTP Status Codes:
-----------------
2XX: Success. 
1. 200 is success. Use it for GET and PUT request
2. 201 is Content Created: Use it for POST request 
3. 204 is No Content. Use it for DELETE request

4XX: Client Error
400: Bad request. URL is correct but the way you are requesting is wrong
404: Resource Not found. Either your URL is wrong or the resource you are requesting is not present
401: Not Authenticate(userid/password) or Not Authorized(permissions after successful log in)

5XX: Server Error:
500: Server not able to process or server is down



Spring important Annotations:
-----------------------------
1. @Autowire:
2. @Component: 
				says to spring create an Object of mine through (IOC or DI)
				It is a general annotation by which spring loads the object into its(spring) container
3. @Services, @Respository and @Controller(@RestController) are the three specilized annotations of 		@Component
4. @Services: we use for Services. Services used Repository
5. @Repository: We use it for Repository which talks to actual database for db operations
6. @Controller: 

7. We have to annotate a class with either of the above annotations like @Repository, @Component, 
   @Service, @Controller or @RestController. Absence of this leads to Beans not found
8. Then In order to inject one class into another(i.e., in order to create an object into another class) 
   we have to give @Autowire. Absence Leads to null pointer exception


Flow is: Controller -> Services --> Repository -> database


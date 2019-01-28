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


Flow is: Controller -> Services --> Repository -> database


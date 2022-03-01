# jaxrs-swagger (Swagger API: using JAX-RS)

This is a sample application of Swagger UI using JAX-RS.  

## Installation

Use the below command to create the war file

```bash
mvn clean install
```
This will download the Swagger-UI and add it to the artifact. Deploy the war file (jaxrs-swagger.war) to the application server (I have used Tomcat).
## Testing
Use the below URL to test the generated JSON 
```python
http://localhost:8080/jaxrs-swagger/services/swagger.json
```
Corresponding Swagger-UI can be accessed 
```python
http://localhost:8080/jaxrs-swagger/docs/
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.


## License
none

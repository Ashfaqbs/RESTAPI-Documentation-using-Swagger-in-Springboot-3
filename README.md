# RESTAPI-Documentation-using-Swagger-in-Springboot-3
    
## Adding Swagger UI Dependency to a Spring Boot 3.0.2 Project for Employees CRUD

This is a guide on how to add Swagger UI to a Spring Boot 3.0.2 project for employees CRUD.

## What is Swagger UI?
Swagger UI is an open-source tool that allows developers to create, visualize, and test RESTful APIs. It provides an interactive documentation interface that allows users to explore the API's resources, methods, and parameters.

## Adding Swagger UI to your Spring Boot project
To add Swagger UI to your Spring Boot project, you'll need to do the following:

### 1. Add the Swagger dependencies to your `pom.xml` file:

          <!--	Swagger-UI Dependency for Spring Boot 3 Start	-->
		
		
		
		    <dependency>
			  <groupId>org.springdoc</groupId>
			  <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
		   	<version>2.0.2</version>
	    	</dependency>
		
		
                <!--	End	-->


 ### 2.Stop the project and update the project and run the project 
   ####  URL : http://localhost:9001/swagger-ui/index.html
 
  ![image](https://user-images.githubusercontent.com/105435085/223010808-3398eaad-a6cd-4206-9b3d-05879bdf141b.png)

### 3. Adding license, Contact and terms of service
    
    ![image](https://user-images.githubusercontent.com/105435085/223012153-e1caebd5-536e-45e3-bb86-bcaa48070f0d.png)
    
    
  Go to the Main class,add this @OpenAPIDefinition
    


      import io.swagger.v3.oas.annotations.OpenAPIDefinition;
      import io.swagger.v3.oas.annotations.info.Contact;
      import io.swagger.v3.oas.annotations.info.Info;
      import io.swagger.v3.oas.annotations.info.License;

      @SpringBootApplication
      @OpenAPIDefinition(

	        	info = @Info(title = "Employee API Backend Springboot 3", version = "Employee API v.0.0.1", 
		       description = "This is a Spring boot project for Employee API ", 
	       	termsOfService = "A Springboot conifg", 
	      	contact = @Contact(name = "Ashfaq", email = "ash001x@gmail.com"

	    	), license = @License(name = "license", url = "domain/swagger-ui/index.html"

	    	)

	    	))
       public class EmployeeApiApplication {

      	public static void main(String[] args) {
	    	SpringApplication.run(EmployeeApiApplication.class, args);
	     }

       }


## Conclusion
In this guide, we've shown you how to add Swagger UI to your Spring Boot 3.0.2 project and use it to document your Employees CRUD API. With Swagger UI, you can make it easier for other developers to understand and use your API, and reduce the time required for documentation.

## Note :

afer adding this dependency following  error was seen

jakarta.validation.NoProviderFoundException: Unable to create a Configuration, because no Jakarta Bean Validation provider could be found. Add a provider like Hibernate Validator (RI) to your classpath.

this can be resolved by adding Hibernate Validator dependency.

         <dependency>
         <artifactId>validation-api</artifactId>
         <groupId>javax.validation</groupId>
        <version>2.0.1.Final</version>
       </dependency>






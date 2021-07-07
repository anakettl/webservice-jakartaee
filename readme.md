## The Conversion Application

This application offers two types of conversion:
- km to miles using form encoded
- Nautical miles to km using json

### How to test
- Start open liberty server
- Use a api Client (Postman, Insomnia)

#### Convert Km To Miles
- Send a POST to `http://localhost:9080/data/api`
- With Form Url Encoded send a field 'km' with a double value.
- See the response with the conversion

#### Convert Nautical Miles To Km
- Send a POST to `http://localhost:9080/data/api`
- With json a body as `{ "mile": "10" }`
- See the response with the conversion


# MicroProfile generated Application

## Introduction

MicroProfile Starter has generated this MicroProfile application for you.

The generation of the executable jar file can be performed by issuing the following command

    mvn clean package

This will create an executable jar file **webservice.jar** within the _target_ maven folder. This can be started by executing the following command

    java -jar target/webservice.jar


### Liberty Dev Mode

During development, you can use Liberty's development mode (dev mode) to code while observing and testing your changes on the fly.
With the dev mode, you can code along and watch the change reflected in the running server right away; 
unit and integration tests are run on pressing Enter in the command terminal; you can attach a debugger to the running server at any time to step through your code.

    mvn liberty:dev


To launch the test page, open your browser at the following URL

    http://localhost:9080/index.html  



## Specification examples

By default, there is always the creation of a JAX-RS application class to define the path on which the JAX-RS endpoints are available.

Also, a simple Hello world endpoint is created, have a look at the class **HelloController**.

More information on MicroProfile can be found [here](https://microprofile.io/)



















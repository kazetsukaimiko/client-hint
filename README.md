# Client Hint #
A Basic [thorntail project](https://thorntail.io/) to test client hint APIs.

## How to use this ##

### Contributing
* First and foremost, you require a GitHub account. Start there.
* Fork this project
* git clone your fork.
* Make changes in your fork, committing/pushing there.
* Submit a PR against kazetsukaimiko/master to get your changes upstream.
* Pull from upstream to get my changes into your fork.

### Starting Thorntail

There are two services instances you need to start to test feature policy:
* 1st Party : The 1st party website.
* 3rd Party : The 3rd party tracking service.

First, for each instance, open a terminal and cd to the client-hint directory.

#### Starting the 3rd Party service (http://localhost:8080, https://localhost:8443)

```
mvn -s settings.xml thorntail:run -P 3rdparty
```

#### Starting the 1st Party service (http://localhost:80, https://localhost:443)

```
mvn -s settings.xml thorntail:run -P 1stparty
```

#### Common to both

Running the above commands, the thorntail server will fire up and you are ready to play around. 

* Web Root: src/main/webapp -> /
* REST Root: /rest
* EchoEndpoint: src/main/java/com/thunderhead/clienthint/rest/EchoEndpoint.java points to /rest/echo


### Making changes

* Java changes require restart of the thorntail service. 
* Anything under src/main/webapp is a web asset and is live updateable.


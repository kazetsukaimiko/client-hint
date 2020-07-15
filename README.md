# Client Hint #
A Basic [thorntail project](https://thorntail.io/) to test client hint APIs.

## How to use this ##

### Contributing
* First and foremost, you require a GitHub account. Start there.
* Fork this project.
* Make changes in a non-master branch
* Submit a PR against kazetsukaimiko/master.

### Starting Thorntail

cd to the client-hint directory and run:
```
mvn -s settings.xml thorntail:run
```

### Making changes

* Java changes require restart of the thorntail service. 
* Anything under src/main/webapp is a web asset and is live updateable.


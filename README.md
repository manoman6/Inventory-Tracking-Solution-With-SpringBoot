# An Inventory Management Solution Modernizing a Spring Application

Tasked with modernizing a web application built using Spring with a Java backend and HTML user interface, this solution created inventory managing and tracking. With the ability to log new parts, made both in-house and by a third-party. Utilizing SpringBoot with a Model View Controller design pattern, new parts and products can be added, logged, built, deleted and sold while maintaining accurate inventory.

### <ins>For a Video Demonstration</ins>
[![Watch the video](https://youtu.be/runqWnv14rU/0.png)](https://youtu.be/runqWnv14rU)


## Getting Started
To simplify trying out this program on your own, I have provided a Docker File and a prebuilt JAR so you do not need Maven installed to run it on your own device. Follow the steps below to build and run the application using Docker.

### <ins>Prerequisites</ins>
* Have Docker installed on your machine. [Click Here For the Download Page](https://www.docker.com/products/docker-desktop/)


### <ins>How to Pull and Run the Docker Image</ins>
* In the commandline/terminal pull the image to your machine:
```commandline/terminal
docker pull ghcr.io/manoman6/inventory-tracking-solution-with-springboot:latest
```
* Run the Container on your local machine:
```commandline/terminal
docker run -p 8080:8080 ghcr.io/manoman6/inventory-tracking-solution-with-springboot:latest
```
* Open your Browser type into the URL
```URL Bar
http://localhost:8080
```

### <ins>How to Build and Run Using the Docker File Without the Image</ins>
-- NOTE --: The prebuilt JAR file in `target/` is provided for convenience. It represents the current stable version of the project. To build your own JAR, use `mvn clean package`.
* Clone this repository using commandline/terminal:
```commandline/terminal
git clone https://github.com/manoman6/Inventory-Tracking-Solution-With-SpringBoot.git
```
```commandline/terminal
cd Inventory-Tracking-Solution-With-SpringBoot
```
* Build the Docker Image
```commandline/terminal
docker build -t inventory-tracking-solution-with-springboot .
```
* Run the Docker Image
```commandline/terminal
docker run -p 8080:8080 inventory-tracking-solution-with-springboot
```
* Open your Browser type into the URL
```URL Bar
http://localhost:8080
```
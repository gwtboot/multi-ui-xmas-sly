# multi-ui-xmas-sly

**Simple Example Using all GWT UI frameworks in One Webapp**

Why? To see that we can combine every UI frameworks in one GWT webapp. 

This example uses GWT Boot as Starter Parent: https://github.com/gwtboot/gwt-boot-samples

[![Build Status](https://travis-ci.com/gwtboot/multi-ui-xmas-sly.svg?branch=master)](https://travis-ci.com/gwtboot/multi-ui-xmas-sly)

## Examples of Multi UIs

### DnComponents

![Multi UI Home DnComponents](src/doc/multi-ui-home-dncomponents.png?raw=true "Multi UI Home DnComponents")

### VueGWT

![Multi UI Counter VueGWT](src/doc/multi-ui-counter-vuegwt.png?raw=true "Multi UI Counter VueGWT")

### DominoUI

![Multi UI Todo DominoUI](src/doc/multi-ui-todo-domino.png?raw=true "Multi UI Todo DominoUI")


## Building Example

To build the example:
```
mvn clean package
```

To run the example:
1. First: run the GWT Dev Mode: 
```
mvn gwt:generate-module gwt:devmode
```
2. Second: open your browser and go to following address:
```
http://127.0.0.1:8888/gwtdemo/
```
3. GWT Dev Mode supports **automatic transpiling**. You just need to update your Java code in your IDE and **reload your web browser**. Your Java code will be automatically transpiled and your webapp stays uptodate without restarting the web server. If you change the **index.html** you need to push the **restart button** on the Swing GUI.

# multi-ui-xmas-sly

**Simple Example Using all GWT UI frameworks in One Webapp**

Why? To see that we can combine every UI frameworks in one GWT webapp. 

This example uses GWT Boot as Starter Parent: https://github.com/gwtboot/gwt-boot-samples

Take a look at this article to see the whole story: http://bit.ly/WebJavaStory

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
http://127.0.0.1:8888/calculator/
```
3. GWT Dev Mode supports **automatic transpiling**. You just need to update your Java code in your IDE and **reload your web browser**. Your Java code will be automatically transpiled and your webapp stays uptodate without restarting the web server. If you change the **index.html** you need to push the **restart button** on the Swing GUI.
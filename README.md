## Java 9 Features

Java9 docs - https://openjdk.java.net/projects/jdk9/

### Factory methods for collections
In J9 - List and Set interfaces have “of()” methods to create an empty or no-empty Immutable List or Set objects.

List immutableList = List.of("one", "two", "three");
Set<String> strKeySet = Set.of("key1", "key2", "key3");
Map nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three")

The Set returned by this method is JVM internal class: java.util.ImmutableCollections.SetN, 
which extends public java.util.AbstractSet. It is immutable – if we try to add or remove elements, 
an UnsupportedOperationException will be thrown.

### Modular System
Modular JAR files contain an additional module descriptor. 
In this module descriptor, dependencies on other modules are expressed through`requires` 
statements. Additionally, `exports` statements control which packages are accessible to 
other modules. All non-exported packages are encapsulated in the module by default. 
Here's an example of a module descriptor, which lives in `module-info.java`:
Other keywords that are used for module definition are requires, exports, uses, opens, provides.

    module com.stark.java12Demo {
      exports com.stark.java12Demo;
    
      requires com.stark.java9Demo;
    }
Module is a collection of Java programs or softwares. 
To describe a module, a Java file module-info.java is required. 
This file also known as module descriptor and defines the following

Module name
It is a name of module and should follow the reverse-domain-pattern. 
Like we name packages, e.g. com.stark.

What does it export
What does it require

https://openjdk.java.net/projects/jigsaw/quick-start

4 Types of Modules: System Modules , Application Modules, Automatic Modules and Unnamed Module

### JShell: the interactive Java REPL
You can launch jshell from the console and directly start typing and executing Java code. 
The immediate feedback of jshell makes it a great tool to explore APIs and try out language features.

### Stream API Improvements
There are four new methods added to the Stream interface: dropWhile, takeWhile, ofNullable. 
The iterate method gets a new overload, allowing you to provide a Predicate on when to stop iterating
takeWhile - 
It returns, if this stream is ordered, a stream consisting of the longest prefix of elements taken from 
this stream that match the given predicate. Otherwise returns, if this stream is unordered, a stream 
consisting of a subset of elements taken from this stream that match the given predicate.
dropWhile -
It returns, if this stream is ordered, a stream consisting of the remaining elements of this stream 
after dropping the longest prefix of elements that match the given predicate. 
Otherwise returns, if this stream is unordered, a stream consisting of the remaining elements of 
this stream after dropping a subset of elements that match the given predicate.

### Private methods in Interfaces
We can write private and private static methods too in an interface using ‘private’ keyword.

### JCMD Sub-Commands
jcmd command line utility. We will get a list of all classes loaded in the JVM and their inheritance structure.

### HTTP/2 Client
A new way of performing HTTP calls arrives with Java 9. 
As existing or Legacy HTTP Client API has numerous issues (like supports HTTP/1.1 protocol and 
does not support HTTP/2 protocol and WebSocket, works only in Blocking mode and lot of performance 
issues.), they are replacing this HttpURLConnection API with new HTTP client. 
They are going to introduce new HTTP 2 Client API under “java.net.http” package. 
It supports both HTTP/1.1 and HTTP/2 protocols. It supports both Synchronous (Blocking Mode) 
and Asynchronous Modes. It supports Asynchronous Mode using WebSocket API.

    HttpClient client = HttpClient.newHttpClient();
    
    HttpRequest req =
       HttpRequest.newBuilder(URI.create("http://www.google.com"))
                  .header("User-Agent", "Java")
                  .GET()
                  .build();
    
    
    HttpResponse resp = client.send(req, HttpResponse.BodyHandler.asString());

### Try with Resource Improvements
Prior Java 9, we can't put resource declared outside the try-with-resource

### Anonymous Inner Classes Improvement
Java 9 introduced a new feature that allows us to use diamond operator with anonymous classes.
In Java 9, as long as the inferred type is denotable, we can use the diamond operator when we create an anonymous inner class.
Data types that can be written in Java program like int, String etc are called denotable types. Java 9 compiler is enough smart and now can infer type.

### SafeVarargs
It is an annotation which applies on a method or constructor that takes varargs parameters. It is used to ensure that the method does not perform unsafe operations on its varargs parameters.
it was included in Java7 and can only be applied on

Final methods
Static methods
Constructors
From Java 9, it can also be used with private instance methods.

Note: The @SafeVarargs annotation can be applied only to methods that cannot be overridden. 
Applying to the other methods will throw a compile time error.

### Control Panel
Java control panel is used to control Java applications that are embedded in browser. 
This control panel maintains the settings that manage Java application embedded in browser.
In Java 9, control panel was rewritten as a JavaFX application and the storage location has changed. To start control panel, 
enter jcontrol to the terminal (cmd for windows) and it will open a window.

### Underscore Keywords
In earlier versions of Java, underscore can be used as identifier and to create variable name also. 
But in Java 9 release, underscore is a keyword and can't be used as an identifier or variable name.

If we use the underscore character ("_") as an identifier, our source code can no longer be compiled.

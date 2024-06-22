all: Library.jar Main.class
	java -cp Library.jar:. Main

Color.class: Color.java
	javac -cp Library.jar:. Color.java

Main.class: Main.java
	javac -cp Library.jar:. Main.java

Library.jar: Color.class
	jar -cf Library.jar Color.class

clean:
	rm -f Color.class Main.class Library.jar

runProgram: all
	java -cp Library.jar:. Main


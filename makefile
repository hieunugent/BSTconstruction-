default: clean complie run
clean:
	rm -f *.class
complie:
	javac *.java
run:
	java TestRunner

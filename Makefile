OUTPUT = output.log


.PHONY: run
run: build
	java -verbose:class src/Main | tee ${OUTPUT}


.PHONY: build
build:
	javac src/*.java

.PHONY: clean
clean:
	rm src/*.class || true
	rm ${OUTPUT} || true

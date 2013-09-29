Nqueens: 
	export X10_NTHREADS=6
	/opt/x10/bin/x10c -O *.x10

test: 
	/opt/x10/bin/x10 Main configurations

clean:
	rm *.java *.class
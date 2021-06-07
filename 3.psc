Algoritmo sin_titulo
	Escribir ' ingresar número '
	Leer n
	Si n<0 Entonces
		Escribir ' no se puede calcular '
	SiNo
		x <- 1
		factorial <- 1
		Mientras x<=n Hacer
			factorial <- factorial*x
			x <- x+1
		FinMientras
		Escribir 'El Factorial es ',factorial
	FinSi
FinAlgoritmo

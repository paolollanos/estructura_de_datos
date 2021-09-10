
#recursividad

def factorial(n):
    resultado = 0 
    if n == 0:
        return 1
    else:
        return n * factorial( n - 1 )

n = 3
print(factorial(n))


def printRev(n):
    if n > 0 :
        print(n)
        printRev( n - 1 )

n = 3
printRev( n )

def bomba(n):
    if n > 0:
        print(n)
        bomba(n - 1 )
    else:
        print("Booom!!")
n = 3
print(bomba(n))

# este no me salio profesor, ayuda por favor
lista = ["tengo hambre", 2, 2, "son cuatro", "y", 4, 16]
def puntomedio(lista):
    #if len(puntomedio - 1) == len(puntomedio)
    if len(lista) > ((len(lista))/2):   
        lista.pop((len(lista))-1)
        puntomedio(lista)
        print(lista)
    
print(puntomedio(lista))

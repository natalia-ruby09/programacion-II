#estadistica: calcular el promedio y la desviacion estandar.
#@autor Natalia Ruby
#@version 1.0 22/08/2025

import math

class estadistica:
    def __init__(self, datos):
        self.datos = datos

    def promedio(self):
        return sum(self.datos) / len(self.datos)

    def desviacion(self):
        prom = self.promedio()
        suma = sum((x - prom) ** 2 for x in self.datos)
        return math.sqrt(suma / (len(self.datos) - 1))

#(TEST)estadistica: calcular el promedio y la desviacion estandar.
#@autor Natalia Ruby
#@version 1.0 22/08/2025

if __name__ == "__main__":
    numeros = list(map(float, input("Ingrese 10 numeros: ").split()))
    if len(numeros) != 10:
        print("Ingresar exactamente 10 numeros.")
    else:
        est = estadistica(numeros)
        print(f"El promedio es {est.promedio():.2f}")
        print(f"La desviacion estandar es {est.desviacion():.5f}")

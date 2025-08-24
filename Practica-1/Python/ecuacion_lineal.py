#algebra: ecuacion cuadratica.
#@autor Natalia Ruby
#@version 1.0 20/08/2025

import math
class EcuacionCuadratica:
    def __init__(self, a, b, c):
        self.__a = a
        self.__b = b
        self.__c = c

    def get_discriminante(self):
        return self.__b**2 - 4*self.__a*self.__c

    def get_raiz1(self):
        disc = self.get_discriminante()
        if disc < 0:
            raise ValueError("No hay raices reales")
        return (-self.__b + math.sqrt(disc)) / (2*self.__a)

    def get_raiz2(self):
        disc = self.get_discriminante()
        if disc < 0:
            raise ValueError("No hay raices reales")
        return (-self.__b - math.sqrt(disc)) / (2*self.__a)

#(TEST)algebra: ecuacion cuadratica.
#@autor Natalia Ruby
#@version 1.0 20/08/2025

if __name__ == "__main__":
    a = float(input("Ingrese a: "))
    b = float(input("Ingrese b: "))
    c = float(input("Ingrese c: "))

    eq = EcuacionCuadratica(a, b, c)

    disc = eq.get_discriminante()
    if disc < 0:
        print("no tiene raíces reales.")
    else:
        print("Raíz 1 =", eq.get_raiz1())
        print("Raíz 2 =", eq.get_raiz2())

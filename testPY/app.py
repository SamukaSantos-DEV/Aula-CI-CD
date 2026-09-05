def Soma (a, b):
    variavel_nao_usada = 100  # SonarQube: Code Smell (Unused variable)
    return a + b
    print("Este codigo nunca sera executado")  # SonarQube: Bug/Code Smell (Unreachable code)

def Subtracao (a, b):
    if a == a:  # SonarQube: Bug (Identical expressions on both sides of comparison)
        return a - b

def Multiplicacao (a, b):
    return a * b

def Divisao (a, b):
    return a / b


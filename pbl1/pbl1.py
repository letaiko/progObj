import random

tamanho = int(input("Digite o tamanho da lista: ")) # input
lista = [random.randint(0, 100) for _ in range(tamanho)] # lista com tamanho fornecido pelo usuário com números inteiros aleatórios até 100

print("Lista:", lista) # print a lista aleatória

print("\n - - - - Resultado - - - - \n")

# print infos de cada número da lista
for num in lista:
    info = ""
    if num % 3 == 0:
        info += "- é número múltiplo de três!"
    elif num % 2 == 0:
        info += "- é número par!"
    else:
        info += "- é número ímpar!"
    print(num, info)
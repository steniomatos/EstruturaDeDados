class Pilha:
    def __init__(self):
        self.items = []

    def esta_vazia(self):
        return len(self.items) == 0

    def empilhar(self, item):
        self.items.append(item)

    def desempilhar(self):
        if not self.esta_vazia():
            return self.items.pop()
        else:
            raise IndexError("A pilha está vazia. Não é possível desempilhar.")

    def topo(self):
        if not self.esta_vazia():
            return self.items[-1]
        else:
            raise IndexError("A pilha está vazia. Não há topo.")

    def tamanho(self):
        return len(self.items)


# Exemplo de uso da classe Pilha
minha_pilha = Pilha()
minha_pilha.empilhar(1)
minha_pilha.empilhar(2)
minha_pilha.empilhar(3)

print("Topo da pilha:", minha_pilha.topo())  # Saída: 3
print("Tamanho da pilha:", minha_pilha.tamanho())  # Saída: 3

item_desempilhado = minha_pilha.desempilhar()
print("Item desempilhado:", item_desempilhado)  # Saída: 3
print("Tamanho da pilha após desempilhar:", minha_pilha.tamanho())  # Saída: 2
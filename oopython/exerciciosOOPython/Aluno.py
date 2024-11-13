""" 
    01. Crie uma classe chamada Aluno com os atributos nome, idade e nota.
        Em seguida, crie dois objetos dessa classe, preenchendo os atributos, 
        e exiba as informações dos alunos na tela.
"""

class Aluno:

    # Atributos
    __nome = None
    __idade = None 
    __nota = None

    # Método Construtor
    def __init__(self, nome, idade, nota):
        self.__nome = nome
        self.__idade = idade 
        self.__nota = nota

    #Getters e Setters
    def getNome(self):
        return self.__nome
    def setNome(self, nome):
        self.__nome = nome
    def getIdade(self):
        return self.__idade
    def setIdade(self, idade):
        self.__idade = idade
    def getNota(self):
        return self.__nota
    def setNota(self, nota):
        self.__nome = nota
    

aluno1 = Aluno("Matheus", 22, 10)
aluno2 = Aluno("Mariane", 20, 10)

print(f"Nome: {aluno1.getNome()} | Idade: {aluno1.getIdade()} | Nota {aluno1.getNota()}")
print(f"Nome: {aluno2.getNome()} | Idade: {aluno2.getIdade()} | Nota {aluno2.getNota()}")
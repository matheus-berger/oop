

# criando classe
class Animal:

    # Atributos (não é necessario se estiver no init)
    __nome = None # (o "__" deixa privado o atributo)
    __idade = None
    __vida = None

    # método construtor
    def __init__(self, nome, idade, vida):
        
        # atributos
        self.__nome = nome 
        self.__idade = idade
        self.__vida = 100

    # Getters e Setters
    def getNome(self):
        return self.__nome
    
    def setNome(self, nome):
        self.__nome = nome

    def getIdade(self):
        return self.__idade
    
    def setIdade(self, idade):
        self.__idade = idade

    def getVida(self):
        return self.__vida

    def setVida(self, vida):
        self.__vida = vida
        if self.__vida <= 0:
            print(self.__nome, "Vida 0")
    
    # 
    def emitirSom(self):
        print("Som do Animal!")


# Classe filha
class Mamifero(Animal):
    
    def __init__(self, nome, idade, forca):

        # atribui valor aos atributos herdadas
        super().__init__(nome, idade, forca)
        # atribui valor ao atributo forca
        self.__forca = forca

    def getForca(self):
        return self.__forca
    def setForca(self, forca):
        self.__forca = forca
    
    #
    def atacar(self, atacado:Animal):
        atacado.setVida(atacado.getVida() - self.__forca)
    
    


cachorro = Animal("Bobby", 5, 50)
leopardo = Mamifero("Leozinho", 5, 70)
burro = Mamifero("Burro", 10, 5)

print(burro.getVida())
leopardo.atacar(burro)
print(burro.getVida())
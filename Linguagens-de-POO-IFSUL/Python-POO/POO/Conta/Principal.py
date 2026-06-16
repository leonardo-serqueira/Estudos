from Conta import Conta

c1 = Conta('123-4', 'Maria', 500.00, 2000.00)
print('NOME: ', c1.titular)
print('SALDO: ', c1.saldo)
print('LIMITE: ', c1.limite)

print()
print()

c2 = Conta('567-8', 'João', 200.00, 1500.00)
print('NOME: ', c2.titular)
print('SALDO: ', c2.saldo)
print('LIMITE: ', c2.limite)
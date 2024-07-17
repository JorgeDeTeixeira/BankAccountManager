# BankAccountManager
Exercício básico do curso de Java do Nélio Alves , Seção 15 Exceções

# BankAccountManager

## Descrição

O projeto `BankAccountManager` é um programa simples em Java que simula as operações básicas de uma conta bancária. Ele permite a leitura dos dados de uma conta bancária e a realização de saques, verificando o saldo disponível e o limite de saque da conta antes de efetuar a operação.

## Funcionalidades

- **Leitura dos Dados da Conta Bancária:** Coleta informações básicas como número da conta, nome do titular, saldo inicial e limite de saque.
- **Realização de Saques:** Permite que o usuário efetue saques na conta bancária, com verificações para garantir que o saldo é suficiente e que o valor do saque não ultrapasse o limite permitido.
- **Exibição do Novo Saldo:** Após um saque bem-sucedido, o novo saldo da conta é exibido.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- `BankAccount.java`: Classe que representa a conta bancária, contendo atributos como número da conta, nome do titular, saldo e limite de saque. Inclui métodos para realizar saques e verificar condições de saldo e limite.
- `Main.java`: Classe principal que interage com o usuário, lendo os dados da conta, solicitando o valor do saque e exibindo o novo saldo após a operação.

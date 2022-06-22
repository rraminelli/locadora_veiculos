# Projeto: Locadora Veiculos

----

## Passo 1

Uma locadora de veículos possui vários veículos que podem ser alugados (Carro, Onibus, Moto).

Cada veículo possui várias informações (placa, cor, modelo, ano, preço de locaçao) e pode ser alugado para um cliente de cada vez.

Para alugar um veiculo o cliente (fisico ou juridico) deve fornecer seus dados pessoais (nome, CPF/CNPJ, etc) e tambem o numero do cartao de credito.

No momento do aluguel do veiculo devem ser informados a quantidade de dias da locaçao, preço total e hora aproximada da devoluçao.

----

## Passo 2

Lista de veiculos para locaçao:
- Antes de efetuar a locaçao devemos recuperar a lista de veiculos disponiveis. Nossa empresa de locaçao de veiculos possui diversas filiais e cada filial possui um modo para recuperar a lista de veiculos. Os possiveis modos sao:
    - Lista de veiculos armazenada em memoria.
    - Lista de veiculos armazenada em banco de dados.
    - Lista de veiculos armazenada em arquivo CSV.
    - Lista de veiculos em API 

- Mostrar a lista em ordem do veiculo mais barato para o mais caro (vice-versa);

- Mostrar a lista em ordem do veiculo mais novo para o mais velho (vice-versa);

----

## Passo 3

- Para a locaçao de onibus, prever um acrescimo de 3% no valor final da locaçao.

## Passo 4

- Criar classes para armazenamento dos dados. Prever a possibilidade de cada filial da locadora pode possuir um tipo diferente de armazenamento (Banco Dados MySQL/Oracle, Arquivo).

## Passo 5

- A locadora de veiculos solicitou o envio de mensagens promocionais para os clientes (Email, SMS, WhatsApp).
- Algumas mensagens poderao ser enviadas também por SMS e/ou WhatsApp, mas sempre por e-mail.
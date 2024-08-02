# RestaurantOwners

## Sistema de CRM para restaurantes

Este repositório contém a documentação e os detalhes gerais do projeto.

Tecnologias:

Java, Web

Figma:

{link}





# Estrutura do Sistema

## Classes

### Colaborador
- `id`: int
- `nome`: String
- `cpf`: String
- `senha`: String

### Atendente (extends Colaborador)
- `FazerPedido()`
- `VerPedido()`

### Caixa (extends Colaborador)
- `VerPedido()`
- `ReceberPagamento()`

### Cozinha (extends Colaborador)
- `VerPedido()`
- `AlterarStatusPedido()`

### Administrativo (extends Colaborador)
- `FazerPedido()`
- `EditarPedido()`
- `RemoverPedido()`
- `VerPedido()`
- `AdicionarColaborador()`
- `EditarColaborador()`
- `RemoverColaborador()`
- `VerColaborador()`
- `AdicionarItemMenu()`
- `EditarItemMenu()`
- `RemoverItemMenu()`
- `VerItemMenu()`

## ItemMenu
- `id`: int
- `item`: String
- `tipo`: String
- `preco`: double
- `disponivel`: boolean

## Pedido
- `id`: int
- `comanda`: int
- `observação`: String
- `@ManyToOne ItemMenu itemMenu`

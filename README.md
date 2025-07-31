# 💰 Sistema de Gerenciamento Financeiro em Java

Este projeto é um sistema simples de gerenciamento financeiro bancário em Java, com foco em Programação Orientada a Objetos (POO). 
Ele permite **criar contas bancárias, fazer depósitos, saques, transferências via PIX, investimentos** e acompanhar o saldo.
---

## 🚀 Funcionalidades

✅ Criar contas com titular e número  
✅ Realizar depósitos  
✅ Realizar saques  
✅ Transferência de valores via PIX entre contas  
✅ Realizar investimentos (simples)  
✅ Consultar saldo atual  
✅ Listar contas e seus saldos  
---

## 🛠️ Tecnologias e Requisitos

- Java 17 ou superior
- VS Code (ou IntelliJ/Eclipse)
- Extensão: [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- JDK instalado no sistema

---

## 📦 Organização das Classes

| Classe         | Descrição |
|----------------|-----------|
| `Main`         | Classe principal. Contém o menu interativo e controla a entrada do usuário. |
| `Conta`        | Representa uma conta bancária com saldo, titular, número e métodos como `depositar`, `sacar`, `transferir` e `investir`. |
| `Banco`        | Gerencia todas as contas criadas. Permite buscar contas por número, adicionar e listar contas. |
| `Transacao`    | (Opcional / em expansão) Representa uma transação realizada em uma conta, como depósito, saque, transferência, etc. Útil para manter o histórico. |

---



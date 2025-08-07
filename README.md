# 💰 Conversor de Moedas em Java (CLI)

Este é um projeto simples de conversor de moedas desenvolvido em Java.
Ele utiliza uma API de taxas de câmbio para realizar conversões entre diferentes moedas de forma interativa, via linha de comando (CLI).

## 🛠 Tecnologias utilizadas

- **Java 17+**
- **API de câmbio (ExchangeRate API)**
- Programação orientada a objetos
- Paradigma MVC (Model-View-Controller)

## 📦 Estrutura do Projeto
Exemplo da estrutura de diretórios:
```
├── Main.java
├── Controller
│ └── ConversorDeMoedas.java
├── Models
│ └── ConversionRate.java
├── Service
│ └── ExchangeRateApi.java
├── View
│ └── MenuCLI.java
```

## ✅ Requisitos

- Java 17 ou superior instalado
- Conexão com a internet

## 🚀 Como executar

1. Clone o repositório:
    
    ```bash
    git clone https://github.com/MiguelJesuino/conversor-moedas-java.git
    ```
2. Importe o projeto na sua IDE (IntelliJ, Eclipse, VS Code, etc.)

3. Certifique-se de ter uma conexão com a internet (para consultar a API)

4. Execute a classe Main.java

## 💻 Funcionalidades

- Faz a conversão usando taxas atualizadas da API

- Valida se as moedas inseridas são válidas

- Permite encerrar o programa digitando `sair`

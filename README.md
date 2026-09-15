# TVProgram

Uma aplicação simples em Java que demonstra conceitos fundamentais de Programação Orientada a Objetos (POO), como Herança, Polimorfismo e Abstração através de um sistema de cálculo de audiência de programas de televisão.

A simple Java application demonstrating Object-Oriented Programming (OOP) principles such as Inheritance, Polymorphism, and Abstraction through a TV program audience calculation system.

---

## Português

### Visão Geral

O sistema simula dois tipos de programas de televisão:
- **TeleNovela:** Calcula os espetadores totais com base na audiência de televisão e gere a lista do elenco.
- **RealityShow:** Sobrescreve o cálculo de audiência para somar a audiência da televisão com a transmissão online.

### Conceitos Chave

- **Abstração:** `ProgramaTV` serve como superclasse abstrata.
- **Herança:** `TeleNovela` e `RealityShow` estendem `ProgramaTV`.
- **Polimorfismo:** `getTotalPessoasAssistindo()` é sobrescrito em `RealityShow` para calcular a audiência combinada.

### Tecnologias

- Java (JDK 8+)

### Como Executar

1. Clona o repositório:
   ```bash
   git clone https://github.com/teu-usuario/ProgramaTV.git
   ```
2. Abre o projeto na tua IDE preferida.
3. Executa o ficheiro `Main.java`.

### Estrutura do Projeto

- `ProgramaTV.java`: Superclasse abstrata com os atributos base.
- `TeleNovela.java`: Subclasse para gestão de telenovelas.
- `RealityShow.java`: Subclasse para gestão de reality shows e audiência online.
- `Main.java`: Ponto de entrada da aplicação.

---

## English

### Overview

The system models two types of television broadcasts:
- **TeleNovela:** Calculates total viewers based strictly on TV audience figures and includes cast management.
- **RealityShow:** Overrides audience calculations to aggregate both TV and online streaming metrics.

### Key Concepts

- **Abstraction:** `ProgramaTV` serves as the abstract superclass.
- **Inheritance:** `TeleNovela` and `RealityShow` extend `ProgramaTV`.
- **Polymorphism:** `getTotalPessoasAssistindo()` is overridden in `RealityShow` to calculate combined metrics.

### Tech Stack

- Java (JDK 8+)

### How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/TVProgram.git
   ```
2. Open in your preferred IDE.
3. Run `Main.java`.

### Project Structure

- `ProgramaTV.java`: Abstract superclass with shared attributes.
- `TeleNovela.java`: Subclass representing soap operas.
- `RealityShow.java`: Subclass representing reality shows with online audience tracking.
- `Main.java`: Application entry point.

# Factory Method - Atividade de Padrões de Projeto

Este repositório contém uma atividade acadêmica da disciplina de **Padrões de Projeto**, do curso de **Análise e Desenvolvimento de Sistemas (ADS)**.

O objetivo da atividade foi implementar, em **Java**, o padrão de projeto **Factory Method** para a geração de diferentes tipos de documentos (PDF, Word e Planilha), separando a criação dos objetos da lógica principal do sistema.

O projeto é apenas um **exercício de estudo**, com foco na compreensão do padrão de projeto e na organização básica de classes e pacotes.

## Tecnologias utilizadas

- Java

## Estrutura do projeto

documentos  
Contém a interface `Documento` e suas implementações: `PDF`, `Word` e `Planilha`.

fabricas  
Contém a classe abstrata `FabricaDocumento` e as fábricas responsáveis por criar cada tipo de documento.

Main  
Classe responsável por executar os testes do sistema.

## Exemplo de execução

== TESTE: PDF ==
Gerando documento PDF...

== TESTE: Word ==
Gerando documento Word...

== TESTE: Planilha ==
Gerando documento Planilha...


## Objetivo

Praticar os conceitos do padrão **Factory Method**, aplicando princípios de **desacoplamento** e **extensibilidade** no código.

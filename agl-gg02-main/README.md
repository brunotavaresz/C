# Tema **AGL**, grupo **agl-gg02**
-----

## Constituição dos grupos e participação individual global

| NMec | Nome | Participação |
|:---:|:---|:---:|
| 113962 | ANDRÉ ATANÁSIO ALVES | 22.0% |
| 111590 | BRUNO DE BARROS BONILAURI CHARÃO | 0.02% |
| 113372 | BRUNO TAVARES MEIXEDO | 18.66% |
| 112714 | DIOGO MARQUES COSTA | 18.66% |
| 113763 | FRANCISCO JOSÉ GOMES PINTO | 22.0% |
| 113526 | RODRIGO MARQUES DE JESUS | 18.66% |

## Relatório

- Este relatório descreve o projeto de desenvolvimento de um compilador para a linguagem AGL (Animated Graphics Language) e suas ferramentas de compilação. A linguagem AGL foi projetada para facilitar a criação de programas em Python3, utilizando a biblioteca tkinter, para visualização de gráficos 2D com animação e interação. 

- O principal objetivo do projeto foi possibilitar a criação de programas em Python3, com base na linguagem AGL, para a geração de gráficos 2D animados e interativos. Isso envolveu o desenvolvimento de um compilador capaz de traduzir código AGL em código Python, bem como a implementação de uma biblioteca de templates para facilitar a geração de código Python a partir de construções AGL.

- AGL.g4: Este arquivo contém a definição da gramática da linguagem AGL usando ANTLR. Ele define as regras sintáticas para a linguagem, incluindo declarações, atribuições, comandos de movimento, loops, comandos de espera, etc.
  
- AGLMain.java: Esta é a classe principal que executa o compilador AGL. Ela instancia o lexer e o parser ANTLR, analisa a entrada AGL, realiza a análise semântica e, se tudo estiver correto, gera o código Python correspondente.
  
- aglTemplates.stg: Este arquivo contém templates StringTemplate usados para gerar o código Python a partir das construções da linguagem AGL. Ele define modelos para várias instruções e expressões em Python.

- SemanticAnalyzer.java: Esta classe implementa um analisador semântico para a linguagem AGL. Ele verifica se as declarações e atribuições são feitas corretamente, e se os tipos correspondem onde necessário.

- xAGL: A linguagem xAGL é uma linguagem de programação secundária, utilizada para automação de tarefas específicas relacionadas a interações com interfaces gráficas. Ela possui uma gramática definida no arquivo xAGL.g4, que é processada por um compilador/interpretador implementado nos arquivos xAGLInterpreter.py e xAGLMain.py. Para testar, a partir da pasta grammar, compila-se primeiro xAGL na linguagem target, python ("antlr4-build -python xAGL"), e depois AGL, por fim, executa-se "java AGLMain" e passa-se como argumento um ficheiro '.agl' que contenha um 'import' (e.g. "java AGLMain < file.agl")

- O projeto alcançou o seu objetivo de desenvolver um compilador para a linguagem AGL, permitindo a criação de programas em Python3 para visualização de gráficos 2D animados e interativos. A combinação do uso de ANTLR para análise sintática, StringTemplate para geração de código e uma abordagem modularizada permitiu o desenvolvimento de um sistema robusto e extensível. O compilador e as suas ferramentas associadas têm o potencial de facilitar o desenvolvimento de aplicações gráficas interativas em Python.

- Foi adicionado os 4 tipos de novos modelos gráficos, alem de conditional statements e tipo de dados booleano do nivel desejavel.

- Todos os objetivos minimos foram atingidos.

## Como correr

- Dar permissão ao ficheiro
```sh
chmod +x compile.sh
```
- Adicionar o ficheiro da linguagem agl na pasta examples, e dentro da pasta examples correr
```sh
./compile.sh ex01.agl
```

## Contribuições

- Diogo Costa: Análise semântica e alguns ajustes na gramática principal, relatorio

- André Alves: Gramática prinpical, String template, gerador de codigo da linguagem principal (compiler), classes da linguagem destino (python)

- Francisco Pinto: Gramática prinpical, String template, gerador de codigo da linguagem principal (compiler), classes da linguagem destino (python)

- Bruno Meixedo : Análise semântica e alguns ajustes na gramática principal e relatório.

- Rodrigo Jesus : Alguns ajustes na gramatica principal, gramática secundária, interpretador da linguagem secundaria (compiler) relatorio.

- Bruno Charao: --
# Controle de acesso

## Sobre
Projeto desenvolvido em Java, com o objetivo de desenvolver um sistema de votação eletrônico. A ideia é que esse sistema permita o cadastro das pessoas candidatas, o cadastro das pessoas eleitoras, a realização do processo de votação e a consulta do resultado tanto parcial quanto final da votação.

O fluxo do sistema é definido seguindo três etapas principais que devem ser executadas na seguinte ordem:

Cadastrar pessoas candidatas: nessa etapa, é preciso ter um menu para o cadastro de pessoas candidatas e, ao fim do cadastro de cada nova pessoa, deve-se oferecer a opção de cadastrar outra. Quando não houver mais pessoas candidatas para serem cadastradas, então se passa para a etapa de cadastro de pessoas eleitoras;

Cadastrar pessoas eleitoras: aqui é preciso ter um menu que possibilite o cadastro de pessoas eleitoras, similar ao menu do cadastro de pessoas candidatas. Finalizado o cadastro, deve-se voltar ao estado inicial do menu de cadastro de pessoas eleitoras para oferecer a oportunidade de cadastrar uma nova pessoa. Quando não houver mais pessoas eleitoras para serem cadastradas, o sistema deve seguir para a etapa de votação;

Iniciar processo votação: nessa etapa é iniciado o processo de votação, em que foi solicitado, na demanda, um menu que ofereça as opções de votar, ver resultado parcial e finalizar a votação. A seguir o detalhamento de cada caminho:

Quando escolhida a opção votar, solicita-se o identificador da pessoa eleitora (por exemplo, o CPF) e o número da pessoa candidata em quem se deseja votar. Depois do voto, o menu deve voltar ao estado inicial, oferecendo as opções votar, ver resultado parcial e finalizar a votação.
A opção ver resultado parcial deve listar todos os nomes das pessoas candidatas, mostrando a quantidade de votos absolutos recebida por cada pessoa candidata e o percentual de votos entre elas. Depois de ver o resultado parcial, o menu deve voltar ao estado inicial, oferecendo as opções votar, ver resultado parcial e finalizar a votação.
A opção finalizar a votação deve mostrar o resultado da votação listando as pessoas candidatas, o número absoluto de votos por pessoa candidata e também o percentual dos votos totais que cada pessoa candidata recebeu. Com o fechamento do processo de votação, o programa deve ser finalizado.
## Arquivos
Os seguintes arquivos foram desenvolvidos por mim:

- `/src/`.

A Trybe forneceu a configuração inicial do projeto.

## Tecnologias
As seguintes tecnologias foram aplicadas por mim nesse projeto:
- Java;
- Java Scanner;

## Como executar a aplicação em sua máquina

1. Clone o repositório, e entre na pasta do repositório que você acabou de clonar.
2. Instale as depêndencias do projeto com o comando `mvn install`
3. Rode e teste a aplicação através da Classe Principal!;

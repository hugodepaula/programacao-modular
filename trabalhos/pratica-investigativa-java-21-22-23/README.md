<!-- Title -->
<div align="center">
    <h1><b>Template de Provas da Engenharia de Software PUC-MG</b></h1>
</div>


<!-- section -->
## Descrição

<p>Esse projeto tem o objetivo de desenvolver um template para provas com LaTeX para o curso de Engenharia de Software da PUC-MG. Para atingir esse objetivo, foi criado um arquivo de classe chamado **eng_softdoc.cls**, o qual possui um conjunto de ambientes e comandos relacionados ao documento. 


Este documento é destinado aos docentes da Engenharia de Software da PUC-MG que desejam utilizar um template LaTeX para suas listas de exercícios. </p>


## Comandos

<b>Para inserir uma questão:</b> utilize o comando \problem para inserir uma nova questão.

```tex
\problem Primeira questão da lista de exercício.

\problem Segunda questão da lista de exercício.
```

<b>Para inserir uma subquestão (itens da questão):</b> utilize o comando *\subproblem* após o comando *\problem*.

```tex
\problem Primeira questão da lista de exercício.
    \subproblem Primeiro subitem.
    \subproblem Segundo subitem.
    \subproblem Terceiro subitem.
    ...
```

<b>Para inserir uma pontuação:</b> utilize o comando *\points{}* para inserir a pontuação adequada.

```tex
\problem Primeira questão da lista de exercício. \points{3.5}
```

## Dicas

<p>As instruções podem ser adaptadas pelo o usuário do template. Para isso, deve-se ir até o arquivo *main.tex* e os itens que estão entre \begin{instlist} e \end{instlist}</p>

<p>O usuário deve alterar o conteúdo que está contido na planilha de informações (planilha no canto superior). Os campos são adaptáveis aos dados que o usuário quiser inserir.</p>


## Autor


Desenvolvido por <b>Pedro Pongelupe Lopes</b>  :triangular_flag_on_post:
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:pedro.pongelupe@sga.pucminas.br)

## Agradecimentos

Template desenvolvido originalmente para a UNICHRISTUS por <b>Maurício Moreira Neto</b> :shipit: 

[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:mauricio.moreira@unichristus.edu.br)[![Twitter](https://img.shields.io/badge/Twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/maumneto)[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/maumneto/)[![Medium](https://img.shields.io/badge/Medium-12100E?style=for-the-badge&logo=medium&logoColor=white)](https://medium.com/@maumneto)[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/profmauricioneto)

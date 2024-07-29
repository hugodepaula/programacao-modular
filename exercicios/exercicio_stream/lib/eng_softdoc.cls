%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%   UNICHRISTUS Exercise List File                                                 %%
%%   @author: Maurício Moreira Neto - 27-02-2022                                    %%
%%   This class defines the pattern used in the exercise list of UNICHRISTUS        %%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{unichristusdoc}[2020/12/08 UNICHRISTUS Exercise List]

% \newcommand{\headlineolor}{\normalcolor}
\LoadClass[onecolumn, a4paper]{article} %% this template is based on the article tamplate. 
\RequirePackage{xcolor}
\RequirePackage{graphicx}
\definecolor{slcolor}{HTML}{FFFFFF}

% \DeclareOption{onecolumn}{\OptionNotUsed}
\DeclareOption{green}{\renewcommand{\headlinecolor}{\color{green}}}
\DeclareOption{red}{\renewcommand{\headlinecolor}{\color{slcolor}}}
\DeclareOption*{\PassOptionToClass{\CurrentOption}{article}}
\ProcessOptions\relax

\newcommand{\university}{PUC-MG: Pontifícia Universidade Católica de Minas Gerais}
\newcommand{\course}{Engenharia de Software}

\RequirePackage{graphicx}
\RequirePackage{anyfontsize}
\RequirePackage{multirow}
\RequirePackage[bottom=0.5in, top=0.5in, left=0.3in, right=0.5in]{geometry}
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%  Creating the header of the document.
%%  This header is composed by a table with the information about the institution,
%%  course, student and others.
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\newcommand{\makeheader}{

    \begin{table}
        \fontsize{0.38cm}{0.5cm}\selectfont 
        \begin{tabular}{|l|p{9.7cm}|p{5cm}|}
        \hline
        \multirow{6}{*}{\includegraphics[scale=0.2]{images/puc_engesoft_logo.png}} & \multicolumn{2}{l|}{\textbf{\university}} \\ \cline{2-3} 
                & \multicolumn{2}{l|}{\textbf{Curso: {\course}}}                        \\ \cline{2-3}
                & \multicolumn{2}{l|}{\textbf{Disciplina:} \class{}}                     \\ \cline{2-3} 
                & \multicolumn{2}{l|}{\textbf{Professor(a):} \prof{}}                 \\ \cline{2-3} 
                & \multicolumn{2}{l|}{\textbf{Semestre:} \semester{}}                     \\ \cline{2-3} 
                & \textbf{Aluno:} \student{}                  & \textbf{Matrícula:} \registration{}          \\ \hline 
        \end{tabular}
        \end{table}

        \fontsize{0.38cm}{0.5cm}\selectfont 
        \begin{center}
            \centering{\textbf{\theme{}}}
        \end{center}
}


\newcommand{\points}[1]{
    \fontsize{0.38cm}{0.1cm}\selectfont 
    \fontfamily{lmr}
    \textbf{(#1 pontos)}
}

\RequirePackage{amssymb}
\RequirePackage{lmodern}
\RequirePackage{enumitem}

% %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%  Creating the instructions of the document.
%  This instructions are based on the pattern of exercise list UNICHRISTUS.
% %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\newcommand{\makeinstructions}
{
    \fontsize{0.38cm}{0.2cm}\selectfont 
    \textbf{\textcolor{red}{Leia as Instruções:}} 


    \fontfamily{lmss}
    \fontsize{0.35cm}{0.2cm}\selectfont 
    \newenvironment{instlist}
    {
        \renewcommand{\labelitemi}{\color{black}$\bullet$}\bfseries
    \begin{itemize}\setlength\itemsep{0em}}
    {\end{itemize}}   
}

\newcommand{\titlequestion}
{
    \fontsize{0.38cm}{0.2cm}\selectfont 
    \begin{center}\textcolor{blue}{Question Instructions}\end{center}

    \fontfamily{lmss}
    \fontsize{0.35cm}{0.2cm}\selectfont 
    \newenvironment{questinst}
    {
        \renewcommand{\labelitemi}{\color{black}$\ast$}
    \begin{itemize}\setlength\itemsep{0em}}
    {\end{itemize}}  
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%% This part of code was modified from template of exercise list of Níckolas Alves
%% Link: https://www.overleaf.com/latex/templates/lista-de-exercicios/pncrythxtyhj
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\newcounter{prob}
\newcounter{subprob}
\renewcommand{\thesubprob}{\alph{subprob}}

\newcommand{\problem}{\setcounter{subprob}{0} \stepcounter{prob} \par \medskip \noindent \textbf{Questão~\theprob \ }}

\newcommand{\answer}{\par \medskip \noindent \textit{Resposta \ }}

\newcommand{\finalanswer}[1]{
	\begin{center} 
    	{\renewcommand{\arraystretch}{1.5}
		\renewcommand{\tabcolsep}{0.2cm} 
    	\begin{tabular}{|c|} 
    		\hline 
        	$ \displaystyle #1 $  \\ 
        	\hline 
    	\end{tabular}} 
   	\end{center}}

\newcommand{\subproblem}{\stepcounter{subprob} \par \smallskip \noindent \quad \textit{(\thesubprob) \ }}

\newcommand{\subanswer}{\par \smallskip \noindent \quad \textit{Resposta \ }}

\newcommand{\option}{\item[$\square$]}
\newcommand{\thisone}{\item[$\blacksquare$]}

\newenvironment{subitemize}{\begin{itemize}}{\end{itemize}}


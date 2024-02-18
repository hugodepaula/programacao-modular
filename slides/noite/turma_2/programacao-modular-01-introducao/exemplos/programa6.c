#include <stdio.h>

struct Aluno {
        char* nome;
        char* matricula;
        int idade;
};

int main() {
        int i = 0, n = 5, soma = 0;
        struct Aluno alunos[n];

        alunos[0].nome = "Pedro";
        alunos[0].matricula = "577028";
        alunos[0].idade = 25;

        alunos[1].nome = "Aninha";
        alunos[1].matricula = "92955";
        alunos[1].idade = 28;

        alunos[2].nome = "Banana";
        alunos[2].matricula = "579855";
        alunos[2].idade = 26;

        alunos[3].nome = "Bernado";
        alunos[3].matricula = "698855";
        alunos[3].idade = 31;

        alunos[4].nome = "Shulambs";
        alunos[4].matricula = "00001";
        alunos[4].idade = 46;

        printf("Alunos registrados:\n\n");
        for (i = 0; i < n; i++) {
                struct Aluno aluno = alunos[i];
                printf("\tNome: %s\n", aluno.nome);
                printf("\tMatrícula: %s\n", aluno.matricula);
                printf("\tIdade: %d\n\n", aluno.idade);
                soma += aluno.idade;
        }
        float media = (float) soma / n;
        printf("\tIdade Média dos alunos: %0.2f anos\n\n", media);

        return 0;
}

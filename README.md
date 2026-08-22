# Aula CI/CD Pipeline

Projeto desenvolvido para estudo de integração contínua e entrega contínua com GitHub Actions.

## Pipeline atual

O workflow está localizado em `.github/workflows/pipeline.yml` e é executado sempre que ocorre um `push` na branch `main`.

Atualmente, o projeto contém a estrutura inicial da pipeline. As etapas de build, testes e deploy podem ser adicionadas conforme a evolução da aula.

## Estrutura do projeto

```text
.github/
└── workflows/
    └── pipeline.yml
```

## Como utilizar

1. Clone o repositório:

   ```bash
   git clone https://github.com/SamukaSantos-DEV/Aula-CI-CD.git
   ```

2. Acesse a pasta do projeto:

   ```bash
   cd Aula-CI-CD
   ```

3. Faça uma alteração e envie para a branch `main`:

   ```bash
   git add .
   git commit -m "minha alteração"
   git push origin main
   ```

4. Acompanhe a execução em **Actions** no GitHub.

## Tecnologias

- Git
- GitHub
- GitHub Actions
- YAML

## Objetivo

Praticar a criação e a automatização de pipelines CI/CD utilizando recursos do GitHub Actions.

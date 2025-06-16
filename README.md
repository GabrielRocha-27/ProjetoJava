# 🎓 Sistema de Cadastro de Cursos e Alunos

Projeto acadêmico desenvolvido por **Gabriel Henrique Rocha Borges**, no 2º semestre do curso de **Análise e Desenvolvimento de Sistemas** da **FATEC São José dos Campos (FATEC-SJC)**.

## 📌 Objetivo
Este sistema foi criado como parte das atividades acadêmicas para gerenciar o cadastro de cursos e alunos, permitindo operações como inserção, listagem, edição, exclusão e exportação de dados.

## 🛠️ Tecnologias Utilizadas
- Java
- MySQL
- MySQL Workbench 8.0 CE
- JDBC
- Interface gráfica com Java Swing

---

## 🔧 1. Configuração Inicial

### 💾 Banco de Dados
1. Abra o **MySQL Workbench 8.0 CE**.
2. Execute **linha por linha** o script SQL fornecido no arquivo `cursos_db_backup.sql`.
   - Isso irá criar o banco de dados `cursos_db` com as tabelas necessárias.
3. Use o usuário: 
Usuário: root
Senha: fatec

---

## 🌐 2. Teste de Conexão
1. No projeto, localize o pacote `factory`.
2. Execute os arquivos de **Driver** e **Conexão** (`ConnectionFactory.java`) com `Run File`.
3. Verifique se a conexão foi estabelecida com sucesso antes de usar o sistema.

---

## 📘 3. Funcionalidades

### 🏫 Cadastro de Cursos
- **Cadastrar Curso:** Informe Nome, Carga Horária e Limite de Alunos.
- **Listar Cursos:** Abre uma nova tela com todos os cursos cadastrados.
- **Editar Curso:** Altere informações do curso selecionado.
- **Excluir Curso:** Remove o curso do banco de dados.
- **Exportar Cursos:** Gera um `.txt` com todos os cursos.

### 👨‍🎓 Cadastro de Alunos
- **Cadastrar Aluno:** Informe CPF, Nome, Email, Data de Nascimento e selecione o Curso.
- **Listar Alunos:** Abre uma nova interface com todos os alunos cadastrados.
- **Editar Aluno:** Permite alterar Nome, CPF, Email e Data de Nascimento (curso não pode ser alterado).
- **Excluir Aluno:** Remove o aluno e atualiza as vagas disponíveis do curso automaticamente.
- **Exportar Alunos:** Gera um `.txt` com todos os alunos.

### 🔍 Consultar Curso
- Visualize os alunos de um curso específico.
- Exporte a lista de alunos desse curso em `.txt`.

---

## ✅ Observações Finais
- Certifique-se de que a conexão com o banco esteja ativa antes de usar o sistema.
- O sistema possui validações para garantir a integridade dos dados.
- Arquivos `.txt` gerados servem para backup ou relatórios.
- Projeto com fins **educacionais**.

---

## 📂 Organização do Projeto

📁 src/
├── 📦 view/ # Telas da interface gráfica

├── 📦 model/ # Classes de domínio (Aluno, Curso)

├── 📦 dao/ # Acesso a dados (DAO)

├── 📦 factory/ # Conexão com o banco de dados

└── 📜 Main.java # Classe principal

📄 README.md # Este manual

📄 Manual em .pdf

📄 cursos_db_backup.sql # Script para criar o banco

---

## 📚 Licença
Este projeto é de uso acadêmico e **não possui fins comerciais**.

---

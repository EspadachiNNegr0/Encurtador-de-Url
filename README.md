# 🔗 Encurtador de URL

Bem-vindo ao **Encurtador de URL**! 🚀  
Um projeto desenvolvido em **Java + Spring Boot**, com integração ao **MySQL**, que transforma links longos em versões curtas, simples e fáceis de compartilhar.  

---

## ✨ Funcionalidades

- 🔄 **Encurtar URLs**: converta links grandes em versões curtas.  
- 🎯 **Redirecionamento automático**: ao acessar a URL curta, o usuário é levado ao destino original.  
- 📊 **Banco de dados MySQL**: armazenamento seguro e estruturado das URLs.  
- 🛠 **API RESTful**: endpoints para criar e consumir URLs encurtadas.  

---

## 🛠 Tecnologias Utilizadas

- ☕ **Java 17**  
- 🌱 **Spring Boot**  
- 🗄 **MySQL**  
- 📦 **Maven**  

---

## 🚀 Como executar o projeto

### Pré-requisitos
- Java 17+
- MySQL rodando localmente
- Maven instalado

### Passos

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/EncurtadorUrl.git

# Entre na pasta do projeto
cd EncurtadorUrl

# Configure o application.properties com suas credenciais do MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/encurtador
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# Execute o projeto
mvn spring-boot:run

# Desafio Técnico
![Java Badge](https://img.shields.io/badge/-Java-orange?style=flat-square&logo=Java&logoColor=white&link=#)
![Java Badge](https://img.shields.io/badge/-SpringBoot-orange?style=flat-square&logo=SpringBoot&logoColor=white&link=#)

Realizar a gestão de matérias primas para fabricação de Bolos 🍰

⚡ Tecnologias usadas:

* Java 8
* Spring Boot
* Hibernate
* MySQL

## Começando

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK 10: Necessário para executar o projeto Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html)
- [Maven 3.5.3: Necessário para realizar o build do projeto Java](http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.5.3/binaries/apache-maven-3.5.3-bin.zip)
- [Eclipse: Para desenvolvimento do projeto](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/oxygen3a)

## Desenvolvimento

Para iniciar o desenvolvimento, é necessário dar um fork e clonar o projeto do GitHub num diretório de sua preferência:

```git
cd "diretorio de sua preferencia"
git clone https://github.com/Micalli/desafio_springboot.git
```

## Rotas

GET: http://localhost:8080/rawMaterials?user=Fulano <br>
     http://localhost:8080/rawMaterials?name=Farinha <br>
POST: http://localhost:8080/rawMaterials/ <br>
O JSON tem que ficar dessa forma
```
{
    "name":"Farinha de rosca",
    "quantity":"20",
    "user":"Bruno"
}
```
PUT: http://localhost:8080/rawMaterials/{idMaterial}/request<br>
O JSON tem que ficar dessa forma
```
{
    "quantity":"18",
    "user":"Brunow Micalli"
}
```
Feito por [Bruno Micalli](https://github.com/micalli).


[![Linkedin Badge](https://img.shields.io/badge/-Bruno_Micalli-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/brunomicalli/)](https://www.linkedin.com/in/brunomicalli/)



# sistema-gerenciamento-barbearia
 Sistema de Gerenciamento de Barbearia (SGB)

Sistema desktop em Java desenvolvido como projeto acadêmico para a disciplina de Programação Orientada a Objetos, aplicando herança, abstração, encapsulamento e polimorfismo na modelagem de um domínio real de negócio.

Descrição:

O SGB centraliza o cadastro de clientes, funcionários (barbeiros e gerentes), serviços oferecidos e o controle de agendamentos e atendimentos de uma barbearia. O projeto foi modelado em UML (Diagrama de Classes e Caso de Uso) e implementado em Java.

 Tecnologias:

Java (JDK 21) · Eclipse IDE
UML
File I/O (FileWriter/FileReader) para persistência de dados


Estrutura de Herança:

Pessoa (abstrata)
├── Cliente
└── Funcionario (abstrata)
    ├── Barbeiro
    └── Gerente

 Conceitos de POO Aplicados


Abstração — Pessoa e Funcionario são classes abstratas, sem instanciação direta.
Herança — Cliente, Barbeiro e Gerente herdam atributos e comportamentos comuns.
Encapsulamento — atributos private com acesso via getters/setters.
Polimorfismo — método exibirDados() sobrescrito (@Override) com implementação própria em cada classe concreta.


 Como Executar?

bashgit clone https://github.com/Yuri978/sistema-gerenciamento-barbearia.git


Abra o projeto no Eclipse (File → Open Projects from File System)
Execute a classe Main.java (Run As → Java Application)


 Melhorias Futuras:

Migrar a persistência de arquivos .txt para banco de dados (SQLite) com padrão DAO, e implementar interface gráfica (JavaFX).

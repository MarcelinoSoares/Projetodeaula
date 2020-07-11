#language: pt
@projeto1
Funcionalidade: validação todos os campos obrigatorios

  @automated @camposobrigatorios
  Cenario: Validar campo Nome obrigatorio
    Dado Estou na página de login
    E Eu não preencho Nome
    E  Eu preencho E-mail com "test@test.com"
    E  Eu preencho Senha com "123456"
    E  Eu preencho Idade com "28"
    Quando  Eu pressiono Cadastrar
    Entao  Eu recebo a mensagem de erro "Campo Nome obrigatorio"

  @automated @camposobrigatorios
  Cenario: Validar campo E-mail obrigatorio
    Dado Estou na página de login
    E  Eu preencho Nome com "teste"
    E  Eu não preencho E-mail
    E  Eu preencho Senha com "123456"
    E  Eu preencho Idade com "28"
    Quando  Eu pressiono Cadastrar
    Entao Eu recebo a mensagem de erro "Campo E-mail obrigatorio"

  @automated @camposobrigatorios
  Cenario: Validar campo Senha obrigatorio
    Dado Estou na página de login
    E  Eu preencho Nome com "teste"
    E  Eu preencho E-mail com "test@test.com"
    E  Eu não preencho Senha
    E  Eu preencho Idade com "28"
    Quando  Eu pressiono Cadastrar
    Entao  Eu recebo a mensagem de erro "Campo Senha obrigatorio"
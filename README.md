# Documentação
Teste de Desenvolvimento Java+Spring.
Copyright 2019 Felipe Nascimento. 

# Descrição do problema
A equipe do Problema SSYS está crescendo a cada mês e agora precisamos ter
algum aplicativo para gerar relatórios com informações de funcionários. Como qualquer
aplicativo escrito no SSYS, ele deve ter uma API para permitir integrações.
A solução é criar o aplicativo "SSYS Employees Reports", uma API com relatórios
sobre funcionários.


# Tecnologias Utilizadas
```ruby
java 8
Spring Boot
```
    
# Código
Para acessar os dados via web no endereço http://dummy.restapiexample.com/api/v1/employees, a aplicação utiliza um `"restTemplate"` na entidade `"DataJson"`, que retorna um Array de Objetos através dos dados obtidos pelo link.
```ruby
public final String getPostsAsObject() {
        String url = "http://dummy.restapiexample.com/api/v1/employees";

        return restTemplate.getForObject(url, String.class);
    }
````


 


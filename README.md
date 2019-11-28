# Documentação
Teste de Desenvolvimento Java+Spring.
Copyright 2019 Felipe Nascimento. 

# Descrição do problema
A equipe da SSYS está crescendo a cada mês e agora precisa ter
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
## Acessando os dados via web
Para acessar os dados via web no endereço http://dummy.restapiexample.com/api/v1/employees, a aplicação utiliza um `"restTemplate"` na entidade `"DataJson"`, que converte o Json do site em uma String.
```ruby
import org.springframework.web.client.RestTemplate;

public final String getPostsAsObject() {
        String url = "http://dummy.restapiexample.com/api/v1/employees";

        return restTemplate.getForObject(url, String.class);
    }
````
## Convertendo uma String em Json
Após coletar os dados no site, a aplicação utiliza o `"Gson"`, uma biblioteca Java desenvolvida pela Google, capaz de converter a String em Json e ainda retornar um Array de Objetos. 
Para utilizá-la é preciso importá-la nas dependências do projeto:
```ruby
<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
			<version>2.8.6</version>
		</dependency>
````

No controlador da aplicação, a biblioteca é utilizada na seguinte função:
```ruby
 @GetMapping("/employees/reports/age")
    @ResponseBody
    public HashMap<String,Object> listDataAge()
    {
        DataJson dataJson = new DataJson();

        Gson gson = new Gson();
        People[] userArray = gson.fromJson(dataJson.getPostsAsObject(), People[].class);

        Arrays.sort(userArray , Comparator.comparing(People::getEmployee_age));
        Employee employee = new Employee();

        return employee.ReportAge(userArray);

    }
```


 


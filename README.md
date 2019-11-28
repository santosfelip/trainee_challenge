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
Projeto Maven
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

##Ordenando o Array para mostar o maior e o menor no relatório

Para ordenar o Array foi utilizado a função pronta `".Sort"``:
```ruby
 Arrays.sort(userArray , Comparator.comparing(People::getEmployee_age));
```
## Retornando os dados Json 
Como a aplicação deseja saber apenas o maior e o menor de cada relatório, após ordenar o vetor ficar simples de saber, que no caso o maior será o objeto que estiver na última posição do vetor e o menor será o que estiver na primeira posição. Assim, a aplicação monta um HashMap com os dados do maior e do menor Objeto e calcula a média da idade ou do salário:
```ruby
public HashMap<String,Object>  ReportSalary(People[] people)
    {

        Employee test = new Employee();

        this.map.put("smaller",people[0]);
        this.map.put("bigger",people[people.length-1]);
        this.map.put("average",(people[0].getEmployee_salary() + people[people.length-1].getEmployee_salary())/2);

        return map;
    }
````

# Referências

https://sites.google.com/site/gson/gson-user-guide
https://spring.io/guides/gs/rest-service/
https://howtodoinjava.com/spring-boot2/resttemplate/spring-restful-client-resttemplate-example/
https://attacomsian.com/blog/processing-json-spring-boot



 


# Curso DS Java spring boot

## primeiro projeto:

#### Formação desenvolvedor moderno
#### Módulo: Back end
#### DESAFIO: Componentes e injeção de dependência


voce devera criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem de desconto e o frete. O calculo do valor total do pedido consiste em aplicar o desconto ao valor básico do pedido, e adicionar o valor do frete. A regra para o cálculo do frete é a seguinte:

|Valor basico do pedido (sem desconto)|frete|
|-------------------------------------|-----|
|Abaixo de R$ 100.00|R$ 20.00
|De R$ 100.00 até R$ 200.00 excluise|R$ 12.00|
|R$ 200.00 ou mais|Gratis|

Exemplo 1:

|ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto)| SAÍDA|
|------------------------------------------------------------------------|------|
|Codigo do pedido: 1034| Pedido código: 1034
|valor basico: 150.00|Valor total: R$ 132.00
|Desconto: 20%||


Exemplo 2:

|ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto)| SAÍDA|
|------------------------------------------------------------------------|------|
|Codigo do pedido: 2282| Pedido código: 2282
|valor basico: 800.00|Valor total: R$ 720.00
|Desconto: 10%||



Sua solução deverá seguir as seguintes especificões:

Um pedido deve ser representado por um objeto conforme o projeto a baixo:

![image](https://github.com/user-attachments/assets/b27bbf43-9ad9-49c4-866a-48502ce62e2e)





A lógica do calculo do valor total do pedido deve ser implementada por componentes (serviços), cada um com sua responsabilidade, conforme o projeto a baixo:

![image](https://github.com/user-attachments/assets/90d99c7b-f080-40e4-b8d2-69be8639cc08)


serviço OrderService: Responsável por operações referentes a pedidos.

serviço ShippingService: Responsável por operações referentes a frete.

Sua solução deverá ser implementada em Java com springboot. A saída deverá ser mostrada no log do terminal da aplicaçao. Cada serviço deve ser implementado como um componentes registrado com @service

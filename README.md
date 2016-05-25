# crud_pos_test_jsf_docker
O projeto funcionando com a imagem do postgres e do glassfish está na BRANCH bFuncionando;

Não esqueça de fazer : mvn clean install para gerar a target.

# OBSERVAÇÕES:
1- Por alguma razão, o jpa NAO ta criando a tabela no banco automaticamente.
O sistema conecta no container do postgre com sucesso, mas no momento de salvar uma pessoa, dá erro.

2- No linux, cada container tem um endereço de ip. 
O ip da conexao do postgres no arquivo glassfish-resources.xml é o endereço do meu container postgres.

3- No linux,o endereço para acessar o servidor do container glassfish é sempre o 0.0.0.0 (ENDEREÇO GENÉRICO).

4- Para executar esse ambiente em Windows, será preciso alterar os endereços...

5- Mesmo para executar em linux, será preciso alterar o endereço do postgres no arquivo glassfish-resources.xml,
pois quando o container for iniciado, poderá usar um ip diferente do já configurado.
Você poderá descobrir o endereço ip do container do postgres da seguinte forma:

sudo docker inspect CODIGO_DO_CONTAINER 

Procure pelo ip no resultado do comando acima.

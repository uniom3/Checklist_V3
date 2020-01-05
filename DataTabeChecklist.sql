CREATE DATABASE CHECKLIST_v1;

CREATE TABLE tb_pessoa(
id int(11) 	NOT NULL AUTO_INCREMENT,
nome nvarchar(70) DEFAULT NULL,
razaoSocial  nvarchar(150),
cpf int(15),
rg int(15),
cnpj int(25),
fone int(15),
celular1 int(15),
celular2  int(15),
email     nvarchar(150),
endereco  nvarchar(100),
numero    nvarchar(15),
complemento  nvarchar(100),
bairro  nvarchar(70),
cidade  nvarchar(70),
uf  nvarchar(2),
CEP int(10),
pais nvarchar(70),
PRIMARY KEY(id)
); 

CREATE TABLE tb_arquivo(
	  id int(11) 	NOT NULL AUTO_INCREMENT,
	  arquivo1 nvarchar(350),
	  arquivo2 nvarchar(350),
	  arquivo3 nvarchar(350),
	  arquivo4 nvarchar(350),
	  arquivo5 nvarchar(350),
	  arquivo6 nvarchar(350),
	  arquivo7 nvarchar(350),
	  arquivo8 nvarchar(350),
	  arquivo9 nvarchar(350),
	  arquivo10 nvarchar(350),
	  arquivo11 nvarchar(350),
	  arquivo12 nvarchar(350),
	  PRIMARY KEY(id)
); 

CREATE TABLE tb_classe(
id int(11) 	NOT NULL AUTO_INCREMENT,
nome nvarchar(350),
PRIMARY KEY(id)
); 

CREATE TABLE tb_classificacao(
id int(11) 	NOT NULL AUTO_INCREMENT,
nome nvarchar(350),
PRIMARY KEY(id)
); 

CREATE TABLE tb_cliente(
     id int(11) NOT NULL AUTO_INCREMENT,
	 ativo nvarchar(3), 
	 tipoPessoa nvarchar(20),
	 incricaoEstadual int(20),
	 inscricaoMunicipal int(20),
	 orgaoExpedidor   nvarchar(10), 
	 enderecoCobranca nvarchar(100),
	 numeroCobranca  nvarchar(20),
	 complementoCobranca nvarchar(150),
	 bairroCobranca nvarchar(100),
	 paisCobranca nvarchar(100),
	 ufCobranca nvarchar(2),
	 cidadeCobranca nvarchar(100),
	 CEPCobranca int(10),
	 dadosContato1 int(15),
	 ramalContato1 int(15),
	 fone2Contato1 int(15),
	 faxContato1  int(15),
	 dadosContato2 int(15),
	 foneContato2  int(15),
	 ramalContato2 int(15),
	 fone2Contato2 int(15),
	 emailContato2 nvarchar(150),
	 faxContato2  int(15),
	 PRIMARY KEY(id)
); 

CREATE TABLE tb_colaborador(
      id int(11) NOT NULL AUTO_INCREMENT,     
	  ativo boolean ,
	  tipoPessoa nvarchar(20),
	  incricaoEstadual int(20),
	 inscricaoMunicipal int(20),
	 orgaoExpedidor   nvarchar(10),
	  enderecoCobranca nvarchar(100),
	 numeroCobranca  nvarchar(20),
	 complementoCobranca nvarchar(150),
	 bairroCobranca nvarchar(100),
	 paisCobranca nvarchar(100),
	 ufCobranca nvarchar(2),
	 cidadeCobranca nvarchar(100),
	 CEPCobranca int(10),
	 dadosContato1 int(15),
	 ramalContato1 int(15),
	 fone2Contato1 int(15),
	 faxContato1  int(15),
	 dadosContato2 int(15),
	 foneContato2  int(15),
	 ramalContato2 int(15),
	 fone2Contato2 int(15),
	 emailContato2 nvarchar(150),
	 faxContato2  int(15),
	  PRIMARY KEY(id)
); 

CREATE TABLE tb_desenho(
     id int(11) NOT NULL AUTO_INCREMENT,  
	  desenhoSetor nvarchar(150),
	  desenhoClasse nvarchar(150),
	  datafixa date,
	  desenhoAntigo nvarchar(500),
	  numero  nvarchar(15),
	  descricao  nvarchar(200),
	  caminhoArquivo  nvarchar(500),
	  revisao  nvarchar(10),
	  elaborado  nvarchar(150),
	  aprovado  nvarchar(150),
	  desenhoCliente  nvarchar(150),
	 desenhoCodCliente int(11),
	 PRIMARY KEY(id));
	 
CREATE TABLE tb_documento(
      id int(11) NOT NULL AUTO_INCREMENT, 
	  or1 boolean,
	  os boolean,
	  documentoCodCliente int(11),
	  documentoNomCliente int(11),
	  classeCodDocumento int(11),
	  classeDocumento nvarchar(350),
	  descricao nvarchar(150),
	  documentoAntigo nvarchar(500),
	  diretorio nvarchar(500),
	  descricaoFinal nvarchar(150),
	  elaborado nvarchar(15),
	  aprovado nvarchar(15),
	  bAprovado boolean,
	  bAndamento boolean,
	  bParcConcluido boolean,
	  bConcluido boolean,
	 datafixa date
	  PRIMARY KEY(id));
	  
CREATE TABLE tb_equipamento(
id int(11) 	NOT NULL AUTO_INCREMENT,
nome nvarchar(350),
PRIMARY KEY(id)
); 
	  
 CREATE TABLE tb_grupo(
      id int(11) NOT NULL AUTO_INCREMENT,
	  grupo nvarchar(100),
	  ativo boolean,
	  alterarSenhaColaborador boolean,
	  alterarDesenho boolean,
	  alterarUsuario boolean,
	  alterarClasse boolean,
	  alterarCliente boolean,
	  alterarColaborador boolean,
	  alterarRelatorio boolean,
	  alterarAdministrador boolean,
	  alterarDocumento boolean,
	  alterarRemessa boolean,
	  visualizarSenhaColaborador boolean,
	  visualizarDesenho boolean,
	  visualizarUsuario boolean,
	  visualizarClasse boolean,
	  visualizarCliente boolean,
	  visualizarColaborador boolean,
	  visualizarRelatorio boolean,
	  visualizarAdministrador boolean,
	  visualizarDocumento boolean,
	  visualizarRemessa boolean,
	  PRIMARY KEY(id)
); 

 CREATE TABLE tb_grupo(
id int(11) NOT NULL AUTO_INCREMENT,
usuario nvarchar(100),
senha nvarchar(100),
PRIMARY KEY(id)
); 

	 
CREATE TABLE tb_remessa(
     id int(11) NOT NULL AUTO_INCREMENT,
	 assunto nvarchar(200),
	 os int(11),
	 datafixa Date ,
	  remessaCliente nvarchar(150),
	  a boolean,
	  b boolean,
	  c boolean,
	  d boolean,
	  e boolean,
	  f boolean,
	  g boolean,
	  h boolean,
	  i boolean,
	  j boolean,
	  k boolean,
	  l boolean,
	  m boolean,
	  remessaDesenho int;
	  PRIMARY KEY(id)
); 
	CREATE TABLE tb_usuario(
	id int(11) NOT NULL AUTO_INCREMENT,
	login nvarchar(50) NOT NULL,
	senha nvarchar(50) NOT NULL,
	fk_colaborador_id int 
	PRIMARY KEY(id)
	);
	 
	 insert into tb_usuario (
	 login, senha, fk_colaborador_id)
	 value
	 ('root','1234', 300);
	 
	 
	 ALTER TABLE tb_documento ADD CONSTRAINT fk_documentoCodCliente FOREIGN KEY ( documentoCodCliente ) REFERENCES tb_cliente ( id ) ;
     ALTER TABLE tb_documento ADD CONSTRAINT fk_classeCodDocumento FOREIGN KEY ( classeCodDocumento ) REFERENCES tb_classe ( id ) ;	 
	 ALTER TABLE tb_desenho ADD CONSTRAINT fk_desenhoCodCliente FOREIGN KEY ( desenhoCodCliente ) REFERENCES tb_cliente ( id ) ;
	 ALTER TABLE tb_desenho ADD CONSTRAINT fk_desenhoSetor FOREIGN KEY ( desenhoSetor ) REFERENCES tb_setor ( id ) ;
	 ALTER TABLE tb_remessa ADD CONSTRAINT fk_remessaCliente FOREIGN KEY ( remessaCliente ) REFERENCES tb_cliente ( id ) ;	
	 ALTER TABLE tb_remessa ADD CONSTRAINT fk_remessaDesenho FOREIGN KEY ( remessaDesenho ) REFERENCES tb_desenho ( id ) ;	 	 
	 ALTER TABLE `tb_usuario` ADD CONSTRAINT `fk_colaborador_id` FOREIGN KEY ( `id` ) REFERENCES `tb_colaborador` ( ` id ` ) ;

	  
	 
	 
	 
	 
	 
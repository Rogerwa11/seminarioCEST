Banco de dados do sistema.


CREATE SCHEMA IF NOT EXISTS seminariocest4p;
USE seminariocest4p ;

CREATE TABLE IF NOT EXISTS usuario (
  matricula INT NOT NULL,
  email VARCHAR(45) NOT NULL,
  nome VARCHAR(45) NOT NULL,
  senha VARCHAR(45) NOT NULL,
  curso VARCHAR(45) NOT NULL,
  PRIMARY KEY (matricula)
  );

CREATE TABLE IF NOT EXISTS projeto(
  idProjeto INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL,
  descricao VARCHAR(45) NOT NULL,
  dataInicio DATE NOT NULL,
  dataFim DATE NOT NULL,
  status VARCHAR(45) NOT NULL,
  usuario_matricula INT NOT NULL,
  PRIMARY KEY (idProjeto, usuario_matricula),
    FOREIGN KEY (usuario_matricula)  REFERENCES usuario (matricula) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS meta (
  idmeta INT NOT NULL AUTO_INCREMENT,
  descricao VARCHAR(45) NOT NULL,
  status VARCHAR(45) NOT NULL,
  projeto_idProjeto INT NOT NULL,
  PRIMARY KEY (idmeta, projeto_idProjeto),
    FOREIGN KEY (projeto_idProjeto) REFERENCES projeto (idProjeto) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS tarefa    (
  idtarefa INT NOT NULL AUTO_INCREMENT,
  descricao VARCHAR(45) NOT NULL,
  prioridade VARCHAR(45) NOT NULL,
  dataInicio DATE NOT NULL,
  dataFim DATE NOT NULL,
  status VARCHAR(45) NOT NULL,
  meta_idmeta INT NOT NULL,
  usuario_matricula INT NOT NULL,
  PRIMARY KEY (idtarefa, meta_idmeta, usuario_matricula),
    FOREIGN KEY (meta_idmeta) REFERENCES meta (idmeta) ON DELETE CASCADE,
    FOREIGN KEY (usuario_matricula) REFERENCES usuario (matricula) ON DELETE CASCADE
    );

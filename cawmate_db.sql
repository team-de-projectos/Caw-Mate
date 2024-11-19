USE cawmate_db;


SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


CREATE TABLE `usuario` (
  `id` INT NOT NULL,
  `nome` VARCHAR(150) NOT NULL,
  `email` VARCHAR(320) NOT NULL,
  `senha` VARCHAR(64) NOT NULL,
  `escolaridade` VARCHAR(45) NOT NULL,
  `nascimento` DATE NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB;


CREATE TABLE `administrador` (
  `id` INT NOT NULL,
  `nome` VARCHAR(150) NOT NULL,
  `email` VARCHAR(320) NOT NULL,
  `senha` VARCHAR(64) NOT NULL,
  `telefone` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB;


CREATE TABLE `suporte` (
  `id` INT NOT NULL,
  `problema` VARCHAR(1000) NOT NULL,
  `resposta` VARCHAR(1000) NOT NULL,
  `usuario_id` INT NOT NULL,
  `administrador_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_suporte_usuario_idx` (`usuario_id` ASC) VISIBLE,
  INDEX `fk_suporte_administrador1_idx` (`administrador_id` ASC) VISIBLE,
  CONSTRAINT `fk_suporte_usuario`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `mydb`.`usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_suporte_administrador1`
    FOREIGN KEY (`administrador_id`)
    REFERENCES `mydb`.`administrador` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE `materia` (
  `id` INT NOT NULL,
  `disciplina` VARCHAR(1000) NOT NULL,
  `nivel` VARCHAR(45) NOT NULL,
  `nota` INT NOT NULL,
  `materiacol` VARCHAR(45) NOT NULL,
  `usuario_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_materia_usuario1_idx` (`usuario_id` ASC) VISIBLE,
  CONSTRAINT `fk_materia_usuario1`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `mydb`.`usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE `aptidao` (
  `id` INT NOT NULL,
  `conteudo` VARCHAR(1000) NOT NULL,
  `resposta` VARCHAR(1000) NOT NULL,
  `nota` INT NOT NULL,
  `usuario_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_aptidao_usuario1_idx` (`usuario_id` ASC) VISIBLE,
  CONSTRAINT `fk_aptidao_usuario1`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `mydb`.`usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE `exercicio` (
  `id` INT NOT NULL,
  `conteudo` VARCHAR(1000) NOT NULL,
  `resposta` VARCHAR(1000) NOT NULL,
  `materia_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_exercicio_materia1_idx` (`materia_id` ASC) VISIBLE,
  CONSTRAINT `fk_exercicio_materia1`
    FOREIGN KEY (`materia_id`)
    REFERENCES `mydb`.`materia` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE `termosUso` (
  `id` INT NOT NULL,
  `conteudo` VARCHAR(45) NOT NULL,
  `usuario_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_termosUso_usuario1_idx` (`usuario_id` ASC) VISIBLE,
  CONSTRAINT `fk_termosUso_usuario1`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `mydb`.`usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE `politicasPrivacidade` (
  `id` INT NOT NULL,
  `conteudo` VARCHAR(45) NOT NULL,
  `usuario_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_politicasPrivacidade_usuario1_idx` (`usuario_id` ASC) VISIBLE,
  CONSTRAINT `fk_politicasPrivacidade_usuario1`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `mydb`.`usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


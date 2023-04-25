DROP SCHEMA IF EXISTS `spring_test` ;

CREATE SCHEMA IF NOT EXISTS `spring_test` DEFAULT CHARACTER SET utf8mb4;

USE `spring_test` ;

CREATE TABLE `department` (
	`code` INT NOT NULL PRIMARY KEY,
    `name` VARCHAR(40) NOT NULL
)ENGINE=InnoDB;


CREATE TABLE IF NOT EXISTS `users` (
  `id` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `name` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `age` int NOT NULL,
  `img` varchar(40) DEFAULT NULL,
  `department_code` INT NOT NULL,
  CONSTRAINT `department_fk` FOREIGN KEY (`department_code`) REFERENCES `department`(`code`),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO `department` (code, name) VALUES (100, '사진부'), (200, '방송부'), (300, '영화부'), (400, '밴드부');

INSERT INTO users (id, password, name, email, age, department_code) values ("ssafy", "1234", "김싸피", "ssafy.kim@ssafy.com", 20, 100);

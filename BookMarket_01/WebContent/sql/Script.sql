--<ScriptOptions statementTerminator=";"/>

ALTER TABLE `book_db`.`books` DROP PRIMARY KEY;

DROP TABLE `book_db`.`books`;

CREATE TABLE `book_db`.`books` (
	`book_id` INT NOT NULL,
	`title` VARCHAR(50),
	`publisher` VARCHAR(30),
	`year` VARCHAR(10),
	`price` INT,
	PRIMARY KEY (`book_id`)
) ENGINE=InnoDB;


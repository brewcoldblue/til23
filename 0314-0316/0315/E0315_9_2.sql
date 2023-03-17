DROP DATABASE IF EXISTS ssafy9_2;
CREATE DATABASE ssafy9_2;
USE ssafy9_2;

CREATE TABLE IF NOT EXISTS movie (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(40) NOT NULL,
    director VARCHAR(20) NOT NULL,
    genre VARCHAR(20) NOT NULL,
    runningtime INT NOT NULL,
    releasedate DATE NOT NULL
    );

CREATE TABLE IF NOT EXISTS review (

    movieId INT,
	nickname VARCHAR(20) NOT NULL,
    rating INT NOT NULL,
    review VARCHAR(100) NOT NULL,
    PRIMARY KEY (nickname)
);

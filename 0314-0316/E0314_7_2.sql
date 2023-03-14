-- 1.    test_movie 라는 이름으로 새로운 schema를 생성하고, 해당 스키마를 사용하시오.\
CREATE DATABASE test_movie;
USE test_movie;

-- 2.    만약 movie 라는 테이블이 존재한다면 삭제하시오.  
DROP TABLE IF EXISTS movie;

-- 3.    test_movie 에 다음 조건을 만족하는 movie 테이블을 생성하시오.
CREATE TABLE movie (
	ID INT NOT NULL,
    TITLE VARCHAR(40) NOT NULL,
    ReleaseDate DATE,
    RunningTime INT NOT NULL
);
DESC movie;

-- 4.    movie 테이블에 아래와 같이 Director 라는 컬럼을 삽입하시오.
ALTER TABLE movie
ADD Director VARCHAR(40) NOT NULL;
DESC movie;

-- 5.    movie 테이블의 Director 컬럼을 아래와 같이 변경하시오.
ALTER TABLE movie
CHANGE Director Director VARCHAR(32) ;
DESC movie;

-- 6.    Director 컬럼을 삭제하시오.
ALTER TABLE movie
DROP Director;
DESC movie;

-- 7.    movie 테이블에 아래와 같은 데이터를 삽입하시오.
INSERT INTO movie
VALUES
	("1000", "이터널스", "2021-11-05", "156"),
    ("1001", "트랜스포터", "2002-10-02", "92"),
    ("1002", "해리포터와 마법사의돌", "2001-12-14", "152"),
    ("1003", "해리포터와 비밀의방", "2002-12-14", "162"),
    ("1004", "기생충", "2019-05-30", "153");
    
SELECT *
FROM movie;
-- 8.    ID가 1003 인 영화의 Title을 ‘해리포터와 불의 잔’ 으로 변경하시오.
UPDATE movie
SET Title = "해리포터와 불의 잔"
WHERE ID = 3;

SELECT *
FROM movie;
-- 9.    RunningTime이 100 이하인 영화를 삭제하시오.
DELETE
FROM movie
WHERE RunningTime <= 100;

SELECT *
FROM movie;
-- 10. movie 테이블에 있는 모든 data를 삭제하시오.
DELETE
FROM movie;

SELECT *
FROM movie;
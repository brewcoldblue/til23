DROP DATABASE IF EXISTS ssafy_movie;

CREATE DATABASE ssafy_movie;

USE ssafy_movie;

DROP TABLE IF EXISTS movie;
DROP TABLE IF EXISTS cinema;


CREATE TABLE `cinema` (
	`CinemaCode` int(10) NOT NULL PRIMARY KEY,
    `CinemaName` varchar(10) CHARACTER SET utf8mb4 NOT NULL,
    `Location` varchar(10) CHARACTER SET utf8mb4 NOT NULL
)ENGINE=InnoDB;

CREATE TABLE `movie` (
	`ID` int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `CinemaCode` int(10) NOT NULL,
    `Title` varchar(40) CHARACTER SET utf8mb4 NOT NULL,
    `ReleaseDate` date,
    `RunningTime` int(3) NOT NULL,
    CONSTRAINT `movie_ibfk_1` FOREIGN KEY (`CinemaCode`) REFERENCES `cinema` (`CinemaCode`)
)ENGINE=InnoDB;



INSERT INTO `cinema` (CinemaCode, CinemaName, Location) 
VALUES
(0, 's시네마','서울'),
(1, 'G시네마','광주'),
(2, 'B시네마','부산'),
(3, 'i시네마','인천');


INSERT INTO `movie` (Id, CinemaCode, Title, ReleaseDate, RunningTime)
VALUES 
(1000, 0,'이터널스',STR_TO_DATE('5-11-2021','%d-%m-%Y'),156),
(1001, 0,'트랜스포터',STR_TO_DATE('2-10-2002','%d-%m-%Y'), 92),
(1002, 1,'해리포터와 마법사의돌',STR_TO_DATE('14-12-2001','%d-%m-%Y'),152),
(1003, 1,'해리포터와 비밀의방',STR_TO_DATE('14-12-2002','%d-%m-%Y'),162),
(1004, 2,'기생충',STR_TO_DATE('30-5-2019','%d-%m-%Y'),153);

commit;

-- 1. movie 테이블 내의 전체 데이터 조회
SELECT *
FROM movie;
-- 2. movie 테이블 내의 모든 타이틀 조회
SELECT Title
FROM movie;
-- 3. 제목이 '이터널스'인 영화 조회
SELECT Title
FROM movie
WHERE Title = '이터널스';
-- 4. 제목이 '해리'로 시작하는 영화 조회
SELECT Title
FROM movie
WHERE Title like '해리%';
-- 5. 제목에 '포터'가 들어가는 영화 정보 조회
SELECT Title
From movie
WHERE Title like '%포터%';
-- 6. ID가 1000 또는 1004
SELECT Title
FROM movie
WHERE ID=1000 or ID=1004;
-- 7. touppercase를 모두 대문자로 바꿔서 출력
SELECT UPPER('touppercase')
FROM dual;
-- 8. '해리포터와' '마법사의 돌' 두 단어를 연결해서 출력
SELECT CONCAT('해리포터와','마법사의 돌');
-- 9. 개봉일이 2018년 1월 1일 이후인 영화들의 제목의 맨 앞 두글자만
SELECT SUBSTR(Title, 1, 2)
FROM movie
WHERE ReleaseDate > '2018-01-01';
-- 10. 제목에 '해리' 가 포함된 영화들의 제목의 '해리포터' 부분을 '말포이'로 바꾼후 조회
SELECT REPLACE(Title, '해리포터','말포이')
FROM movie
WHERE Title like '%해리%';
-- 11. 소수 둘째 자리까지 반올림
SELECT ROUND(PI(), 2);


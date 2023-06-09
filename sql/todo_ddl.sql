CREATE TABLE `tbl_todo` (
  `tno` int NOT NULL AUTO_INCREMENT,
  `todo` varchar(100)  NOT NULL,
  `duedate` date DEFAULT (curdate()),
  `finished` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`tno`)
);

-- DML INSERT
INSERT INTO tbl_todo (todo,duedate) VALUES ('JSP 공부','2023-05-05');
-- INSERT INTO tbl_todo (todo,duedate) VALUES (?,?);

-- DML UPDATE
update tbl_todo set todo='청소' , duedate='2023-05-02',finished=1 where tno=2;
-- update tbl_todo set todo=? , duedate=? , finished=? where tno=?;


-- DML DELETE
delete from tbl_todo where tno=8;
-- delete from tbl_todo where tno=?;

-- DML SELECT
-- list
select* from tbl_todo;
-- select* from tbl_todo;

-- 상세보기 view , 수정 update-view
select * from tbl_todo where tno=2;
-- select * from tbl_todo where tno=?;

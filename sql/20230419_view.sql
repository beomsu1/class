
-- 2023.04.19

-- VIIW : 가상 테이블
-- view 객체는 sql 가진다! -> sql 실행결과를 가상의 테이블로 사용 

select empno, ename, deptno 
from emp
where deptno=30
;

-- view 객체 생성
-- create or replace view 뷰이름 as 서브쿼리
create or replace view emp_view30 
as
select empno, ename, deptno 
from emp
where deptno=30
;

select * from emp_view30
;
-- 주문정보 : oreders , book , customer
select o.orderid , c.name, b.bookname , b.price , o.saleprice , o.orderdate 
from orders o , book b, customer c
where o.bookid = b.bookid and o.custid = c.custid
;

create or replace view order_info
as
select o.orderid , c.name, b.bookname , b.price , o.saleprice , o.orderdate 
from orders o , book b, customer c
where o.bookid = b.bookid and o.custid = c.custid
;

select bookname from order_info where name='박지성';

drop view order_info;

select rownum , ename , hiredate from emp order by hiredate;



select rownum , ename , hiredate
from (select rownum , ename , hiredate from emp order by hiredate)
where rownum <= 3
order by hiredate
;

create or replace view emp_hiredate_view
as
select ename , hiredate from emp order by hiredate
;

select rownum , ename , hiredate from emp_hiredate_view where rownum <= 3 ;
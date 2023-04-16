
-- 2023-04-13
-- join

-- CROSS JOIN
-- 스키마를 붙이고 결과 행은 모든 경우의 수 -> n * m
-- emp , dept -> 14 *4 = 56

select *
from emp , dept -- crossjoin
where emp.deptno = dept.deptno -- equi join
order by emp.deptno
;

select e.deptno , d.deptno
from emp e , dept d
where e.deptno = d.deptno;

-- 이름이 SCOTT 인 사람의 부서명으 출력해봅시다.
select deptno
from emp
where ename='SCOTT';
-- 20
select dname
from dept
where deptno=20;

-- join으로 해결

select e. ename , d. dname 
from emp e, dept d
where e.deptno = d.deptno
AND e.ename = 'SCOTT';

-- 사원별 급여 등급 표현
select *
from salgrade;

select e.ename , s. losal , e.sal , s.hisal, s.grade
from emp e , salgrade s
where e.sal between s.losal and s.hisal
;

-- self join : 자기 자신의 테이블을 조인하는 경우
-- 각 사원의 이름과 각 사원의 매니저 이름을 출력
select e.ename as "사원" , nvl(m.ename,'없음') as "상사"
from emp e , emp m
where e.mgr = m.empno(+)
;

-- inner join
select *
from emp inner join dept
on emp.deptno = dept.deptno;

select *
from emp natural join dept;

select *
from emp join dept
using(deptno
;)


select *
from emp e join emp m
on e.mgr = m.empno
;

select * 
from emp e left outer join emp m
on e.mgr = m.empno;

-- 도서 판매 정보 출력
select * from orders;

select o.orderid , c.name , b.bookname , o.saleprice , o.orderdate
from orders o , customer c , book b
where o.custid = c.custid and o.bookid = b.bookid
;



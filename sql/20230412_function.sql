
-- 2023.04.12
-- 함수

desc dual;
select * from dual;

-- 단일 행 함수 / 집합(그룹)함수
-- 단일 행 함수 : 숫자, 문자, 날짜, 변환, 기타 함수

-- 숫자 함수
select 10 , -10 , abs(-10) , abs(10) from dual;

-- floor : 소수점 아래를 없앰(버림)
select 2.1 , 2.9, floor(2.1) , floor(2.9) from dual;

-- round : 지정위치에서 반올림
select 1234.567, round(1234.567) ,round(1234.567,1) ,round(1234.567,-1) from dual;

-- trunc : 특정 자리수 아래를 없앰(버림)
select 1234.567 , trunc(1234.567) , trunc(1234.567,1) from dual;

-- mod : 나머지 연산
select mod(1,3) , mod (2,3) , mod(0,3), mod(3,0) from dual;

-- 문자 함수
-- lower 소문자로 변환
select 'SCOTT', lower('SCOTT') from dual;
select dname , lower(dname) from dept;
-- upper 대문자로 변환
select 'scott' , upper('scott') from dual;

select initcap('scott') from dual; 

-- 문자열을 추출 : substr(원본 , 시작위치) , substr(원본 , 시작위치 , 반환할 문자의 개수)
select '안녕하세요. 손흥민입니다.', 
substr('안녕하세요. 손흥민입니다.' , 8) ,
substr('안녕하세요. 손흥민입니다.' , 2,8)
from dual;

-- 문자열의 개수 : length(원본문자열)
select length('안녕하세요. 차두리입니다.') from dual;

-- 문자열에서 특정 자리수가 지정하고 자리에 데이터가 없을 떄 패턴을 입력
-- 00010
--      원본은 맨 오른쪽으로 원본문자열 , 5자리 만들거야, 왼쪽 부분은 0으로 
select '10', lpad('10',8,'0') , rpad('11',5,'0') from dual;
select deptno , lpad(deptno,5,0) from dept;

-- trim() : 공백 제거
select '        ABC          ' , trim('         AAAAAAAAAABBCC ')
from dual;

-- replace 문자열 변환 (원본 , 바꾸고 싶은 문자열 , 어떻게 변경할지)
select 'Steven King',
replace('Steven King' , 'Steven' , 's.'),
replace('Steven King' , 'Steven' , '')
from dual;

-- 날짜 함수
select sysdate from dual;

select months_between('23/12/15', sysdate) from dual;
select add_months(sysdate,8) from dual;
select add_months(sysdate,-1) from dual;
select add_months(sysdate,-6) from dual;
select next_day(sysdate,1) from dual;
select last_day(sysdate) from dual;
select round(sysdate) from dual;
select trunc(sysdate) from dual;

-- 변환 함수
-- DATE -> CHAR
-- to_char(원본,'패턴')
select sysdate,
to_char(sysdate,'yyyy-mm-dd'),
to_char(sysdate,'yyyy.mm.dd.'),
to_char(sysdate,'yyyy-mm-dd day')
from dual;

select 123456789 ,
        to_char(123456789,'000000000000'),
        to_char(123456789,'000,000,000,000'),
        to_char(123456789,'999999999999'), -- 9는 앞에 안 채워지고 공백
        to_char(123456789,'999,999,999,999'),
        to_char(123456789,'L999,999,999,999'),
        to_char(123456789,'999,999') -- 자릿수가 안맞으면 출력이 안됨
from dual;

select ename, sal , to_char(sal*1300, 'L999,999,999') as wonSAL
from emp;

-- char -> date
-- to_date('문자열','패턴')
select *
from emp
where hiredate = to_date('02198120','mmyyyydd');
-- to_date('19810220','yyyymmdd');

insert into emp values(9999,'SON','MANAGER',7782,'2023-04-12',4000,null,10);

select * from emp;

rollback; -- 마지막 commit 시점으로 복귀

-- char -> number
-- to_number('문자열','패턴') -> 숫자 타입
select to_number('20,000','99,999') - to_number('10,000','99,999')
from dual;

-- decode 함수 ->  = 비교 연산 후 결과 출력 하는 함수 switch~case
select ename , deptno,
        decode(deptno,
                10,'ACCOUNTING',
                20,'RESEARCH',
                30,'SALES',
                40,'OPERATIONS'
                )as dname
from emp
order by deptno;

select empno , ename , job , sal ,
       nvl( decode(job,
            'ANALYST',sal*1.05,
            'SALESMAN',sal*1.10,
            'MANAGER',sal*1.15,
            'CLERK',sal*1.2),sal)as upsal
from emp
order by empno ;

select ename , deptno,
        decode(deptno,
                10,'ACCOUNTING',
                20,'RESEARCH',
                30,'SALES',
                40,'OPERATIONS'
                )as dname,
                case when deptno = 10 then 'ACOOUNTING'
                    when deptno = 20 then 'RESEARCH'
                    when deptno = 30 then 'SALES'
                    when deptno = 40 then 'OPEARTIONS'
                end as dname2
from emp
order by deptno;

-- 그룹함수 , 집합함수 , 집계함수 , 다중행 함수
-- 하나의 행이 아닌 다중행을 그룹으로 묶어서 처리
-- sum, avg , count , max , min

-- 급여 총액을 구해보자
select sum(sal), to_char(sum(sal) , 'L999,999')
from emp;

-- 커미션의 총압
select sum(comm)
from emp;

select sum(comm), count(comm), avg(comm) 
from emp
where comm is not null;

-- 평균 급여
select avg(sal) , trunc(avg(sal)) , round(avg(sal))
from emp;

-- 최대 급여 max() 최소 급여 min()
select max(sal) , min(sal)
from emp;

-- count() -> row 개수
-- 전체 사원의 수
select count(*)
from emp;

-- 10번 부서의 사원 수
select count(*) from emp where deptno=10;

-- 부서의 개수
select count(*) from dept;

select distinct job 
from emp 
order by job;

select count(distinct job)
from emp 
order by job;

select count(comm)
from emp;

select * from emp;

-- group by -> 행 단위로 집합
select deptno , 
count (*) as "사원의 수" , 
sum(sal) as "총 급여액", 
trunc(avg(sal)) as "평균 급여",
max(sal) as "최고급여액",
min(sal) as "최소급여액",
count(comm) as "커미션을 받는 사원 수"
from emp
group by deptno
-- 그룹의 평균 급여가 2000이상인
-- having avg(sal)>=2000
-- 총 급여액이 10000이 넘어가는 그룹
having sum(sal)>10000
order by deptno;

select job , count(*) , trunc(avg(sal)) , sum(sal) , max(Sal) ,min(sal) , max(sal)-min(sal)
from emp
group by job;

-- 1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.

-- (5) 박지성이구매한도서의출판사수

select count(publisher)
from orders o , book b
where o.custid=1 and o.bookid = b.bookid
;

select count(publisher)
from orders o , book b , customer c
where o.bookid = b.bookid and o.custid = c. custid and c.name = '박지성'
;

-- (6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이

select bookname , price , b.price - o.saleprice as pricegap
from orders o , book b
where o.custid=1 and o.bookid = b.bookid
;

select bookname , price , b.price - o.saleprice as pricegap
from orders o , book b , customer c
where o.bookid = b.bookid and o.custid = c. custid and c.name = '박지성'
;

-- (7) 박지성이구매하지않은도서의이름
-- 구매한 도서를 찾고 해당 범위를 반전
-- 박지성이 구매한 도서의 bookid
select bookname
from book b
where not exists (select * from orders o where o.custid=1 and o.bookid = b.bookid)
;

select bookname
from book
where bookid not in (select distinct bookid from orders o , customer c where o.custid = c.custid and c.name = '박지성');

select distinct bookid from orders o , customer c where o.custid = c.custid and c.name = '박지성';


-- ​2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.

-- (8) 주문하지않은고객의이름(부속질의사용)

select c.name
from customer c
where c. custid not in (select o. custid from orders o , customer c where o.custid = c.custid)
;

-- (9) 주문금액의총액과주문의평균

select sum(saleprice) , avg(saleprice)
from orders
;

-- (10) 고객의이름과고객별구매액

select c.name , sum(saleprice)
from orders o , customer c
where o.custid = c. custid
group by c.name
;

-- (11) 고객의이름과고객이구매한도서목록

select c.name , b.bookname
from customer c , orders o , book b
where c.custid = o. custid and o.bookid = b. bookid
order by c.name
;
-- ​(12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문
-- 정가 - 판매가 -> 최대 차이
select max(price - saleprice)
from orders o , book b
where o.bookid = b.bookid 
;

select o.orderid , b.price , o.saleprice , price-saleprice as gap
from orders o , book b 
where o.bookid = b.bookid
and b.price - o.saleprice = (select max(price - saleprice)
                                from orders o , book b
                                where o.bookid = b.bookid )
;

-- (13) 도서의판매액평균보다자신의구매액평균이더높은고객의이름
-- 고객별 총 판매액 출력 조건 -> 총 평균보다 더 높은 값을 가지는 고객만

select c.custid, c.name, avg(o.saleprice)
from orders o , customer c
where o.custid = c.custid
group by c.custid, c.name
having avg(o.saleprice)>(select avg(saleprice) from orders)
order by c.custid
;

-- 판매평균
select avg(saleprice) from orders;

--3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
-- (1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
-- orders ,book -> publisher in ()
-- 박지성이 구매한 도서의 출판사 이름

select b.publisher
from orders o, book b , customer c
where o.bookid = b.bookid and o.custid = c.custid
and c.name='박지성'
;

select *
from orders o, book b, customer c
where o.bookid = b.bookid and o.custid = c.custid
and b.publisher in (select b.publisher
                        from orders o, book b , customer c
                        where o.bookid = b.bookid and o.custid = c.custid
                        and c.name='박지성')
                        and c.name != '박지성'
;

-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
-- group by custid, name
-- 고객별 구매한 도서의 출판사의 수

select c.custid , c.name , count(distinct b.publisher)
from orders o , book b , customer c
where o.bookid = b.bookid and o. custid = c.custid
group by c. custid , c.name
having count(distinct b.publisher) >1
;

-- 2개 이상의 출판사의 책을 구매한 회원 id
select o.custid , count(distinct b.publisher)
from orders o , book b
where o.bookid = b.bookid
group by o.custid
having count(distinct b.publisher)>1
;



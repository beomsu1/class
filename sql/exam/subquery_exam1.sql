-- 1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.

-- (5) 박지성이구매한도서의출판사수

select count(publisher)
from orders o , book b
where o.custid=1 and o.bookid = b.bookid
;
-- (6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이

select bookname , price , b.price - o.saleprice as pricegap
from orders o , book b
where o.custid=1 and o.bookid = b.bookid
;

-- (7) 박지성이구매하지않은도서의이름

select bookname
from book b
where not exists (select * from orders o where o.custid=1 and o.bookid = b.bookid)
;


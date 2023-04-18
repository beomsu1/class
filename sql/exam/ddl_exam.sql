
create table phoneInfo_basic(
        idx number(6) primary key,
        fr_name VARCHAR2(20)not null, -- 친구이름
        fr_phonenumber VARCHAR2(20) not null, -- 친구 전화번호
        fr_email VARCHAR2(20), -- 친구 이메일
        fr_address VARCHAR2(20), -- 친구 주소
        fr_regdate DATE default sysdate -- 등록 시간
);


create table phoneInfo_univ(
        idx number(6) primary key,
        fr_u_major VARCHAR2(20) default 'N' not null, -- 친구 전공 정보
        fr_u_year number(1) default '1' not null check(0<fr_u_year and fr_u_year<5) , -- 대학친구의 학년
        fr_ref number(7)references phoneInfo_basic(idx) not null -- 친구의 기본 정보 외래키
);

create table phoneInfo_com(
        idx number(6) primary key,
        fr_c_company varchar2(20) default 'N' not null, -- 회사친구의 회사회사 이름
        fr_ref number(6) references phoneInfo_basic(idx) not null -- 친구의 기본 정보 외래키
);

select * from phoneInfo_basic;

insert into phoneInfo_basic ( idx , fr_name , fr_phonenumber , fr_email , fr_address)
        values (7745 , 'RAMPARD' , '010-1457-5571' , 'FRANK@CHE','');
        
update phoneInfo_basic
set fr_name = 'BANJANG';

delete from phoneInfo_basic where idx = 7745;

----------------------------------------------------------------------------------

select * from phoneInfo_univ;

insert into phoneInfo_univ ( idx , FR_U_MAJOR , FR_U_YEAR , FR_REF)
        values (15434 , 'COACH' , '1' , '7745');

update phoneInfo_univ
set idx = 3374;

delete from phoneInfo_univ where FR_U_MAJOR = 'COACH';

---------------------------------------------------------------------------------

select * from  phoneInfo_com;

insert into phoneInfo_com ( idx , fr_c_company , fr_ref)
        values (1113 , 'CHELSEA' , 7745);
        
update phoneInfo_com
set fr_c_company = 'CHELSEA1';

delete from phoneInfo_com where fr_ref = 7745;

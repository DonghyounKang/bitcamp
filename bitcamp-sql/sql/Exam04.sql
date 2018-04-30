# FK(Foreign Key)
- 다른 테이블의 PK(Primary Key)를 참조하는 컬럼

/*게시판 테이블*/
```
create table test1(
	no int not null primary key auto_increment,
	title varchar(255) not null,
	content text,
	rdt datetime not null
);
```
/*첨부파일 테이블*/
```
create table test2(
	fno int not null primary key auto_increment, /*첨부파일 고유번호*/
	filepath varchar(255), /*파일이 있는 경로를 저장 / 실제 파일은 파일 시스템에 저장*/
	bno int not null/*게시판 번호*/
);
```

게시판 데이터 입력
```
insert into test1(title,rdt) values('aaa',now());
insert into test1(title,rdt) values('bbb',now());
insert into test1(title,rdt) values('ccc',now());
insert into test1(title,rdt) values('ddd',now());
insert into test1(title,rdt) values('eee',now());
insert into test1(title,rdt) values('fff',now());
insert into test1(title,rdt) values('ggg',now());
insert into test1(title,rdt) values('hhh',now());
insert into test1(title,rdt) values('iii',now());
insert into test1(title,rdt) values('jjj',now());
insert into test1(title,rdt) values('kkk',now());
```

첨부파일 데이터 입력:
```
insert into test2(filepath, bno) values('c:/downloard/a.gif',1);
insert into test2(filepath, bno) values('c:/downloard/b.gif',1);
insert into test2(filepath, bno) values('c:/downloard/c.gif',1);
insert into test2(filepath, bno) values('c:/downloard/d.gif',5);
insert into test2(filepath, bno) values('c:/downloard/e.gif',5);
insert into test2(filepath, bno) values('c:/downloard/f.gif',10);
```

## FK 제약조건이 없을 경우
- 첨부파일 데이터 입력시 존재하지 않는 게시물 번호가 들어갈 수 있다.
```
insert into test2(filepath, bno) values('c:/downloard/g.gif',100);
```

- 첨부 파일이 있는 게시물이 지워질 수 있다.
- 마찬가지로 게시물이 존재하지 않는 첨부파일 데이터이기 때문에 무효한 데이터가 된다.
```
delete from test1 where no=1;
```

##FK(Foreign Key) 제약조건 설정

- 다른 테이블의 데이터와 연관된 데이터를 저장할 때 무효한 데이터가 입력되지 않도록 하는 문법
- 다른 테이블의 데이터가 참좌는 데이터를 임의로 지우지 못하도록 하는 문법
- 그래서 데이터의 무결성(결함이 없는 상태)을 유지하기 위한 문법

- 다른 테이블의 PK를 참조하는 컬럼으로 선언한다.

```
alter table 테이블명
	add constraint 제약조건 이름 foreign key (컬럼명) references 테이블명(컬럼영);

alter table test2
	add constraint test2_bno_fk foreign key(bno) references test1(no);
	
```
-위와 같이 test2 테이블에 제약조건을 건 다음에 데이터를 입력해보자
첨부파일 데이터 입력:
/*
```
- 1번게시물 삭제로 자료입력 불가
insert into test2(filepath, bno) values('c:/downloard/a.gif',1);
insert into test2(filepath, bno) values('c:/downloard/b.gif',1);
insert into test2(filepath, bno) values('c:/downloard/c.gif',1);

- 아래는 가능
insert into test2(filepath, bno) values('c:/downloard/d.gif',5);
insert into test2(filepath, bno) values('c:/downloard/e.gif',5);
insert into test2(filepath, bno) values('c:/downloard/f.gif',10);

-5번 게시물 삭제 불가
delete from test1 where no=2; -- 가능
delete from test1 where no=5; -- 불가능

```
*/
- test1처럼 다른 테이블에 의해 참조되는 테이블을 '부모 테이블'이라 부른다.
- test2처럼 다른 테이블의 데이터를 참조하는 테이블을 '자식 테이블'이라 부른다.




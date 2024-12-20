

CREATE TABLE if not exists tbl_todolist (
    cash_seq INT AUTO_INCREMENT PRIMARY KEY,
    status varchar(255) NOT NULL check ( status in ('완료', '진행', '지연')),
    importance varchar(255) not null check ( importance in ('높음', '보통', '낮음')),
    categories varchar(255) DEFAULT '개인'check ( categories in ('개인', '회사')),
    todo varchar(255),
    regdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    email varchar(255)

);
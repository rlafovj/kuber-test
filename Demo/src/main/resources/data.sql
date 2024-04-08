select * from users;

insert into articles (id, title, content, writer) values (150, 'Child, The', 'sit amet nulla quisque arcu libero rutrum ac lobortis vel dapibus at diam', 'Charil');

insert into users (id, username, password, name, phone, address, job) values (1, 'qwerty', '1234', '홍길동', '011010101', 'Cairo', 'Engineer');

insert into articles (id, title, content, writer) values (150, 'Child, The', 'sit amet nulla quisque arcu libero rutrum ac lobortis vel dapibus at diam', );

INSERT INTO articles (id, title, content, writer)
SELECT 1, 'Child, The', 'sit amet nulla quisque arcu libero rutrum ac lobortis vel dapibus at diam', name
FROM users
WHERE name = (SELECT name FROM users ORDER BY RAND() LIMIT 1);
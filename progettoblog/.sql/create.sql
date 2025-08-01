create table authors (
    id BIGINT auto_increment PRIMARY KEY,
    firstname VARCHAR(100) ,
    lastname VARCHAR(100) ,
    email VARCHAR(100)
);

create table posts(
    id BIGINT auto_increment PRIMARY KEY,
    title VARCHAR(100) not NULL,
    body VARCHAR(100) not null,
    publish_date CHAR(8), -- seguendo il formato a 8 caratteri yyyyMMdd
    author_id BIGINT,
    FOREIGN KEY (author_id) REFERENCES authors(id)
);

create table comments(
    id BIGINT auto_increment PRIMARY KEY,
    email VARCHAR(100) not null,
    body VARCHAR(200) not null,
    date CHAR (8), -- seguendo il formato a 8 caratteri yyyyMMdd
    post_id BIGINT,
    FOREIGN KEY (post_id) REFERENCES posts(id)
);

-- create table pivot(
--     post_id BIGINT,
--     comment_id BIGINT,
--     PRIMARY KEY (post_id, comment_id),
--     FOREIGN KEY (post_id) REFERENCES posts(id),
--     FOREIGN KEY (comment_id) REFERENCES comments(id)
-- );
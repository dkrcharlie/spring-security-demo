
INSERT INTO users (username, password, enabled)
values ('user',
        '$2a$10$.asF1.Oq2PVFjy8jwmztZ.7xq5mLhMY3Pb9yvstLwDS/3LTZoqvN2',
        1);

INSERT INTO authorities (username, authority)
values ('user', 'ROLE_USER');

-- User user/pass
INSERT INTO users (username, password, enabled)
values ('admin',
        '$2a$10$.asF1.Oq2PVFjy8jwmztZ.7xq5mLhMY3Pb9yvstLwDS/3LTZoqvN2',
        1);

INSERT INTO authorities (username, authority)
values ('admin', 'ROLE_ADMIN');

-- User user/pass
INSERT INTO users (username, password, enabled)
values ('manager',
        '$2a$10$.asF1.Oq2PVFjy8jwmztZ.7xq5mLhMY3Pb9yvstLwDS/3LTZoqvN2',
        1);

INSERT INTO authorities (username, authority)
values ('manager', 'ROLE_MANAGER');
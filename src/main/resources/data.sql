insert into  users(username, password, enabled) values ('user','$2a$10$.asF1.Oq2PVFjy8jwmztZ.7xq5mLhMY3Pb9yvstLwDS/3LTZoqvN2',true);
insert into  users(username, password, enabled) values ('admin','$2a$10$.asF1.Oq2PVFjy8jwmztZ.7xq5mLhMY3Pb9yvstLwDS/3LTZoqvN2',true);
insert into  users(username, password, enabled) values ('manager','$2a$10$.asF1.Oq2PVFjy8jwmztZ.7xq5mLhMY3Pb9yvstLwDS/3LTZoqvN2',true);

insert into authorities(username, authority) VALUES ('user','ROLE_USER');
insert into authorities(username, authority) VALUES ('admin','ROLE_ADMIN');
insert into authorities(username, authority) VALUES ('manager','ROLE_MANAGER');
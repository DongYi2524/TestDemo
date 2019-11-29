create schema if not exists login collate utf8_general_ci;

create table if not exists user
(
    USER_ID int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    USER_NAME varchar(255) DEFAULT NULL COMMENT '用户名',
    PASS_WORD varchar(255) DEFAULT NULL COMMENT '密码',
    USER_CREAT_BY int(11) DEFAULT NULL COMMENT '创建人',
    USER_CREAT_TIME  timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '创建时间',
    USER_UPDATE_BY  int(11) DEFAULT NULL COMMENT '修改人',
    USER_UPDATE_TIME datetime DEFAULT NULL  COMMENT '修改时间',
    USER_REMARK varchar(255) DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (USER_ID)
) COMMENT '用户名';
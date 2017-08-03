-- begin DEMO_CUSTOMER
create table DEMO_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    EMAIL varchar(100),
    DETAILS_ID varchar(36),
    --
    primary key (ID)
)^
-- end DEMO_CUSTOMER
-- begin DEMO_CUSTOMER_DETAILS
create table DEMO_CUSTOMER_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ADDRESS varchar(255),
    COMMENTS longvarchar,
    --
    primary key (ID)
)^
-- end DEMO_CUSTOMER_DETAILS
-- begin DEMO_PHONE
create table DEMO_PHONE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_ varchar(255),
    NUMBER_ varchar(255),
    CUSTOMER_DETAILS_ID varchar(36),
    --
    primary key (ID)
)^
-- end DEMO_PHONE

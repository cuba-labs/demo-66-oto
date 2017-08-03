alter table DEMO_CUSTOMER add constraint FK_DEMO_CUSTOMER_DETAILS foreign key (DETAILS_ID) references DEMO_CUSTOMER_DETAILS(ID);

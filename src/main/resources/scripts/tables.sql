create table mom_codelist(
       id number not null,
       nome varchar2(400) not null,
       
       constraint PK_CODELIST_ID primary key (id)
);

create sequence sq_mom_codelist;

create table mom_section(
       id number not null,
       nome varchar2(200) not null,
       sub_section number,
       codelist number not null,
       
       constraint PK_SECTION primary key (id),
       constraint FK_SEC_CODELIST foreign key (codelist) references mom_codelist(id),
       constraint FK_SUB_SECTION foreign key (sub_section) references mom_section(id)
);
create sequence sq_mom_section;

alter table mom_section add constraint UK_SEC_NOME unique (nome, sub_section);
--alter table mom_section drop constraint UK_SEC_NOME;

create table mom_block(
       id number not null,
       nome varchar2(200) not null,
       cod number not null,
       section_id number not null,
       
       constraint PK_BLOCK_ID primary key (id),
       constraint FK_BLOCK_SECTION foreign key (section_id) references mom_section(id)
);
create sequence sq_mom_block;

alter table mom_block add constraint UK_BLOCK_NAME unique (nome, cod);


create table mom_remarks (
       id number not null,
       nome varchar2(200),
       
       constraint PK_REMARKS_ID primary key (id)
);

create sequence sq_mom_remarks;

create table mom_block_remark (
       block_id number references mom_block(id),
       remark_id number references mom_remarks(id)
);

alter table mom_block_remark add constraint UK_BLOCK_REMARK unique (block_id, remark_id);
alter table mom_block_remark modify (block_id number not null);
alter table mom_block_remark modify (remark_id number not null);

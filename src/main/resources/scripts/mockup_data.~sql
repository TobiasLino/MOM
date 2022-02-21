insert into mom_codelist
  (id, nome)
values
  (sq_mom_codelist.nextval, 'ABC-1234');

-- sections
insert into mom_section
  (id, nome, sub_section, codelist)
values
  (sq_mom_section.nextval, '0', null, 3);
insert into mom_section
  (id, nome, sub_section, codelist)
values
  (sq_mom_section.nextval, '2', null, 3);
insert into mom_section
  (id, nome, sub_section, codelist)
values
  (sq_mom_section.nextval, '3', null, 3);
insert into mom_section
  (id, nome, sub_section, codelist)
values
  (sq_mom_section.nextval, '4', null, 3);
insert into mom_section
  (id, nome, sub_section, codelist)
values
  (sq_mom_section.nextval, '5', null, 3);
insert into mom_section
  (id, nome, sub_section, codelist)
values
  (sq_mom_section.nextval, 'AP01', null, 3);
insert into mom_section
  (id, nome, sub_section, codelist)
values
  (sq_mom_section.nextval, 'S03', null, 3);

select * from mom_section;

-- subsections
insert into mom_section
  (id, nome, sub_section, codelist)
values
  (sq_mom_section.nextval, '01', 4, 3);
insert into mom_section
  (id, nome, sub_section, codelist)
values
  (sq_mom_section.nextval, '04', 6, 3);
insert into mom_section
  (id, nome, sub_section, codelist)
values
  (sq_mom_section.nextval, '06', 6, 3);

-- blocks
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Letter', '50', 2);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Letter', '55', 2);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Letter', '60', 2);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Cover', '01', 2);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Cover', '02', 2);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Cover', '03', 2);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'LEP', '01', 2);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'LEP', '02', 2);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'LEP', '03', 2);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'TOC', '01', 2);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'TOC', '02', 2);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Introduction', '01', 3);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Introduction', '02', 3);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Introduction', '03', 3);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Episódio 2', '14', 9);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Episódio 2', '15', 9);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Episódio 3', '01', 5);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Episódio 3', '02', 5);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Episódio 3 ', '03', 5);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Episódio 1', '12', 10);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Episódio 4', '01', 10);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Episódio 4', '02', 11);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Appendix', '01', 7);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Mars', '01', 8);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Copyright', '01', 8);
insert into mom_block
  (id, nome, cod, section_id)
values
  (sq_mom_block.nextval, 'Copyright', '02', 8);
  

-- remarks
insert into mom_remarks (id, nome) values (sq_mom_remarks.nextval, 'Mars');
insert into mom_remarks
  (id, nome)
values
  (sq_mom_remarks.nextval, 'Alpha Centauri');
insert into mom_remarks
  (id, nome)
values
  (sq_mom_remarks.nextval, 'Saturn');
  
-- remark blocks
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Mars'), (select id from mom_block where nome = 'Episódio 1' and cod = '12') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Mars'), (select id from mom_block where nome = 'Appendix' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Mars'), (select id from mom_block where nome = 'Mars' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Mars'), (select id from mom_block where nome = 'Copyright' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Mars'), (select id from mom_block where nome = 'Letter' and cod = '50') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Mars'), (select id from mom_block where nome = 'Cover' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Mars'), (select id from mom_block where nome = 'LEP' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Mars'), (select id from mom_block where nome = 'TOC' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Mars'), (select id from mom_block where nome = 'Introduction' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Mars'), (select id from mom_block where nome = 'Episódio 2' and cod = '14') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Mars'), (select id from mom_block where nome = 'Episódio 3 ' and cod = '2') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Mars'), (select id from mom_block where nome = 'Episódio 4' and cod = '02') from dual;

insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Alpha Centauri'), (select id from mom_block where nome = 'Episódio 1' and cod = '12') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Alpha Centauri'), (select id from mom_block where nome = 'Appendix' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Alpha Centauri'), (select id from mom_block where nome = 'Mars' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Alpha Centauri'), (select id from mom_block where nome = 'Copyright' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Alpha Centauri'), (select id from mom_block where nome = 'Letter' and cod = '55') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Alpha Centauri'), (select id from mom_block where nome = 'Cover' and cod = '02') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Alpha Centauri'), (select id from mom_block where nome = 'LEP' and cod = '02') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Alpha Centauri'), (select id from mom_block where nome = 'TOC' and cod = '02') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Alpha Centauri'), (select id from mom_block where nome = 'Introduction' and cod = '02') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Alpha Centauri'), (select id from mom_block where nome = 'Episódio 2' and cod = '15') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Alpha Centauri'), (select id from mom_block where nome = 'Episódio 3 ' and cod = '03') from dual;

insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Saturn'), (select id from mom_block where nome = 'Episódio 1' and cod = '12') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Saturn'), (select id from mom_block where nome = 'Appendix' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Saturn'), (select id from mom_block where nome = 'Mars' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Saturn'), (select id from mom_block where nome = 'TOC' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Saturn'), (select id from mom_block where nome = 'Episódio 2' and cod = '14') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Saturn'), (select id from mom_block where nome = 'Letter' and cod = '60') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Saturn'), (select id from mom_block where nome = 'Cover' and cod = '03') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Saturn'), (select id from mom_block where nome = 'LEP' and cod = '03') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Saturn'), (select id from mom_block where nome = 'Introduction' and cod = '03') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Saturn'), (select id from mom_block where nome = 'Episódio 3' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Saturn'), (select id from mom_block where nome = 'Episódio 4' and cod = '01') from dual;
insert into mom_block_remark(remark_id, block_id) select (select id from mom_remarks where nome = 'Saturn'), (select id from mom_block where nome = 'Copyright' and cod = '02') from dual;

insert into TB_EMERG_ROOM (ID_EMERG_ROOM, EMERG_ROOM)
values
    (1, '0 - 15 min'),
    (2, '15 - 30 min'),
    (3, '30 - 45 min'),
    (4, '45 - 60 min'),
    (5, '60 - 75 min'),
    (6, '75 - 90 min'),
    (7, '90 - 105 min'),
    (8, '105 - 120 min');


insert into TB_HOSP_UNIT (ID_HOSP_UNIT, HOSP_UNIT, ADDRESS, NUM_ADDRESS, CITY_ADDRESS, STATE_ADDRESS, ZIP_CODE)
values
    (1, 'Sede Entrada 1', 'Rua Ramiro Barcelos', 910, 'Porto Alegre', 'RS', 90035000),
    (2, 'Sede Entrada 2', 'Rua Tiradentes', 333, 'Porto Alegre', 'RS', 90560030),
    (3, 'Unidade Iguatemi', 'Rua Antonio Carlos Berta - Shopping Iguatemi - Andar 3', 390, 'Porto Alegre', 'RS', 91340020),
    (4, 'Unidade Hub Canoas', 'Av. Getulio Vargas', 4831, 'Canoas', 'RS', 92020333);



insert into TB_PATIENT (ID_PATIENT, ADDRESS_PATIENT, NUM_ADDRESS, DT_BIRTH, CITY_ADDRESS, CPF_PATIENT, EMAIL, NM_MOTHER, NM_PACIENT, PHONE, STATE_ADDRESS, ZIP_CODE)
values
    (1, 'Rua Carlos Chagas', 50, '1992-03-17', 'Porto Alegre', '12345678912', 'maria_92@gmail.com', 'Joaquina Silva', 'Maria de Lourdes Silva', 5133355678, 'RS', 90030020),
    (2, 'Rua Cassiano do Nascimento', 320, '1959-11-01', 'Porto Alegre', 99988877766, 'felipe_59@gmail.com', 'Amanda de Castro', 'Felipe de Castro', 5133358790, 'RS', 90010070),
    (3, 'Av. Osvaldo Aranha', 214, '1962-07-01', 'Porto Alegre', 11122233344, 'joana_62@gmail.com', 'Gabriela Soares', 'Joana Soares', 5133353231, 'RS', 90035190),
    (4, 'Av. Alberto Bins', 450, '1945-04-17', 'Porto Alegre', 44455566677, 'clara_45@gmail.com', 'Maria Dias', 'Clara Dias', 5133350000, 'RS', 90030140);


insert into TB_QUIZ (ID_QUIZ, NM_QUIZ, TP_QUIZ)
values
    (1, 'Habitos e Saude', 1),
    (2, 'Questionario de Emergencia', 2);


insert into TB_QUESTION (ID_QUESTION, IND_FREE_TEXT, QUESTION, ID_QUIZ)
values
    (1, 0, 'Sente dor de cabeca', 2),
    (2, 0, 'Sente dificuldade para respirar', 2),
    (3, 0, 'Sente dor abdominal', 2),
    (4, 0, 'Sente dor nas costas', 2),
    (5, 0, 'Sente dor no peito', 2),
    (6, 1, 'Caso tenha como medir, informe sua temperatura corporal', 2),
    (7, 1, 'Caso tenha como medir, informe sua pressao arterial', 2),
    (8, 1, 'Caso tenha como medir, informe sua saturacao', 2),
    (9, 0, 'Possui alergia a algum medicamento', 1),
    (10, 0, 'Toma algum medicamento de uso continuo', 1),
    (11, 0, 'Possui alguma doenca diagnosticada', 1),
    (12, 0, 'Possui historico de doenca cardiaca em pais e ou irmaos', 1),
    (13, 0, 'Fumante', 1),
    (14, 0, 'Pratica atividade fisica', 1),
    (15, 0, 'Consome bebida alcoolica', 1),
    (16, 0, 'Quer se dirigir a unidade de emergencia', 2);


insert into TB_ANSWER (ID_ANSWER, DT_ANSWER, ANSWER, DESC_ANSWER, ID_PATIENT, ID_QUESTION, ID_QUIZ)
values
    (1, '2022-02-10', 1, 'Dipirona', 1, 9, 1),
    (2, '2022-02-10', 1, 'Floxetina', 1, 10, 1),
    (3, '2022-02-10', 1, 'Hipertensao', 1, 11, 1),
    (4, '2022-02-10', 1, '4', 1, 12, 1),
    (5, '2022-02-10', 1, 'Diariamente', 1, 13, 1),
    (6, '2022-02-10', 1, '3 vezes por semana', 1, 14, 1),
    (7, '2022-02-10', 1, '1 vez por semana', 1, 15, 1),
    (8, '2022-02-15', 1, 'Intensa', 1, 1, 2),
    (9, '2022-02-15', 1, '', 1, 2, 2),
    (10, '2022-02-15', 1, 'Com irradiacao para braco esquerdo', 1, 5, 2),
    (11, '2022-02-15', 1, 'Dor intensa', 1, 3, 2),
    (12, '2022-02-15', 1, '', 1, 4, 2),
    (13, '2022-02-15', 1, '36', 1, 6, 2),
    (14, '2022-02-15', 1, '90 - 140', 1, 7, 2),
    (15, '2022-02-15', 1, '90', 1, 8, 2),
    (16, '2022-02-11', 1, 'Paracetamol', 2, 9, 1),
    (17, '2022-02-11', 1, 'Inicox', 2, 10, 1),
    (18, '2022-02-11', 1, 'Diabetes', 2, 11, 1),
    (19, '2022-02-11', 1, '2', 2, 12, 1),
    (20, '2022-02-11', 1, 'Diariamente', 2, 13, 1),
    (21, '2022-02-11', 1, '2 vezes por semana', 2, 14, 1),
    (22, '2022-02-11', 1, '2 vezes por semana', 2, 15, 1),
    (23, '2022-02-16', 1, 'Baixa', 2, 1, 2),
    (24, '2022-02-16', 0, '', 2, 2, 2),
    (25, '2022-02-16', 1, 'Forte', 2, 5, 2),
    (26, '2022-02-16', 1, 'Dor intermitente', 2, 3, 2),
    (27, '2022-02-16', 0, '', 2, 4, 2),
    (28, '2022-02-16', 1, '36', 2, 6, 2),
    (29, '2022-02-16', 0, '', 2, 7, 2),
    (30, '2022-02-16', 0, '', 2, 8, 2),
    (31, '2022-02-15', 1, '', 1, 16, 2),
    (32, '2022-02-16', 1, '', 2, 16, 2);


insert into TB_QUESTION_COMPLEMENT (ID_QUESTION_COMPLEMENT, COMPLEMENT, ID_QUESTION)
values
    (1, 'Intensidade', 1),
    (2, 'Caracteristica da Dor', 5),
    (3, 'Intensidade', 3),
    (4, 'Quais', 9),
    (5, 'Quais', 10),
    (6, 'Quais', 11),
    (7, 'Quantidade de Pessoas', 12),
    (8, 'Frequencia', 13),
    (9, 'Frequencia', 14),
    (10, 'Frequencia', 15);


insert into TB_STATUS (ID_STATUS, STATUS)
values
    (1, 'Em Aberto'),
    (2, 'Finalizado');


insert into TB_TICKET (ID_TICKET, DT_CREATED, ID_ANSWER, ID_EMERG_ROOM, ID_HOSP_UNIT, ID_STATUS, DT_STATUS)
values
    (1, '2022-02-15', 31, 2, 1, 1, '2022-02-15'),
    (2, '2022-02-15', 31, 2, 1, 2, '2022-02-16'),
    (3, '2022-02-16', 32, 4, 3, 1, '2022-02-16'),
    (4, '2022-02-16', 32, 4, 3, 2, '2022-02-17');
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


insert into TB_QUIZ (ID_QUIZ, NM_QUIZ, TP_QUIZ)
values
    (1, 'Habitos e Saude', 1),
    (2, 'Questionario de Emergencia', 2);


insert into TB_QUESTION (ID_QUESTION, IND_FREE_TEXT, QUESTION, ID_QUIZ)
values
    (1, false, 'Sente dor de cabeca', 2),
    (2, false, 'Sente dificuldade para respirar', 2),
    (3, false, 'Sente dor abdominal', 2),
    (4, false, 'Sente dor nas costas', 2),
    (5, false, 'Sente dor no peito', 2),
    (6, true, 'Caso tenha como medir, informe sua temperatura corporal', 2),
    (7, true, 'Caso tenha como medir, informe sua pressao arterial', 2),
    (8, true, 'Caso tenha como medir, informe sua saturacao', 2),
    (9, false, 'Possui alergia a algum medicamento', 1),
    (10, false, 'Toma algum medicamento de uso continuo', 1),
    (11, false, 'Possui alguma doenca diagnosticada', 1),
    (12, true, 'Possui historico de doenca cardiaca em pais e ou irmaos', 1),
    (13, false, 'Fumante', 1),
    (14, false, 'Pratica atividade fisica', 1),
    (15, false, 'Consome bebida alcoolica', 1),
    (16, false, 'Quer se dirigir a unidade de emergencia', 2);


insert into TB_ANSWER (ID_ANSWER, DT_ANSWER, ANSWER, DESC_ANSWER, ID_PATIENT, ID_QUESTION, ID_QUIZ)
values
    (1, '2022-02-10', true, 'Dipirona', 1, 9, 1),
    (2, '2022-02-10', true, 'Floxetina', 1, 10, 1),
    (3, '2022-02-10', true, 'Hipertensao', 1, 11, 1),
    (4, '2022-02-10', true, '4', 1, 12, 1),
    (5, '2022-02-10', true, 'Diariamente', 1, 13, 1),
    (6, '2022-02-10', true, '3 vezes por semana', 1, 14, 1),
    (7, '2022-02-10', true, '1 vez por semana', 1, 15, 1),
    (8, '2022-02-15', true, 'Intensa', 1, 1, 2),
    (9, '2022-02-15', true, '', 1, 2, 2),
    (10, '2022-02-15', true, 'Com irradiacao para braco esquerdo', 1, 5, 2),
    (11, '2022-02-15', true, 'Dor intensa', 1, 3, 2),
    (12, '2022-02-15', true, '', 1, 4, 2),
    (13, '2022-02-15', true, '36', 1, 6, 2),
    (14, '2022-02-15', true, '90 - 140', 1, 7, 2),
    (15, '2022-02-15', true, '90', 1, 8, 2),
    (16, '2022-02-11', true, 'Paracetamol', 2, 9, 1),
    (17, '2022-02-11', true, 'Inicox', 2, 10, 1),
    (18, '2022-02-11', true, 'Diabetes', 2, 11, 1),
    (19, '2022-02-11', true, '2', 2, 12, 1),
    (20, '2022-02-11', true, 'Diariamente', 2, 13, 1),
    (21, '2022-02-11', true, '2 vezes por semana', 2, 14, 1),
    (22, '2022-02-11', true, '2 vezes por semana', 2, 15, 1),
    (23, '2022-02-16', true, 'Baixa', 2, 1, 2),
    (24, '2022-02-16', false, '', 2, 2, 2),
    (25, '2022-02-16', true, 'Forte', 2, 5, 2),
    (26, '2022-02-16', true, 'Dor intermitente', 2, 3, 2),
    (27, '2022-02-16', false, '', 2, 4, 2),
    (28, '2022-02-16', true, '36', 2, 6, 2),
    (29, '2022-02-16', false, '', 2, 7, 2),
    (30, '2022-02-16', false, '', 2, 8, 2),
    (31, '2022-02-15', true, '', 1, 16, 2),
    (32, '2022-02-16', true, '', 2, 16, 2);


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
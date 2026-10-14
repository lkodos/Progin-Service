INSERT INTO employees (last_name, first_name, patronymic, position)
VALUES (null, 'Гузель', 'Радиковна', 'TEACHER'),
       (null, 'Андрей', 'Денисович', 'TEACHER'),
       (null, 'Зайнаб', 'Фаридовна', 'TEACHER'),
       (null, 'Гузель', 'Радиковна', 'TEACHER'),
       ('Шабаева', 'Амина', 'Гаязовна', 'SENIOR_TEACHER'),
       ('Федотовский', 'Эльдар', null, 'DEVELOPER');

INSERT INTO teachers (id, grade)
VALUES (1, 'JUNIOR'),
       (2, 'MIDDLE'),
       (3, 'SENIOR'),
       (4, 'JUNIOR'),
       (5, 'SENIOR');


INSERT INTO groups (group_name, location, day, time, teacher_id)
VALUES ('ТМБ-1', 'TRK', 'TUESDAY', '16:40', 1),
       ('ГаКБ-1', 'GAGARINA', 'THURSDAY', '15:00', 2),
       ('ТГБ-1', 'TRK', 'FRIDAY', '18:20', 3),
       ('ТКБ-1', 'TRK', 'MONDAY', '18:20', 1);
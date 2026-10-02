TRUNCATE TABLE public.teachers, groups RESTART IDENTITY CASCADE;

INSERT INTO teachers (last_name, first_name, patronymic, position, grade)
VALUES (null, 'Гузель', 'Радиковна', 'TEACHER', null),
       (null, 'Андрей', 'Денисович', 'TEACHER', null),
       (null, 'Зайнаб', 'Фаридовна', 'TEACHER', null),
       (null, 'Гузель', 'Радиковна', 'TEACHER', null),
       ('Шабаева', 'Амина', 'Гаязовна', 'SENIOR_TEACHER', null);


INSERT INTO groups (group_name, location, day, time, teacher_id)
VALUES ('ТМБ-1', 'TRK', 'TUESDAY', '16:40', 1),
       ('ГаКБ-1', 'GAGARINA', 'THURSDAY', '15:00', 2),
       ('ТГБ-1', 'TRK', 'FRIDAY', '18:20', 3),
       ('ТКБ-1', 'TRK', 'MONDAY', '18:20', 1);
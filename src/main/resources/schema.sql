DROP TABLE IF EXISTS groups;
DROP TABLE IF EXISTS teachers;

CREATE TABLE IF NOT EXISTS teachers
(
    teacher_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    last_name  VARCHAR(100),
    first_name VARCHAR(100) NOT NULL,
    patronymic VARCHAR(100),
    position   VARCHAR(100),
    grade      VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS groups
(
    group_id   INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    group_name VARCHAR(50) UNIQUE NOT NULL,
    location   VARCHAR(50)        NOT NULL,
    day        VARCHAR(50)        NOT NULL,
    time       TIME               NOT NULL,
    teacher_id INT REFERENCES teachers(teacher_id) ON DELETE SET NULL
);
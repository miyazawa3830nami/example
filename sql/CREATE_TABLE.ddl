CREATE TABLE todo_list
(task_id serial primary key,
task_name varchar,
task_detail varchar,
status smallint,
limit_date timestamp,
create_date timestamp,
lastmodify_date timestamp
)
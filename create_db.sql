drop view jdbcrealm_group;
drop view jdbcrealm_user;

create view jdbcrealm_user (username, password) as
select ID, Password
from Applicant;

create view jdbcrealm_group (username, groupname) as
select ID, 'Users'
from Applicant;
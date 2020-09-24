create schema Users;

create table user
    (
        userId varchar(255) unique not null ,
        firstName varchar(50) not null,
        lastName varchar(50) not null,
        gender enum('Male','Female','Other') default 'Other',
        email varchar(320) unique not null,
        phoneNumber varchar(15),
        dayOfBirth date not null,
        username varchar(40) not null unique,
        password varchar(256) not null,
        address varchar(1000),
        zipCode varchar(100),
        primary key(userID)
    );

insert into user(userId, firstName, lastName, gender, email, phoneNumber, dayOfBirth, username, password, address, zipCode)
value (uuid(), 'Sindre Broholm', 'Sæther', 1, 'Sindreset@gmail.com', '004793071137', '1993-07-19', 'sindre', '123', 'Movollen 100','7091');

select * from user;
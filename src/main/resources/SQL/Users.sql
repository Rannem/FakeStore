create schema Users;

create table user
    (
        userId LONG unique not null auto_increment,
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

insert into user( firstName, lastName, gender, email, phoneNumber, dayOfBirth, username, password, address, zipCode)
value ('Sindre Broholm', 'Sæther', 1, 'Sindreset@gmail.com', '004793071137', '1993-07-19', 'sindre', '123', 'Movollen 100','7091'),
 ('Helge', 'Rannem', 1, 'helgeRannem@gmail.com', '004799434990', '2000-03-03', 'Rannem00', '123', 'åsvegen 75','7715'),
 ('Stig', 'Texdahl', 1, 'Stig@texdahl.com', '004792695396', '1992-12-02', 'Stig', '123', 'Lerkendal Stadion','7031');

select * from user;
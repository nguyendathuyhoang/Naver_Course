drop table if exists exchange_value;
create table exchange_value(
     id int primary key,
     currency_from nvarchar(100),
    currency_to nvarchar(100),
    conversion_multiple decimal(10,2),
    port int
);
CREATE DATABASE MyBatis CHARSET=utf8;
USE MyBatis

CREATE TABLE IF NOT EXISTS Supplier(
	ID INT PRIMARY KEY AUTO_INCREMENT  NOT NULL COMMENT '主键',
	UserName VARCHAR(20) NOT NULL COMMENT'供应商名',
	address VARCHAR(250) NOT NULL COMMENT'供应商地址',
	phone VARCHAR(11) NOT NULL COMMENT'供应商联系方式'
)CHARSET=utf8;

INSERT INTO Supplier(UserName,address,phone) 
VALUES ('美的','四川成都',12345678912),
('格力','四川泸州',98765432198),
('TCL','四川宜宾',14725836914),
('康佳','四川巴中',12365478912);

SELECT * FROM Supplier

DROP TABLE Supplier
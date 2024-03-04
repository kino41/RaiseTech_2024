DROP TABLE IF EXISTS national_flower;

CREATE TABLE national_flower (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  country VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO national_flower (name, country) VALUES ("菊", "日本");
INSERT INTO national_flower (name, country) VALUES ("牡丹", "中国");
INSERT INTO national_flower (name, country) VALUES ("薔薇", "アメリカ");
INSERT INTO national_flower (name, country) VALUES ("蘭", "ブラジル");
INSERT INTO national_flower (name, country) VALUES ("睡蓮", "エジプト");

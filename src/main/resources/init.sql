CREATE TABLE USER(
	user_id INT UNIQUE,
	user_name VARCHAR(64) PRIMARY KEY,
	PASSWORD VARCHAR(255) NOT NULL,
	STATUS CHAR DEFAULT '1',
	create_time DATETIME NOT NULL,
	email VARCHAR(64),
	head_portrait VARCHAR(255) NULL,
	nick_name VARCHAR(128) NULL,
	update_time DATETIME NULL
)

CREATE TABLE role(
	role_id INT PRIMARY KEY,
	role_name VARCHAR(128),
	role_description VARCHAR(128)
)

CREATE TABLE permission(
	permission_id INT PRIMARY KEY,
	permission_url VARCHAR(255),
	permission_name VARCHAR(200)
)
CREATE TABLE user_role(
	uid INT,
	rid INT
)
CREATE TABLE role_permission(
	rid INT,
	pid INT
)
CREATE TABLE blog(
	blog_id INT PRIMARY KEY,
	appreciation CHAR DEFAULT '0',
	commentabled CHAR DEFAULT '0',
	content LONGTEXT,
	create_time DATETIME,
	description VARCHAR(255),
	first_picture VARCHAR(255),
	flag VARCHAR(255),
	published CHAR DEFAULT '0',
	title VARCHAR(255),
	update_time DATETIME,
	views INT,
	type_id INT,
	user_id INT,
	share_statement CHAR DEFAULT '0',
	recommed CHAR DEFAULT '0'
)

CREATE TABLE tag(
	tag_id INT PRIMARY KEY,
	tag_name VARCHAR(255)
)

CREATE TABLE TYPE(
	type_id INT PRIMARY KEY,
	type_name VARCHAR(255)
)

CREATE TABLE blog_tag(
	bid INT,
	tid INT,
)
CREATE TABLE COMMENT(
	comment_id INT PRIMARY KEY,
	context VARCHAR(255),
	create_time DATETIME,
	nick_name VARCHAR(255),
	email VARCHAR(255),
	blog_id INT,
	parent_id INT,
	head_portrait VARCHAR(255),
	admin_comment CHAR DEFAULT '0'
)
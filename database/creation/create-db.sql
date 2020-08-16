CREATE ROLE autorizador LOGIN NOSUPERUSER INHERIT NOCREATEDB NOCREATEROLE NOREPLICATION;
ALTER USER autorizador WITH ENCRYPTED PASSWORD 'qualirede';

CREATE DATABASE autorizacaodb;
ALTER DATABASE autorizacaodb OWNER TO autorizador;
GRANT ALL ON DATABASE autorizacaodb TO autorizador WITH GRANT OPTION;
GRANT CONNECT ON DATABASE autorizacaodb TO autorizador;

CREATE SCHEMA autorizacao AUTHORIZATION autorizador;
GRANT ALL ON SCHEMA autorizacao TO autorizador WITH GRANT OPTION;
GRANT USAGE ON SCHEMA autorizacao TO autorizador WITH GRANT OPTION;

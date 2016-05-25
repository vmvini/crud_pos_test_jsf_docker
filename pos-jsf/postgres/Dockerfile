FROM postgres:9.5.1
MAINTAINER Ricardo Job <sousajob@gmail.com>
ENV POSTGRES_USER vmvini
ENV POSTGRES_PASSWORD 12345
ENV POSTGRES_DB crud
COPY create.sql /docker-entrypoint-initdb.d/
COPY data.sql /docker-entrypoint-initdb.d/

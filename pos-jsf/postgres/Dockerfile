FROM postgres:9.5.1
MAINTAINER Ricardo Job <sousajob@gmail.com>
ENV POSTGRES_USER root
ENV POSTGRES_PASSWORD root
ENV POSTGRES_DB pos-jsf-crud
COPY create.sql /docker-entrypoint-initdb.d/
COPY data.sql /docker-entrypoint-initdb.d/

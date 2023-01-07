FROM openjdk:17-oracle

ENV FLYWAY_DOWNLOAD_URL=https://repo1.maven.org/maven2/org/flywaydb/flyway-commandline/9.8.1/flyway-commandline-9.8.1-linux-x64.tar.gz

# download 
RUN curl ${FLYWAY_DOWNLOAD_URL} --output /var/download/flyway.tar.gz && \
    tar xvz -f /var/download/flyway.tar.gz && \
    ln -s `pwd`/flyway-9.8.1/flyway /usr/local/bin
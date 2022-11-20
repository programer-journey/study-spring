FROM openjdk:17-oracle

ENV MAVEN_HOME=/usr/share/maven
ARG MAVEN_VERSION=3.6.3
ARG BASE_URL=https://apache.osuosl.org/maven/maven-3/${MAVEN_VERSION}/binaries

# download mvn cli
RUN mkdir -p /var/download /usr/share/maven && \
    curl -o /var/download/maven-release ${BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz && \
    tar -xzf /var/download/maven-release -C ${MAVEN_HOME} --strip-components=1

# import mvn cli path to environment
ENV PATH=$MAVEN_HOME/bin:$PATH

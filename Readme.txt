commands
-------

Keep root loglevel as INFO
set active profile as kubernetes
Remove commented libs in pom.xml

mvn clean install -DskipTests
docker build -t logconfig .
docker run -p 8080:8080 logconfig
docker tag logconfig shashanksdixit/logconfig
docker push shashanksdixit/logconfig
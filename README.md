

Download the latest elastic-apm-java agent .

wget -O apm-agent.jar https://search.maven.org/remotecontent?filepath=co/elastic/apm/elastic-apm-agent/1.9.0/elastic-apm-agent-1.9.0.jar

Run the below command to integrate the play application with Elastic APM.

sbt \
        -J-javaagent:apm-agent.jar 
        -J-Delastic.apm.logging.log_level=DEBUG \
        -J-Delastic.apm.service_name=play-scala-seed \
        -J-Delastic.apm.application_packages=controllers \
        -J-Delastic.apm.server_urls=http://localhost:8200 \
        -J-Delastic.apm.metrics_interval=20s \

        
        
pipeline {
    agent any
    tools {
        jdk 'java 11'
    }
    environment {
        JAVA_HOME="/opt/tools/jdk/java_11"
    }
    stages {
        stage("Clone the project") {
            steps {
                git branch: 'main', url: 'https://github.com/Sztzoli/jaxws_design_first.git'
            }
        }
        stage("Compilation") {
            steps {
                echo $JAVA_HOME
            }
            steps {
                sh "./mvnw clean install -DskipTests"
            }
        }
        stage("Test Unit") {
            steps {
                sh "./mvnw test -Punit"
            }
        }
        stage("Deployment") {
            steps {
                sh 'nohup ./mvnw spring-boot:run -Dserver.port=8001 &'
            }
        }
    }
}
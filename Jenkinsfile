pipeline {
    agent any
    tools {
        jdk 'java 11'
    }
    environment {
        JAVA_HOME="/var/jenkins_home/tools/hudson.model.JDK/java_11/jdk-11.0.1"
    }
    stages {
        stage("Clone the project") {
            steps {
                git branch: 'main', url: 'https://github.com/Sztzoli/jaxws_design_first.git'
            }
        }
        stage("Echo vatiable") {
            steps {
                sh "printenv"
            }
        }
        stage("Compilation") {
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
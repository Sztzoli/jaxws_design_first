pipeline {
  agent any
      tools {
        maven 'maven 3.8.6'
        jdk 'java 11'
    }
  stages {
    stage('GitHub Pull') {
      steps {
        git url: 'https://github.com/Sztzoli/jaxws_design_first.git'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean install -DskipTests -Dmaven.compiler.target=11 -Dmaven.compiler.source=11'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Integration Test') {
      steps {
        sh 'mvn verify -Pintegration-tests'
      }
    }
  }
}
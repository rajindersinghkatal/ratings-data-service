node{
   stage('SCM Checkout'){
     git 'https://github.com/rajindersinghkatal/ratings-data-service.git'
    }
   stage('Maven Build'){
     def mvnHome = tool name: 'Maven_3_6_0', type: 'maven'
     bat "echo %JAVA_HOME%"
     bat "set JAVA_HOME=C:/Program Files/Java/jdk1.8.0_172/jre"
     bat "echo %JAVA_HOME%"
     bat "mvn clean install"
    } 
}
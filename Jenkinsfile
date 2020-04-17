node{
   stage('SCM Checkout'){
     git 'https://github.com/rajindersinghkatal/ratings-data-service.git'
    }
   stage('Maven Build'){
     def mvnHome = tool name: 'Maven_3_6_0', type: 'maven'
     //sh "${mvnHome}/bin/mvn package"
     bat "echo %JAVA_HOME%"
     bat "${mvnHome}/bin/mvn package"
     //bat "mvn clean install"
    } 
}
node{
   stage('SCM Checkout'){
     git 'https://github.com/rajindersinghkatal/ratings-data-service.git'
    }
   stage('Maven Build'){
     def mvnHome = tool name: 'Maven_3_6_0', type: 'maven'
     bat "mvn clean install"
    } 
}
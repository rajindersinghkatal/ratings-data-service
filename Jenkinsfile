node{
   stage('SCM Checkout'){
     git 'https://github.com/rajindersinghkatal/ratings-data-service.git'
    }
   stage('Maven Build'){
     def mvnHome = tool name: 'Maven_3_6_0', type: 'maven'
	 def java_Home =  tool name: 'JAVA_8', type: 'jdk'
     //sh "${mvnHome}/bin/mvn package"
     //bat "set JAVA_HOME=${java_Homjre"
	 //bat "echo %JAVA_HOME%"
	 //bat "mvn clean install"
	 bat "mvn clean install -U"
    } 
}
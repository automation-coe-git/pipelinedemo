node{

   def tomcatWeb = 'C:\\Users\\keertipati.bhaskar\\Desktop\\Tomcat\\apache-tomcat-9.0.44\\webapps'
   def tomcatBin = 'C:\\Users\\keertipati.bhaskar\\Desktop\\Tomcat\\apache-tomcat-9.0.44\\bin'
   def mvnHome ='C:\\Users\\keertipati.bhaskar\\Downloads\\apache-maven-3.6.3'
   def tomcatStatus = ''
   
   stage('SCM Checkout'){
     git 'https://github.com/automation-coe-git/JenkinsWar.git/'
   }
   
   stage('Compile-Package-create-war-file'){
      // Get maven home path  
      bat "${mvnHome}/bin/mvn clean package"
      }
      

   stage('Deploy-To-Tomcat'){
     bat "copy target\\JenkinsWar.war \"${tomcatWeb}\\JenkinsWar.war\""
   }
   
   stage ('Start-Tomcat-Server') {
   sleep(time:5,unit:"SECONDS")
         dir('C:\\Users\\keertipati.bhaskar\\Desktop\\Tomcat\\apache-tomcat-9.0.44\\bin') {
           bat "startup.bat"
           }
           
         sleep(time:30,unit:"SECONDS")
   }
   
   stage('SCM-Automation-Code-Checkout'){
     git 'https://github.com/automation-coe-git/pipelinedemo.git'
   }
   
   stage('Run-Automation-Tests'){
      bat "${mvnHome}/bin/mvn clean test"
      }
      
    

}
     

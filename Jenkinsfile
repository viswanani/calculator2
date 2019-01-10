pipeline {
    
    agent any
    stages {
        stage ('--validate--') {
          if(isUnix()) {
             
             sh "mvn validate"  
          
          }
         else {
             
             bat "mvn validate" 
          
          }

            
   
        }
        
        satge ('--compile--') {
                  
                  if(isUnix()) {
                      
                     sh "mvn compile" 
                  
                  }
                  else {
                      
                      bat "mvn compile"
                  }


                    
                  
              }
              
              stage('--package--') {
                  
                  if(isUnix()) {
                      
                      sh "mvn package"
                      
                  }
                  else {
                      
                      bat "mvn package"
                      
                  }


              }
              stage ('--install--') {
                        
                        if(isUnix()) {
                            
                            sh "mvn install"
                            
                        }
                        else {
                            
                            bat "mvn install"
                            
                        }


                    }




    }

}

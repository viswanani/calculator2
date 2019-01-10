pipeline {
    
    agent any
    stages {
        stage ('--validate--') {
        script {
            
             if(isUnix()) {
             
             sh "mvn validate"  
          
          }
         else {
             
             bat "mvn validate" 
          
          }
        
        }

         

            
   
        }
        
        stage ('--compile--') {
        script {
            
            if(isUnix()) {
                      
                     sh "mvn compile" 
                  
                  }
                  else {
                      
                      bat "mvn compile"
                  }


                    
                  
              }
        
        }

                  
                  
              
              stage('--package--') {
              script {
                  
                   if(isUnix()) {
                      
                      sh "mvn package"
                      
                  }
                  else {
                      
                      bat "mvn package"
                      
                  }
              
              }

                  
                 


              }
              stage ('--install--') {
              script {
                  
                   if(isUnix()) {
                            
                            sh "mvn install"
                            
                        }
                        else {
                            
                            bat "mvn install"
                            
                        }
              }

                        
                       


                    }




    }

}

pipeline {
    
    agent any
    stages {
    stage ('--clean--') {
              
              steps {
                  
                  script {
                      
                      if(isUnix()) {
                          
                          sh "mvn clean"
                      
                      }
                      else {
                          
                          bat "mvn clean"
                      
                      }


                  }

              }

          }

        stage ('--validate--') {
         steps {
            
             script {
            
             if(isUnix()) {
             
             sh "mvn validate"  
          
          }
         else {
             
             bat "mvn validate" 
          
          }
        
        } 

         

            
   
         }
        }

      
        
        stage ('--compile--') {
        steps {
            script {
            
            if(isUnix()) {
                      
                     sh "mvn compile" 
                  
                  }
                  else {
                      
                      bat "mvn compile"
                  }


                    
                  
              }
        
        }

                  
            
        }

        
                  
              
              stage('--package--') {
              steps {
                  
                  script {
                  
                   if(isUnix()) {
                      
                      sh "mvn package"
                      
                  }
                  else {
                      
                      bat "mvn package"
                      
                  }
              
              }

                  
                 


               } 
              }

             
              stage ('--install--') {
              steps {
                  
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

              
}

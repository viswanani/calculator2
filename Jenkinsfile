pipeline {
    
    agent any
    stages {
    stage ('--push the branches--') {
       
       steps {
       script {
           
           if(isUnix()) {
               
               sh "git pull origin master"
               sh "git push origin --all"
           
           }
           else {
               
           bat "git pull origin master" 
           sh  "git push origin --all"   
           
           }


       }

           
       }

                       }

    stage ('--SCM CHeckout--') {
        
        steps {
            git branch: 'multi' , credentialsId:'viswanani' , url:'https://github.com/viswanani/calculator2.git'
        }

    }
    
    stage ('--clean--') {
              
              steps {
                  
                  script {
                      
                      if(isUnix())
                       {
                          
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

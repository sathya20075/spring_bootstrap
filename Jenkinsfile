#!/usr/bin/env groovy
node{
 try{
   parameters{
     int(name: 'buildId')
      boolean(name: 'buildStatus')
   }
    
    stage('Clone project'){
       def branch = 'master'
       if(params.branch){
           branch = params.branch
       }
       dir('self'){
        git credentialsId: '',
            url:'',
            branch: branch
       }
    }
    stage('')
 }catch(e){
      currentBuild.result = 'Failed'
      //create new jira issue
 }

    
}
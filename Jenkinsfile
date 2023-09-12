#!/usr/bin/env groovy
node{
 try{
   parameters{
      string(name: 'buildResult')
   }
   stage('Clone project'){
       def branch = 'master'
       if(params.branch){
           branch = params.branch
       }
       dir('self'){
        git credentialsId: 'gitcredentials',
            url:'https://github.com/sathya20075/spring_bootstrap.git',
            branch: branch
       }
    }
    stage('Build project'){
      sh('cd initial && mvn clean install')
    }
 }catch(e){
      currentBuild.result = 'Failed'

      //create new jira issue
 }

    
}
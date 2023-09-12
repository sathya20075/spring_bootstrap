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
      sh '''
        echo 'Check curl command available'
        echo `which curl`
        echo 'Building the spring bootstrap project'
        cd self/initial
        mvn clean install
      '''
    }
 }catch(e){
      currentBuild.result = 'Failed'
      createJiraIfBuildFailed()
      throw(e)

      //create new jira issue
 }
 finally{

 }

 /*
  This method takes the below arguments:
  JiraProjectKey -
  Assignee -
  Description of Test -
  Component name -
  Issue Priority - Highest, High, Medium, Low, Lowest
  Issue Type -  Task, Sub-task, Epic
  Action Id on success
 */

 def createJiraIfBuildFailed(){
     println "Build failed!! Creating a new Jira Issue!"

 }

    
}
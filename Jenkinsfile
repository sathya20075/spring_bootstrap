#!/usr/bin/env groovy

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
     def response = sh '''
     curl --request POST \
  --url 'https://testjenkins20075.atlassian.net/rest/api/3/issue' \
  --user 'sathya20075@gmail.com:ATATT3xFfGF0UrBZICswbQS-jMmqxmBWNVqd_KD4aT09QhGBQnW9bWnm_6zNROjSKcAg1eYCLkVAIXzIbjIUmN5HKnISMWSm2h9cbfGIfj3o5b-JSdjqunoaZ99Mjy99aDRr3LN1WIXkPVRkRrBq4MszEbBk826mfyFDtLgxXSeCwzik8Bc8Ou4=69DDBF50' \
  --header 'Accept: application/json' \
  --header 'Content-Type: application/json' \
  --data '{
   "fields":{
      "project":{
         "id":"10000",
         "key":"TES",
         "name":"test20075"
      },
      "assignee":{
         "name":"sathya20075@gmail.com"
      },
      "reporter":{
         "accountId":"557058:7bdd9bc6-a216-4c77-b403-6e84922c636b",
         "emailAddress":"sathya20075@gmail.com"
      },
      "issuetype":{
         "id":"10001",
         "name":"Task",
         "subtask": false   
      },
      "duedate":"2023-09-12",
      "priority":{
         "id":"3",
         "name":"Medium"
      },
      "summary":"Build failed! Due to exception in code triggered from Jar"
   },
   "update":{
      
   }
}' 
'''

 }

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
      createJiraIfBuildFailed(e)
      throw(e)

      //create new jira issue
 }
 finally{

 }

 

    
}
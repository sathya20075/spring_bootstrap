

curl --request GET \
  --url 'https://testjenkins20075.atlassian.net/rest/api/3/issuetype' \
  --user 'sathya20075@gmail.com:ATATT3xFfGF0UrBZICswbQS-jMmqxmBWNVqd_KD4aT09QhGBQnW9bWnm_6zNROjSKcAg1eYCLkVAIXzIbjIUmN5HKnISMWSm2h9cbfGIfj3o5b-JSdjqunoaZ99Mjy99aDRr3LN1WIXkPVRkRrBq4MszEbBk826mfyFDtLgxXSeCwzik8Bc8Ou4=69DDBF50' \
  --header 'Accept: application/json' \
  

curl --request POST \
  --url 'https://testjenkins20075.atlassian.net/rest/api/3/issue' \
  --user 'sathya20075@gmail.com:ATATT3xFfGF0UrBZICswbQS-jMmqxmBWNVqd_KD4aT09QhGBQnW9bWnm_6zNROjSKcAg1eYCLkVAIXzIbjIUmN5HKnISMWSm2h9cbfGIfj3o5b-JSdjqunoaZ99Mjy99aDRr3LN1WIXkPVRkRrBq4MszEbBk826mfyFDtLgxXSeCwzik8Bc8Ou4=69DDBF50' \
  --header 'Accept: application/json' \
  --header 'Content-Type: application/json' \
  --data '{
   "fields":{
      "project":{
         "id":"10000",
         "key":"TES"
      },
      "assignee":{
         "name":"sathya20075@gmail.com"
      },
      "reporter":{
         "name":"Sathya Narayanan"
      },
      "issuetype":{
         "id":"10002",
         "name":"Sub-task"
      },
      "duedate":"2019-05-11",
      "priority":{
         "id":"High"
      },
      "summary":"Build failed! Due to exception in code"
   },
   "update":{
      
   }
}' 


curl --request POST \
  --url 'https://your-domain.atlassian.net/rest/api/3/issue' \
  --user 'email@example.com:<api_token>' \
  --header 'Accept: application/json' \
  --header 'Content-Type: application/json' \
  --data '{
  "fields": {
    "assignee": {
      "id": "5b109f2e9729b51b54dc274d"
    },
    "components": [
      {
        "id": "10000"
      }
    ],
    "customfield_10000": "09/Jun/19",
    "customfield_20000": "06/Jul/19 3:25 PM",
    "customfield_30000": [
      "10000",
      "10002"
    ],
    "customfield_40000": {
      "content": [
        {
          "content": [
            {
              "text": "Occurs on all orders",
              "type": "text"
            }
          ],
          "type": "paragraph"
        }
      ],
      "type": "doc",
      "version": 1
    },
    "customfield_50000": {
      "content": [
        {
          "content": [
            {
              "text": "Could impact day-to-day work.",
              "type": "text"
            }
          ],
          "type": "paragraph"
        }
      ],
      "type": "doc",
      "version": 1
    },
    "customfield_60000": "jira-software-users",
    "customfield_70000": [
      "jira-administrators",
      "jira-software-users"
    ],
    "customfield_80000": {
      "value": "red"
    },
    "description": {
      "content": [
        {
          "content": [
            {
              "text": "Order entry fails when selecting supplier.",
              "type": "text"
            }
          ],
          "type": "paragraph"
        }
      ],
      "type": "doc",
      "version": 1
    },
    "duedate": "2019-05-11",
    "environment": {
      "content": [
        {
          "content": [
            {
              "text": "UAT",
              "type": "text"
            }
          ],
          "type": "paragraph"
        }
      ],
      "type": "doc",
      "version": 1
    },
    "fixVersions": [
      {
        "id": "10001"
      }
    ],
    "issuetype": {
      "id": "10000"
    },
    "labels": [
      "bugfix",
      "blitz_test"
    ],
    "parent": {
      "key": "PROJ-123"
    },
    "priority": {
      "id": "20000"
    },
    "project": {
      "id": "10000"
    },
    "reporter": {
      "id": "5b10a2844c20165700ede21g"
    },
    "security": {
      "id": "10000"
    },
    "summary": "Main order flow broken",
    "timetracking": {
      "originalEstimate": "10",
      "remainingEstimate": "5"
    },
    "versions": [
      {
        "id": "10000"
      }
    ]
  },
  "update": {}
}'
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("weater.feature");
formatter.feature({
  "line": 2,
  "name": "How is the weater in Charlotte,NC?",
  "description": "",
  "id": "how-is-the-weater-in-charlotte,nc?",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@weater"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "how-is-the-weater-in-charlotte,nc?;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "weater home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user search weater in specific city",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user able to get result",
  "keyword": "Then "
});
formatter.match({
  "location": "WeaterStepDefn.weater_home_page()"
});
formatter.result({
  "duration": 1824742183,
  "status": "passed"
});
formatter.match({
  "location": "WeaterStepDefn.user_search_weater_in_specific_city()"
});
formatter.result({
  "duration": 15592184584,
  "status": "passed"
});
formatter.match({
  "location": "WeaterStepDefn.user_able_to_get_result()"
});
formatter.result({
  "duration": 2313428,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat chase.stepDefns.WeaterStepDefn.user_able_to_get_result(WeaterStepDefn.java:73)\n\tat ✽.Then user able to get result(weater.feature:7)\n",
  "status": "pending"
});
});
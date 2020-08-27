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

  "duration": 2429223202,
=======
  "duration": 1968356611,

  "status": "passed"
});
formatter.match({
  "location": "WeaterStepDefn.user_search_weater_in_specific_city()"
});
formatter.result({

  "duration": 2076146237,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d85.0.4183.83)\n  (Driver info: chromedriver\u003d2.25.426935 (820a95b0b81d33e42712f9198c215f703412e1a1),platform\u003dMac OS X 10.15.4 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.10.0\u0027, revision: \u0027176b4a9\u0027, time: \u00272018-03-02T19:03:16.397Z\u0027\nSystem info: host: \u0027Nilufers-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:4a0:96c0:454f:af60%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.4\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.25.426935 (820a95b0b81d33..., userDataDir: /var/folders/hq/jrm8hv796nz...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, takesHeapSnapshot: true, takesScreenshot: true, version: 85.0.4183.83, webStorageEnabled: true}\nSession ID: 3ea575e7fa07315dfea1702e98b3a267\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\n\tat weater.stepDefns.WeaterStepDefn.user_search_weater_in_specific_city(WeaterStepDefn.java:39)\n\tat ✽.When user search weater in specific city(weater.feature:6)\n",
  "status": "failed"
=======
  "duration": 30689874676,
  "status": "passed"

});
formatter.match({
  "location": "WeaterStepDefn.user_able_to_get_result()"
});
formatter.result({

  "status": "skipped"
=======
  "duration": 1654443,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat weater.stepDefns.WeaterStepDefn.user_able_to_get_result(WeaterStepDefn.java:73)\n\tat ✽.Then user able to get result(weater.feature:7)\n",
  "status": "pending"

});
});
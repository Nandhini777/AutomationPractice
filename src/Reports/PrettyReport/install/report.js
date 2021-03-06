$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("01_Tomato.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author : Nandhini"
    }
  ],
  "line": 2,
  "name": "To Check the Automation Practise",
  "description": "",
  "id": "to-check-the-automation-practise",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Login",
  "description": "",
  "id": "to-check-the-automation-practise;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    },
    {
      "line": 4,
      "name": "@Automation"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch the website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to create an account",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "enter \"\u003cEmail\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user logout",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "to-check-the-automation-practise;login;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ],
      "line": 12,
      "id": "to-check-the-automation-practise;login;;1"
    },
    {
      "cells": [
        "testautomation@mailinator.com",
        "test@123"
      ],
      "line": 13,
      "id": "to-check-the-automation-practise;login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login",
  "description": "",
  "id": "to-check-the-automation-practise;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Automation"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch the website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to create an account",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "enter \"testautomation@mailinator.com\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user logout",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.customerWebsiteLaunch()"
});
formatter.result({
  "duration": 56900169800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.create_an_account()"
});
formatter.result({
  "duration": 1088450700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testautomation@mailinator.com",
      "offset": 7
    },
    {
      "val": "test@123",
      "offset": 43
    }
  ],
  "location": "LoginSteps.enter(String,String)"
});
formatter.result({
  "duration": 50101940800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"email\"}\n  (Session info: chrome\u003d88.0.4324.150)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.18363 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027INCHN-LAP1234\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_172\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: C:\\Users\\nandhini.r\\AppData...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 88.0.4324.150, webStorageEnabled: true}\nSession ID: 6b24d0e4a8c70e8d0d147491a0233341\n*** Element info: {Using\u003did, value\u003demail}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Spliterators$ArraySpliterator.forEachRemaining(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.ReduceOps$ReduceOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.collect(Unknown Source)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:480)\r\n\tat com.eComm.Utils.CommonActions.scrollToMakeElementVisible(CommonActions.java:171)\r\n\tat com.eComm.PageFunctions.LoginPageFunction.login(LoginPageFunction.java:31)\r\n\tat com.eComm.StepDefinitions.LoginSteps.enter(LoginSteps.java:21)\r\n\tat ✽.Given enter \"testautomation@mailinator.com\" and \"test@123\"(01_Tomato.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.userlogout()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Login",
  "description": "",
  "id": "to-check-the-automation-practise;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Automation"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "launch the website",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Select the category \"\u003cCategory\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "to-check-the-automation-practise;login;",
  "rows": [
    {
      "cells": [
        "Category",
        "TEst"
      ],
      "line": 22,
      "id": "to-check-the-automation-practise;login;;1"
    },
    {
      "cells": [
        "Dresses",
        "test@123"
      ],
      "line": 23,
      "id": "to-check-the-automation-practise;login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "Login",
  "description": "",
  "id": "to-check-the-automation-practise;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Automation"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "launch the website",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Select the category \"Dresses\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.customerWebsiteLaunch()"
});
formatter.result({
  "duration": 11790481900,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
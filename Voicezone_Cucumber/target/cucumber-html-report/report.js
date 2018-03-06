$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Voicezone_features/Sign_In.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "Voicezone",
  "description": "",
  "id": "voicezone",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "Voicezone",
  "description": "",
  "id": "voicezone;voicezone",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "\u003cFeature\u003e Get\"\u003cUsername\u003e\" and \"\u003cPassword\u003e\" and \"\u003cExe\u003e\" and \"\u003cBrowser\u003e\" and \u003ctimelim\u003e",
  "keyword": "Given "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "voicezone;voicezone;",
  "rows": [
    {
      "cells": [
        "Feature",
        "Username",
        "Password",
        "Exe",
        "Browser",
        "timelim"
      ],
      "line": 25,
      "id": "voicezone;voicezone;;1"
    },
    {
      "cells": [
        "NotifybyEmail",
        "NCSTest",
        "Password2013",
        "Yes",
        "Chrome",
        "80"
      ],
      "line": 26,
      "id": "voicezone;voicezone;;2"
    },
    {
      "cells": [
        "Voicetotext",
        "NCSTest",
        "Password2013",
        "Yes",
        "Chrome",
        "80"
      ],
      "line": 27,
      "id": "voicezone;voicezone;;3"
    },
    {
      "cells": [
        "Pinskip",
        "NCSTest",
        "Password2013",
        "Yes",
        "Chrome",
        "80"
      ],
      "line": 28,
      "id": "voicezone;voicezone;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "Voicezone",
  "description": "",
  "id": "voicezone;voicezone;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "NotifybyEmail Get\"NCSTest\" and \"Password2013\" and \"Yes\" and \"Chrome\" and 80",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "NCSTest",
      "offset": 18
    },
    {
      "val": "Password2013",
      "offset": 32
    },
    {
      "val": "Yes",
      "offset": 51
    },
    {
      "val": "Chrome",
      "offset": 61
    },
    {
      "val": "80",
      "offset": 73
    }
  ],
  "location": "NotifybyEmail.notifybyemail_Get_and_and_and_and(String,String,String,String,int)"
});
formatter.result({
  "duration": 410183169733,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cbutton type\u003d\"button\" class\u003d\"vs-btn btn\" style\u003d\"float:left; margin-left:10px;\" name\u003d\"btn...tolist\" id\u003d\"btnAddtolist\" onclick\u003d\"VoicemailSettingsActions.AddEmailNotification(this, {})\" data-initialvalue\u003d\"\"\u003eAdd\u003c/button\u003e is not clickable at point (823, 139). Other element would receive the click: \u003cdiv class\u003d\"modal-backdrop fade\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d64.0.3282.186)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 10.0.15063 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u0027BDC8-DX-3Z9QX52\u0027, ip: \u0027192.168.176.252\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.33.506120 (e3e53437346286..., userDataDir: C:\\Users\\SDF6B6~1.SAR\\AppDa...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 64.0.3282.186, webStorageEnabled: true}\nSession ID: 357daa1316943be9b49cf5b7e6d9776c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat Voicezone_StepDefinition.NotifybyEmail.add(NotifybyEmail.java:88)\r\n\tat Voicezone_StepDefinition.NotifybyEmail.notifybyemail_Get_and_and_and_and(NotifybyEmail.java:41)\r\n\tat ✽.Given NotifybyEmail Get\"NCSTest\" and \"Password2013\" and \"Yes\" and \"Chrome\" and 80(Voicezone_features/Sign_In.feature:22)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 27,
  "name": "Voicezone",
  "description": "",
  "id": "voicezone;voicezone;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "Voicetotext Get\"NCSTest\" and \"Password2013\" and \"Yes\" and \"Chrome\" and 80",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "NCSTest",
      "offset": 16
    },
    {
      "val": "Password2013",
      "offset": 30
    },
    {
      "val": "Yes",
      "offset": 49
    },
    {
      "val": "Chrome",
      "offset": 59
    },
    {
      "val": "80",
      "offset": 71
    }
  ],
  "location": "Voicetotext.Voicetotext_Get_and_and_and_and(String,String,String,String,int)"
});

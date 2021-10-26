#Autor: Zuly Mejia

@stories
Feature: Utest Academy
  As a user, I want to register on the Utest page.
  @scenario1
  Scenario: Registration on the Utest page
    Given than Zuly wants to sign up for Utest
    When she clicks on the join today option
    |strfirstname|strlastname|stremailadress             |strmonth|strday|stryear|strcity      |strzip|strcountry|strcomputer|strversion|strlanguage|strmobile|strmodel|strsystem  |strpassword|strlanguageuser|
    |Zuly        |Mejia      |zuly.mejia@unillanos.edu.co|November|8     |1998   |Villavicencio|500003|Colombia  |Windows    |10        |Spanish    |Huawei   |P30 lite|Android 10 |Utest123.. |Spanish        |
    Then she must fill out the form
    |strquestion              |
    |Welcome to the community!|

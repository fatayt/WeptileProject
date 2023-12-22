@weptile
Feature: US001 Quote

  Scenario: TC001 Get a Quote Now Positive test
  Given User goes to weptile site
  And Click on the testimonials section in the middle of the home page.
  And Click on the Get a Quote Now button.
  And User enters the required information
  And Click on CAPTCHA
  When Click on Send Message button
  Then Assert a message that the offer request has been sent

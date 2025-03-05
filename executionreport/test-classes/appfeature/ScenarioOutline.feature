Feature: Signup functionality
Scenario Outline: signup to application
Given user is at signup page
When user enters name as "<name>" on form
And user select gender as "<gender>"
And user select the slotnumber as <slotnumber>
Then user gets created

Examples:
| name | gender | slotnumber | browser |
| Eder | Male | 1 | chrome |
| Ron | Male | 2 | firefox|
| Diana | Female | 3 | edge |
| Alex | Male | 5 | opera |


Feature: ScoreMedia -League page 
  Then Login credential error message should be displayed

Background:
   Given I am landed on ScoreMedia app
  
    
  @tag6
 
  Scenario:User landing on his/her Fav leagues page and reading news about it
    When I click getStarted button
    Then I should be landed on ChooseYourLeagues page
    When I click on my FavLeague
    And I click the Continue button
    Then I should be landed on ChooseYourFavTeam page
    When I click on my FavTeam
    And I click the Continue button
   Then I should be landed on NeverMissAGame page
    When I click the Continue button
     And I clcik teh maybeLater for Email SignUp
    Then i should be lanaded on Team Player news page
    When I click the TeamLogo
    Then I should be landed on selectedTeamPage
    
    
    
  
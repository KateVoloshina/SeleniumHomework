Feature: Epam site

#script 1
    Scenario: Translate site page
        Given I'm in Epam site
        When I entered Global (en)
        And chose other language
        Then Site was translated

#script 2
    Scenario: Accept cookie
        Given I'm in Epam site
        When I was read message about analytic data
        And enter accept
        Then message dissapeared

#script 3
    Scenario: Watch video in site
        Given I'm in Epam site
        When I was slided main page down
        And clicked in video
        Then I watched short movie
    
#script 4-6
    Rule: Subscribing in only not blocked on our country social network
    
        Example: Subscribing to Epan group on "Facebook"
            Given I'm in Epam site
            When I was slided main page down
            And clicked in Facebook icon
            Then I got in Epam facebook page
            And subscribed in Epam group

        Example: No subscribing to Epan group in "Vkontakte"
            Given I'm in Epam site
            When I was slided main page down
            And see Vkontakte icon
            Then I didn't clicked in it

        Example: Subscribing to Epan group in "Instagram"
            Given I'm in Epam site
            When I was slided main page down
            And clicked in instagram icon
            Then I got in Epam instagram page
            And subscribed in Epam group

#script 7
    Scenario: Finding Epam office in Ukraine
        Given I'm in Epam site
        When I was slided main page down
        And clicked in "Europe"
        And clicked in right  button
        Then I find 5 Ukraine office

#script 8
    Scenario: Finding design section
        Given I'm in Epam site
        When I was slided main page down
        And I find design heading
        And  I clicked in it
        Then I got in design page
# Lost In The Woods
## Android application that is based on following ideas: 
#### Sometimes, at least in my experience, you may find yourself walking in a trail system where there is no map to base your journey off of. In this case, it is best to find a way to not get lost. What I do is keep a running tally in my head of the "choice" that I made when I arrived at a situation that I could take a left/right turn, or just continue forward. Then, once I reach the end of my journey, I reverse the order of this running tally and reverse the direction of each entry (besides forward). So, say the tally was LRLL. Then the reversed tally to take me home would be RRLR. While this is effective, the length of my journey is usually limited by the amount of choices that my brain can remember before jumbling everything and becoming lost. 
## How this app will assist with this process: 
#### This app will perform as follows: There will be a single activity/screen with a button for left, right, or straight, and a button that says "Take me home". Each time the user encounters a choice in the direction that they will take, they press the button that corresponds to the choice they made. Their choices will be saved. Once they select "Take me home", the directions will be reversed and the order of the list will also be reversed. This list will then be displayed in a new activity.
#### What follows below is an outline of the general plan for what's to come with this application: 

### To-Do:
- [x] Buttons on MainActivity
- [x] Open second activity once correct button is pressed
- [x] Display direction choices in second activity
- [x] Implement unit testing with Junit (or at least learn about junit and determine if it's applicable to this application)
- [ ] Add some style to the entire application
- [x] Add the ability to undo a button press
- [x] Add the ability to reset a 'journey' while within the app
- [ ] Use fragments to restructure the entire application in order to accomodate the next two objectives below
- [ ] Using SQLite, allow users to save, access, and delete journeys
- [ ] Using SQLite, allow users to add a tag and a note about a given saved journey
- [ ] Get screenshots and add to portfolio site
- [ ] Put app on the Google Play Store
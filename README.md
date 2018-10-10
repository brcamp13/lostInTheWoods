# lostInTheWoods
## My "Pilot" Android application is based on following ideas: 
#### Sometimes, at least in my experience, you may find yourself walking in a trail system where there is no map to base your journey off of. In this case, it is best to find a way to not get lost. What I do is keep a running tally in my head of the "choice" that I made when I arrived at a situation that I could take a left/right turn, or just continue forward. Then, once I reached the end of my journey, I reversed the order of this running tally and the direction of each entry in this running tally. So say the tally was LRLL. Then the reversed tally to take me home would be RRLR. While this is effective, the length of my journey is usually limited by the amount of choices that my brain can remember before jumbling everything and becoming lost. 
## How this app will assist with this process: 
#### This app will perform as follows: There will be a single activity/screen with a button for left, right, or straight, and a button that says "Take me home". Each time the user encounters a choice in the direction that they will take, they press the button that corresponds to the choice they made. Their choices will be saved. Once they select "Take me home", the directions will be reversed and the order of the list will also be reversed. This list will either be displayed as a scrollable or as a single direction at a time. 

### To-Do:
- [x] Buttons on MainActivity
- [x] Open second activity once correct button is pressed
- [ ] Display direction choices in second activity
- [ ] Add some style to the entire application
- [ ] Add the ability to undo a button press
- [ ] Add the ability to delete a 'journey' while within the app
### Future: 
- [ ] Create server + database and allow for creation of user accounts
- [ ] Allow users to save journeys
- [ ] Allow users to add a tag and a note about a given saved journey
- [ ] Provide an interface for all of the above that extends beyond the barebones application


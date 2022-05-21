# Directions

**Task:**

Create a dog class with actions and properties using JavaFX.

**Details:**
* Include a UML diagram instead of pseudocode for this assignment
* Name your variables appropriately using camelCase (Eg., zombieImage)
* Comment methods, and complex logic

## Assessment Levels

This assignment is divided into different levels. Start with the easier levels and work your way up. Make sure to include all elements listed.

### Developing
* Create a Dog class that with a constructor to change the size of the image
  * use the dogStand.png from the DogImages folder provided
* Add a  sit() method that changes the dog image to a sitting image
  * use the dogSit2.png from the DogImages folder provided
* Add a  bark() method that  writes the text on the screen "Ruff! Ruff!" right next to the dog image

***See D2L for example***


### Proficient
* Create a Dog class that with a constructor to change the size of the image
  * use the dogStand.png from the DogImages folder provided
* Add a  sit() method that changes the dog image to a sitting image
  * use the dogSit2.png from the DogImages folder provided
* Add a  bark() method that  writes the text on the screen "Ruff! Ruff!" right next to the dog image
  * Remove the text when the dog starts  moving
* Add a setX, setY, getX, and getY methods to be able to place the dog anywhere on the screen
* Add an event listener to the stage to make the dog sit when  the down arrow is pressed, and bark when the dog is clicked
* Add an event listener to the move the dog left or right if the arrow keys are pressed
  * Flip the image when the dog moves different  directions
  * Hint: Lookup ImageView.setScaleX()
 
***See D2L for example***
	

### Exemplary
* Create a Dog class that with a constructor to change the size of the image
  * use the dogStand.png from the DogImages folder provided
* Add a  sit() method that changes the dog image to a sitting image
  * use the dogSit2.png from the DogImages folder provided
* Add a  bark() method that  writes the text on the screen "Ruff! Ruff!" right next to the dog image.
  * Remove the text when the dog starts  moving
* Add a setX and setY method to be able to place the dog anywhere on the screen
* Add an event listener to the stage to make the dog sit when  the down arrow is pressed, and bark when the dog is clicked
* Add an event listener to the move the dog left or right if the arrow keys are pressed
  * Use the walking or running animations  in the dogImages folder to  animate the dog's movements
* Create a collision event to allow the dog to collect dog biscuits. Create a counter on the stage to keep track of the biscuits collected
  * use the biscuit.png from the DogImages folder provided
  * Hint: Lookup bounds, intersects, and  BoundingBox  for collisions
 
***See D2L for example***
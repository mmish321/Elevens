# Activity 2 : Initial Design of a Deck Class  

## Exercises  
1. Finished Constructor and other methods.  
2. Tested all the methods, created a deck, called, isEmpty, size, and deal  


## Questions  
1. A card is an object and a deck is an object defined as being made up of a group of cards. The two are seperate objects but deck is made of of another object, it is a composite relationship as a deck HAS - A card.      
2. 6 Cards  :  
Jack of blue (point value = 11)   
queen of blue (point value = 12)  
king of blue (point value = 13)  
Jack of red (point value = 11)  
queen of red (point value = 12)   
king of red (point value = 13)    

3. String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}  , String[] suits = {"spades", "heart", "clubs", "diamond"}  , int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11}  
It should be noted that another correct way would be reversing the order of the ranks and value arrays. It's the same thing.    

4. Yes, because when you loop through the arrays in the constructor, it bases it off the order that is passed in, so if the order of the arrays is not correct, the cards will not be correctly formatted. 

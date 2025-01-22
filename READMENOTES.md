Notes for where in the code to find the changes I made
Including prompt, file name, line number, and change made.

1. All changes made in mainscreen.html
1. L14: "My Chair shop"
2. L19: "Chair Shop"
3. L21: "Chair Parts"

Added an “About” page to the application to describe your chosen customer’s company 
to web viewers and include navigation to and from the “About” page and the main screen.

1. Created aboutpage.html
2. aboutpage.html: L1-12: adopted the bootstrap and initial settings of the mainscreen html to maintain a similar style.
3. aboutpage.html: L13-34: Created the style for html which includes:
   4. aboutpage.html:  L14-18: Header styling: adds the color brown, makes padding 30px, and text aligns center
   5. aboutpage.html:  L19-23: body styling: creates the font family and adds padding and margins both at 10px
   6. aboutpage.html:  L24-27: H2 styling: adds saddlebrown color, and text aligns center.
   7. aboutpage.html:  L28-30: Paragraph styling: text aligns center
   8. aboutpage.html:  L31-33: Nav styling for the link to home page: text aligns center.
9. aboutpage.html:  L37-39: Add's a header "welcome to the chair store"
10. aboutpage.html:  L41-47: creates a div container with the body of the text which has an about us section filled with puns
11. aboutpage.html:  L48-50: add's a nav element that contains the link to the homepage.
12. Mainscreen.html: L162-165: adds a nav element and a link to the about us page.


13. Created a Java file within controller to create a controller for the aboutpage file
14. aboutController: L1-4: are autopopulated imports and packages from the creation of hte file and using @Controller
15.  aboutController: L6:Uses the annotation @Controller to indicate to spring that this is a controller class
16.  aboutController: L7:instantiates the aboutController class
17.  aboutController: L8:Uses the annotation @GetMapping to allow it to connect the template and URL 
18.  aboutController: L9-10:A function to return the aboutpage to the viewer.

Added a sample inventory to the application.

1. BootStrapData.java: L59: if statement that ensures the sample inventory is not added again every time that the page is refreshed or the app is rerun.
2. BootStrapData.java: L60: note for first object
3. BootStrapData.java: L61: created outsourcedpart object o for my first part
4. BootStrapData.java: L62: set the Company name
5. BootStrapData.java: L63: set the name
6. BootStrapData.java: L64 set the inventory
7. BootStrapData.java: L65 set the price
8. BootStrapData.java: L66 set the id
9. BootStrapData.java: L67 saved the object to the outsourcedpartrepository
10. BootStrapData.java: L68 set the variable thePart to null
11. BootStrapData.java: L69 created a list of type outsourcedpart called outsourcedparts
12. BootStrapData.java: L70 made a for loop where if part == outsourced parts maintains loop
13. BootStrapData.java: L71 if statement that is the part name is equal to "seat" it sets thePart to that part
14. BootStrapData.java: L72 ends for loop
15. BootStrapData.java: L74 prints the company name
16. BootStrapData.java: L76 starts for loop where if part equals outsourcedParts maintains the loop
17. BootStrapData.java: L77 prints the part name and company name
18. BootStrapData.java: L78 ends for loop
19. BootStrapData.java: L80 note for second part
20. BootStrapData.java: L81 created outsourcedpart object p for my first part
21. BootStrapData.java: L82: set the Company name
22. BootStrapData.java: L83: set the name
23. BootStrapData.java: L84 set the inventory
24. BootStrapData.java: L85 set the price
25. BootStrapData.java: L86 set the id
26. BootStrapData.java: L87 saved the object to the outsourcedpartrepository
27. BootStrapData.java: L89 made a for loop where if part == outsourced parts maintains loop
28. BootStrapData.java: L90 if statement that is the part name is equal to "legs" it sets thePart to that part
29. BootStrapData.java: L91 ends for loop
30. BootStrapData.java: L93 prints the company name
31. BootStrapData.java: L95 starts for loop where if part equals outsourcedParts maintains the loop
32. BootStrapData.java: L96 prints the part name and company name
33. BootStrapData.java: L97 ends for loop
34. BootStrapData.java: L99: note for third object
35. BootStrapData.java: L100: created outsourcedpart object q for my first part
36. BootStrapData.java: L101: set the Company name
37. BootStrapData.java: L102: set the name
38. BootStrapData.java: L103 set the inventory
39. BootStrapData.java: L104 set the price
40. BootStrapData.java: L105 set the id
41. BootStrapData.java: L106 saved the object to the outsourcedpartrepository
42. BootStrapData.java: L108 made a for loop where if part == outsourced parts maintains loop
43. BootStrapData.java: L109 if statement that is the part name is equal to "Arm Rests" it sets thePart to that part
44. BootStrapData.java: L110 ends for loop
45. BootStrapData.java: L112 prints the company name
46. BootStrapData.java: L114 starts for loop where if part equals outsourcedParts maintains the loop
47. BootStrapData.java: L115 prints the part name and company name
48. BootStrapData.java: L116 ends for loop
49. BootStrapData.java: L118: note for fourth object
50. BootStrapData.java: L119: created outsourcedpart object r for my first part
51. BootStrapData.java: L120: set the Company name
52. BootStrapData.java: L121: set the name
53. BootStrapData.java: L122 set the inventory
54. BootStrapData.java: L123 set the price
55. BootStrapData.java: L124 set the id
56. BootStrapData.java: L125 saved the object to the outsourcedpartrepository
57. BootStrapData.java: L127 made a for loop where if part == outsourced parts maintains loop
58. BootStrapData.java: L128 if statement that is the part name is equal to "Back Rests" it sets thePart to that part
59. BootStrapData.java: L129 ends for loop
60. BootStrapData.java: L131 prints the company name
61. BootStrapData.java: L133 starts for loop where if part equals outsourcedParts maintains the loop
62. BootStrapData.java: L134 prints the part name and company name
63. BootStrapData.java: L135 ends for loop
64. BootStrapData.java: L137: note for fifth object
65. BootStrapData.java: L138: created outsourcedpart object s for my first part
66. BootStrapData.java: L139: set the Company name
67. BootStrapData.java: L140: set the name
68. BootStrapData.java: L141 set the inventory
69. BootStrapData.java: L142 set the price
70. BootStrapData.java: L143 set the id
71. BootStrapData.java: L144 saved the object to the outsourcedpartrepository
72. BootStrapData.java: L146 made a for loop where if part == outsourced parts maintains loop
73. BootStrapData.java: L147 if statement that is the part name is equal to "Arm Rests" it sets thePart to that part
74. BootStrapData.java: L148 ends for loop
75. BootStrapData.java: L150 prints the company name
76. BootStrapData.java: L152 starts for loop where if part equals outsourcedParts maintains the loop
77. BootStrapData.java: L153 prints the part name and company name
78. BootStrapData.java: L154 ends for loop
79. BootStrapData.java: L156 ends if statement
80. BootStrapData.java: L163 creates if statement to not add extra products when the page is reloaded or the app is rerun
81. BootStrapData.java: L164 creates a product object and constructs it with initial values
82. BootStrapData.java: L165 creates a product object and constructs it with initial values
83. BootStrapData.java: L166 creates a product object and constructs it with initial values
84. BootStrapData.java: L167 creates a product object and constructs it with initial values
85. BootStrapData.java: L168 creates a product object and constructs it with initial values
86. BootStrapData.java: L169 Saves the object to product repository
87. BootStrapData.java: L170 Saves the object to product repository
88. BootStrapData.java: L171 Saves the object to product repository
89. BootStrapData.java: L172 Saves the object to product repository
90. BootStrapData.java: L173 Saves the object to product repository
91. BootStrapData.java: L174 ends if statement

Added a “Buy Now” button to your product list.
•  The “Buy Now” button is next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

1. Created PurchaseSuccessful.html
2. created PurchaseFailed.html
3. mainscreen.html: L85: Creates a button next to update and delete buttons that is linked to the addproduct  controller
4. PurchaseSuccessful.html: L1-8: The normal head info that is on all the html pages
5. PurchaseSuccessful.html: L10: made title for page
6. PurchaseSuccessful.html: L11-24: adds style to the HTML page (text centering, padding, and margins)
7. PurchaseSuccessful.html: L25: ends head
8. PurchaseSuccessful.html: L26: starts body
9. PurchaseSuccessful.html: L27: starts header
10. PurchaseSuccessful.html: L28: makes header title stating purchase successful
11. PurchaseSuccessful.html: L29: ends header
12. PurchaseSuccessful.html: L31 & 39: starts and ends div container
13. PurchaseSuccessful.html: L32: heading that states purchase was successful
14. PurchaseSuccessful.html: L33: Paragraph that says congrats on purchase
15. PurchaseSuccessful.html: L34: Paragraph that informs of the decrementation of the stock
16. PurchaseSuccessful.html: L36 & 39: starts and ends nav container
17. PurchaseSuccessful.html: L37-38: link to mainscreen
18. PurchaseFailed.html: L1-8: The normal head info that is on all the html pages
19. PurchaseFailed.html: L10: made title for page
20. PurchaseFailed.html: L11-24: adds style to the HTML page (text centering, padding, and margins)
21. PurchaseFailed.html: L25: ends head
22. PurchaseFailed.html: L26 starts body
23. PurchaseFailed.html: L27 starts header
24. PurchaseFailed.html: L28 Makes header title stating the purchase failed
25. PurchaseFailed.html: L29 ends header
26. PurchaseFailed.html: L31 & 36 starts and ends the div container
27. PurchaseFailed.html: L32 heading that states the purchase was unsuccessful
28. PurchaseFailed.html: L33 Paragraph that states taht something went wrong with the purchase
29. PurchaseFailed.html: L34 Paragraph that states the product may no longer be in stock
30. PurchaseFailed.html: L35 Paragraph taht states to check the inventory of the product
31. PurchaseFailed.html: L37 & 40 starts and ends the nav container
32. PurchaseFailed.html: L38 & 39: link to main screen
33. AddProductController.java: L179: annotated with @GetMapping to link to /addproduct
34. AddProductController.java: L180: creates an add product method with 2 parameters
35. AddProductController.java: L181: creates a ProductService object to update the productrepo
36. AddProductController.java: L182: creates a Product object and sets it equal to the product ID
37. AddProductController.java: L184: if statement that checks the inventory status is above 0
38. AddProductController.java: L185: return statement that directs to PurchaseFailed.html
39. AddProductController.java: L186 ends if
40. AddProductController.java: L187: starts else statement
41. AddProductController.java: L188: decrements the product inventory
42. AddProductController.java: L189: saves the inventory through productservice to product repo
43. AddProductController.java: L191: return that directs you to confirmation page purchaseSuccessful.html
44. AddProductController.java: L193: ends else statement

Modified the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

1. part.java: L4 & 5: imported my min and max validators
2. part.java: L33: adds a @min annotation to notify the inventory is below minimum if below zero
3. part.java: L35 & 37 adds annotation for my valid min and max entry validators
4. part.java: L36 & 38 declares the min and max variables for inventory
5. part.java: L60-67: creates a constructor that accepts max and min inventory levels
6. part.java: L69: declares a new method to check  if the inventory is valid
7. part.java: L70: starts an if statement checking that the inputted inventory is between the min and max
8. part.java: L71-76: returns true if within min and max inventory and false if not
9. part.java: L78: getter for min inv
10. part.java:L79: setter for min inv
11. part.java:L80 getter for max inv
12. part.java:L81: seter for max inv
13. bootstrapdata.java: L67 & 68: sets the sample inventory for part 1 to have an initial max and min inventory 
14. bootstrapdata.java: L89 & 90: sets the sample inventory for part 2 to have an initial max and min inventory 
15. bootstrapdata.java: L110 & 111: sets the sample inventory for part 3 to have an initial max and min inventory
16. bootstrapdata.java: L131 & 132: sets the sample inventory for part 4 to have an initial max and min inventory
17. bootstrapdata.java: L152 & 153: sets the sample inventory for part 5 to have an initial max and min inventory
18. inhousepartform.html: L26: adds a text input box for min inventory
19. inhousepartform.html: l27 adds a connection to the min inventory error
20. inhousepartform.html: L28 adds a text input box for max inventory
21. inhousepartform.html: L29 adds a connection to the max inventory error
22. outsourcedpartform.html: L26: adds a text input box for min inventory
23. outsourcedpartform.html: l27 adds a connection to the min inventory error
24. outsourcedpartform.html: L28 adds a text input box for max inventory
25. outsourcedpartform.html: L29 adds a connection to the max inventory error
26. application.properties: L6: renamed the database used to database-for-d287
27. addinhousepartcontroller.java: L43-45: adds an if statement to the existing function to check if the set inventory is within the set range using my function made in parts.java
28. addoutsourcedpartcontroller.java: L43-46: adds an if statement ot the existing function to check if the set inventory is within the set range using my function made in parts.java
29. Created MaxValidator.java: to make custom validations to alert if entries are not within desired specifications
30. MaxValidator.java: L1-8: imported data for the validator
31. MaxValidator.java: L9: declares a max validator class
32. MaxValidator.java: L10-13: annotations and variable declarations
33. MaxValidator.java: L14-16: method to initilize (from the netbeans video)
34. MaxValidator.java: L17-24: and override method to check if the context of the max inv is above zero and if not it sets an alert that the max inventory must be above 0
35. Created MinValidator.java: to make custom validation to alert if entries are not wihtin desired specifications
37. minValidator.java: L1-8: imported data for the validator
31. minValidator.java: L9: declares a min validator class
32. minValidator.java: L10-13: annotations and variable declarations
33. minValidator.java: L14-16: method to initilize (from the netbeans video)
34. minValidator.java: L17-24: and override method to check if the context of the min inv is above zero and if not it sets an alert that the max inventory must be above 0
35. Created validMaxEntry.java: to display an error message if the max entry is not within specs
36. validMaxEntry.java: L1-9 imported data
37. validMaxEntry.java: L10: sets a contraint that it is validated by the maxValidator.java
38. validMaxEntry.java: L11-12: sets the target to the max inv text box and for the validator to run at runtime
39. validMaxEntry.java: L13: creates a interface function 
40. validMaxEntry.java: L14-17: sets the message to be displayed in case of an error
41. Created validMinEntry.java: to display an error message if the min entry is not within specs
36. validMaxEntry.java: L1-9 imported data
37. validMaxEntry.java: L10: sets a contraint that it is validated by the minValidator.java
38. validMaxEntry.java: L11-12: sets the target to the min inv text box and for the validator to run at runtime
39. validMaxEntry.java: L13: creates a interface function
40. validMaxEntry.java: L14-17: sets the message to be displayed in case of an error

Added validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.
. for the error message on the product page:
   3. EnufPartsValidator.java: L37: Adds an if statement that checks if the desired inventory increase will put the part below its minimum parts inventory and return false if so
   4. ValidEnufParts.java: L20: Alters the message to include the message that the user is attempting to add inventory that puts the part below the set minimum inventory.

Added at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

1. PartTest.java: L30: annotate test to declare a unit test
2. PartTest.java: L31: declare a getmaxInv test
3. PartTest.java: L32: declare a variable for maxinv set to 5
4. PartTest.java: L33: set the partIn using setMaxInv to my new variable
5. PartTest.java: L34: use assertEquals to ensure they match up
6. PartTest.java: L35: set partout using setmaxinv to my new variable
7. PartTest.java: L36: use assertEquals to ensure they match up
8. PartTest.java: L37: end unit test
9. PartTest.java: L38: annotate test to declare a unit test
10. PartTest.java: L39: declare a setmaxInv test
11. PartTest.java: L40: declare a variable for maxinv set to 5
12. PartTest.java: L41: set the partIn using setMaxInv to my new variable
13. PartTest.java: L42: use assertEquals to ensure they match up
14. PartTest.java: L43: set partout using setmaxinv to my new variable
15. PartTest.java: L44: use assertEquals to ensure they match up
16. PartTest.java: L45: end unit test 
17. PartTest.java: L46: annotate test to declare a unit test
10. PartTest.java: L47: declare a getminInv test
11. PartTest.java: L48: declare a variable for mininv set to 0
12. PartTest.java: L49: set the partIn using setMinInv to my new variable
13. PartTest.java: L50: use assertEquals to ensure they match up
14. PartTest.java: L51: set partout using setmininv to my new variable
15. PartTest.java: L52: use assertEquals to ensure they match up
16. PartTest.java: L53: end unit test
17. PartTest.java: L54: annotate test to declare a unit test
10. PartTest.java: L55: declare a setminInv test
11. PartTest.java: L56: declare a variable for mininv set to 0
12. PartTest.java: L57: set the partIn using setMinInv to my new variable
13. PartTest.java: L58: use assertEquals to ensure they match up
14. PartTest.java: L59: set partout using setmininv to my new variable
15. PartTest.java: L60: use assertEquals to ensure they match up
16. PartTest.java: L61: end unit test

Remove the class files for any unused validators
1. Deleted DeletePartValidator.java because it was unused.
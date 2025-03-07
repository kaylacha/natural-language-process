# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram!

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get display on this README.

![UML Diagram for my project](UML.png)

## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

[![Code Video](nameOfThumbnail.png)](https://drive.google.com/file/d/1fR5q17l6ISxBZa9Lg1_rTYr_4tppB2kb/view?usp=sharing)

## Project Description

Write a description of the goal and/or problem that your application. Include descriptions of what text is being analyzed, either if its text files you are using to interpret text an how the user interacts with your project.

My application gives LAUSD students their own unique email. The base of the username is written based on the studen't first letter of their first name plus their last name. If there are multiple of the username base, the four digit number in the email starting from 0001 increases by 1. The text file of student names at a school are analyzed. In order to establish one's own email, the app allows users to input their first and last name to be given a unique LAUSD email.

## NLP Techniques

Write a description of what natural lanugage technique (NLP) you implemented in your project. State which methods in your project are associated with this, and a brief explanation of how those methods word and how they are necessary in the NLP technique.

My project uses NLP methods in order to split and find names. To accomplish this, I utilized the substring and split method. To compare the number of letters in a word, I implemented the equals method. Lastly, in order to have all emails come out in lower case, I used the toLowerCase method. This was all necessary to have the names be transformed into emails exactly the way LAUSD does it. My code checks for the frequency for the username bases by traversing through students.txt.
# The Script Element

HTML defines the structure of a web page by using page elements as the building blocks. However, HTML by itself can not produce web page interactivity, that's where JavaScript comes in.

Web programmers use JavaScript to make web pages dynamic and interactive. This powerful scripting language is encapsulated in its own HTML element: the <script> element. You can think of this <script> element as the door to JavaScript for HTML. This lesson will dig deeper into what the <script> element can do for your websites and best practices on how and where to insert JavaScript in your HTML files.

## Your Tasks

### Getting Started

This assignment will follow the same workflow as the last assignment.  You will begin by making a new assignment directory within which you will create an index.html file and a app.js file.  

- [ ] First create a new folder on your computer called TheScriptElement.  Then, open the folder in VS Code.

- [ ] Add an index.html file to this folder,  

### The <script> tag

The <script> element allows you to add JavaScript code inside an HTML file. Below, the <script> element embeds valid JavaScript code:

```
<h1>This is an embedded JS example</h1>
<script>
  function Hello()
    {
    alert ( "Hello World");
    }
</script>
```

Frankly, without the <script> tag, websites would be unclickable and a bit boring.

The <script> element, like most elements in HTML, has an opening and closing angle bracket. The closing tag marks the end of the content inside of the <script> element. Just like the <style> tag used to embed CSS code, you use the <script> tag to embed valid JavaScript code.

- [ ] Download and save the following images into your assignment directory, 

	- [https://github.com/hpluska/TimberlineCS/blob/master/AdvCSAssignments/JavaScriptInteractive/TheScriptElement/burger.png](https://github.com/hpluska/TimberlineCS/blob/master/AdvCSAssignments/JavaScriptInteractive/TheScriptElement/burger.png)

	- [https://github.com/hpluska/TimberlineCS/blob/master/AdvCSAssignments/JavaScriptInteractive/TheScriptElement/normal.jpg](https://github.com/hpluska/TimberlineCS/blob/master/AdvCSAssignments/JavaScriptInteractive/TheScriptElement/normal.jpg)

- [ ] Copy and paste the following code into index.html page, 

```
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css">
</head>
  
<body>
	<section class = "container">
  	<img src = "normal.jpg" id= "myImage">
  	<p onclick="food()">Click Me</p>
	</section>
</body>
  
<script>
  
</script>
  
</html>
```

- [ ] Copy this JavaScript code and paste it between the opening and closing <script> tags.

```
function food() {
      var image = document.getElementById('myImage');
      if(image.src.match("normal")) {
          image.src = "burger.png";
      } else {
          image.src = "normal.jpg";
      }
  } 
 
```
- [ ] Save everything, then open your index.html page in your browswer.  See what happens when you click the "click me" text

### The src attribute

Since you know how to use a <script> element with embedded code, let's talk about linking code. Linking code is preferable because of a programming concept called Separation of Concerns (SoC). Instead of having messy code that is all in the same file, web developers separate their code into different files, making each “concern” easier to understand and more convenient when changes must be made.

For this exercise, instead of writing JavaScript in our HTML file, we are going to write it in its own file, and then reference this code with a file path name. We will do this using an attribute that may jog your memory: the src attribute!

If this seems familiar, that's because you may have been linking to external files with the <img> and <link> elements. The attribute is exactly the same, but now its value specifies the location of your script file.

If the file is in the same project folder, the src value will be a relative path name. Below is an example of a relative pathname to a JavaScript file.

```
<script src=/exampleScript.js> </script>
```

If you must refer to JavaScript hosted externally, or in a CDN, you can also link to that file location

- [ ] Add an empty <script> element to index.html.

```
<script></script>
```

- [ ] Add an empty src attribute to the opening tag of your <script> element

```
<script src=" "> </script>
```

- [ ] Create a new file called script.js and save this to your assignment directory.  Copy and paste the code below into this file. 

```
function blooming() {
      var image = document.getElementById('myImage');
      if(image.src.match("normal")) {
          image.src = "burger.png";
      } else {
          image.src = "normal.jpg";
      }
  }
```

- [ ] Make the src reference point to the script.js file you just created.

- [ ] Save everything and reload your index.html file... everything should as before. 

### How are scripts loaded?

A quick recap: the <script> element allows HTML files to load and execute JavaScript. The JavaScript can either go embedded inside of the <script> tag or the script tag can reference an external file. Before we dive deeper, let’s take a moment to talk about how browsers parse HTML files into web pages. This informs where to include a <script> element inside your HTML file.

Browsers come equipped with HTML parsers that help browsers render the elements accordingly. Elements, including the <script> element, are by default, parsed in the order they appear in the HTML file. When the HTML parser encounters a <script> element, it loads the script then executes its contents before parsing the rest of the HTML. The two main points to note here are that:

The HTML parser does NOT process the next element in the HTML file until it loads and executes the <script> element, thus leading to a delay in load time and resulting in a poor user experience.
Additionally, scripts are loaded sequentially, so if one script depends on another script, they should be placed in that very order inside the HTML file.

- [ ] Click on the link below to open a GIF

	- [https://github.com/hpluska/TimberlineCS/blob/master/AdvCSAssignments/JavaScriptInteractive/TheScriptElement/ScriptNoAttribute.gif](https://github.com/hpluska/TimberlineCS/blob/master/AdvCSAssignments/JavaScriptInteractive/TheScriptElement/ScriptNoAttribute.gif)

Notice, the GIF displays two scripts being loaded. The first script makes a Watering Can appear, the second script makes a Flower appear. This shows how scripts are loaded sequentially, and how they pause the HTML parser, which is why "Blooming" appears at the end.

### Defer attribute

When the HTML parser comes across a <script> element, it stops to load its content. Once loaded, the JavaScript code is executed and the HTML parser proceeds to parse the next element in the file. This can result in a slow load time for your website. HTML4 introduced the defer and async attributes of the <script> element to address the user wait-time in the website based on different scenarios.

The defer attribute specifies scripts should be executed after the HTML file is completely parsed. When the HTML parser encounters a <script> element with the defer attribute, it loads the script but defers the actual execution of the JavaScript until after it finishes parsing the rest of the elements in the HTML file.

Here is an example of the defer tag:

```
<script src="example.js" defer> </script>
```

When is defer useful?

When a script contains functionality that requires interaction with the DOM, the defer attribute is the way to go. This way, it ensures that the entire HTML file has been parsed before the script is executed.

- [ ] Add the following files to your main assignment directory, 

	- [https://github.com/hpluska/TimberlineCS/blob/master/AdvCSAssignments/JavaScriptInteractive/TheScriptElement/turnBlue.js](https://github.com/hpluska/TimberlineCS/blob/master/AdvCSAssignments/JavaScriptInteractive/TheScriptElement/turnBlue.js)
	- [https://github.com/hpluska/TimberlineCS/blob/master/AdvCSAssignments/JavaScriptInteractive/TheScriptElement/turnYellow.js](https://github.com/hpluska/TimberlineCS/blob/master/AdvCSAssignments/JavaScriptInteractive/TheScriptElement/turnYellow.js)

- [ ] Cut and paste the following code into your index.html file, 

```
<!DOCTYPE html> 
<html>
 
  <head>
    <link rel="stylesheet" href="style.css">
    <script id="blue" src="turnBlue.js"></script>
  <script id="yellow" src="turnYellow.js"></script>
  </head>
  
  <body>		
   	<p class="centered" id="logo">Code is Lit</p>
  </body>
</html>
```
- [ ] We want the "Code is Lit" to be blue! Add a defer attribute to the turnBlue.js script to make it the last script that is downloaded and executed.

### Async attribute

The async attribute loads and executes the script asynchronously with the rest of the webpage. This means that, similar to the defer attribute, the HTML parser will continue parsing the rest of the HTML as the script is downloaded in the background. However, with the async flag, the script will not wait until the entire page is parsed: it will execute immediately after it has been downloaded. Here is an example of the async tag:

```
<script src="example.js" async> </script>
```

When is it useful?

Async is useful for scripts that are independent of other scripts in order to function accordingly. Thus, if it does not matter exactly at which point the script file is executed, asynchronous loading is the most suitable option as it optimizes web page load time.

- [ ] Each script tag restyles the "Code is lit" text. Add async attribute to both the turnBlue script and the turnYellow script.  Refresh the page multiple times. Notice the color of the text after each refresh. 





### The .pop() Method

Another array method, .pop(), removes the last item of an array.

```
const newItemTracker = ['item 0', 'item 1', 'item 2'];

const removed = newItemTracker.pop();

console.log(newItemTracker); 
// Output: [ 'item 0', 'item 1' ]
console.log(removed);
// Output: item 2
```
- In the example above, calling .pop() on the newItemTracker array removed item 2 from the end.
- pop() does not take any arguments, it simply removes the last element of newItemTracker.
- pop() returns the value of the last element. In the example, we store the returned value in a variable removed to be used for later.
- pop() is a method that mutates the initial array.

When you need to mutate an array by removing the last element, use .pop().

- [ ] Copy and paste the code below into your app.js file, 

```
const chores = ['wash dishes', 'do laundry', 'take out trash', 'cook dinner', 'mop floor'];
```
Use the .pop() method to remove the last element from chores.

- [ ] log chores to the console to make sure it worked.

### More Array Methods

There are many more array methods than just .push() and .pop(). You can read about all of the array methods that exist on the [Mozilla Developer Network (MDN) array documentation](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array).

.pop() and .push() mutate the array on which they're called. However, there are times that we don't want to mutate the original array and we can use non-mutating array methods. Be sure to check MDN to understand the behavior of the method you are using.

Some arrays methods that are available to JavaScript developers include: .join(), .slice(), .splice(), .shift(), .unshift(), and .concat() amongst many others. Using these built-in methods make it easier to do some common tasks when working with arrays.

Below, we will explore some methods that we have not learned yet. We will use these methods to edit a grocery list. As you complete the steps, you can consult the MDN documentation to learn what each method does!

- [ ] Copy and paste the code below into your app.js file, 

```
const groceryList = ['orange juice', 'bananas', 'coffee beans', 'brown rice', 'pasta', 'coconut oil', 'plantains'];
```

Use the .shift() method to remove the first item from the array groceryList.

Log the new groceryList to the console.

- [ ] Under the code added in step 1, use the .unshift() method to add 'popcorn' to the beginning of your grocery list.

After calling .unshift() on groceryList, log groceryList to the console.

- You're in a hurry so you decide to ask a friend to help you with your grocery shopping. You want him to pick up the 'bananas', 'coffee beans', and 'brown rice'.

Under the code you added for step 2, use .slice() to provide your friend with a list of these three things.

Log this part of the list to the console. Unlike the two previous checkpoints, you should do both of these steps in one line.

- [ ] After calling .slice() on groceryList, log the grocery list to the console one more time.

Notice that the groceryList array still contains the same items it had in Step 2. That means .slice() is non-mutating! 

- [ ] Let's find the index of a particular element in groceryList using .indexOf().

Call .indexOf() on groceryList to find the index of the element 'pasta' and save the returned value to a const variable named pastaIndex.

Then log pastaIndex to the console. 

### Arrays and Functions

Throughout the lesson we went over arrays being mutable, or changeable. Well what happens if we try to change an array inside a function? Does the array keep the change after the function call or is it scoped to inside the function?

Take a look at the following example where we call .push() on an array inside a function. Recall, the .push() method mutates, or changes, an array:

```
const flowers = ['peony', 'daffodil', 'marigold'];

function addFlower(arr) {
  arr.push('lily');
}

addFlower(flowers);

console.log(flowers); // Output: ['peony', 'daffodil', 'marigold', 'lily']
```
Let's go over what happened in the example:

- The flowers array that has 3 elements.
- The function addFlower() has a parameter of arr uses .push() to add a 'lily' element into arr.
- We call addFlower() with an argument of flowers which will execute the code inside addFlower.
- We check the value of flowers and it now includes the 'lily' element! The array was mutated!

So when you pass an array into a function, if the array is mutated inside the function, that change will be maintained outside the function as well. You might also see this concept explained as pass-by-reference since what we're actually passing the function is a reference to where the variable memory is stored and changing the memory.

- Copy and paste the code below into your app.js file, 

```
const concept = ['arrays', 'can', 'be', 'mutated'];

function changeArr(arr){
  arr[3] = 'MUTATED';
}

changeArr(concept);
```
Underneath the function call, log concept to the console to check if this reassignment mutated the array.

- [ ] Let's double check what happens if we mutate an array using a built-in method inside a function.

Under the console.log() statement, define another function named removeElement that takes a parameter of newArr. Inside the function body call .pop() on newArr.

- [ ] Call removeElement() with an argument of concept.

- [ ] After calling removeElement(concept), check the value of concept by logging it to console.

Notice that in both cases, the change to the array was maintained outside of the function!

### Nested Arrays

Earlier we mentioned that arrays can store other arrays. When an array contains another array it is known as a nested array. Examine the example below:

```
const nestedArr = [[1], [2, 3]];
```
To access the nested arrays we can use bracket notation with the index value, just like we did to access any other element:

```
const nestedArr = [[1], [2, 3]];

console.log(nestedArr[1]); // Output: [2, 3]
```
Notice that nestedArr[1] will grab the element in index 1 which is the array [2, 3]. Then, if we wanted to access the elements within the nested array we can chain, or add on, more bracket notation with index values.

```
const nestedArr = [[1], [2, 3]];

console.log(nestedArr[1]); // Output: [2, 3]
console.log(nestedArr[1][0]); // Output: 2
```

In the second console.log() statement, we have two bracket notations chained to nestedArr. We know that nestedArr[1] is the array [2, 3]. Then to grab the first element from that array, we use nestedArr[1][0] and we get the value of 2.

- [ ] Let's make a nested array! Create a variable numberClusters. Assign as its value an array with three array elements.

- The first array element should hold the elements 1 and 2 in that order.
- The second array element should hold the elements 3 and 4 in that order.
- The third array element should hold the elements 5 and 6 in that order.

- [ ] Awesome, you made a nested array! Now declare a variable named target using the const keyword and assign to access the element 6 inside numberClusters.

### Secret Message

Using array methods, you will transform an array of strings into a secret message!

You should consult the [Mozilla Developer Network (MDN)](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array) for reference on any method with which you are not familiar.

- [ ] To get started copy and paste the code below into your app.js file, 

```
let secretMessage = ['Learning', 'is', 'not', 'about', 'what', 'you', 'get', 'easily', 'the', 'first', 'time,', 'it', 'is', 'about', 'what', 'you', 'can', 'figure', 'out.', '-2015,', 'Chris', 'Pine,', 'Learn', 'JavaScript'];
```
Use an array method to remove the last string of the array secretMessage.

You can check your work by logging the .length of the array. At this point, the length should be 1 less than the original length.

- [ ] Use an array method to add the words 'to' and 'Program' as separate strings to the end of the secretMessage array.

- [ ] Change the word 'easily' to the word 'right' by accessing the index and replacing it.

- [ ] Use an array method to remove the first string of the array.

- [ ] Use an array method to add the string Programming to the beginning of the array.

- [ ] Use an array method to remove the strings 'get', 'right', 'the', 'first', 'time', and replace them with the single string 'know'.

- [ ] On one line, use console.log() and .join() to print the secret message as a sentence.

### Get credit for this assignment

- [ ] Once you have completed all of the above, have Ms. Pluska mark this assignment complete. 












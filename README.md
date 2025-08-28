# Java Upskilling Training notes

## Switch Statement
* The switch statement in Java is a control flow statement that allows you to execute one block of code among many based on the value of an expression. It is an alternative to the if-else-if ladder and provides a more readable and efficient way to handle multiple conditions.

## JUnits testing
### 1st Version
```
    @Test
    @DisplayName("")
    public void nameOfMethod(){
        // Arrange
        int time = 21;
        String expected = "Good evening";
        // Act
        String actual = App.getGreeting(time);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
```
### 2nd Version
```
    @ParameterizedTest
    @CsvSource({
            "What you're expecting, 2",
            "What you're expecting, 8",
            "What you're expecting, 15",
            "What you're expecting, 21"
    })
    public void nameOfMethod(String expected,int time){
        Assertions.assertEquals(expected, App.getGreeting(time));
    }
```

### 3rd Version
```
    @ParameterizedTest
    @ValueSource(ints = {19, 23}) // this is where you put the range/boundaries
    @DisplayName("getGreeting, when a given time 19 to 23, returns good evening")
    public void nameOfMethod(int time){
        Assertions.assertEquals("Good evening", App.getGreeting(time));
    }
```


## Loops(For/ For each , While/ Do While)




## OOP
* Abstraction: Is the concept of classes, which they then are the blueprints of real life objects
* An object is the instance of a class

* Encapsulation: concept of data hiding & exposing e.g. thru private & public methods & variables
* Polymorphism: different implementations of the same thinghas two types: method overriding & method overloading
* Inheritance: a hierarchical relationship between classes (e.g. subclasses)

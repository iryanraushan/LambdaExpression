# LAMBDA EXPRESSION

A lambda expression in Java is a concise way to define and use small blocks of code, often for tasks that can be treated as data. It's a feature introduced in Java 8 that makes code more readable and expressive, especially when working with functional interfaces (interfaces with a single method). Lambda expressions allow you to write code in a more declarative and functional style, making it easier to work with collections, perform actions on elements, and perform various other operations. They consist of parameters, an arrow operator (->), and an expression or block of code. Lambda expressions are particularly useful when passing behavior as arguments to methods or when dealing with functional programming concepts.

```(parameters) -> expression or block of code```

# Breakdown of the components:

- Parameters: These are the input parameters that the lambda expression takes. If the lambda doesn't take any parameters, you still need to use empty parentheses. If there's only one parameter and its type can be inferred, you can omit the parentheses. For multiple parameters or explicitly typed parameters, you need to enclose them in parentheses.

- Arrow Operator (->): This separates the parameter list from the body of the lambda expression.

- Expression or Block of Code: This is the actual code that gets executed when the lambda is invoked. For a single expression, you can simply write the expression, and its value will be returned. For multiple statements, you need to enclose them in curly braces {} and provide a return statement if necessary.


Example 1: A simple lambda expression without parameters:

``` () -> System.out.println("Hello, Lambda!");```

Example 2: A lambda expression with a single parameter:
``` (name) -> "Hello, " + name; ```

Example 3: A lambda expression with multiple parameters and a block of code:
```
(x, y) -> {
    int sum = x + y;
    return sum;
}
```

Lambda expressions are often used in conjunction with functional interfaces, which define the type of the lambda expression based on the single abstract method's signature. Some common functional interfaces in Java are Runnable, Callable, Consumer, Supplier, Predicate, and more. The use of lambda expressions reduces the need for explicit anonymous inner classes, making the code more concise and readable.

Example using Consumer functional interface with a lambda expression:

```
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(name -> System.out.println("Hello, " + name));
```

- Sorting with Comparators:
```
  List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
  Collections.sort(names, (a, b) -> a.compareTo(b));
  // Shorter version using method reference:
  // Collections.sort(names, String::compareTo);
```

- Filtering with Predicates:
```
  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 ==     0).collect(Collectors.toList());
```

- Mapping with Function:
```
  List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
  List<Integer> nameLengths = names.stream().map(name ->         name.length()).collect(Collectors.toList());
```

- Custom Functional Interfaces:
```
  @FunctionalInterface
  interface MathOperation {
      int operate(int a, int b);
  }

  MathOperation addition = (a, b) -> a + b;
  MathOperation subtraction = (a, b) -> a - b;
  
  System.out.println(addition.operate(5, 3)); // Output: 8
  System.out.println(subtraction.operate(10, 4)); // Output: 6
```

- Event Handling:
```
button.addActionListener(event -> System.out.println("Button clicked!"));
```
- Using Lambda in Stream Operations:
```
  List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
  long count = words.stream().filter(word -> word.startsWith("a")).count();
  System.out.println("Count of words starting with 'a': " + count);
```
- Optional with Lambda:
```
  Optional<String> name = Optional.ofNullable(getName());
  name.ifPresentOrElse(
      n -> System.out.println("Hello, " + n),
      () -> System.out.println("Hello, Guest")
  );
```

# Arnold Enum Types

> In this repository you'll find **Arnold Enum Types**. This kata is to introduce yourself into the Enum Types and how to work with them with the programming language of Java. The level is easy and my advice is to copy the main class and the test cases and try to build the application programming the mathematical formulas you'll find below.

## Table of Contents

1. [Motivation](#motivation)
1. [Used Technologies](#used-technologies)
1. [Steps To Follow](#steps-to-follow)
1. [Reflections](#reflections)
1. [License](#license)

---

## Motivation

The thing that really motivates me to try this kata was because all is themed in Astronomical concepts and anyone that likes the astronomy I think will be really pleasant trying to develop the code for this program. At the same time until this point I've just worked with constants and I didn't have a clue about what, where the Enum Types until I got into it. Really useful resource that anyone should know if would like to become a professional programmer. Completely advisable to anyone that enjoy learning new things, you can be sure that you won't waste your time.

---

**[⬆ back to top](#table-of-contents)**

## Used Technologies

- Java
- Junit
- Maven
- Jacoco
- MarkDown
- Github

---

**[⬆ back to top](#table-of-contents)**

## Steps To Follow

This kata is about to calculate the weight of any person to any of the planets of the Solar System. To have an idea should do something similar to what does this page:

- http://www.traducimos.cl/planet/


This kata is called **Arnold Enum Types** because it's supposed that after do this kata you'll learn how to avoid what happens to him in the old movie of **Total Recall** be careful and make sure that you're maths still fresh if you want to avoid this ending...

- https://www.youtube.com/watch?v=86scPKqWFvc&ab_channel=jonesdavy72 

>Not gonna lie, the special effects where very good to be the 90's.

There are the formulas you should keep in mind:

- surfaceWeight = yourDough * surfaceGravity

- surfaceGravity = G * planetDough / radiusPlanetSquared

- G = 6.67300E - 11

- yourDough = yourWeightOnEarth / surfaceGravityEarth


The dough and radius of each planet (in kg and meters) are:

    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);


This should be the output after execute your program (you can use it like a reference and a test case) **if your weight on Earth was 175kg**;

    $ java Planet 175
    
    Your weight on MERCURY is 66.107583
    Your weight on VENUS is 158.374842
    Your weight on EARTH is 175.000000
    Your weight on MARS is 66.279007
    Your weight on JUPITER is 442.847567
    Your weight on SATURN is 186.552719
    Your weight on URANUS is 158.397260
    Your weight on NEPTUNE is 199.207413


If you're brave enough, you can try to resolve it all by yourself, in case you think you'll need some help, you can copy and paste the main class of the program and if still too difficult the test cases that have been made specially to go step by step. If after that still being too difficult in this link you'll find the solution by Oracle:

- https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html

> You can get a hint by giving a quick look to the code, but don't abuse please, it's easy enough to get it all by yourself if you copy the main class and the test cases, enjoy !

---

**[⬆ back to top](#table-of-contents)**

## Reflections

One of the most profitable things of this kata how I explained before is to know and be able to work with Enum Types, I'll never forget about them. And one of the most enjoyable things is to develop an algorithm that will calculate for you which one could be your weight in any planet of the solar System, and yes, if you were wondering about the formulas, you'll need to translate them into code. Don't worry the mathematics you need to apply in this kata are really basic and you won't get lost at any point, or unless you won't get lost for anything related to maths. Thinking about myself, I think this kata has helped me a lot with the Enum Types and the different operators I can use with them. So good, so cool, so easy !

---

**[⬆ back to top](#table-of-contents)**

## License

MIT License

Copyright (c) 2020 AntoniPizarro and Pau Llinàs

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

---

**[⬆ back to top](#table-of-contents)**

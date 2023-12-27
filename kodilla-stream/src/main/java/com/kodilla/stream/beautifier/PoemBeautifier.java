package com.kodilla.stream.beautifier;

public class PoemBeautifier {

        public void beautify (String decor , PoemDecorator poemDecorator){
            String decorResult = poemDecorator.decorator(decor);
            System.out.println(decorResult);
        }
}

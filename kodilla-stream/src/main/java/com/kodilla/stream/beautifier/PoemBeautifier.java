package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String textToDecorateX,PoemDecorator poemDecorator){
    String result = poemDecorator.decorate(textToDecorateX);
    return result;
    }
}

package com.tts;

public class Output {
    // 2. What is the output?
    // Not required to run the code. Just determine what the code should output.

    double[] exampleArray = {1,5,6,5,4,1};

    double maximum = exampleArray[0];

    int index = 0;

        for (int i = 1; i<exampleArray.length> i++) {

        if (exampleArray[i] > maximum) {
            maximum = exampleArray[i];
            index = i;
        }
    }
        System.out.println(index)
}

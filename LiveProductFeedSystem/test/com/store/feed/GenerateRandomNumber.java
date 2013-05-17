/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Ronalds
 */
public class GenerateRandomNumber {

    private static Random random;

    public static void main(String[] args) {
        Random random1 = getRandomInstance();
        int randomNumber;
        List<Integer> randomNumbers = new ArrayList<Integer>();

        randomNumber = random.nextInt(99999) + 10000;
        while (!randomNumbers.contains(randomNumber) || randomNumbers.contains(randomNumber)) {
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
                break;
            } else {
                randomNumber = random.nextInt(99999) + 10000;
            }
        }
    }

    private static synchronized Random getRandomInstance() {
        if (random == null) {
            random = new Random();
        }
        return random;
    }
}

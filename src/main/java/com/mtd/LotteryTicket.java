package com.mtd;

import java.util.*;

import static java.util.stream.Collectors.toMap;

public class LotteryTicket {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        List<Integer> finalBall = new ArrayList<>();
        List<Integer> ball = Arrays.asList(1,18,28,29,30);
        finalBall.add(ball.get(getRandomNumber(0,4)));
        ball = Arrays.asList(10,12,4,7,27);
        finalBall.add(ball.get(getRandomNumber(0,4)));
        ball = Arrays.asList(10,21,31,26,37);
        finalBall.add(ball.get(getRandomNumber(0,4)));
        ball = Arrays.asList(5,17,22,39,2);
        finalBall.add(ball.get(getRandomNumber(0,4)));
        ball = Arrays.asList(1,30,6,28,13);
        finalBall.add(ball.get(getRandomNumber(0,4)));
        ball = Arrays.asList(12,9,4,3,5);
        finalBall.add(ball.get(getRandomNumber(0,4)));

        List<List<Integer>> lotteryTicket = new ArrayList<>();
        lotteryTicket.add(Arrays.asList(03,14,18,19,20,4));
        lotteryTicket.add(Arrays.asList(06,8,10,19,30,1));
        lotteryTicket.add(Arrays.asList(22,27,32,34,37,1));
        lotteryTicket.add(Arrays.asList(02,05,29,35,39,6));
        lotteryTicket.add(Arrays.asList(01,10,35,37,39,2));
        lotteryTicket.add(Arrays.asList(16,23,26,27,38,9));
        System.out.println("_______________"+finalBall);
        lotteryTicket.add(finalBall);

        Map<Integer, Integer> countMap = new HashMap<>();
        int count = 0;
        for(int i = 0; i < 10; i++) {
            int randomNumber = getRandomNumber(0,7);
            System.out.println(randomNumber);
            if(countMap.containsKey(randomNumber)) {
                countMap.put(randomNumber, countMap.get(randomNumber)+1);
            } else {
                countMap.put(randomNumber, count+1);
            }
        }
        System.out.print("Before ::: "+countMap);
        System.out.println("::::::::::::::::::::::::::::::::::::");
        countMap = countMap.entrySet() .stream() .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())) .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.print("After ::: "+countMap);
        System.out.println(lotteryTicket.get(countMap.keySet().stream().findFirst().get()));

    }
}

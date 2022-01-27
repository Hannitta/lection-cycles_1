package ru.netology.sqr;

public class SQRService {

    public int rangeCalculator(int bottomBorder, int topBorder) {
        /*bottomBorder = 200;
        topBorder = 300;*/
        int sum = 0;
        int variable = 0;

        for (int i = 10; i <= 99; i++) {
            variable = i * i;
            if((bottomBorder >= variable) && (variable <= topBorder)) {
                sum++;
            }
        }
        return sum;
    }
}

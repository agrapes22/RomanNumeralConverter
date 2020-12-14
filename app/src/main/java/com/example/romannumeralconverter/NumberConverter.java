package com.example.romannumeralconverter;

public class NumberConverter
{

    public String toRoman(int number)
    {
        if (number < 0 || number > 10000)
        {
            return "Sorry, can't help you";
        }
        String returnValue = "";

        while (number >= 1000)
        {
            returnValue += "M";
            number = number - 1000;
        }
        while (number >= 900)
        {
            returnValue += "CM";
            number = number - 900;
        }
        while (number >= 500)
        {
            returnValue += "D";
            number = number - 500;
        }

        while (number >= 400)
        {
            returnValue += "CD";
            number = number - 400;
        }

        while (number >= 100)
        {
            returnValue += "C";
            number = number - 100;
        }

        while (number >= 90)
        {
            returnValue += "XC";
            number = number - 90;
        }

        while (number >= 50)
        {
            returnValue += "L";
            number = number - 50;
        }

        while (number >= 40)
        {
            returnValue += "XL";
            number = number - 40;
        }

        while (number >= 10)
        {
            returnValue += "X";
            number = number - 10;
        }

        while (number >= 9)
        {
            returnValue += "IX";
            number = number - 9;
        }

        while (number >= 5)
        {
            returnValue += "V";
            number = number - 5;
        }

        while (number >= 4)
        {
            returnValue += "IV";
            number = number - 4;
        }

        while (number >= 1)
        {
            returnValue += "I";
            number = number - 1;
        }

        return returnValue;
    }

    public int toNumber(String str) //Using solution found online (recommended in video tutorial)
    {
        int result = 0;
        int lastNumber = 0;
        String romanNumeral = str.toUpperCase();
        /* operation to be performed on upper cases even if user
           enters roman values in lower case chars */
        for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    result = processDecimal(1000, lastNumber, result);
                    lastNumber = 1000;
                    break;

                case 'D':
                    result = processDecimal(500, lastNumber, result);
                    lastNumber = 500;
                    break;

                case 'C':
                    result = processDecimal(100, lastNumber, result);
                    lastNumber = 100;
                    break;

                case 'L':
                    result = processDecimal(50, lastNumber, result);
                    lastNumber = 50;
                    break;

                case 'X':
                    result = processDecimal(10, lastNumber, result);
                    lastNumber = 10;
                    break;

                case 'V':
                    result = processDecimal(5, lastNumber, result);
                    lastNumber = 5;
                    break;

                case 'I':
                    result = processDecimal(1, lastNumber, result);
                    lastNumber = 1;
                    break;
            }
        }
        return result;
    }

    private int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }

    public String toString(int num)
    {
        return num + "";
    }

}

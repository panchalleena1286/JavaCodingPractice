//Write a Program to Convert Decimal number to HexaDecimal.

import java.util.*;
public class DecimalToHexaDecimal {
	
	static void decToHexa(int n)
    {
        
        char[] hexaDeciNum = new char[100];
        int i = 0;
        while (n != 0) {
            int temp = 0;
            temp = n % 16;
            if (temp < 10) {
                hexaDeciNum[i] = (char)(temp + 48);
                i++;
            }
            else {
                hexaDeciNum[i] = (char)(temp + 55);
                i++;
            }
 
            n = n / 16;
        }
 
        for (int j = i - 1; j >= 0; j--)
            System.out.print(hexaDeciNum[j]);
    }
 
    public static void main(String[] args)
    {
        int n = 5642;
        decToHexa(n);
    }

}
